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
 * <p>Java class for outcomes_metadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomes_metadataType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="mdname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mdoperator" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="EQ"/&gt;
 *             &lt;enumeration value="NEQ"/&gt;
 *             &lt;enumeration value="LT"/&gt;
 *             &lt;enumeration value="LTE"/&gt;
 *             &lt;enumeration value="GT"/&gt;
 *             &lt;enumeration value="GTE"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomes_metadataType", propOrder = {
    "value"
})
public class OutcomesMetadataType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "mdname", required = true)
    protected String mdname;
    @XmlAttribute(name = "mdoperator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mdoperator;

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
     * Gets the value of the mdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdname() {
        return mdname;
    }

    /**
     * Sets the value of the mdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdname(String value) {
        this.mdname = value;
    }

    /**
     * Gets the value of the mdoperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdoperator() {
        return mdoperator;
    }

    /**
     * Sets the value of the mdoperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdoperator(String value) {
        this.mdoperator = value;
    }

}
