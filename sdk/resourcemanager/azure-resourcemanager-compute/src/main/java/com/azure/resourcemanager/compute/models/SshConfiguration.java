// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SSH configuration for Linux based VMs running on Azure. */
@Fluent
public final class SshConfiguration {
    /*
     * The list of SSH public keys used to authenticate with linux based VMs.
     */
    @JsonProperty(value = "publicKeys")
    private List<SshPublicKey> publicKeys;

    /**
     * Get the publicKeys property: The list of SSH public keys used to authenticate with linux based VMs.
     *
     * @return the publicKeys value.
     */
    public List<SshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to authenticate with linux based VMs.
     *
     * @param publicKeys the publicKeys value to set.
     * @return the SshConfiguration object itself.
     */
    public SshConfiguration withPublicKeys(List<SshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicKeys() != null) {
            publicKeys().forEach(e -> e.validate());
        }
    }
}
