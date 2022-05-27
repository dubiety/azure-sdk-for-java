// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of p2s vpn connections to be disconnected. */
@Fluent
public final class P2SVpnConnectionRequest {
    /*
     * List of p2s vpn connection Ids.
     */
    @JsonProperty(value = "vpnConnectionIds")
    private List<String> vpnConnectionIds;

    /**
     * Get the vpnConnectionIds property: List of p2s vpn connection Ids.
     *
     * @return the vpnConnectionIds value.
     */
    public List<String> vpnConnectionIds() {
        return this.vpnConnectionIds;
    }

    /**
     * Set the vpnConnectionIds property: List of p2s vpn connection Ids.
     *
     * @param vpnConnectionIds the vpnConnectionIds value to set.
     * @return the P2SVpnConnectionRequest object itself.
     */
    public P2SVpnConnectionRequest withVpnConnectionIds(List<String> vpnConnectionIds) {
        this.vpnConnectionIds = vpnConnectionIds;
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
