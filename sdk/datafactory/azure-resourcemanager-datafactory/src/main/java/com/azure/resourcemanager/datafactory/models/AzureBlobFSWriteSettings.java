// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure blobFS write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFSWriteSettings")
@Fluent
public final class AzureBlobFSWriteSettings extends StoreWriteSettings {
    /*
     * Indicates the block size(MB) when writing data to blob. Type: integer
     * (or Expression with resultType integer).
     */
    @JsonProperty(value = "blockSizeInMB")
    private Object blockSizeInMB;

    /**
     * Get the blockSizeInMB property: Indicates the block size(MB) when writing data to blob. Type: integer (or
     * Expression with resultType integer).
     *
     * @return the blockSizeInMB value.
     */
    public Object blockSizeInMB() {
        return this.blockSizeInMB;
    }

    /**
     * Set the blockSizeInMB property: Indicates the block size(MB) when writing data to blob. Type: integer (or
     * Expression with resultType integer).
     *
     * @param blockSizeInMB the blockSizeInMB value to set.
     * @return the AzureBlobFSWriteSettings object itself.
     */
    public AzureBlobFSWriteSettings withBlockSizeInMB(Object blockSizeInMB) {
        this.blockSizeInMB = blockSizeInMB;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
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
    }
}
