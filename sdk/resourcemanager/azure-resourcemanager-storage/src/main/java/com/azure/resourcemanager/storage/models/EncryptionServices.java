// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of services that support encryption.
 */
@Fluent
public final class EncryptionServices {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(EncryptionServices.class);

    /*
     * The encryption function of the blob storage service.
     */
    @JsonProperty(value = "blob")
    private EncryptionService blob;

    /*
     * The encryption function of the file storage service.
     */
    @JsonProperty(value = "file")
    private EncryptionService file;

    /*
     * The encryption function of the table storage service.
     */
    @JsonProperty(value = "table")
    private EncryptionService table;

    /*
     * The encryption function of the queue storage service.
     */
    @JsonProperty(value = "queue")
    private EncryptionService queue;

    /**
     * Get the blob property: The encryption function of the blob storage
     * service.
     * 
     * @return the blob value.
     */
    public EncryptionService blob() {
        return this.blob;
    }

    /**
     * Set the blob property: The encryption function of the blob storage
     * service.
     * 
     * @param blob the blob value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withBlob(EncryptionService blob) {
        this.blob = blob;
        return this;
    }

    /**
     * Get the file property: The encryption function of the file storage
     * service.
     * 
     * @return the file value.
     */
    public EncryptionService file() {
        return this.file;
    }

    /**
     * Set the file property: The encryption function of the file storage
     * service.
     * 
     * @param file the file value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withFile(EncryptionService file) {
        this.file = file;
        return this;
    }

    /**
     * Get the table property: The encryption function of the table storage
     * service.
     * 
     * @return the table value.
     */
    public EncryptionService table() {
        return this.table;
    }

    /**
     * Set the table property: The encryption function of the table storage
     * service.
     * 
     * @param table the table value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withTable(EncryptionService table) {
        this.table = table;
        return this;
    }

    /**
     * Get the queue property: The encryption function of the queue storage
     * service.
     * 
     * @return the queue value.
     */
    public EncryptionService queue() {
        return this.queue;
    }

    /**
     * Set the queue property: The encryption function of the queue storage
     * service.
     * 
     * @param queue the queue value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withQueue(EncryptionService queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blob() != null) {
            blob().validate();
        }
        if (file() != null) {
            file().validate();
        }
        if (table() != null) {
            table().validate();
        }
        if (queue() != null) {
            queue().validate();
        }
    }
}
