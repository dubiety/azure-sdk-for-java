// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the restriction where the SKU cannot be used. */
@Fluent
public final class ResourceSkuRestrictionInfo {
    /*
     * Gets locations where the SKU is restricted
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * Gets list of availability zones where the SKU is restricted.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get the locations property: Gets locations where the SKU is restricted.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Gets locations where the SKU is restricted.
     *
     * @param locations the locations value to set.
     * @return the ResourceSkuRestrictionInfo object itself.
     */
    public ResourceSkuRestrictionInfo withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the zones property: Gets list of availability zones where the SKU is restricted.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Gets list of availability zones where the SKU is restricted.
     *
     * @param zones the zones value to set.
     * @return the ResourceSkuRestrictionInfo object itself.
     */
    public ResourceSkuRestrictionInfo withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
