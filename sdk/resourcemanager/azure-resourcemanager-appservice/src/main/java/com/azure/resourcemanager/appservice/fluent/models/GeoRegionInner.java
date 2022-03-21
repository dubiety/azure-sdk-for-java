// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Geographical region. */
@Fluent
public final class GeoRegionInner extends ProxyOnlyResource {
    /*
     * GeoRegion resource specific properties
     */
    @JsonProperty(value = "properties")
    private GeoRegionProperties innerProperties;

    /**
     * Get the innerProperties property: GeoRegion resource specific properties.
     *
     * @return the innerProperties value.
     */
    private GeoRegionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GeoRegionInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the description property: Region description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the displayName property: Display name for region.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the orgDomain property: Display name for region.
     *
     * @return the orgDomain value.
     */
    public String orgDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().orgDomain();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
