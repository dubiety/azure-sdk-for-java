// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluent.models.DataPolicyManifestInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of data policy manifests. */
@Fluent
public final class DataPolicyManifestListResult {
    /*
     * An array of data policy manifests.
     */
    @JsonProperty(value = "value")
    private List<DataPolicyManifestInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of data policy manifests.
     *
     * @return the value value.
     */
    public List<DataPolicyManifestInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of data policy manifests.
     *
     * @param value the value value to set.
     * @return the DataPolicyManifestListResult object itself.
     */
    public DataPolicyManifestListResult withValue(List<DataPolicyManifestInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the DataPolicyManifestListResult object itself.
     */
    public DataPolicyManifestListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
