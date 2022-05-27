// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request body for a request to Bot Service Management to check availability of a bot name. */
@Fluent
public final class CheckNameAvailabilityRequestBody {
    /*
     * the name of the bot for which availability needs to be checked.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * the type of the bot for which availability needs to be checked
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: the name of the bot for which availability needs to be checked.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: the name of the bot for which availability needs to be checked.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityRequestBody object itself.
     */
    public CheckNameAvailabilityRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: the type of the bot for which availability needs to be checked.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: the type of the bot for which availability needs to be checked.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityRequestBody object itself.
     */
    public CheckNameAvailabilityRequestBody withType(String type) {
        this.type = type;
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
