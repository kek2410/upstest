//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 06:24:08 PM KST 
//


package com.ups.shipping.voidshipmentrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="Request" type="{}RequestType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ExpandedVoidShipment" type="{}ExpandedVoidShipmentType"/&gt;
 *         &lt;/choice&gt;
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
    "shipmentIdentificationNumber",
    "expandedVoidShipment"
})
@XmlRootElement(name = "VoidShipmentRequest")
public class VoidShipmentRequest {

    @XmlElement(name = "Request", required = true)
    protected RequestType request;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "ExpandedVoidShipment")
    protected ExpandedVoidShipmentType expandedVoidShipment;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the shipmentIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * Sets the value of the shipmentIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * Gets the value of the expandedVoidShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ExpandedVoidShipmentType }
     *     
     */
    public ExpandedVoidShipmentType getExpandedVoidShipment() {
        return expandedVoidShipment;
    }

    /**
     * Sets the value of the expandedVoidShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpandedVoidShipmentType }
     *     
     */
    public void setExpandedVoidShipment(ExpandedVoidShipmentType value) {
        this.expandedVoidShipment = value;
    }

}
