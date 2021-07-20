//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 06:09:13 PM KST 
//


package com.ups.shipping.labelrecoveryrequest;

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
 *         &lt;element ref="{}TransactionReference" minOccurs="0"/&gt;
 *         &lt;element name="RequestAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "transactionReference",
    "requestAction",
    "subVersion"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "TransactionReference")
    protected TransactionReference transactionReference;
    @XmlElement(name = "RequestAction", required = true)
    protected String requestAction;
    @XmlElement(name = "SubVersion")
    protected String subVersion;

    /**
     * Gets the value of the transactionReference property.
     *
     * @return
     *     possible object is
     *     {@link TransactionReference }
     *
     */
    public TransactionReference getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionReference }
     *
     */
    public void setTransactionReference(TransactionReference value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the requestAction property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestAction() {
        return requestAction;
    }

    /**
     * Sets the value of the requestAction property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestAction(String value) {
        this.requestAction = value;
    }

    /**
     * Gets the value of the subVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubVersion() {
        return subVersion;
    }

    /**
     * Sets the value of the subVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubVersion(String value) {
        this.subVersion = value;
    }

}
