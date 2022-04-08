// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DDoS protection plan properties. */
@Immutable
public final class DdosProtectionPlanPropertiesFormat {
    /*
     * The resource GUID property of the DDoS protection plan resource. It
     * uniquely identifies the resource, even if the user changes its name or
     * migrate the resource across subscriptions or resource groups.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the DDoS protection plan resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The list of virtual networks associated with the DDoS protection plan
     * resource. This list is read-only.
     */
    @JsonProperty(value = "virtualNetworks", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualNetworks;

    /**
     * Get the resourceGuid property: The resource GUID property of the DDoS protection plan resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the DDoS protection plan resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtualNetworks property: The list of virtual networks associated with the DDoS protection plan resource.
     * This list is read-only.
     *
     * @return the virtualNetworks value.
     */
    public List<SubResource> virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
