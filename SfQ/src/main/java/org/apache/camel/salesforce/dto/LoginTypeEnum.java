/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LoginType
 */
public enum LoginTypeEnum {

    ; // empty picklist!

    final String value;

    private LoginTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LoginTypeEnum fromValue(String value) {
        for (LoginTypeEnum e : LoginTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}