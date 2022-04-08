// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The exposure control request. */
@Fluent
public final class ExposureControlRequest {
    /*
     * The feature name.
     */
    @JsonProperty(value = "featureName")
    private String featureName;

    /*
     * The feature type.
     */
    @JsonProperty(value = "featureType")
    private String featureType;

    /**
     * Get the featureName property: The feature name.
     *
     * @return the featureName value.
     */
    public String featureName() {
        return this.featureName;
    }

    /**
     * Set the featureName property: The feature name.
     *
     * @param featureName the featureName value to set.
     * @return the ExposureControlRequest object itself.
     */
    public ExposureControlRequest withFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * Get the featureType property: The feature type.
     *
     * @return the featureType value.
     */
    public String featureType() {
        return this.featureType;
    }

    /**
     * Set the featureType property: The feature type.
     *
     * @param featureType the featureType value to set.
     * @return the ExposureControlRequest object itself.
     */
    public ExposureControlRequest withFeatureType(String featureType) {
        this.featureType = featureType;
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
