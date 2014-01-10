package paml.util.transferguardwsclient;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.xml.namespace.QName;

import org.apache.commons.io.FileUtils;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.xpath.DefaultXPath;

import paml.util.transferguardwsclient.gen.ITransferService;
import paml.util.transferguardwsclient.gen.OrderRequest;
import paml.util.transferguardwsclient.gen.OrderResponse;
import paml.util.transferguardwsclient.gen.Result;
import paml.util.transferguardwsclient.gen.ResultRequest;
import paml.util.transferguardwsclient.gen.ResultResponse;

/**
 * @author last modified by: $Author: selliott $
 * @version $Revision: 66179 $ $Date: 2014-01-10 15:14:34 -0800 (Fri, 10 Jan 2014) $
 */
public class TransferGuardServiceClient {
	//Checkstyle: Off

	private static String _siteID;

	public ITransferService getTransferService() throws Exception {
		_siteID = "0000";
		setSecuritySystemProperties();

		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.getInInterceptors().add( new LoggingInInterceptor() );
		jaxWsProxyFactoryBean.getOutInterceptors().add( new LoggingOutInterceptor() );

		jaxWsProxyFactoryBean.setWsdlLocation( "https://transferguard-cert.paml.com/v1/wsdl/TransferService.wsdl" );
		jaxWsProxyFactoryBean.setServiceClass( ITransferService.class );
		jaxWsProxyFactoryBean.setServiceName( new QName( "http://hl7.paml.com/ws/", "TransferService" ) );
		return (ITransferService)jaxWsProxyFactoryBean.create();
	}

	private void setSecuritySystemProperties() {
		System.setProperty( "javax.net.ssl.keyStore", "./src/main/resources/wsdl/" + _siteID + ".p12" );
		System.setProperty( "javax.net.ssl.keyStoreType", "PKCS12" );
		System.setProperty( "javax.net.ssl.keyStorePassword", "your-password-goes-here" );
	}

	public static void main( final String[] args ) throws Exception {
		TransferGuardServiceClient transferGuardServiceClient = new TransferGuardServiceClient();
		ITransferService client = transferGuardServiceClient.getTransferService();

		setupSecurity( client );

		// Get the current version of the TransferGuard Service
		String version = client.getVersion();
		System.out.println( MessageFormat.format( "Using TransferGuard Service Version: {0}\n", version ) );

		// Create an order.
		System.out.println( "Preparing to place order...\n" );
		String hl7Message = FileUtils.readFileToString( new File( "./src/main/resources/messages/sample orm.xml" ) );
		OrderRequest orderRequest = new OrderRequest( hl7Message, _siteID );

		// Place an order.
		OrderResponse orderResponse = client.placeOrder( orderRequest );

		// Get the order message ID for tracking purposes.
		System.out.println( MessageFormat.format( "Order successfully placed. You can use Message ID {0} to track the message.\n",
			orderResponse.getMessageID() ) );

		// Check if there are any results waiting.
		System.out.println( "Checking for pending results...\n" );
		ResultRequest resultRequest = new ResultRequest( _siteID );

		int resultCount = client.getPendingResultCount( resultRequest );
		System.out.println( MessageFormat.format( "There are {0} result(s) waiting to be retieved.\n", resultCount ) );

		// If there are pending results, retrieve them
		if ( resultCount > 0 ) {
			// Retrieve results.
			System.out.println( "Retrieving results...\n" );
			ResultResponse resultResponse = client.getResults( resultRequest );
			List< Result > results = resultResponse.getResults().getResult();
			int index = 0;
			for( Result result : results ) {
				String resultHL7 = result.getHL7Message();
				Document document = DocumentHelper.parseText( resultHL7 );
				DefaultXPath xpath = new DefaultXPath( "//v2xml:ORU_R01/v2xml:MSH/v2xml:MSH.8" ) {
					{
						setNamespaceURIs( new HashMap< String, String >() {
							{
								put( "v2xml", "urn:hl7-org:v2xml" );
							}
						} );
					}
				};

				System.out.println( MessageFormat.format( "Result Message {0} ID: {1}", index, xpath.selectSingleNode( document ).getText() ) );
				index++;
			}
		}

		System.out.println( "\nPress enter to continue..." );
		System.in.read();
	}

	private static void setupSecurity( final ITransferService port ) throws Exception {
		String storePath = System.getProperty( "javax.net.ssl.keyStore" );
		String storePassword = System.getProperty( "javax.net.ssl.keyStorePassword" );
		String storeType = System.getProperty( "javax.net.ssl.keyStoreType" );

		KeyStore keyStore = KeyStore.getInstance( storeType );
		keyStore.load( new FileInputStream( storePath ), storePassword.toCharArray() );

		KeyManagerFactory factory = KeyManagerFactory.getInstance( KeyManagerFactory.getDefaultAlgorithm() );
		factory.init( keyStore, storePassword.toCharArray() );

		KeyManager[] keyManagers = factory.getKeyManagers();
		Client client = ClientProxy.getClient( port );
		HTTPConduit conduit = (HTTPConduit)client.getConduit();
		conduit.setTlsClientParameters( new TLSClientParameters() );
		conduit.getTlsClientParameters().setKeyManagers( keyManagers );
	}

}
