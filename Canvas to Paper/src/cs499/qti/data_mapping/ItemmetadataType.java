//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.04 at 12:42:32 PM CDT 
//


package cs499.qti.data_mapping;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemmetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemmetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qtimetadata" type="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qtimetadataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_computerscored" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_feedbackpermitted" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_hintspermitted" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_itemtype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_levelofdifficulty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_maximumscore" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_renderingtype" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_responsetype" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_scoringpermitted" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_solutionspermitted" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_timedependence" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_timelimit" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_toolvendor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_topic" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_weighting" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_material" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/ims_qtiasiv1p2}qmd_typeofsolution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemmetadataType", propOrder = {
    "qtimetadata",
    "qmdComputerscored",
    "qmdFeedbackpermitted",
    "qmdHintspermitted",
    "qmdItemtype",
    "qmdLevelofdifficulty",
    "qmdMaximumscore",
    "qmdRenderingtype",
    "qmdResponsetype",
    "qmdScoringpermitted",
    "qmdSolutionspermitted",
    "qmdStatus",
    "qmdTimedependence",
    "qmdTimelimit",
    "qmdToolvendor",
    "qmdTopic",
    "qmdWeighting",
    "qmdMaterial",
    "qmdTypeofsolution"
})
public class ItemmetadataType {

    protected List<QtimetadataType> qtimetadata;
    @XmlElement(name = "qmd_computerscored")
    protected String qmdComputerscored;
    @XmlElement(name = "qmd_feedbackpermitted")
    protected String qmdFeedbackpermitted;
    @XmlElement(name = "qmd_hintspermitted")
    protected String qmdHintspermitted;
    @XmlElement(name = "qmd_itemtype")
    protected String qmdItemtype;
    @XmlElement(name = "qmd_levelofdifficulty")
    protected String qmdLevelofdifficulty;
    @XmlElement(name = "qmd_maximumscore")
    protected String qmdMaximumscore;
    @XmlElement(name = "qmd_renderingtype")
    protected List<String> qmdRenderingtype;
    @XmlElement(name = "qmd_responsetype")
    protected List<String> qmdResponsetype;
    @XmlElement(name = "qmd_scoringpermitted")
    protected String qmdScoringpermitted;
    @XmlElement(name = "qmd_solutionspermitted")
    protected String qmdSolutionspermitted;
    @XmlElement(name = "qmd_status")
    protected String qmdStatus;
    @XmlElement(name = "qmd_timedependence")
    protected String qmdTimedependence;
    @XmlElement(name = "qmd_timelimit")
    protected String qmdTimelimit;
    @XmlElement(name = "qmd_toolvendor")
    protected String qmdToolvendor;
    @XmlElement(name = "qmd_topic")
    protected String qmdTopic;
    @XmlElement(name = "qmd_weighting")
    protected String qmdWeighting;
    @XmlElement(name = "qmd_material")
    protected List<String> qmdMaterial;
    @XmlElement(name = "qmd_typeofsolution")
    protected String qmdTypeofsolution;

    /**
     * Gets the value of the qtimetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the qtimetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtimetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QtimetadataType }
     * 
     * 
     */
    public List<QtimetadataType> getQtimetadata() {
        if (qtimetadata == null) {
            qtimetadata = new ArrayList<QtimetadataType>();
        }
        return this.qtimetadata;
    }

    /**
     * Gets the value of the qmdComputerscored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdComputerscored() {
        return qmdComputerscored;
    }

    /**
     * Sets the value of the qmdComputerscored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdComputerscored(String value) {
        this.qmdComputerscored = value;
    }

    /**
     * Gets the value of the qmdFeedbackpermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdFeedbackpermitted() {
        return qmdFeedbackpermitted;
    }

    /**
     * Sets the value of the qmdFeedbackpermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdFeedbackpermitted(String value) {
        this.qmdFeedbackpermitted = value;
    }

    /**
     * Gets the value of the qmdHintspermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdHintspermitted() {
        return qmdHintspermitted;
    }

    /**
     * Sets the value of the qmdHintspermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdHintspermitted(String value) {
        this.qmdHintspermitted = value;
    }

    /**
     * Gets the value of the qmdItemtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdItemtype() {
        return qmdItemtype;
    }

    /**
     * Sets the value of the qmdItemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdItemtype(String value) {
        this.qmdItemtype = value;
    }

    /**
     * Gets the value of the qmdLevelofdifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdLevelofdifficulty() {
        return qmdLevelofdifficulty;
    }

    /**
     * Sets the value of the qmdLevelofdifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdLevelofdifficulty(String value) {
        this.qmdLevelofdifficulty = value;
    }

    /**
     * Gets the value of the qmdMaximumscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdMaximumscore() {
        return qmdMaximumscore;
    }

    /**
     * Sets the value of the qmdMaximumscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdMaximumscore(String value) {
        this.qmdMaximumscore = value;
    }

    /**
     * Gets the value of the qmdRenderingtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the qmdRenderingtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQmdRenderingtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQmdRenderingtype() {
        if (qmdRenderingtype == null) {
            qmdRenderingtype = new ArrayList<String>();
        }
        return this.qmdRenderingtype;
    }

    /**
     * Gets the value of the qmdResponsetype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the qmdResponsetype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQmdResponsetype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQmdResponsetype() {
        if (qmdResponsetype == null) {
            qmdResponsetype = new ArrayList<String>();
        }
        return this.qmdResponsetype;
    }

    /**
     * Gets the value of the qmdScoringpermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdScoringpermitted() {
        return qmdScoringpermitted;
    }

    /**
     * Sets the value of the qmdScoringpermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdScoringpermitted(String value) {
        this.qmdScoringpermitted = value;
    }

    /**
     * Gets the value of the qmdSolutionspermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdSolutionspermitted() {
        return qmdSolutionspermitted;
    }

    /**
     * Sets the value of the qmdSolutionspermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdSolutionspermitted(String value) {
        this.qmdSolutionspermitted = value;
    }

    /**
     * Gets the value of the qmdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdStatus() {
        return qmdStatus;
    }

    /**
     * Sets the value of the qmdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdStatus(String value) {
        this.qmdStatus = value;
    }

    /**
     * Gets the value of the qmdTimedependence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTimedependence() {
        return qmdTimedependence;
    }

    /**
     * Sets the value of the qmdTimedependence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTimedependence(String value) {
        this.qmdTimedependence = value;
    }

    /**
     * Gets the value of the qmdTimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTimelimit() {
        return qmdTimelimit;
    }

    /**
     * Sets the value of the qmdTimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTimelimit(String value) {
        this.qmdTimelimit = value;
    }

    /**
     * Gets the value of the qmdToolvendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdToolvendor() {
        return qmdToolvendor;
    }

    /**
     * Sets the value of the qmdToolvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdToolvendor(String value) {
        this.qmdToolvendor = value;
    }

    /**
     * Gets the value of the qmdTopic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTopic() {
        return qmdTopic;
    }

    /**
     * Sets the value of the qmdTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTopic(String value) {
        this.qmdTopic = value;
    }

    /**
     * Gets the value of the qmdWeighting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdWeighting() {
        return qmdWeighting;
    }

    /**
     * Sets the value of the qmdWeighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdWeighting(String value) {
        this.qmdWeighting = value;
    }

    /**
     * Gets the value of the qmdMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the qmdMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQmdMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQmdMaterial() {
        if (qmdMaterial == null) {
            qmdMaterial = new ArrayList<String>();
        }
        return this.qmdMaterial;
    }

    /**
     * Gets the value of the qmdTypeofsolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTypeofsolution() {
        return qmdTypeofsolution;
    }

    /**
     * Sets the value of the qmdTypeofsolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTypeofsolution(String value) {
        this.qmdTypeofsolution = value;
    }

}
