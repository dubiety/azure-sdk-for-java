// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Public IP Address associated with azure firewall. */
@Fluent
public final class AzureFirewallPublicIpAddress {
    /*
     * Public IP Address value.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Get the address property: Public IP Address value.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: Public IP Address value.
     *
     * @param address the address value to set.
     * @return the AzureFirewallPublicIpAddress object itself.
     */
    public AzureFirewallPublicIpAddress withAddress(String address) {
        this.address = address;
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
