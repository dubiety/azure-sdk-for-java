// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.digitaltwins.models.ExternalResource;
import com.azure.resourcemanager.digitaltwins.models.TimeSeriesDatabaseConnectionProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a time series database connection resource. */
@Fluent
public final class TimeSeriesDatabaseConnectionInner extends ExternalResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimeSeriesDatabaseConnectionInner.class);

    /*
     * Properties of a specific time series database connection.
     */
    @JsonProperty(value = "properties")
    private TimeSeriesDatabaseConnectionProperties properties;

    /**
     * Get the properties property: Properties of a specific time series database connection.
     *
     * @return the properties value.
     */
    public TimeSeriesDatabaseConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a specific time series database connection.
     *
     * @param properties the properties value to set.
     * @return the TimeSeriesDatabaseConnectionInner object itself.
     */
    public TimeSeriesDatabaseConnectionInner withProperties(TimeSeriesDatabaseConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
