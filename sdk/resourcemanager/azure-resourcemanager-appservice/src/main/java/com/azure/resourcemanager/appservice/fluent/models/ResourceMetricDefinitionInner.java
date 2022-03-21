// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.ResourceMetricAvailability;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Metadata for the metrics. */
@Fluent
public final class ResourceMetricDefinitionInner extends ProxyOnlyResource {
    /*
     * ResourceMetricDefinition resource specific properties
     */
    @JsonProperty(value = "properties")
    private ResourceMetricDefinitionProperties innerProperties;

    /**
     * Get the innerProperties property: ResourceMetricDefinition resource specific properties.
     *
     * @return the innerProperties value.
     */
    private ResourceMetricDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceMetricDefinitionInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the unit property: Unit of the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.innerProperties() == null ? null : this.innerProperties().unit();
    }

    /**
     * Get the primaryAggregationType property: Primary aggregation type.
     *
     * @return the primaryAggregationType value.
     */
    public String primaryAggregationType() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryAggregationType();
    }

    /**
     * Get the metricAvailabilities property: List of time grains supported for the metric together with retention
     * period.
     *
     * @return the metricAvailabilities value.
     */
    public List<ResourceMetricAvailability> metricAvailabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().metricAvailabilities();
    }

    /**
     * Get the resourceUri property: Resource URI.
     *
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceUri();
    }

    /**
     * Get the properties property: Resource metric definition properties.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.innerProperties() == null ? null : this.innerProperties().properties();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
