
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
 *         &lt;element name="PlaceBase64OrderResult" type="{http://hl7.paml.com/ws/}OrderResponse" minOccurs="0"/>
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
    "placeBase64OrderResult"
})
@XmlRootElement(name = "PlaceBase64OrderResponse", namespace = "http://hl7.paml.com/ws/")
public class PlaceBase64OrderResponse {

    @XmlElement(name = "PlaceBase64OrderResult", namespace = "http://hl7.paml.com/ws/", nillable = true)
    protected OrderResponse placeBase64OrderResult;

    /**
     * Default no-arg constructor
     * 
     */
    public PlaceBase64OrderResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PlaceBase64OrderResponse(final OrderResponse placeBase64OrderResult) {
        this.placeBase64OrderResult = placeBase64OrderResult;
    }

    /**
     * Gets the value of the placeBase64OrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponse }
     *     
     */
    public OrderResponse getPlaceBase64OrderResult() {
        return placeBase64OrderResult;
    }

    /**
     * Sets the value of the placeBase64OrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponse }
     *     
     */
    public void setPlaceBase64OrderResult(OrderResponse value) {
        this.placeBase64OrderResult = value;
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

    public PlaceBase64OrderResponse withPlaceBase64OrderResult(OrderResponse value) {
        setPlaceBase64OrderResult(value);
        return this;
    }

}
