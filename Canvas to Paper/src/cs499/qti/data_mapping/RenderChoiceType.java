//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.21 at 06:58:23 PM CDT 
//


package cs499.qti.data_mapping;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for render_choiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="render_choiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="material" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}materialType"/&gt;
 *           &lt;element name="material_ref" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}material_refType"/&gt;
 *           &lt;element name="response_label" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}response_labelType"/&gt;
 *           &lt;element name="flow_label" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}flow_labelType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}response_na" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="shuffle" default="No"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="minnumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="maxnumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_choiceType", propOrder = {
    "materialOrMaterialRefOrResponseLabel",
    "responseNa"
})
public class RenderChoiceType {

    @XmlElements({
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "material_ref", type = MaterialRefType.class),
        @XmlElement(name = "response_label", type = ResponseLabelType.class),
        @XmlElement(name = "flow_label", type = FlowLabelType.class)
    })
    protected List<Object> materialOrMaterialRefOrResponseLabel;
    @XmlElement(name = "response_na")
    protected ResponseNaType responseNa;
    @XmlAttribute(name = "shuffle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shuffle;
    @XmlAttribute(name = "minnumber")
    protected String minnumber;
    @XmlAttribute(name = "maxnumber")
    protected String maxnumber;

    /**
     * Gets the value of the materialOrMaterialRefOrResponseLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialOrMaterialRefOrResponseLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialOrMaterialRefOrResponseLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialType }
     * {@link MaterialRefType }
     * {@link ResponseLabelType }
     * {@link FlowLabelType }
     * 
     * 
     */
    public List<Object> getMaterialOrMaterialRefOrResponseLabel() {
        if (materialOrMaterialRefOrResponseLabel == null) {
            materialOrMaterialRefOrResponseLabel = new ArrayList<Object>();
        }
        return this.materialOrMaterialRefOrResponseLabel;
    }

    /**
     * Gets the value of the responseNa property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseNaType }
     *     
     */
    public ResponseNaType getResponseNa() {
        return responseNa;
    }

    /**
     * Sets the value of the responseNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseNaType }
     *     
     */
    public void setResponseNa(ResponseNaType value) {
        this.responseNa = value;
    }

    /**
     * Gets the value of the shuffle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShuffle() {
        if (shuffle == null) {
            return "No";
        } else {
            return shuffle;
        }
    }

    /**
     * Sets the value of the shuffle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShuffle(String value) {
        this.shuffle = value;
    }

    /**
     * Gets the value of the minnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinnumber() {
        return minnumber;
    }

    /**
     * Sets the value of the minnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinnumber(String value) {
        this.minnumber = value;
    }

    /**
     * Gets the value of the maxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxnumber() {
        return maxnumber;
    }

    /**
     * Sets the value of the maxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxnumber(String value) {
        this.maxnumber = value;
    }

}
