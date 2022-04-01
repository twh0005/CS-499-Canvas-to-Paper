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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for sectioncontrolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sectioncontrolType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qticomment" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qticommentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="feedbackswitch" default="Yes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hintswitch" default="Yes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="solutionswitch" default="Yes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="view" default="All"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="All"/&gt;
 *             &lt;enumeration value="Administrator"/&gt;
 *             &lt;enumeration value="AdminAuthority"/&gt;
 *             &lt;enumeration value="Assessor"/&gt;
 *             &lt;enumeration value="Author"/&gt;
 *             &lt;enumeration value="Candidate"/&gt;
 *             &lt;enumeration value="InvigilatorProctor"/&gt;
 *             &lt;enumeration value="Psychometrician"/&gt;
 *             &lt;enumeration value="Scorer"/&gt;
 *             &lt;enumeration value="Tutor"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectioncontrolType", propOrder = {
    "qticomment"
})
public class SectioncontrolType {

    protected QticommentType qticomment;
    @XmlAttribute(name = "feedbackswitch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackswitch;
    @XmlAttribute(name = "hintswitch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hintswitch;
    @XmlAttribute(name = "solutionswitch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solutionswitch;
    @XmlAttribute(name = "view")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

    /**
     * Gets the value of the qticomment property.
     * 
     * @return
     *     possible object is
     *     {@link QticommentType }
     *     
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the value of the qticomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QticommentType }
     *     
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the value of the feedbackswitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackswitch() {
        if (feedbackswitch == null) {
            return "Yes";
        } else {
            return feedbackswitch;
        }
    }

    /**
     * Sets the value of the feedbackswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackswitch(String value) {
        this.feedbackswitch = value;
    }

    /**
     * Gets the value of the hintswitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintswitch() {
        if (hintswitch == null) {
            return "Yes";
        } else {
            return hintswitch;
        }
    }

    /**
     * Sets the value of the hintswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHintswitch(String value) {
        this.hintswitch = value;
    }

    /**
     * Gets the value of the solutionswitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionswitch() {
        if (solutionswitch == null) {
            return "Yes";
        } else {
            return solutionswitch;
        }
    }

    /**
     * Sets the value of the solutionswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionswitch(String value) {
        this.solutionswitch = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

}
