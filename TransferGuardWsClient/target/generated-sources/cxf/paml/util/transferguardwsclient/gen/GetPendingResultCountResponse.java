
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
 *         &lt;element name="GetPendingResultCountResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getPendingResultCountResult"
})
@XmlRootElement(name = "GetPendingResultCountResponse", namespace = "http://hl7.paml.com/ws/")
public class GetPendingResultCountResponse {

    @XmlElement(name = "GetPendingResultCountResult", namespace = "http://hl7.paml.com/ws/")
    protected Integer getPendingResultCountResult;

    /**
     * Default no-arg constructor
     * 
     */
    public GetPendingResultCountResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetPendingResultCountResponse(final Integer getPendingResultCountResult) {
        this.getPendingResultCountResult = getPendingResultCountResult;
    }

    /**
     * Gets the value of the getPendingResultCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetPendingResultCountResult() {
        return getPendingResultCountResult;
    }

    /**
     * Sets the value of the getPendingResultCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetPendingResultCountResult(Integer value) {
        this.getPendingResultCountResult = value;
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

    public GetPendingResultCountResponse withGetPendingResultCountResult(Integer value) {
        setGetPendingResultCountResult(value);
        return this;
    }

}
