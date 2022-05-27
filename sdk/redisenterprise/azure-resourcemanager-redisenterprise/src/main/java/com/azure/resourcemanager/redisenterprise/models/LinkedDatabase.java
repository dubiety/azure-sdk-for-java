// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Linked Database Specifies details of a linked database resource. */
@Fluent
public final class LinkedDatabase {
    /*
     * Resource ID of a database resource to link with this database.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * State of the link between the database resources.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private LinkState state;

    /**
     * Get the id property: Resource ID of a database resource to link with this database.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of a database resource to link with this database.
     *
     * @param id the id value to set.
     * @return the LinkedDatabase object itself.
     */
    public LinkedDatabase withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the state property: State of the link between the database resources.
     *
     * @return the state value.
     */
    public LinkState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
