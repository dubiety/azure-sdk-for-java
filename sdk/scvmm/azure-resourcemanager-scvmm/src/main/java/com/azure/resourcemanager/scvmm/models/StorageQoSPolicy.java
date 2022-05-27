// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageQoSPolicy definition. */
@Fluent
public final class StorageQoSPolicy {
    /*
     * The name of the policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The ID of the QoS policy.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The maximum IO operations per second.
     */
    @JsonProperty(value = "iopsMaximum")
    private Long iopsMaximum;

    /*
     * The minimum IO operations per second.
     */
    @JsonProperty(value = "iopsMinimum")
    private Long iopsMinimum;

    /*
     * The Bandwidth Limit for internet traffic.
     */
    @JsonProperty(value = "bandwidthLimit")
    private Long bandwidthLimit;

    /*
     * The underlying policy.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /**
     * Get the name property: The name of the policy.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the policy.
     *
     * @param name the name value to set.
     * @return the StorageQoSPolicy object itself.
     */
    public StorageQoSPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The ID of the QoS policy.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the QoS policy.
     *
     * @param id the id value to set.
     * @return the StorageQoSPolicy object itself.
     */
    public StorageQoSPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the iopsMaximum property: The maximum IO operations per second.
     *
     * @return the iopsMaximum value.
     */
    public Long iopsMaximum() {
        return this.iopsMaximum;
    }

    /**
     * Set the iopsMaximum property: The maximum IO operations per second.
     *
     * @param iopsMaximum the iopsMaximum value to set.
     * @return the StorageQoSPolicy object itself.
     */
    public StorageQoSPolicy withIopsMaximum(Long iopsMaximum) {
        this.iopsMaximum = iopsMaximum;
        return this;
    }

    /**
     * Get the iopsMinimum property: The minimum IO operations per second.
     *
     * @return the iopsMinimum value.
     */
    public Long iopsMinimum() {
        return this.iopsMinimum;
    }

    /**
     * Set the iopsMinimum property: The minimum IO operations per second.
     *
     * @param iopsMinimum the iopsMinimum value to set.
     * @return the StorageQoSPolicy object itself.
     */
    public StorageQoSPolicy withIopsMinimum(Long iopsMinimum) {
        this.iopsMinimum = iopsMinimum;
        return this;
    }

    /**
     * Get the bandwidthLimit property: The Bandwidth Limit for internet traffic.
     *
     * @return the bandwidthLimit value.
     */
    public Long bandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * Set the bandwidthLimit property: The Bandwidth Limit for internet traffic.
     *
     * @param bandwidthLimit the bandwidthLimit value to set.
     * @return the StorageQoSPolicy object itself.
     */
    public StorageQoSPolicy withBandwidthLimit(Long bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }

    /**
     * Get the policyId property: The underlying policy.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The underlying policy.
     *
     * @param policyId the policyId value to set.
     * @return the StorageQoSPolicy object itself.
     */
    public StorageQoSPolicy withPolicyId(String policyId) {
        this.policyId = policyId;
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
