// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of all the settings. */
@Fluent
public final class SettingListInner {
    /*
     * Array of settings.
     */
    @JsonProperty(value = "value", required = true)
    private List<SettingsInner> value;

    /**
     * Get the value property: Array of settings.
     *
     * @return the value value.
     */
    public List<SettingsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of settings.
     *
     * @param value the value value to set.
     * @return the SettingListInner object itself.
     */
    public SettingListInner withValue(List<SettingsInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model SettingListInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SettingListInner.class);
}
