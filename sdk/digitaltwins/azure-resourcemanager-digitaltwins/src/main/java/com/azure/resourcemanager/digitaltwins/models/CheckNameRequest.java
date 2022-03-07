// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result returned from a database check name availability request. */
@Fluent
public final class CheckNameRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameRequest.class);

    /*
     * Resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource, for instance
     * Microsoft.DigitalTwins/digitalTwinsInstances.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "Microsoft.DigitalTwins/digitalTwinsInstances";

    /** Creates an instance of CheckNameRequest class. */
    public CheckNameRequest() {
        type = "Microsoft.DigitalTwins/digitalTwinsInstances";
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the CheckNameRequest object itself.
     */
    public CheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, for instance Microsoft.DigitalTwins/digitalTwinsInstances.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, for instance Microsoft.DigitalTwins/digitalTwinsInstances.
     *
     * @param type the type value to set.
     * @return the CheckNameRequest object itself.
     */
    public CheckNameRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model CheckNameRequest"));
        }
    }
}
