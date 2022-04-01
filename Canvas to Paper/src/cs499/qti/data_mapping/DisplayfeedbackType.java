//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.21 at 06:58:23 PM CDT 
//


package cs499.qti.data_mapping;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for displayfeedbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayfeedbackType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="feedbacktype" default="Response"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Response"/&gt;
 *             &lt;enumeration value="Solution"/&gt;
 *             &lt;enumeration value="Hint"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="linkrefid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayfeedbackType", propOrder = {
    "value"
})
public class DisplayfeedbackType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "feedbacktype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbacktype;
    @XmlAttribute(name = "linkrefid", required = true)
    protected String linkrefid;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the feedbacktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbacktype() {
        if (feedbacktype == null) {
            return "Response";
        } else {
            return feedbacktype;
        }
    }

    /**
     * Sets the value of the feedbacktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbacktype(String value) {
        this.feedbacktype = value;
    }

    /**
     * Gets the value of the linkrefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkrefid() {
        return linkrefid;
    }

    /**
     * Sets the value of the linkrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkrefid(String value) {
        this.linkrefid = value;
    }

}
