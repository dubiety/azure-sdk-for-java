// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the peer express route circuit connection. */
@Fluent
public final class PeerExpressRouteCircuitConnectionPropertiesFormat {
    /*
     * Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     */
    @JsonProperty(value = "expressRouteCircuitPeering")
    private SubResource expressRouteCircuitPeering;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the
     * peered circuit.
     */
    @JsonProperty(value = "peerExpressRouteCircuitPeering")
    private SubResource peerExpressRouteCircuitPeering;

    /*
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * Express Route Circuit connection state.
     */
    @JsonProperty(value = "circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CircuitConnectionStatus circuitConnectionStatus;

    /*
     * The name of the express route circuit connection resource.
     */
    @JsonProperty(value = "connectionName")
    private String connectionName;

    /*
     * The resource guid of the authorization used for the express route
     * circuit connection.
     */
    @JsonProperty(value = "authResourceGuid")
    private String authResourceGuid;

    /*
     * The provisioning state of the peer express route circuit connection
     * resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the PeerExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public PeerExpressRouteCircuitConnectionPropertiesFormat withExpressRouteCircuitPeering(
        SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the PeerExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public PeerExpressRouteCircuitConnectionPropertiesFormat withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the PeerExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public PeerExpressRouteCircuitConnectionPropertiesFormat withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get the connectionName property: The name of the express route circuit connection resource.
     *
     * @return the connectionName value.
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Set the connectionName property: The name of the express route circuit connection resource.
     *
     * @param connectionName the connectionName value to set.
     * @return the PeerExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public PeerExpressRouteCircuitConnectionPropertiesFormat withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get the authResourceGuid property: The resource guid of the authorization used for the express route circuit
     * connection.
     *
     * @return the authResourceGuid value.
     */
    public String authResourceGuid() {
        return this.authResourceGuid;
    }

    /**
     * Set the authResourceGuid property: The resource guid of the authorization used for the express route circuit
     * connection.
     *
     * @param authResourceGuid the authResourceGuid value to set.
     * @return the PeerExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public PeerExpressRouteCircuitConnectionPropertiesFormat withAuthResourceGuid(String authResourceGuid) {
        this.authResourceGuid = authResourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the peer express route circuit connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
