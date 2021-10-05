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
 * Settings for Azure Files identity based authentication.
 */
@Fluent
public final class AzureFilesIdentityBasedAuthentication {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureFilesIdentityBasedAuthentication.class);

    /*
     * Indicates the directory service used.
     */
    @JsonProperty(value = "directoryServiceOptions", required = true)
    private DirectoryServiceOptions directoryServiceOptions;

    /*
     * Required if choose AD.
     */
    @JsonProperty(value = "activeDirectoryProperties")
    private ActiveDirectoryProperties activeDirectoryProperties;

    /**
     * Get the directoryServiceOptions property: Indicates the directory
     * service used.
     * 
     * @return the directoryServiceOptions value.
     */
    public DirectoryServiceOptions directoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    /**
     * Set the directoryServiceOptions property: Indicates the directory
     * service used.
     * 
     * @param directoryServiceOptions the directoryServiceOptions value to set.
     * @return the AzureFilesIdentityBasedAuthentication object itself.
     */
    public AzureFilesIdentityBasedAuthentication withDirectoryServiceOptions(DirectoryServiceOptions directoryServiceOptions) {
        this.directoryServiceOptions = directoryServiceOptions;
        return this;
    }

    /**
     * Get the activeDirectoryProperties property: Required if choose AD.
     * 
     * @return the activeDirectoryProperties value.
     */
    public ActiveDirectoryProperties activeDirectoryProperties() {
        return this.activeDirectoryProperties;
    }

    /**
     * Set the activeDirectoryProperties property: Required if choose AD.
     * 
     * @param activeDirectoryProperties the activeDirectoryProperties value to
     * set.
     * @return the AzureFilesIdentityBasedAuthentication object itself.
     */
    public AzureFilesIdentityBasedAuthentication withActiveDirectoryProperties(ActiveDirectoryProperties activeDirectoryProperties) {
        this.activeDirectoryProperties = activeDirectoryProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (directoryServiceOptions() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property directoryServiceOptions in model AzureFilesIdentityBasedAuthentication"));
        }
        if (activeDirectoryProperties() != null) {
            activeDirectoryProperties().validate();
        }
    }
}
