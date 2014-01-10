
package paml.util.transferguardwsclient.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.cxf.jaxb.JAXBToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for ResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://hl7.paml.com/ws/}ArrayOfResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultResponse", namespace = "http://hl7.paml.com/ws/", propOrder = {
    "results"
})
public class ResultResponse {

    @XmlElement(name = "Results", namespace = "http://hl7.paml.com/ws/", required = true, nillable = true)
    protected ArrayOfResult results;

    /**
     * Default no-arg constructor
     * 
     */
    public ResultResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResultResponse(final ArrayOfResult results) {
        this.results = results;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResult }
     *     
     */
    public ArrayOfResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResult }
     *     
     */
    public void setResults(ArrayOfResult value) {
        this.results = value;
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

    public ResultResponse withResults(ArrayOfResult value) {
        setResults(value);
        return this;
    }

}
