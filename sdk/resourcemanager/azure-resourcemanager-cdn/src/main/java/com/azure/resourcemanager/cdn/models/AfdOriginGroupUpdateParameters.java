// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.fluent.models.AfdOriginGroupUpdatePropertiesParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AFDOrigin group properties needed for origin group creation or update. */
@Fluent
public final class AfdOriginGroupUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdOriginGroupUpdateParameters.class);

    /*
     * The JSON object that contains the properties of the origin group.
     */
    @JsonProperty(value = "properties")
    private AfdOriginGroupUpdatePropertiesParameters innerProperties;

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin group.
     *
     * @return the innerProperties value.
     */
    private AfdOriginGroupUpdatePropertiesParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the profileName property: The name of the profile which holds the origin group.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @return the loadBalancingSettings value.
     */
    public LoadBalancingSettingsParameters loadBalancingSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingSettings();
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the AfdOriginGroupUpdateParameters object itself.
     */
    public AfdOriginGroupUpdateParameters withLoadBalancingSettings(
        LoadBalancingSettingsParameters loadBalancingSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties().withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the AfdOriginGroupUpdateParameters object itself.
     */
    public AfdOriginGroupUpdateParameters withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     *     trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the AfdOriginGroupUpdateParameters object itself.
     */
    public AfdOriginGroupUpdateParameters withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupUpdatePropertiesParameters();
        }
        this
            .innerProperties()
            .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * Get the responseBasedAfdOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @return the responseBasedAfdOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().responseBasedAfdOriginErrorDetectionSettings();
    }

    /**
     * Set the responseBasedAfdOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @param responseBasedAfdOriginErrorDetectionSettings the responseBasedAfdOriginErrorDetectionSettings value to
     *     set.
     * @return the AfdOriginGroupUpdateParameters object itself.
     */
    public AfdOriginGroupUpdateParameters withResponseBasedAfdOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupUpdatePropertiesParameters();
        }
        this
            .innerProperties()
            .withResponseBasedAfdOriginErrorDetectionSettings(responseBasedAfdOriginErrorDetectionSettings);
        return this;
    }

    /**
     * Get the sessionAffinityState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     *
     * @return the sessionAffinityState value.
     */
    public EnabledState sessionAffinityState() {
        return this.innerProperties() == null ? null : this.innerProperties().sessionAffinityState();
    }

    /**
     * Set the sessionAffinityState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     *
     * @param sessionAffinityState the sessionAffinityState value to set.
     * @return the AfdOriginGroupUpdateParameters object itself.
     */
    public AfdOriginGroupUpdateParameters withSessionAffinityState(EnabledState sessionAffinityState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties().withSessionAffinityState(sessionAffinityState);
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
