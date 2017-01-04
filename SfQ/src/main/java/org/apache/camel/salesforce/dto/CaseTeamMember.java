/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CaseTeamMember
 */
@XStreamAlias("CaseTeamMember")
public class CaseTeamMember extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // MemberId
    private String MemberId;

    @JsonProperty("MemberId")
    public String getMemberId() {
        return this.MemberId;
    }

    @JsonProperty("MemberId")
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    // TeamTemplateMemberId
    private String TeamTemplateMemberId;

    @JsonProperty("TeamTemplateMemberId")
    public String getTeamTemplateMemberId() {
        return this.TeamTemplateMemberId;
    }

    @JsonProperty("TeamTemplateMemberId")
    public void setTeamTemplateMemberId(String TeamTemplateMemberId) {
        this.TeamTemplateMemberId = TeamTemplateMemberId;
    }

    // TeamRoleId
    private String TeamRoleId;

    @JsonProperty("TeamRoleId")
    public String getTeamRoleId() {
        return this.TeamRoleId;
    }

    @JsonProperty("TeamRoleId")
    public void setTeamRoleId(String TeamRoleId) {
        this.TeamRoleId = TeamRoleId;
    }

}
