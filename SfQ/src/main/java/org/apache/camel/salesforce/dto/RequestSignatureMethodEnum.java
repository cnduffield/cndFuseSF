/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RequestSignatureMethod
 */
public enum RequestSignatureMethodEnum {

    // RSA-SHA1
    RSA_SHA1("RSA-SHA1"),
    // RSA-SHA256
    RSA_SHA256("RSA-SHA256");

    final String value;

    private RequestSignatureMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RequestSignatureMethodEnum fromValue(String value) {
        for (RequestSignatureMethodEnum e : RequestSignatureMethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
