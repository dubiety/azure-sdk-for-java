// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The name of the entity last modified it. */
@Fluent
public final class Principal {
    /*
     * The id of the principal made changes
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the principal made changes
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Type of principal such as user , group etc
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Email of principal
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * Get the id property: The id of the principal made changes.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the principal made changes.
     *
     * @param id the id value to set.
     * @return the Principal object itself.
     */
    public Principal withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName property: The name of the principal made changes.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the principal made changes.
     *
     * @param displayName the displayName value to set.
     * @return the Principal object itself.
     */
    public Principal withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the type property: Type of principal such as user , group etc.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of principal such as user , group etc.
     *
     * @param type the type value to set.
     * @return the Principal object itself.
     */
    public Principal withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the email property: Email of principal.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email of principal.
     *
     * @param email the email value to set.
     * @return the Principal object itself.
     */
    public Principal withEmail(String email) {
        this.email = email;
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
