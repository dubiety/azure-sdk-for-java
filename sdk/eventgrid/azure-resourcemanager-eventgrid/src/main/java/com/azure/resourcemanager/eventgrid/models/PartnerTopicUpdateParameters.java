// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties of the Partner Topic update. */
@Fluent
public final class PartnerTopicUpdateParameters {
    /*
     * Tags of the Partner Topic resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Identity information for the Partner Topic resource.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /**
     * Get the tags property: Tags of the Partner Topic resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the Partner Topic resource.
     *
     * @param tags the tags value to set.
     * @return the PartnerTopicUpdateParameters object itself.
     */
    public PartnerTopicUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Identity information for the Partner Topic resource.
     *
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity information for the Partner Topic resource.
     *
     * @param identity the identity value to set.
     * @return the PartnerTopicUpdateParameters object itself.
     */
    public PartnerTopicUpdateParameters withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
