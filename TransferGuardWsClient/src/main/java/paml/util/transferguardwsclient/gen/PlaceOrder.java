
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
 *         &lt;element name="orderRequest" type="{http://hl7.paml.com/ws/}OrderRequest" minOccurs="0"/>
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
    "orderRequest"
})
@XmlRootElement(name = "PlaceOrder", namespace = "http://hl7.paml.com/ws/")
public class PlaceOrder {

    @XmlElement(namespace = "http://hl7.paml.com/ws/", nillable = true)
    protected OrderRequest orderRequest;

    /**
     * Default no-arg constructor
     * 
     */
    public PlaceOrder() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PlaceOrder(final OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    /**
     * Gets the value of the orderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRequest }
     *     
     */
    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    /**
     * Sets the value of the orderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRequest }
     *     
     */
    public void setOrderRequest(OrderRequest value) {
        this.orderRequest = value;
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

    public PlaceOrder withOrderRequest(OrderRequest value) {
        setOrderRequest(value);
        return this;
    }

}
