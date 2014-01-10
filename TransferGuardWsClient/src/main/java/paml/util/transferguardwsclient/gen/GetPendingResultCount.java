
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
 *         &lt;element name="resultRequest" type="{http://hl7.paml.com/ws/}ResultRequest" minOccurs="0"/>
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
    "resultRequest"
})
@XmlRootElement(name = "GetPendingResultCount", namespace = "http://hl7.paml.com/ws/")
public class GetPendingResultCount {

    @XmlElement(namespace = "http://hl7.paml.com/ws/", nillable = true)
    protected ResultRequest resultRequest;

    /**
     * Default no-arg constructor
     * 
     */
    public GetPendingResultCount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetPendingResultCount(final ResultRequest resultRequest) {
        this.resultRequest = resultRequest;
    }

    /**
     * Gets the value of the resultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ResultRequest }
     *     
     */
    public ResultRequest getResultRequest() {
        return resultRequest;
    }

    /**
     * Sets the value of the resultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultRequest }
     *     
     */
    public void setResultRequest(ResultRequest value) {
        this.resultRequest = value;
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

    public GetPendingResultCount withResultRequest(ResultRequest value) {
        setResultRequest(value);
        return this;
    }

}
