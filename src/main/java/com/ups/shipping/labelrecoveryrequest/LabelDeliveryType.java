//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 06:09:13 PM KST 
//


package com.ups.shipping.labelrecoveryrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LabelLinkIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelDeliveryType", propOrder = {
    "labelLinkIndicator"
})
public class LabelDeliveryType {

    @XmlElement(name = "LabelLinkIndicator")
    protected LabelLinkIndicator labelLinkIndicator;

    /**
     * Gets the value of the labelLinkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link LabelLinkIndicator }
     *     
     */
    public LabelLinkIndicator getLabelLinkIndicator() {
        return labelLinkIndicator;
    }

    /**
     * Sets the value of the labelLinkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelLinkIndicator }
     *     
     */
    public void setLabelLinkIndicator(LabelLinkIndicator value) {
        this.labelLinkIndicator = value;
    }

}