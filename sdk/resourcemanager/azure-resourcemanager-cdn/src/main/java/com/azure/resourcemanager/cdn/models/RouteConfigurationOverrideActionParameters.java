// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the parameters for the route configuration override action. */
@Fluent
public final class RouteConfigurationOverrideActionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteConfigurationOverrideActionParameters.class);

    /*
     * The typeName property.
     */
    @JsonProperty(value = "typeName", required = true)
    private String typeName = "DeliveryRuleRouteConfigurationOverrideActionParameters";

    /*
     * A reference to the origin group override configuration. Leave empty to
     * use the default origin group on route.
     */
    @JsonProperty(value = "originGroupOverride")
    private OriginGroupOverride originGroupOverride;

    /*
     * The caching configuration associated with this rule. To disable caching,
     * do not provide a cacheConfiguration object.
     */
    @JsonProperty(value = "cacheConfiguration")
    private CacheConfiguration cacheConfiguration;

    /** Creates an instance of RouteConfigurationOverrideActionParameters class. */
    public RouteConfigurationOverrideActionParameters() {
        typeName = "DeliveryRuleRouteConfigurationOverrideActionParameters";
    }

    /**
     * Get the typeName property: The typeName property.
     *
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     *
     * @param typeName the typeName value to set.
     * @return the RouteConfigurationOverrideActionParameters object itself.
     */
    public RouteConfigurationOverrideActionParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the originGroupOverride property: A reference to the origin group override configuration. Leave empty to use
     * the default origin group on route.
     *
     * @return the originGroupOverride value.
     */
    public OriginGroupOverride originGroupOverride() {
        return this.originGroupOverride;
    }

    /**
     * Set the originGroupOverride property: A reference to the origin group override configuration. Leave empty to use
     * the default origin group on route.
     *
     * @param originGroupOverride the originGroupOverride value to set.
     * @return the RouteConfigurationOverrideActionParameters object itself.
     */
    public RouteConfigurationOverrideActionParameters withOriginGroupOverride(OriginGroupOverride originGroupOverride) {
        this.originGroupOverride = originGroupOverride;
        return this;
    }

    /**
     * Get the cacheConfiguration property: The caching configuration associated with this rule. To disable caching, do
     * not provide a cacheConfiguration object.
     *
     * @return the cacheConfiguration value.
     */
    public CacheConfiguration cacheConfiguration() {
        return this.cacheConfiguration;
    }

    /**
     * Set the cacheConfiguration property: The caching configuration associated with this rule. To disable caching, do
     * not provide a cacheConfiguration object.
     *
     * @param cacheConfiguration the cacheConfiguration value to set.
     * @return the RouteConfigurationOverrideActionParameters object itself.
     */
    public RouteConfigurationOverrideActionParameters withCacheConfiguration(CacheConfiguration cacheConfiguration) {
        this.cacheConfiguration = cacheConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (originGroupOverride() != null) {
            originGroupOverride().validate();
        }
        if (cacheConfiguration() != null) {
            cacheConfiguration().validate();
        }
    }
}
