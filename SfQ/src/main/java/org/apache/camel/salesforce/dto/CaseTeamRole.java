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
 * Salesforce DTO for SObject CaseTeamRole
 */
@XStreamAlias("CaseTeamRole")
public class CaseTeamRole extends AbstractSObjectBase {

    // AccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private AccessLevelEnum AccessLevel;

    @JsonProperty("AccessLevel")
    public AccessLevelEnum getAccessLevel() {
        return this.AccessLevel;
    }

    @JsonProperty("AccessLevel")
    public void setAccessLevel(AccessLevelEnum AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    // PreferencesVisibleInCSP
    private Boolean PreferencesVisibleInCSP;

    @JsonProperty("PreferencesVisibleInCSP")
    public Boolean getPreferencesVisibleInCSP() {
        return this.PreferencesVisibleInCSP;
    }

    @JsonProperty("PreferencesVisibleInCSP")
    public void setPreferencesVisibleInCSP(Boolean PreferencesVisibleInCSP) {
        this.PreferencesVisibleInCSP = PreferencesVisibleInCSP;
    }

}