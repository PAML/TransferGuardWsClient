
package paml.util.transferguardwsclient.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.cxf.jaxb.JAXBToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HL7Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://hl7.paml.com/ws/", propOrder = {
    "hl7Message"
})
public class Result {

    @XmlElement(name = "HL7Message", namespace = "http://hl7.paml.com/ws/", required = true, nillable = true)
    protected String hl7Message;

    /**
     * Default no-arg constructor
     * 
     */
    public Result() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Result(final String hl7Message) {
        this.hl7Message = hl7Message;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return JAXBToStringBuilder.valueOf(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    public Result withHL7Message(String value) {
        setHL7Message(value);
        return this;
    }

}
