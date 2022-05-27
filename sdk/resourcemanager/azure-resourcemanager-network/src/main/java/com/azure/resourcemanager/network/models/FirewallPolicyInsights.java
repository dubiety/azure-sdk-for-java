// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Firewall Policy Insights. */
@Fluent
public final class FirewallPolicyInsights {
    /*
     * A flag to indicate if the insights are enabled on the policy.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Number of days the insights should be enabled on the policy.
     */
    @JsonProperty(value = "retentionDays")
    private Integer retentionDays;

    /*
     * Workspaces needed to configure the Firewall Policy Insights.
     */
    @JsonProperty(value = "logAnalyticsResources")
    private FirewallPolicyLogAnalyticsResources logAnalyticsResources;

    /**
     * Get the isEnabled property: A flag to indicate if the insights are enabled on the policy.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: A flag to indicate if the insights are enabled on the policy.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the FirewallPolicyInsights object itself.
     */
    public FirewallPolicyInsights withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the retentionDays property: Number of days the insights should be enabled on the policy.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: Number of days the insights should be enabled on the policy.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the FirewallPolicyInsights object itself.
     */
    public FirewallPolicyInsights withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the logAnalyticsResources property: Workspaces needed to configure the Firewall Policy Insights.
     *
     * @return the logAnalyticsResources value.
     */
    public FirewallPolicyLogAnalyticsResources logAnalyticsResources() {
        return this.logAnalyticsResources;
    }

    /**
     * Set the logAnalyticsResources property: Workspaces needed to configure the Firewall Policy Insights.
     *
     * @param logAnalyticsResources the logAnalyticsResources value to set.
     * @return the FirewallPolicyInsights object itself.
     */
    public FirewallPolicyInsights withLogAnalyticsResources(FirewallPolicyLogAnalyticsResources logAnalyticsResources) {
        this.logAnalyticsResources = logAnalyticsResources;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logAnalyticsResources() != null) {
            logAnalyticsResources().validate();
        }
    }
}
