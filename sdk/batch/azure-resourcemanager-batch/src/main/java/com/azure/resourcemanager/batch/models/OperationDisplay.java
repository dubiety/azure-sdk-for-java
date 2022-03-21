// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that describes the operation. */
@Fluent
public final class OperationDisplay {
    /*
     * Friendly name of the resource provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The operation type. For example: read, write, delete, or listKeys/action
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * The resource type on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The friendly name of the operation
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: Friendly name of the resource provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Friendly name of the resource provider.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the operation property: The operation type. For example: read, write, delete, or listKeys/action.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation type. For example: read, write, delete, or listKeys/action.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the resource property: The resource type on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource type on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the description property: The friendly name of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The friendly name of the operation.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
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
