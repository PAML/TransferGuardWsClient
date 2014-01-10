
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
 *         &lt;element name="GetResultsResult" type="{http://hl7.paml.com/ws/}ResultResponse" minOccurs="0"/>
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
    "getResultsResult"
})
@XmlRootElement(name = "GetResultsResponse", namespace = "http://hl7.paml.com/ws/")
public class GetResultsResponse {

    @XmlElement(name = "GetResultsResult", namespace = "http://hl7.paml.com/ws/", nillable = true)
    protected ResultResponse getResultsResult;

    /**
     * Default no-arg constructor
     * 
     */
    public GetResultsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetResultsResponse(final ResultResponse getResultsResult) {
        this.getResultsResult = getResultsResult;
    }

    /**
     * Gets the value of the getResultsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultResponse }
     *     
     */
    public ResultResponse getGetResultsResult() {
        return getResultsResult;
    }

    /**
     * Sets the value of the getResultsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultResponse }
     *     
     */
    public void setGetResultsResult(ResultResponse value) {
        this.getResultsResult = value;
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

    public GetResultsResponse withGetResultsResult(ResultResponse value) {
        setGetResultsResult(value);
        return this;
    }

}
