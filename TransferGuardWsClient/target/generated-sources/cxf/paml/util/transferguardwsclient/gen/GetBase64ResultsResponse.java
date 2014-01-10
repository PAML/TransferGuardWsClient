
package paml.util.transferguardwsclient.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.cxf.jaxb.JAXBToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetBase64ResultsResult" type="{http://hl7.paml.com/ws/}ResultResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBase64ResultsResult"
})
@XmlRootElement(name = "GetBase64ResultsResponse", namespace = "http://hl7.paml.com/ws/")
public class GetBase64ResultsResponse {

    @XmlElement(name = "GetBase64ResultsResult", namespace = "http://hl7.paml.com/ws/", nillable = true)
    protected ResultResponse getBase64ResultsResult;

    /**
     * Default no-arg constructor
     * 
     */
    public GetBase64ResultsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetBase64ResultsResponse(final ResultResponse getBase64ResultsResult) {
        this.getBase64ResultsResult = getBase64ResultsResult;
    }

    /**
     * Gets the value of the getBase64ResultsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultResponse }
     *     
     */
    public ResultResponse getGetBase64ResultsResult() {
        return getBase64ResultsResult;
    }

    /**
     * Sets the value of the getBase64ResultsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultResponse }
     *     
     */
    public void setGetBase64ResultsResult(ResultResponse value) {
        this.getBase64ResultsResult = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return JAXBToStringBuilder.valueOf(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    public GetBase64ResultsResponse withGetBase64ResultsResult(ResultResponse value) {
        setGetBase64ResultsResult(value);
        return this;
    }

}
