//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.26 at 09:38:30 AM KST 
//


package com.ups.timeintransit.timeintransitresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ServiceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" type="{}CodeType"/&gt;
 *         &lt;element name="Guaranteed" type="{}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedArrival" type="{}EstimatedArrivalType"/&gt;
 *         &lt;element name="SaturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDeliveryDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSummaryType", propOrder = {
    "service",
    "guaranteed",
    "disclaimer",
    "estimatedArrival",
    "saturdayDelivery",
    "saturdayDeliveryDisclaimer"
})
public class ServiceSummaryType {

    @XmlElement(name = "Service", required = true)
    protected CodeType service;
    @XmlElement(name = "Guaranteed")
    protected List<CodeType> guaranteed;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;
    @XmlElement(name = "EstimatedArrival", required = true)
    protected EstimatedArrivalType estimatedArrival;
    @XmlElement(name = "SaturdayDelivery")
    protected String saturdayDelivery;
    @XmlElement(name = "SaturdayDeliveryDisclaimer")
    protected String saturdayDeliveryDisclaimer;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setService(CodeType value) {
        this.service = value;
    }

    /**
     * Gets the value of the guaranteed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGuaranteed() {
        if (guaranteed == null) {
            guaranteed = new ArrayList<CodeType>();
        }
        return this.guaranteed;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * Gets the value of the estimatedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedArrivalType }
     *     
     */
    public EstimatedArrivalType getEstimatedArrival() {
        return estimatedArrival;
    }

    /**
     * Sets the value of the estimatedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedArrivalType }
     *     
     */
    public void setEstimatedArrival(EstimatedArrivalType value) {
        this.estimatedArrival = value;
    }

    /**
     * Gets the value of the saturdayDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDelivery() {
        return saturdayDelivery;
    }

    /**
     * Sets the value of the saturdayDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDelivery(String value) {
        this.saturdayDelivery = value;
    }

    /**
     * Gets the value of the saturdayDeliveryDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDeliveryDisclaimer() {
        return saturdayDeliveryDisclaimer;
    }

    /**
     * Sets the value of the saturdayDeliveryDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDeliveryDisclaimer(String value) {
        this.saturdayDeliveryDisclaimer = value;
    }

}
