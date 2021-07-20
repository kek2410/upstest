//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.26 at 09:37:53 AM KST 
//


package com.ups.timeintransit.timeintransitrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Request"/&gt;
 *         &lt;element name="TransitFrom" type="{}TransitFromType"/&gt;
 *         &lt;element name="TransitTo" type="{}TransitToType"/&gt;
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPackagesInShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllServicesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnContractServices" type="{}ReturnContractServicesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "transitFrom",
    "transitTo",
    "shipmentWeight",
    "totalPackagesInShipment",
    "pickupDate",
    "time",
    "invoiceLineTotal",
    "documentsOnlyIndicator",
    "maximumListSize",
    "includeAllServicesIndicator",
    "returnContractServices"
})
@XmlRootElement(name = "TimeInTransitRequest")
public class TimeInTransitRequest {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "TransitFrom", required = true)
    protected TransitFromType transitFrom;
    @XmlElement(name = "TransitTo", required = true)
    protected TransitToType transitTo;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "TotalPackagesInShipment")
    protected String totalPackagesInShipment;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "InvoiceLineTotal")
    protected MonetaryType invoiceLineTotal;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "MaximumListSize")
    protected String maximumListSize;
    @XmlElement(name = "IncludeAllServicesIndicator")
    protected String includeAllServicesIndicator;
    @XmlElement(name = "ReturnContractServices")
    protected List<ReturnContractServicesType> returnContractServices;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

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
     * Gets the value of the totalPackagesInShipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPackagesInShipment() {
        return totalPackagesInShipment;
    }

    /**
     * Sets the value of the totalPackagesInShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPackagesInShipment(String value) {
        this.totalPackagesInShipment = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
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
     * Gets the value of the includeAllServicesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAllServicesIndicator() {
        return includeAllServicesIndicator;
    }

    /**
     * Sets the value of the includeAllServicesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAllServicesIndicator(String value) {
        this.includeAllServicesIndicator = value;
    }

    /**
     * Gets the value of the returnContractServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnContractServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnContractServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnContractServicesType }
     * 
     * 
     */
    public List<ReturnContractServicesType> getReturnContractServices() {
        if (returnContractServices == null) {
            returnContractServices = new ArrayList<ReturnContractServicesType>();
        }
        return this.returnContractServices;
    }

}
