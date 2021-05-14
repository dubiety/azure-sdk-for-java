// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains all the secrets of a Disk. */
@Immutable
public final class DiskSecret {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskSecret.class);

    /*
     * Serial number of the assigned disk.
     */
    @JsonProperty(value = "diskSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String diskSerialNumber;

    /*
     * Bit Locker key of the disk which can be used to unlock the disk to copy
     * data.
     */
    @JsonProperty(value = "bitLockerKey", access = JsonProperty.Access.WRITE_ONLY)
    private String bitLockerKey;

    /**
     * Get the diskSerialNumber property: Serial number of the assigned disk.
     *
     * @return the diskSerialNumber value.
     */
    public String diskSerialNumber() {
        return this.diskSerialNumber;
    }

    /**
     * Get the bitLockerKey property: Bit Locker key of the disk which can be used to unlock the disk to copy data.
     *
     * @return the bitLockerKey value.
     */
    public String bitLockerKey() {
        return this.bitLockerKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
