// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Azure VM (Mercury) workload-specific backup policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("GenericProtectionPolicy")
@Fluent
public final class GenericProtectionPolicy extends ProtectionPolicy {
    /*
     * List of sub-protection policies which includes schedule and retention
     */
    @JsonProperty(value = "subProtectionPolicy")
    private List<SubProtectionPolicy> subProtectionPolicy;

    /*
     * TimeZone optional input as string. For example: TimeZone = "Pacific
     * Standard Time".
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Name of this policy's fabric.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /**
     * Get the subProtectionPolicy property: List of sub-protection policies which includes schedule and retention.
     *
     * @return the subProtectionPolicy value.
     */
    public List<SubProtectionPolicy> subProtectionPolicy() {
        return this.subProtectionPolicy;
    }

    /**
     * Set the subProtectionPolicy property: List of sub-protection policies which includes schedule and retention.
     *
     * @param subProtectionPolicy the subProtectionPolicy value to set.
     * @return the GenericProtectionPolicy object itself.
     */
    public GenericProtectionPolicy withSubProtectionPolicy(List<SubProtectionPolicy> subProtectionPolicy) {
        this.subProtectionPolicy = subProtectionPolicy;
        return this;
    }

    /**
     * Get the timeZone property: TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @param timeZone the timeZone value to set.
     * @return the GenericProtectionPolicy object itself.
     */
    public GenericProtectionPolicy withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the fabricName property: Name of this policy's fabric.
     *
     * @return the fabricName value.
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set the fabricName property: Name of this policy's fabric.
     *
     * @param fabricName the fabricName value to set.
     * @return the GenericProtectionPolicy object itself.
     */
    public GenericProtectionPolicy withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectionPolicy withProtectedItemsCount(Integer protectedItemsCount) {
        super.withProtectedItemsCount(protectedItemsCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectionPolicy withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (subProtectionPolicy() != null) {
            subProtectionPolicy().forEach(e -> e.validate());
        }
    }
}
