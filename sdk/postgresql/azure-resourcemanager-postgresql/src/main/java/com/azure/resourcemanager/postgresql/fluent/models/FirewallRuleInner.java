// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a server firewall rule. */
@Fluent
public final class FirewallRuleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallRuleInner.class);

    /*
     * The properties of a firewall rule.
     */
    @JsonProperty(value = "properties", required = true)
    private FirewallRuleProperties innerProperties = new FirewallRuleProperties();

    /**
     * Get the innerProperties property: The properties of a firewall rule.
     *
     * @return the innerProperties value.
     */
    private FirewallRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().startIpAddress();
    }

    /**
     * Set the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withStartIpAddress(String startIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallRuleProperties();
        }
        this.innerProperties().withStartIpAddress(startIpAddress);
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().endIpAddress();
    }

    /**
     * Set the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withEndIpAddress(String endIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallRuleProperties();
        }
        this.innerProperties().withEndIpAddress(endIpAddress);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model FirewallRuleInner"));
        } else {
            innerProperties().validate();
        }
    }
}
