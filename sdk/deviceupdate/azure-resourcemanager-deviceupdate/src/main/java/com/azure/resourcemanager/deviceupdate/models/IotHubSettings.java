// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Device Update account integration with IoT Hub settings. */
@Fluent
public final class IotHubSettings {
    /*
     * IoTHub resource ID
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Get the resourceId property: IoTHub resource ID.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: IoTHub resource ID.
     *
     * @param resourceId the resourceId value to set.
     * @return the IotHubSettings object itself.
     */
    public IotHubSettings withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model IotHubSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IotHubSettings.class);
}
