// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** keyValue. */
@Fluent
public final class MicrosoftGraphKeyValue {
    /*
     * Key for the key-value pair.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * Value for the key-value pair.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * keyValue
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the key property: Key for the key-value pair.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Key for the key-value pair.
     *
     * @param key the key value to set.
     * @return the MicrosoftGraphKeyValue object itself.
     */
    public MicrosoftGraphKeyValue withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Value for the key-value pair.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value for the key-value pair.
     *
     * @param value the value value to set.
     * @return the MicrosoftGraphKeyValue object itself.
     */
    public MicrosoftGraphKeyValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: keyValue.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: keyValue.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphKeyValue object itself.
     */
    public MicrosoftGraphKeyValue withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
