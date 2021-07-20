//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 11:30:01 AM KST 
//


package com.ups.tracking.trackrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ElementLevelInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementLevelInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ElementIdentifier" type="{http://www.ups.com/XMLSchema/UXOLT/Common/v1.0}ElementIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementLevelInformationType", propOrder = {
    "level",
    "elementIdentifier"
})
public class ElementLevelInformationType {

    @XmlElement(name = "Level", namespace = "http://www.ups.com/XMLSchema/UXOLT/Common/v1.0", required = true)
    protected String level;
    @XmlElement(name = "ElementIdentifier", namespace = "http://www.ups.com/XMLSchema/UXOLT/Common/v1.0")
    protected List<ElementIdentifierType> elementIdentifier;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the elementIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementIdentifierType }
     * 
     * 
     */
    public List<ElementIdentifierType> getElementIdentifier() {
        if (elementIdentifier == null) {
            elementIdentifier = new ArrayList<ElementIdentifierType>();
        }
        return this.elementIdentifier;
    }

}
