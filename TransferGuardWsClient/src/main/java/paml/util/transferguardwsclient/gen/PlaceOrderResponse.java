
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
 *         &lt;element name="PlaceOrderResult" type="{http://hl7.paml.com/ws/}OrderResponse" minOccurs="0"/>
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
    "placeOrderResult"
})
@XmlRootElement(name = "PlaceOrderResponse", namespace = "http://hl7.paml.com/ws/")
public class PlaceOrderResponse {

    @XmlElement(name = "PlaceOrderResult", namespace = "http://hl7.paml.com/ws/", nillable = true)
    protected OrderResponse placeOrderResult;

    /**
     * Default no-arg constructor
     * 
     */
    public PlaceOrderResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PlaceOrderResponse(final OrderResponse placeOrderResult) {
        this.placeOrderResult = placeOrderResult;
    }

    /**
     * Gets the value of the placeOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponse }
     *     
     */
    public OrderResponse getPlaceOrderResult() {
        return placeOrderResult;
    }

    /**
     * Sets the value of the placeOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponse }
     *     
     */
    public void setPlaceOrderResult(OrderResponse value) {
        this.placeOrderResult = value;
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

    public PlaceOrderResponse withPlaceOrderResult(OrderResponse value) {
        setPlaceOrderResult(value);
        return this;
    }

}
