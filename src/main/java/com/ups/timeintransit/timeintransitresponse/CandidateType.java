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


/**
 * <p>Java class for CandidateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressArtifactFormat" type="{}AddressArtifactFormatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateType", propOrder = {
    "addressArtifactFormat"
})
public class CandidateType {

    @XmlElement(name = "AddressArtifactFormat", required = true)
    protected AddressArtifactFormatType addressArtifactFormat;

    /**
     * Gets the value of the addressArtifactFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AddressArtifactFormatType }
     *     
     */
    public AddressArtifactFormatType getAddressArtifactFormat() {
        return addressArtifactFormat;
    }

    /**
     * Sets the value of the addressArtifactFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressArtifactFormatType }
     *     
     */
    public void setAddressArtifactFormat(AddressArtifactFormatType value) {
        this.addressArtifactFormat = value;
    }

}
