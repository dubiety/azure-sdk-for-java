// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.CorsRules;
import com.azure.resourcemanager.storage.models.DeleteRetentionPolicy;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of File services in storage account.
 */
@Fluent
public final class FileServicePropertiesProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(FileServicePropertiesProperties.class);

    /*
     * Specifies CORS rules for the File service. You can include up to five
     * CorsRule elements in the request. If no CorsRule elements are included
     * in the request body, all CORS rules will be deleted, and CORS will be
     * disabled for the File service.
     */
    @JsonProperty(value = "cors")
    private CorsRules cors;

    /*
     * The file service properties for share soft delete.
     */
    @JsonProperty(value = "shareDeleteRetentionPolicy")
    private DeleteRetentionPolicy shareDeleteRetentionPolicy;

    /**
     * Get the cors property: Specifies CORS rules for the File service. You
     * can include up to five CorsRule elements in the request. If no CorsRule
     * elements are included in the request body, all CORS rules will be
     * deleted, and CORS will be disabled for the File service.
     * 
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the File service. You
     * can include up to five CorsRule elements in the request. If no CorsRule
     * elements are included in the request body, all CORS rules will be
     * deleted, and CORS will be disabled for the File service.
     * 
     * @param cors the cors value to set.
     * @return the FileServicePropertiesProperties object itself.
     */
    public FileServicePropertiesProperties withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the shareDeleteRetentionPolicy property: The file service properties
     * for share soft delete.
     * 
     * @return the shareDeleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy shareDeleteRetentionPolicy() {
        return this.shareDeleteRetentionPolicy;
    }

    /**
     * Set the shareDeleteRetentionPolicy property: The file service properties
     * for share soft delete.
     * 
     * @param shareDeleteRetentionPolicy the shareDeleteRetentionPolicy value
     * to set.
     * @return the FileServicePropertiesProperties object itself.
     */
    public FileServicePropertiesProperties withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cors() != null) {
            cors().validate();
        }
        if (shareDeleteRetentionPolicy() != null) {
            shareDeleteRetentionPolicy().validate();
        }
    }
}
