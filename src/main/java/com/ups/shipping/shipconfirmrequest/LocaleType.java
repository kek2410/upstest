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
 * <p>Java class for LocaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Dialect" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocaleType", propOrder = {
    "language",
    "dialect"
})
public class LocaleType {

    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "Dialect", required = true)
    protected String dialect;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the dialect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialect() {
        return dialect;
    }

    /**
     * Sets the value of the dialect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialect(String value) {
        this.dialect = value;
    }

}
