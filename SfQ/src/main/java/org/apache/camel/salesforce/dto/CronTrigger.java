/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CronTrigger
 */
@XStreamAlias("CronTrigger")
public class CronTrigger extends AbstractSObjectBase {

    // CronJobDetailId
    private String CronJobDetailId;

    @JsonProperty("CronJobDetailId")
    public String getCronJobDetailId() {
        return this.CronJobDetailId;
    }

    @JsonProperty("CronJobDetailId")
    public void setCronJobDetailId(String CronJobDetailId) {
        this.CronJobDetailId = CronJobDetailId;
    }

    // NextFireTime
    private org.joda.time.DateTime NextFireTime;

    @JsonProperty("NextFireTime")
    public org.joda.time.DateTime getNextFireTime() {
        return this.NextFireTime;
    }

    @JsonProperty("NextFireTime")
    public void setNextFireTime(org.joda.time.DateTime NextFireTime) {
        this.NextFireTime = NextFireTime;
    }

    // PreviousFireTime
    private org.joda.time.DateTime PreviousFireTime;

    @JsonProperty("PreviousFireTime")
    public org.joda.time.DateTime getPreviousFireTime() {
        return this.PreviousFireTime;
    }

    @JsonProperty("PreviousFireTime")
    public void setPreviousFireTime(org.joda.time.DateTime PreviousFireTime) {
        this.PreviousFireTime = PreviousFireTime;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // StartTime
    private org.joda.time.DateTime StartTime;

    @JsonProperty("StartTime")
    public org.joda.time.DateTime getStartTime() {
        return this.StartTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(org.joda.time.DateTime StartTime) {
        this.StartTime = StartTime;
    }

    // EndTime
    private org.joda.time.DateTime EndTime;

    @JsonProperty("EndTime")
    public org.joda.time.DateTime getEndTime() {
        return this.EndTime;
    }

    @JsonProperty("EndTime")
    public void setEndTime(org.joda.time.DateTime EndTime) {
        this.EndTime = EndTime;
    }

    // CronExpression
    private String CronExpression;

    @JsonProperty("CronExpression")
    public String getCronExpression() {
        return this.CronExpression;
    }

    @JsonProperty("CronExpression")
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    // TimeZoneSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private TimeZoneSidKeyEnum TimeZoneSidKey;

    @JsonProperty("TimeZoneSidKey")
    public TimeZoneSidKeyEnum getTimeZoneSidKey() {
        return this.TimeZoneSidKey;
    }

    @JsonProperty("TimeZoneSidKey")
    public void setTimeZoneSidKey(TimeZoneSidKeyEnum TimeZoneSidKey) {
        this.TimeZoneSidKey = TimeZoneSidKey;
    }

    // TimesTriggered
    private Integer TimesTriggered;

    @JsonProperty("TimesTriggered")
    public Integer getTimesTriggered() {
        return this.TimesTriggered;
    }

    @JsonProperty("TimesTriggered")
    public void setTimesTriggered(Integer TimesTriggered) {
        this.TimesTriggered = TimesTriggered;
    }

}
