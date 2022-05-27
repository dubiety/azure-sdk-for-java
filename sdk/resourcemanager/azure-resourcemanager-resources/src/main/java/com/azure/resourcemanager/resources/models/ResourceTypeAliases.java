// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The resource type aliases definition. */
@Fluent
public final class ResourceTypeAliases {
    /*
     * The resource type name.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The aliases for property names.
     */
    @JsonProperty(value = "aliases")
    private List<Alias> aliases;

    /**
     * Get the resourceType property: The resource type name.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type name.
     *
     * @param resourceType the resourceType value to set.
     * @return the ResourceTypeAliases object itself.
     */
    public ResourceTypeAliases withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the aliases property: The aliases for property names.
     *
     * @return the aliases value.
     */
    public List<Alias> aliases() {
        return this.aliases;
    }

    /**
     * Set the aliases property: The aliases for property names.
     *
     * @param aliases the aliases value to set.
     * @return the ResourceTypeAliases object itself.
     */
    public ResourceTypeAliases withAliases(List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aliases() != null) {
            aliases().forEach(e -> e.validate());
        }
    }
}
