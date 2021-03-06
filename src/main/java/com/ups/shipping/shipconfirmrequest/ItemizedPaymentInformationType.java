//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 06:23:24 PM KST 
//


package com.ups.shipping.shipconfirmrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ItemizedPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemizedPaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentCharge" type="{}ShipmentChargeType" maxOccurs="2"/&gt;
 *         &lt;element name="SplitDutyVATIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ItemizedPaymentInformationType", propOrder = {
    "shipmentCharge",
    "splitDutyVATIndicator"
})
public class ItemizedPaymentInformationType {

    @XmlElement(name = "ShipmentCharge", required = true)
    protected List<ShipmentChargeType> shipmentCharge;
    @XmlElement(name = "SplitDutyVATIndicator")
    protected String splitDutyVATIndicator;

    /**
     * Gets the value of the shipmentCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentChargeType }
     * 
     * 
     */
    public List<ShipmentChargeType> getShipmentCharge() {
        if (shipmentCharge == null) {
            shipmentCharge = new ArrayList<ShipmentChargeType>();
        }
        return this.shipmentCharge;
    }

    /**
     * Gets the value of the splitDutyVATIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitDutyVATIndicator() {
        return splitDutyVATIndicator;
    }

    /**
     * Sets the value of the splitDutyVATIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitDutyVATIndicator(String value) {
        this.splitDutyVATIndicator = value;
    }

}
