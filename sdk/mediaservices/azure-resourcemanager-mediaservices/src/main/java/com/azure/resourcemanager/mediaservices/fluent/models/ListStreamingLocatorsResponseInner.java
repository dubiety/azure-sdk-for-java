// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.mediaservices.models.AssetStreamingLocator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Streaming Locators associated with this Asset. */
@Immutable
public final class ListStreamingLocatorsResponseInner {
    /*
     * The list of Streaming Locators.
     */
    @JsonProperty(value = "streamingLocators", access = JsonProperty.Access.WRITE_ONLY)
    private List<AssetStreamingLocator> streamingLocators;

    /**
     * Get the streamingLocators property: The list of Streaming Locators.
     *
     * @return the streamingLocators value.
     */
    public List<AssetStreamingLocator> streamingLocators() {
        return this.streamingLocators;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (streamingLocators() != null) {
            streamingLocators().forEach(e -> e.validate());
        }
    }
}
