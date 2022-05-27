// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.Access;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RouteFilterRuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Route Filter Rule Resource. */
@Fluent
public final class RouteFilterRulePropertiesFormat {
    /*
     * The access type of the rule.
     */
    @JsonProperty(value = "access", required = true)
    private Access access;

    /*
     * The rule type of the rule.
     */
    @JsonProperty(value = "routeFilterRuleType", required = true)
    private RouteFilterRuleType routeFilterRuleType;

    /*
     * The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     */
    @JsonProperty(value = "communities", required = true)
    private List<String> communities;

    /*
     * The provisioning state of the route filter rule resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the access property: The access type of the rule.
     *
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access property: The access type of the rule.
     *
     * @param access the access value to set.
     * @return the RouteFilterRulePropertiesFormat object itself.
     */
    public RouteFilterRulePropertiesFormat withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the routeFilterRuleType property: The rule type of the rule.
     *
     * @return the routeFilterRuleType value.
     */
    public RouteFilterRuleType routeFilterRuleType() {
        return this.routeFilterRuleType;
    }

    /**
     * Set the routeFilterRuleType property: The rule type of the rule.
     *
     * @param routeFilterRuleType the routeFilterRuleType value to set.
     * @return the RouteFilterRulePropertiesFormat object itself.
     */
    public RouteFilterRulePropertiesFormat withRouteFilterRuleType(RouteFilterRuleType routeFilterRuleType) {
        this.routeFilterRuleType = routeFilterRuleType;
        return this;
    }

    /**
     * Get the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @return the communities value.
     */
    public List<String> communities() {
        return this.communities;
    }

    /**
     * Set the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @param communities the communities value to set.
     * @return the RouteFilterRulePropertiesFormat object itself.
     */
    public RouteFilterRulePropertiesFormat withCommunities(List<String> communities) {
        this.communities = communities;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter rule resource.
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
        if (access() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property access in model RouteFilterRulePropertiesFormat"));
        }
        if (routeFilterRuleType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property routeFilterRuleType in model RouteFilterRulePropertiesFormat"));
        }
        if (communities() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property communities in model RouteFilterRulePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RouteFilterRulePropertiesFormat.class);
}
