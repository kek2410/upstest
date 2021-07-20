//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 06:23:24 PM KST 
//


package com.ups.shipping.shipconfirmrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegotiatedRatesIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RateChartIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TPFCNegotiatedRatesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserLevelDiscountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInformationType", propOrder = {
    "negotiatedRatesIndicator",
    "rateChartIndicator",
    "tpfcNegotiatedRatesIndicator",
    "userLevelDiscountIndicator"
})
public class RateInformationType {

    @XmlElement(name = "NegotiatedRatesIndicator", required = true)
    protected String negotiatedRatesIndicator;
    @XmlElement(name = "RateChartIndicator", required = true)
    protected String rateChartIndicator;
    @XmlElement(name = "TPFCNegotiatedRatesIndicator")
    protected String tpfcNegotiatedRatesIndicator;
    @XmlElement(name = "UserLevelDiscountIndicator")
    protected String userLevelDiscountIndicator;

    /**
     * Gets the value of the negotiatedRatesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedRatesIndicator() {
        return negotiatedRatesIndicator;
    }

    /**
     * Sets the value of the negotiatedRatesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedRatesIndicator(String value) {
        this.negotiatedRatesIndicator = value;
    }

    /**
     * Gets the value of the rateChartIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateChartIndicator() {
        return rateChartIndicator;
    }

    /**
     * Sets the value of the rateChartIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateChartIndicator(String value) {
        this.rateChartIndicator = value;
    }

    /**
     * Gets the value of the tpfcNegotiatedRatesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPFCNegotiatedRatesIndicator() {
        return tpfcNegotiatedRatesIndicator;
    }

    /**
     * Sets the value of the tpfcNegotiatedRatesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPFCNegotiatedRatesIndicator(String value) {
        this.tpfcNegotiatedRatesIndicator = value;
    }

    /**
     * Gets the value of the userLevelDiscountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLevelDiscountIndicator() {
        return userLevelDiscountIndicator;
    }

    /**
     * Sets the value of the userLevelDiscountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLevelDiscountIndicator(String value) {
        this.userLevelDiscountIndicator = value;
    }

}