//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 11:30:28 AM KST 
//


package com.ups.tracking.trackresponse;

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
 *         &lt;element name="AlternateTrackingInfo" type="{}AlternateTrackingInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ActivityLocation" type="{}ActivityLocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{}Status" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMTDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMTTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMTOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDateFromManifestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}NextScheduleActivity" minOccurs="0"/&gt;
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
    "alternateTrackingInfo",
    "activityLocation",
    "status",
    "date",
    "time",
    "gmtDate",
    "gmtTime",
    "gmtOffset",
    "deliveryDateFromManifestIndicator",
    "nextScheduleActivity"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "AlternateTrackingInfo")
    protected List<AlternateTrackingInfoType> alternateTrackingInfo;
    @XmlElement(name = "ActivityLocation")
    protected ActivityLocationType activityLocation;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "GMTDate")
    protected String gmtDate;
    @XmlElement(name = "GMTTime")
    protected String gmtTime;
    @XmlElement(name = "GMTOffset")
    protected String gmtOffset;
    @XmlElement(name = "DeliveryDateFromManifestIndicator")
    protected String deliveryDateFromManifestIndicator;
    @XmlElement(name = "NextScheduleActivity")
    protected NextScheduleActivity nextScheduleActivity;

    /**
     * Gets the value of the alternateTrackingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateTrackingInfoType }
     * 
     * 
     */
    public List<AlternateTrackingInfoType> getAlternateTrackingInfo() {
        if (alternateTrackingInfo == null) {
            alternateTrackingInfo = new ArrayList<AlternateTrackingInfoType>();
        }
        return this.alternateTrackingInfo;
    }

    /**
     * Gets the value of the activityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLocationType }
     *     
     */
    public ActivityLocationType getActivityLocation() {
        return activityLocation;
    }

    /**
     * Sets the value of the activityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLocationType }
     *     
     */
    public void setActivityLocation(ActivityLocationType value) {
        this.activityLocation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the gmtDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMTDate() {
        return gmtDate;
    }

    /**
     * Sets the value of the gmtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMTDate(String value) {
        this.gmtDate = value;
    }

    /**
     * Gets the value of the gmtTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMTTime() {
        return gmtTime;
    }

    /**
     * Sets the value of the gmtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMTTime(String value) {
        this.gmtTime = value;
    }

    /**
     * Gets the value of the gmtOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMTOffset() {
        return gmtOffset;
    }

    /**
     * Sets the value of the gmtOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMTOffset(String value) {
        this.gmtOffset = value;
    }

    /**
     * Gets the value of the deliveryDateFromManifestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDateFromManifestIndicator() {
        return deliveryDateFromManifestIndicator;
    }

    /**
     * Sets the value of the deliveryDateFromManifestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDateFromManifestIndicator(String value) {
        this.deliveryDateFromManifestIndicator = value;
    }

    /**
     * Gets the value of the nextScheduleActivity property.
     * 
     * @return
     *     possible object is
     *     {@link NextScheduleActivity }
     *     
     */
    public NextScheduleActivity getNextScheduleActivity() {
        return nextScheduleActivity;
    }

    /**
     * Sets the value of the nextScheduleActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextScheduleActivity }
     *     
     */
    public void setNextScheduleActivity(NextScheduleActivity value) {
        this.nextScheduleActivity = value;
    }

}
