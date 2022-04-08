// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Database connection string value to type pair. */
@Fluent
public final class ConnStringValueTypePair {
    /*
     * Value of pair.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Type of database.
     */
    @JsonProperty(value = "type", required = true)
    private ConnectionStringType type;

    /**
     * Get the value property: Value of pair.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of pair.
     *
     * @param value the value value to set.
     * @return the ConnStringValueTypePair object itself.
     */
    public ConnStringValueTypePair withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the type property: Type of database.
     *
     * @return the type value.
     */
    public ConnectionStringType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of database.
     *
     * @param type the type value to set.
     * @return the ConnStringValueTypePair object itself.
     */
    public ConnStringValueTypePair withType(ConnectionStringType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ConnStringValueTypePair"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ConnStringValueTypePair"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnStringValueTypePair.class);
}
