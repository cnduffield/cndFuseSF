/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist GeoCodeAccuracy
 */
public enum GeoCodeAccuracyEnum {

    // 0
    _0("0"),
    // A
    A("A"),
    // B
    B("B"),
    // C
    C("C"),
    // D
    D("D"),
    // G
    G("G"),
    // H
    H("H"),
    // I
    I("I"),
    // K
    K("K"),
    // L
    L("L"),
    // M
    M("M"),
    // N
    N("N"),
    // P
    P("P"),
    // S
    S("S"),
    // T
    T("T"),
    // Z
    Z("Z");

    final String value;

    private GeoCodeAccuracyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static GeoCodeAccuracyEnum fromValue(String value) {
        for (GeoCodeAccuracyEnum e : GeoCodeAccuracyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
