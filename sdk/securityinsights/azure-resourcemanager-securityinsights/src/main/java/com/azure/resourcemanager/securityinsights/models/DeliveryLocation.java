// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DeliveryLocation. */
public enum DeliveryLocation {
    /** Enum value Unknown. */
    UNKNOWN("Unknown"),

    /** Enum value Inbox. */
    INBOX("Inbox"),

    /** Enum value JunkFolder. */
    JUNK_FOLDER("JunkFolder"),

    /** Enum value DeletedFolder. */
    DELETED_FOLDER("DeletedFolder"),

    /** Enum value Quarantine. */
    QUARANTINE("Quarantine"),

    /** Enum value External. */
    EXTERNAL("External"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Dropped. */
    DROPPED("Dropped"),

    /** Enum value Forwarded. */
    FORWARDED("Forwarded");

    /** The actual serialized value for a DeliveryLocation instance. */
    private final String value;

    DeliveryLocation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DeliveryLocation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DeliveryLocation object, or null if unable to parse.
     */
    @JsonCreator
    public static DeliveryLocation fromString(String value) {
        DeliveryLocation[] items = DeliveryLocation.values();
        for (DeliveryLocation item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
