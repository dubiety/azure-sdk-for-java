// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A web application firewall rule. */
@Fluent
public final class ApplicationGatewayFirewallRule {
    /*
     * The identifier of the web application firewall rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private int ruleId;

    /*
     * The description of the web application firewall rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the ruleId property: The identifier of the web application firewall rule.
     *
     * @return the ruleId value.
     */
    public int ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: The identifier of the web application firewall rule.
     *
     * @param ruleId the ruleId value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withRuleId(int ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the description property: The description of the web application firewall rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the web application firewall rule.
     *
     * @param description the description value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withDescription(String description) {
        this.description = description;
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
