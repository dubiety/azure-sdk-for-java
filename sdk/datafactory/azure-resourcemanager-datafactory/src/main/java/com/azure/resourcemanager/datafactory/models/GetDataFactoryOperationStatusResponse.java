// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Response body structure for get data factory operation status. */
@Fluent
public final class GetDataFactoryOperationStatusResponse {
    /*
     * Status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Response body structure for get data factory operation status.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the status property: Status of the operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the operation.
     *
     * @param status the status value to set.
     * @return the GetDataFactoryOperationStatusResponse object itself.
     */
    public GetDataFactoryOperationStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: Response body structure for get data factory operation status.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Response body structure for get data factory operation status.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GetDataFactoryOperationStatusResponse object itself.
     */
    public GetDataFactoryOperationStatusResponse withAdditionalProperties(Map<String, Object> additionalProperties) {
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
