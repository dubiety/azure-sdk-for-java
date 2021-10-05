// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The usage names that can be used; currently limited to StorageAccount.
 */
@Immutable
public final class UsageName {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(UsageName.class);

    /*
     * Gets a string describing the resource name.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * Gets a localized string describing the resource name.
     */
    @JsonProperty(value = "localizedValue", access = JsonProperty.Access.WRITE_ONLY)
    private String localizedValue;

    /**
     * Get the value property: Gets a string describing the resource name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the localizedValue property: Gets a localized string describing the
     * resource name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
