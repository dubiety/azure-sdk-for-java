// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents subscription registered features. */
@Fluent
public final class CustomerSubscriptionRegisteredFeatures {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomerSubscriptionRegisteredFeatures.class);

    /*
     * Name of subscription registered feature
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * State of subscription registered feature
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Get the name property: Name of subscription registered feature.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of subscription registered feature.
     *
     * @param name the name value to set.
     * @return the CustomerSubscriptionRegisteredFeatures object itself.
     */
    public CustomerSubscriptionRegisteredFeatures withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the state property: State of subscription registered feature.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State of subscription registered feature.
     *
     * @param state the state value to set.
     * @return the CustomerSubscriptionRegisteredFeatures object itself.
     */
    public CustomerSubscriptionRegisteredFeatures withState(String state) {
        this.state = state;
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
