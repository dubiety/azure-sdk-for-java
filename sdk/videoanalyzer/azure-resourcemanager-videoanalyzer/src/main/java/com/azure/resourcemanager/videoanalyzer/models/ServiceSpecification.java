// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The service metric specifications. */
@Immutable
public final class ServiceSpecification {
    /*
     * List of log specifications.
     */
    @JsonProperty(value = "logSpecifications", access = JsonProperty.Access.WRITE_ONLY)
    private List<LogSpecification> logSpecifications;

    /*
     * List of metric specifications.
     */
    @JsonProperty(value = "metricSpecifications", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricSpecification> metricSpecifications;

    /**
     * Get the logSpecifications property: List of log specifications.
     *
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Get the metricSpecifications property: List of metric specifications.
     *
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }
}
