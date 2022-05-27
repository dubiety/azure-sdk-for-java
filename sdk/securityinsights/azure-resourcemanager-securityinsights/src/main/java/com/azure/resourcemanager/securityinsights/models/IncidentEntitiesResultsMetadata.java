// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information of a specific aggregation in the incident related entities result. */
@Fluent
public final class IncidentEntitiesResultsMetadata {
    /*
     * Total number of aggregations of the given kind in the incident related
     * entities result.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * The kind of the aggregated entity.
     */
    @JsonProperty(value = "entityKind", required = true)
    private EntityKind entityKind;

    /**
     * Get the count property: Total number of aggregations of the given kind in the incident related entities result.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Total number of aggregations of the given kind in the incident related entities result.
     *
     * @param count the count value to set.
     * @return the IncidentEntitiesResultsMetadata object itself.
     */
    public IncidentEntitiesResultsMetadata withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the entityKind property: The kind of the aggregated entity.
     *
     * @return the entityKind value.
     */
    public EntityKind entityKind() {
        return this.entityKind;
    }

    /**
     * Set the entityKind property: The kind of the aggregated entity.
     *
     * @param entityKind the entityKind value to set.
     * @return the IncidentEntitiesResultsMetadata object itself.
     */
    public IncidentEntitiesResultsMetadata withEntityKind(EntityKind entityKind) {
        this.entityKind = entityKind;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (entityKind() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property entityKind in model IncidentEntitiesResultsMetadata"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IncidentEntitiesResultsMetadata.class);
}
