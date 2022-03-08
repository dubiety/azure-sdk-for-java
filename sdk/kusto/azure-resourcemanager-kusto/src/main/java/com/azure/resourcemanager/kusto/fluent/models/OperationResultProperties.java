// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation result properties. */
@Fluent
public final class OperationResultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationResultProperties.class);

    /*
     * The kind of the operation.
     */
    @JsonProperty(value = "operationKind")
    private String operationKind;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The state of the operation.
     */
    @JsonProperty(value = "operationState")
    private String operationState;

    /**
     * Get the operationKind property: The kind of the operation.
     *
     * @return the operationKind value.
     */
    public String operationKind() {
        return this.operationKind;
    }

    /**
     * Set the operationKind property: The kind of the operation.
     *
     * @param operationKind the operationKind value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withOperationKind(String operationKind) {
        this.operationKind = operationKind;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the operationState property: The state of the operation.
     *
     * @return the operationState value.
     */
    public String operationState() {
        return this.operationState;
    }

    /**
     * Set the operationState property: The state of the operation.
     *
     * @param operationState the operationState value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withOperationState(String operationState) {
        this.operationState = operationState;
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
