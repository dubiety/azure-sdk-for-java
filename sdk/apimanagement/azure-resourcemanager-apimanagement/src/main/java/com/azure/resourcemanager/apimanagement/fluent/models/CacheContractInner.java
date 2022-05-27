// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cache details. */
@Fluent
public final class CacheContractInner extends ProxyResource {
    /*
     * Cache properties details.
     */
    @JsonProperty(value = "properties")
    private CacheContractProperties innerProperties;

    /**
     * Get the innerProperties property: Cache properties details.
     *
     * @return the innerProperties value.
     */
    private CacheContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Cache description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Cache description.
     *
     * @param description the description value to set.
     * @return the CacheContractInner object itself.
     */
    public CacheContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the connectionString property: Runtime connection string to cache.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionString();
    }

    /**
     * Set the connectionString property: Runtime connection string to cache.
     *
     * @param connectionString the connectionString value to set.
     * @return the CacheContractInner object itself.
     */
    public CacheContractInner withConnectionString(String connectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheContractProperties();
        }
        this.innerProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the useFromLocation property: Location identifier to use cache from (should be either 'default' or valid
     * Azure region identifier).
     *
     * @return the useFromLocation value.
     */
    public String useFromLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().useFromLocation();
    }

    /**
     * Set the useFromLocation property: Location identifier to use cache from (should be either 'default' or valid
     * Azure region identifier).
     *
     * @param useFromLocation the useFromLocation value to set.
     * @return the CacheContractInner object itself.
     */
    public CacheContractInner withUseFromLocation(String useFromLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheContractProperties();
        }
        this.innerProperties().withUseFromLocation(useFromLocation);
        return this;
    }

    /**
     * Get the resourceId property: Original uri of entity in external system cache points to.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: Original uri of entity in external system cache points to.
     *
     * @param resourceId the resourceId value to set.
     * @return the CacheContractInner object itself.
     */
    public CacheContractInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheContractProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
