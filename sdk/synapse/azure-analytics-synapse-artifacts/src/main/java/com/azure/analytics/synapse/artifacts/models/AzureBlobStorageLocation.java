// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The location of azure blob dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobStorageLocation")
@Fluent
public final class AzureBlobStorageLocation extends DatasetLocation {
    /*
     * Specify the container of azure blob. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "container")
    private Object container;

    /**
     * Get the container property: Specify the container of azure blob. Type: string (or Expression with resultType
     * string).
     *
     * @return the container value.
     */
    public Object getContainer() {
        return this.container;
    }

    /**
     * Set the container property: Specify the container of azure blob. Type: string (or Expression with resultType
     * string).
     *
     * @param container the container value to set.
     * @return the AzureBlobStorageLocation object itself.
     */
    public AzureBlobStorageLocation setContainer(Object container) {
        this.container = container;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLocation setFolderPath(Object folderPath) {
        super.setFolderPath(folderPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLocation setFileName(Object fileName) {
        super.setFileName(fileName);
        return this;
    }
}
