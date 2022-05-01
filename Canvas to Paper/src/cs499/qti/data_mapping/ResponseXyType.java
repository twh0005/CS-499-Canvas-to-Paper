//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.04 at 12:42:32 PM CDT 
//


package cs499.qti.data_mapping;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for response_xyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response_xyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="material" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}materialType"/&gt;
 *           &lt;element name="material_ref" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}material_refType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="render_choice" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}render_choiceType"/&gt;
 *           &lt;element name="render_hotspot" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}render_hotspotType"/&gt;
 *           &lt;element name="render_slider" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}render_sliderType"/&gt;
 *           &lt;element name="render_fib" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}render_fibType"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}render_extension"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="material" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}materialType"/&gt;
 *           &lt;element name="material_ref" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}material_refType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rcardinality" default="Single"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Single"/&gt;
 *             &lt;enumeration value="Multiple"/&gt;
 *             &lt;enumeration value="Ordered"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rtiming" default="No"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_xyType", propOrder = {
    "content"
})
public class ResponseXyType {

    @XmlElementRefs({
        @XmlElementRef(name = "material", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "material_ref", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "render_choice", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "render_hotspot", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "render_slider", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "render_fib", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "render_extension", namespace = "http://www.imsglobal.org/xsd/ims_qtiasiv1p2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "rcardinality")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcardinality;
    @XmlAttribute(name = "rtiming")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rtiming;
    @XmlAttribute(name = "ident", required = true)
    protected String ident;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Material" is used by two different parts of a schema. See: 
     * line 1921 of file:/D:/black/Documents/GitHub/CS-499-Canvas-to-Paper/Canvas%20to%20Paper/schema/xsd/ims_qtiasiv1p2p1.xsd
     * line 1910 of file:/D:/black/Documents/GitHub/CS-499-Canvas-to-Paper/Canvas%20to%20Paper/schema/xsd/ims_qtiasiv1p2p1.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MaterialType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderChoiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderHotspotType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderSliderType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderFibType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderExtensionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the rcardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcardinality() {
        if (rcardinality == null) {
            return "Single";
        } else {
            return rcardinality;
        }
    }

    /**
     * Sets the value of the rcardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcardinality(String value) {
        this.rcardinality = value;
    }

    /**
     * Gets the value of the rtiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtiming() {
        if (rtiming == null) {
            return "No";
        } else {
            return rtiming;
        }
    }

    /**
     * Sets the value of the rtiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtiming(String value) {
        this.rtiming = value;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

}
