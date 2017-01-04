/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceRegeneratedType
 */
public enum RecurrenceRegeneratedTypeEnum {

    // RecurrenceRegenerateAfterDueDate
    RECURRENCEREGENERATEAFTERDUEDATE("RecurrenceRegenerateAfterDueDate"),
    // RecurrenceRegenerateAfterToday
    RECURRENCEREGENERATEAFTERTODAY("RecurrenceRegenerateAfterToday"),
    // RecurrenceRegenerated
    RECURRENCEREGENERATED("RecurrenceRegenerated");

    final String value;

    private RecurrenceRegeneratedTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RecurrenceRegeneratedTypeEnum fromValue(String value) {
        for (RecurrenceRegeneratedTypeEnum e : RecurrenceRegeneratedTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}