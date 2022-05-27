// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The value of a parameter. */
@Fluent
public final class ParameterValuesValue {
    /*
     * The value of the parameter.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Get the value property: The value of the parameter.
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the parameter.
     *
     * @param value the value value to set.
     * @return the ParameterValuesValue object itself.
     */
    public ParameterValuesValue withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
