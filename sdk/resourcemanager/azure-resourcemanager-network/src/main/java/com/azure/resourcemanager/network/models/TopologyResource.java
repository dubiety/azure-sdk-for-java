// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network resource topology information for the given resource group. */
@Fluent
public final class TopologyResource {
    /*
     * Name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * ID of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Holds the associations the resource has with other resources in the
     * resource group.
     */
    @JsonProperty(value = "associations")
    private List<TopologyAssociation> associations;

    /**
     * Get the name property: Name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     *
     * @param name the name value to set.
     * @return the TopologyResource object itself.
     */
    public TopologyResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: ID of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ID of the resource.
     *
     * @param id the id value to set.
     * @return the TopologyResource object itself.
     */
    public TopologyResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the TopologyResource object itself.
     */
    public TopologyResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the associations property: Holds the associations the resource has with other resources in the resource
     * group.
     *
     * @return the associations value.
     */
    public List<TopologyAssociation> associations() {
        return this.associations;
    }

    /**
     * Set the associations property: Holds the associations the resource has with other resources in the resource
     * group.
     *
     * @param associations the associations value to set.
     * @return the TopologyResource object itself.
     */
    public TopologyResource withAssociations(List<TopologyAssociation> associations) {
        this.associations = associations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (associations() != null) {
            associations().forEach(e -> e.validate());
        }
    }
}
