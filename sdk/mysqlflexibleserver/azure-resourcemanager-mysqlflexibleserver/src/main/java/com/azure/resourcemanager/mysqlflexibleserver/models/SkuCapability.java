// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sku capability. */
@Immutable
public final class SkuCapability {
    /*
     * vCore name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * supported vCores
     */
    @JsonProperty(value = "vCores", access = JsonProperty.Access.WRITE_ONLY)
    private Long vCores;

    /*
     * supported IOPS
     */
    @JsonProperty(value = "supportedIops", access = JsonProperty.Access.WRITE_ONLY)
    private Long supportedIops;

    /*
     * supported memory per vCore in MB
     */
    @JsonProperty(value = "supportedMemoryPerVCoreMB", access = JsonProperty.Access.WRITE_ONLY)
    private Long supportedMemoryPerVCoreMB;

    /**
     * Get the name property: vCore name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the vCores property: supported vCores.
     *
     * @return the vCores value.
     */
    public Long vCores() {
        return this.vCores;
    }

    /**
     * Get the supportedIops property: supported IOPS.
     *
     * @return the supportedIops value.
     */
    public Long supportedIops() {
        return this.supportedIops;
    }

    /**
     * Get the supportedMemoryPerVCoreMB property: supported memory per vCore in MB.
     *
     * @return the supportedMemoryPerVCoreMB value.
     */
    public Long supportedMemoryPerVCoreMB() {
        return this.supportedMemoryPerVCoreMB;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
