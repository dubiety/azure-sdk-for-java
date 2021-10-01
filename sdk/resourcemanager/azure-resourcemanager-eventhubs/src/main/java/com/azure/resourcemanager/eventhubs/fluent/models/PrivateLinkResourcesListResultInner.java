// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.models.PrivateLinkResource;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the List private link resources operation.
 */
@Fluent
public final class PrivateLinkResourcesListResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesListResultInner.class);

    /*
     * A collection of private link resources
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResource> value;

    /*
     * A link for the next page of private link resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A collection of private link resources.
     * 
     * @return the value value.
     */
    public List<PrivateLinkResource> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of private link resources.
     * 
     * @param value the value value to set.
     * @return the PrivateLinkResourcesListResultInner object itself.
     */
    public PrivateLinkResourcesListResultInner withValue(List<PrivateLinkResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of private link
     * resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of private link
     * resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PrivateLinkResourcesListResultInner object itself.
     */
    public PrivateLinkResourcesListResultInner withNextLink(String nextLink) {
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
