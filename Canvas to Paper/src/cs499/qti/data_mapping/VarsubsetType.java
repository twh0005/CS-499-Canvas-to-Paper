//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.04 at 12:42:32 PM CDT 
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
 * <p>Java class for varsubsetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="varsubsetType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="respident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="setmatch" default="Exact"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Exact"/&gt;
 *             &lt;enumeration value="Partial"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varsubsetType", propOrder = {
    "value"
})
public class VarsubsetType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "respident", required = true)
    protected String respident;
    @XmlAttribute(name = "setmatch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setmatch;
    @XmlAttribute(name = "index")
    protected String index;

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
     * Gets the value of the respident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespident() {
        return respident;
    }

    /**
     * Sets the value of the respident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespident(String value) {
        this.respident = value;
    }

    /**
     * Gets the value of the setmatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetmatch() {
        if (setmatch == null) {
            return "Exact";
        } else {
            return setmatch;
        }
    }

    /**
     * Sets the value of the setmatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetmatch(String value) {
        this.setmatch = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}