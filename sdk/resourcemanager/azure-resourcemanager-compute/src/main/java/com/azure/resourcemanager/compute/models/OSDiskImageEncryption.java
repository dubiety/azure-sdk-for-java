// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains encryption settings for an OS disk image. */
@Fluent
public final class OSDiskImageEncryption extends DiskImageEncryption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSDiskImageEncryption.class);

    /*
     * This property specifies the security profile of an OS disk image.
     */
    @JsonProperty(value = "securityProfile")
    private OSDiskImageSecurityProfile securityProfile;

    /**
     * Get the securityProfile property: This property specifies the security profile of an OS disk image.
     *
     * @return the securityProfile value.
     */
    public OSDiskImageSecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: This property specifies the security profile of an OS disk image.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the OSDiskImageEncryption object itself.
     */
    public OSDiskImageEncryption withSecurityProfile(OSDiskImageSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OSDiskImageEncryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        super.withDiskEncryptionSetId(diskEncryptionSetId);
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
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }
}
