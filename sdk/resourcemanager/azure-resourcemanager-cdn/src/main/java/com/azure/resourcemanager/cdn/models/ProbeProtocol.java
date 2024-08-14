// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

/**
 * Protocol to use for health probe.
 */
public enum ProbeProtocol {
    /**
     * Enum value NotSet.
     */
    NOT_SET("NotSet"),

    /**
     * Enum value Http.
     */
    HTTP("Http"),

    /**
     * Enum value Https.
     */
    HTTPS("Https");

    /**
     * The actual serialized value for a ProbeProtocol instance.
     */
    private final String value;

    ProbeProtocol(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProbeProtocol instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ProbeProtocol object, or null if unable to parse.
     */
    public static ProbeProtocol fromString(String value) {
        if (value == null) {
            return null;
        }
        ProbeProtocol[] items = ProbeProtocol.values();
        for (ProbeProtocol item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
