// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Limit settings for the AutoML job. */
@Fluent
public final class ImageLimitSettings {
    /*
     * Maximum number of concurrent AutoML iterations.
     */
    @JsonProperty(value = "maxConcurrentTrials")
    private Integer maxConcurrentTrials;

    /*
     * Maximum number of AutoML iterations.
     */
    @JsonProperty(value = "maxTrials")
    private Integer maxTrials;

    /*
     * AutoML job timeout.
     */
    @JsonProperty(value = "timeout")
    private Duration timeout;

    /**
     * Get the maxConcurrentTrials property: Maximum number of concurrent AutoML iterations.
     *
     * @return the maxConcurrentTrials value.
     */
    public Integer maxConcurrentTrials() {
        return this.maxConcurrentTrials;
    }

    /**
     * Set the maxConcurrentTrials property: Maximum number of concurrent AutoML iterations.
     *
     * @param maxConcurrentTrials the maxConcurrentTrials value to set.
     * @return the ImageLimitSettings object itself.
     */
    public ImageLimitSettings withMaxConcurrentTrials(Integer maxConcurrentTrials) {
        this.maxConcurrentTrials = maxConcurrentTrials;
        return this;
    }

    /**
     * Get the maxTrials property: Maximum number of AutoML iterations.
     *
     * @return the maxTrials value.
     */
    public Integer maxTrials() {
        return this.maxTrials;
    }

    /**
     * Set the maxTrials property: Maximum number of AutoML iterations.
     *
     * @param maxTrials the maxTrials value to set.
     * @return the ImageLimitSettings object itself.
     */
    public ImageLimitSettings withMaxTrials(Integer maxTrials) {
        this.maxTrials = maxTrials;
        return this;
    }

    /**
     * Get the timeout property: AutoML job timeout.
     *
     * @return the timeout value.
     */
    public Duration timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: AutoML job timeout.
     *
     * @param timeout the timeout value to set.
     * @return the ImageLimitSettings object itself.
     */
    public ImageLimitSettings withTimeout(Duration timeout) {
        this.timeout = timeout;
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
