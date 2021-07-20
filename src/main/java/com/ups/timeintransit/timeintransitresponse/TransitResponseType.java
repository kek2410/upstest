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
 * <p>Java class for TransitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransitFrom" type="{}TransitFromType"/&gt;
 *         &lt;element name="TransitTo" type="{}TransitToType"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{}DocumentsOnlyIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AutoDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceSummary" type="{}ServiceSummaryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MaximumListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitResponseType", propOrder = {
    "transitFrom",
    "transitTo",
    "pickupDate",
    "documentsOnlyIndicator",
    "autoDutyCode",
    "shipmentWeight",
    "invoiceLineTotal",
    "serviceSummary",
    "maximumListSize",
    "disclaimer"
})
public class TransitResponseType {

    @XmlElement(name = "TransitFrom", required = true)
    protected TransitFromType transitFrom;
    @XmlElement(name = "TransitTo", required = true)
    protected TransitToType transitTo;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "AutoDutyCode")
    protected String autoDutyCode;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "InvoiceLineTotal")
    protected MonetaryType invoiceLineTotal;
    @XmlElement(name = "ServiceSummary", required = true)
    protected List<ServiceSummaryType> serviceSummary;
    @XmlElement(name = "MaximumListSize")
    protected String maximumListSize;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;

    /**
     * Gets the value of the transitFrom property.
     * 
     * @return
     *     possible object is
     *     {@link TransitFromType }
     *     
     */
    public TransitFromType getTransitFrom() {
        return transitFrom;
    }

    /**
     * Sets the value of the transitFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitFromType }
     *     
     */
    public void setTransitFrom(TransitFromType value) {
        this.transitFrom = value;
    }

    /**
     * Gets the value of the transitTo property.
     * 
     * @return
     *     possible object is
     *     {@link TransitToType }
     *     
     */
    public TransitToType getTransitTo() {
        return transitTo;
    }

    /**
     * Sets the value of the transitTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitToType }
     *     
     */
    public void setTransitTo(TransitToType value) {
        this.transitTo = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the documentsOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * Sets the value of the documentsOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * Gets the value of the autoDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoDutyCode() {
        return autoDutyCode;
    }

    /**
     * Sets the value of the autoDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoDutyCode(String value) {
        this.autoDutyCode = value;
    }

    /**
     * Gets the value of the shipmentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * Sets the value of the shipmentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setShipmentWeight(WeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * Gets the value of the invoiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *     
     */
    public MonetaryType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * Sets the value of the invoiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *     
     */
    public void setInvoiceLineTotal(MonetaryType value) {
        this.invoiceLineTotal = value;
    }

    /**
     * Gets the value of the serviceSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSummaryType }
     * 
     * 
     */
    public List<ServiceSummaryType> getServiceSummary() {
        if (serviceSummary == null) {
            serviceSummary = new ArrayList<ServiceSummaryType>();
        }
        return this.serviceSummary;
    }

    /**
     * Gets the value of the maximumListSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumListSize() {
        return maximumListSize;
    }

    /**
     * Sets the value of the maximumListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumListSize(String value) {
        this.maximumListSize = value;
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

}