// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an application gateway private link IP configuration. */
@Fluent
public final class ApplicationGatewayPrivateLinkIpConfigurationProperties {
    /*
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /*
     * The private IP address allocation method.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * Reference to the subnet resource.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * Whether the ip configuration is primary or not.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * The provisioning state of the application gateway private link IP
     * configuration.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the ApplicationGatewayPrivateLinkIpConfigurationProperties object itself.
     */
    public ApplicationGatewayPrivateLinkIpConfigurationProperties withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the ApplicationGatewayPrivateLinkIpConfigurationProperties object itself.
     */
    public ApplicationGatewayPrivateLinkIpConfigurationProperties withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Reference to the subnet resource.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayPrivateLinkIpConfigurationProperties object itself.
     */
    public ApplicationGatewayPrivateLinkIpConfigurationProperties withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Whether the ip configuration is primary or not.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Whether the ip configuration is primary or not.
     *
     * @param primary the primary value to set.
     * @return the ApplicationGatewayPrivateLinkIpConfigurationProperties object itself.
     */
    public ApplicationGatewayPrivateLinkIpConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway private link IP
     * configuration.
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
