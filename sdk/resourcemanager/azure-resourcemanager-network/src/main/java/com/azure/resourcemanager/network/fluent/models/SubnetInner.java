// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.Delegation;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.models.ServiceAssociationLink;
import com.azure.resourcemanager.network.models.ServiceEndpointPropertiesFormat;
import com.azure.resourcemanager.network.models.VirtualNetworkPrivateEndpointNetworkPolicies;
import com.azure.resourcemanager.network.models.VirtualNetworkPrivateLinkServiceNetworkPolicies;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Subnet in a virtual network resource. */
@Fluent
public final class SubnetInner extends SubResource {
    /*
     * Properties of the subnet.
     */
    @JsonProperty(value = "properties")
    private SubnetPropertiesFormatInner innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the innerProperties property: Properties of the subnet.
     *
     * @return the innerProperties value.
     */
    private SubnetPropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withType(String type) {
        this.type = type;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SubnetInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the addressPrefix property: The address prefix for the subnet.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Set the addressPrefix property: The address prefix for the subnet.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefix(String addressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withAddressPrefix(addressPrefix);
        return this;
    }

    /**
     * Get the addressPrefixes property: List of address prefixes for the subnet.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefixes();
    }

    /**
     * Set the addressPrefixes property: List of address prefixes for the subnet.
     *
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefixes(List<String> addressPrefixes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withAddressPrefixes(addressPrefixes);
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityGroup();
    }

    /**
     * Set the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    /**
     * Get the routeTable property: The reference to the RouteTable resource.
     *
     * @return the routeTable value.
     */
    public RouteTableInner routeTable() {
        return this.innerProperties() == null ? null : this.innerProperties().routeTable();
    }

    /**
     * Set the routeTable property: The reference to the RouteTable resource.
     *
     * @param routeTable the routeTable value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withRouteTable(RouteTableInner routeTable) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withRouteTable(routeTable);
        return this;
    }

    /**
     * Get the natGateway property: Nat gateway associated with this subnet.
     *
     * @return the natGateway value.
     */
    public SubResource natGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().natGateway();
    }

    /**
     * Set the natGateway property: Nat gateway associated with this subnet.
     *
     * @param natGateway the natGateway value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNatGateway(SubResource natGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withNatGateway(natGateway);
        return this;
    }

    /**
     * Get the serviceEndpoints property: An array of service endpoints.
     *
     * @return the serviceEndpoints value.
     */
    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceEndpoints();
    }

    /**
     * Set the serviceEndpoints property: An array of service endpoints.
     *
     * @param serviceEndpoints the serviceEndpoints value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withServiceEndpoints(serviceEndpoints);
        return this;
    }

    /**
     * Get the serviceEndpointPolicies property: An array of service endpoint policies.
     *
     * @return the serviceEndpointPolicies value.
     */
    public List<ServiceEndpointPolicyInner> serviceEndpointPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceEndpointPolicies();
    }

    /**
     * Set the serviceEndpointPolicies property: An array of service endpoint policies.
     *
     * @param serviceEndpointPolicies the serviceEndpointPolicies value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withServiceEndpointPolicies(serviceEndpointPolicies);
        return this;
    }

    /**
     * Get the privateEndpoints property: An array of references to private endpoints.
     *
     * @return the privateEndpoints value.
     */
    public List<PrivateEndpointInner> privateEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoints();
    }

    /**
     * Get the ipConfigurations property: An array of references to the network interface IP configurations using
     * subnet.
     *
     * @return the ipConfigurations value.
     */
    public List<IpConfigurationInner> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Get the ipConfigurationProfiles property: Array of IP configuration profiles which reference this subnet.
     *
     * @return the ipConfigurationProfiles value.
     */
    public List<IpConfigurationProfileInner> ipConfigurationProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurationProfiles();
    }

    /**
     * Get the ipAllocations property: Array of IpAllocation which reference this subnet.
     *
     * @return the ipAllocations value.
     */
    public List<SubResource> ipAllocations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAllocations();
    }

    /**
     * Set the ipAllocations property: Array of IpAllocation which reference this subnet.
     *
     * @param ipAllocations the ipAllocations value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withIpAllocations(List<SubResource> ipAllocations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withIpAllocations(ipAllocations);
        return this;
    }

    /**
     * Get the resourceNavigationLinks property: An array of references to the external resources using subnet.
     *
     * @return the resourceNavigationLinks value.
     */
    public List<ResourceNavigationLink> resourceNavigationLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceNavigationLinks();
    }

    /**
     * Get the serviceAssociationLinks property: An array of references to services injecting into this subnet.
     *
     * @return the serviceAssociationLinks value.
     */
    public List<ServiceAssociationLink> serviceAssociationLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceAssociationLinks();
    }

    /**
     * Get the delegations property: An array of references to the delegations on the subnet.
     *
     * @return the delegations value.
     */
    public List<Delegation> delegations() {
        return this.innerProperties() == null ? null : this.innerProperties().delegations();
    }

    /**
     * Set the delegations property: An array of references to the delegations on the subnet.
     *
     * @param delegations the delegations value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withDelegations(List<Delegation> delegations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withDelegations(delegations);
        return this;
    }

    /**
     * Get the purpose property: A read-only string identifying the intention of use for this subnet based on
     * delegations and other user-defined properties.
     *
     * @return the purpose value.
     */
    public String purpose() {
        return this.innerProperties() == null ? null : this.innerProperties().purpose();
    }

    /**
     * Get the provisioningState property: The provisioning state of the subnet resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateEndpointNetworkPolicies property: Enable or Disable apply network policies on private end point in
     * the subnet.
     *
     * @return the privateEndpointNetworkPolicies value.
     */
    public VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointNetworkPolicies();
    }

    /**
     * Set the privateEndpointNetworkPolicies property: Enable or Disable apply network policies on private end point in
     * the subnet.
     *
     * @param privateEndpointNetworkPolicies the privateEndpointNetworkPolicies value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withPrivateEndpointNetworkPolicies(
        VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withPrivateEndpointNetworkPolicies(privateEndpointNetworkPolicies);
        return this;
    }

    /**
     * Get the privateLinkServiceNetworkPolicies property: Enable or Disable apply network policies on private link
     * service in the subnet.
     *
     * @return the privateLinkServiceNetworkPolicies value.
     */
    public VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceNetworkPolicies();
    }

    /**
     * Set the privateLinkServiceNetworkPolicies property: Enable or Disable apply network policies on private link
     * service in the subnet.
     *
     * @param privateLinkServiceNetworkPolicies the privateLinkServiceNetworkPolicies value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withPrivateLinkServiceNetworkPolicies(
        VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withPrivateLinkServiceNetworkPolicies(privateLinkServiceNetworkPolicies);
        return this;
    }

    /**
     * Get the applicationGatewayIpConfigurations property: Application gateway IP configurations of virtual network
     * resource.
     *
     * @return the applicationGatewayIpConfigurations value.
     */
    public List<ApplicationGatewayIpConfigurationInner> applicationGatewayIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGatewayIpConfigurations();
    }

    /**
     * Set the applicationGatewayIpConfigurations property: Application gateway IP configurations of virtual network
     * resource.
     *
     * @param applicationGatewayIpConfigurations the applicationGatewayIpConfigurations value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withApplicationGatewayIpConfigurations(
        List<ApplicationGatewayIpConfigurationInner> applicationGatewayIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubnetPropertiesFormatInner();
        }
        this.innerProperties().withApplicationGatewayIpConfigurations(applicationGatewayIpConfigurations);
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
