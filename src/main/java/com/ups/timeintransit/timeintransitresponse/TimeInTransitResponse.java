//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.26 at 09:38:30 AM KST 
//


package com.ups.timeintransit.timeintransitresponse;

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
 *         &lt;element ref="{}Response"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TransitResponse" type="{}TransitResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="TransitFromList" type="{}TransitFromListType" minOccurs="0"/&gt;
 *           &lt;element name="TransitToList" type="{}TransitToListType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response",
    "transitResponse",
    "transitFromList",
    "transitToList"
})
@XmlRootElement(name = "TimeInTransitResponse")
public class TimeInTransitResponse {

    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "TransitResponse")
    protected List<TransitResponseType> transitResponse;
    @XmlElement(name = "TransitFromList")
    protected TransitFromListType transitFromList;
    @XmlElement(name = "TransitToList")
    protected TransitToListType transitToList;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the transitResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitResponseType }
     * 
     * 
     */
    public List<TransitResponseType> getTransitResponse() {
        if (transitResponse == null) {
            transitResponse = new ArrayList<TransitResponseType>();
        }
        return this.transitResponse;
    }

    /**
     * Gets the value of the transitFromList property.
     * 
     * @return
     *     possible object is
     *     {@link TransitFromListType }
     *     
     */
    public TransitFromListType getTransitFromList() {
        return transitFromList;
    }

    /**
     * Sets the value of the transitFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitFromListType }
     *     
     */
    public void setTransitFromList(TransitFromListType value) {
        this.transitFromList = value;
    }

    /**
     * Gets the value of the transitToList property.
     * 
     * @return
     *     possible object is
     *     {@link TransitToListType }
     *     
     */
    public TransitToListType getTransitToList() {
        return transitToList;
    }

    /**
     * Sets the value of the transitToList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitToListType }
     *     
     */
    public void setTransitToList(TransitToListType value) {
        this.transitToList = value;
    }

}