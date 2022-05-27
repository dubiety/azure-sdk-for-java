// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.BlobInventoryPolicySchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The storage account blob inventory policy properties. */
@Fluent
public final class BlobInventoryPolicyProperties {
    /*
     * Returns the last modified date and time of the blob inventory policy.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * The storage account blob inventory policy object. It is composed of
     * policy rules.
     */
    @JsonProperty(value = "policy", required = true)
    private BlobInventoryPolicySchema policy;

    /**
     * Get the lastModifiedTime property: Returns the last modified date and time of the blob inventory policy.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the policy property: The storage account blob inventory policy object. It is composed of policy rules.
     *
     * @return the policy value.
     */
    public BlobInventoryPolicySchema policy() {
        return this.policy;
    }

    /**
     * Set the policy property: The storage account blob inventory policy object. It is composed of policy rules.
     *
     * @param policy the policy value to set.
     * @return the BlobInventoryPolicyProperties object itself.
     */
    public BlobInventoryPolicyProperties withPolicy(BlobInventoryPolicySchema policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policy() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property policy in model BlobInventoryPolicyProperties"));
        } else {
            policy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobInventoryPolicyProperties.class);
}
