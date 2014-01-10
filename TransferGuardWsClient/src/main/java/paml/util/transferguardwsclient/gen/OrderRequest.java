
package paml.util.transferguardwsclient.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.cxf.jaxb.JAXBToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for OrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HL7Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SiteID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRequest", namespace = "http://hl7.paml.com/ws/", propOrder = {
    "hl7Message",
    "siteID"
})
public class OrderRequest {

    @XmlElement(name = "HL7Message", namespace = "http://hl7.paml.com/ws/", required = true, nillable = true)
    protected String hl7Message;
    @XmlElement(name = "SiteID", namespace = "http://hl7.paml.com/ws/", required = true, nillable = true)
    protected String siteID;

    /**
     * Default no-arg constructor
     * 
     */
    public OrderRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OrderRequest(final String hl7Message, final String siteID) {
        this.hl7Message = hl7Message;
        this.siteID = siteID;
    }

    /**
     * Gets the value of the hl7Message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHL7Message() {
        return hl7Message;
    }

    /**
     * Sets the value of the hl7Message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHL7Message(String value) {
        this.hl7Message = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
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

    public OrderRequest withHL7Message(String value) {
        setHL7Message(value);
        return this;
    }

    public OrderRequest withSiteID(String value) {
        setSiteID(value);
        return this;
    }

}
