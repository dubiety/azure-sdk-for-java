// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the workload operation. */
@Fluent
public class OperationsDisplayDefinition {
    /*
     * Defines the workload provider.
     */
    @JsonProperty(value = "provider", required = true)
    private String provider;

    /*
     * Defines the workload resource.
     */
    @JsonProperty(value = "resource", required = true)
    private String resource;

    /*
     * Defines the workload operation.
     */
    @JsonProperty(value = "operation", required = true)
    private String operation;

    /*
     * Describes the workload operation.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get the provider property: Defines the workload provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Defines the workload provider.
     *
     * @param provider the provider value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Defines the workload resource.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Defines the workload resource.
     *
     * @param resource the resource value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Defines the workload operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Defines the workload operation.
     *
     * @param operation the operation value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Describes the workload operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Describes the workload operation.
     *
     * @param description the description value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (provider() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property provider in model OperationsDisplayDefinition"));
        }
        if (resource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model OperationsDisplayDefinition"));
        }
        if (operation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operation in model OperationsDisplayDefinition"));
        }
        if (description() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property description in model OperationsDisplayDefinition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OperationsDisplayDefinition.class);
}
