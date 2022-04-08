// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for list tap configurations API service call. */
@Fluent
public final class NetworkInterfaceTapConfigurationListResult {
    /*
     * A list of tap configurations.
     */
    @JsonProperty(value = "value")
    private List<NetworkInterfaceTapConfigurationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of tap configurations.
     *
     * @return the value value.
     */
    public List<NetworkInterfaceTapConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of tap configurations.
     *
     * @param value the value value to set.
     * @return the NetworkInterfaceTapConfigurationListResult object itself.
     */
    public NetworkInterfaceTapConfigurationListResult withValue(List<NetworkInterfaceTapConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
