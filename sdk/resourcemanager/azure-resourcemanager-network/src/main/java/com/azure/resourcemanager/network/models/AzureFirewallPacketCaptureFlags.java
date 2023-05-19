// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the AzureFirewallRCAction. */
@Fluent
public final class AzureFirewallPacketCaptureFlags {
    /*
     * Flags to capture
     */
    @JsonProperty(value = "type")
    private AzureFirewallPacketCaptureFlagsType type;

    /** Creates an instance of AzureFirewallPacketCaptureFlags class. */
    public AzureFirewallPacketCaptureFlags() {
    }

    /**
     * Get the type property: Flags to capture.
     *
     * @return the type value.
     */
    public AzureFirewallPacketCaptureFlagsType type() {
        return this.type;
    }

    /**
     * Set the type property: Flags to capture.
     *
     * @param type the type value to set.
     * @return the AzureFirewallPacketCaptureFlags object itself.
     */
    public AzureFirewallPacketCaptureFlags withType(AzureFirewallPacketCaptureFlagsType type) {
        this.type = type;
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
