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
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestOption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionReference" type="{http://www.ups.com/XMLSchema/UXOLT/Common/v1.0}TransactionReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "requestOption",
    "subVersion",
    "transactionReference"
})
public class RequestType {

    @XmlElement(name = "RequestOption", namespace = "http://www.ups.com/XMLSchema/UXOLT/Common/v1.0")
    protected List<String> requestOption;
    @XmlElement(name = "SubVersion", namespace = "http://www.ups.com/XMLSchema/UXOLT/Common/v1.0")
    protected String subVersion;
    @XmlElement(name = "TransactionReference", namespace = "http://www.ups.com/XMLSchema/UXOLT/Common/v1.0")
    protected TransactionReferenceType transactionReference;

    /**
     * Gets the value of the requestOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestOption() {
        if (requestOption == null) {
            requestOption = new ArrayList<String>();
        }
        return this.requestOption;
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

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceType }
     *     
     */
    public void setTransactionReference(TransactionReferenceType value) {
        this.transactionReference = value;
    }

}
