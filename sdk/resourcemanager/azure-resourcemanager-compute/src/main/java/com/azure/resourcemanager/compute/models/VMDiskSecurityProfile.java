// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the security profile settings for the managed disk. &lt;br&gt;&lt;br&gt; NOTE: It can only be set for
 * Confidential VMs.
 */
@Fluent
public final class VMDiskSecurityProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMDiskSecurityProfile.class);

    /*
     * Specifies the EncryptionType of the managed disk. <br> It is set to
     * DiskWithVMGuestState for encryption of the managed disk along with
     * VMGuestState blob, and VMGuestStateOnly for encryption of just the
     * VMGuestState blob. <br><br> NOTE: It can be set for only Confidential
     * VMs.
     */
    @JsonProperty(value = "securityEncryptionType")
    private SecurityEncryptionTypes securityEncryptionType;

    /*
     * Specifies the customer managed disk encryption set resource id for the
     * managed disk that is used for Customer Managed Key encrypted
     * ConfidentialVM OS Disk and VMGuest blob.
     */
    @JsonProperty(value = "diskEncryptionSet")
    private DiskEncryptionSetParameters diskEncryptionSet;

    /**
     * Get the securityEncryptionType property: Specifies the EncryptionType of the managed disk. &lt;br&gt; It is set
     * to DiskWithVMGuestState for encryption of the managed disk along with VMGuestState blob, and VMGuestStateOnly for
     * encryption of just the VMGuestState blob. &lt;br&gt;&lt;br&gt; NOTE: It can be set for only Confidential VMs.
     *
     * @return the securityEncryptionType value.
     */
    public SecurityEncryptionTypes securityEncryptionType() {
        return this.securityEncryptionType;
    }

    /**
     * Set the securityEncryptionType property: Specifies the EncryptionType of the managed disk. &lt;br&gt; It is set
     * to DiskWithVMGuestState for encryption of the managed disk along with VMGuestState blob, and VMGuestStateOnly for
     * encryption of just the VMGuestState blob. &lt;br&gt;&lt;br&gt; NOTE: It can be set for only Confidential VMs.
     *
     * @param securityEncryptionType the securityEncryptionType value to set.
     * @return the VMDiskSecurityProfile object itself.
     */
    public VMDiskSecurityProfile withSecurityEncryptionType(SecurityEncryptionTypes securityEncryptionType) {
        this.securityEncryptionType = securityEncryptionType;
        return this;
    }

    /**
     * Get the diskEncryptionSet property: Specifies the customer managed disk encryption set resource id for the
     * managed disk that is used for Customer Managed Key encrypted ConfidentialVM OS Disk and VMGuest blob.
     *
     * @return the diskEncryptionSet value.
     */
    public DiskEncryptionSetParameters diskEncryptionSet() {
        return this.diskEncryptionSet;
    }

    /**
     * Set the diskEncryptionSet property: Specifies the customer managed disk encryption set resource id for the
     * managed disk that is used for Customer Managed Key encrypted ConfidentialVM OS Disk and VMGuest blob.
     *
     * @param diskEncryptionSet the diskEncryptionSet value to set.
     * @return the VMDiskSecurityProfile object itself.
     */
    public VMDiskSecurityProfile withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        this.diskEncryptionSet = diskEncryptionSet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionSet() != null) {
            diskEncryptionSet().validate();
        }
    }
}
