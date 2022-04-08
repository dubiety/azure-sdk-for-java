// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** API contact information. */
@Fluent
public final class ApiContactInformation {
    /*
     * The identifying name of the contact person/organization
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The URL pointing to the contact information. MUST be in the format of a
     * URL
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * The email address of the contact person/organization. MUST be in the
     * format of an email address
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * Get the name property: The identifying name of the contact person/organization.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The identifying name of the contact person/organization.
     *
     * @param name the name value to set.
     * @return the ApiContactInformation object itself.
     */
    public ApiContactInformation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the url property: The URL pointing to the contact information. MUST be in the format of a URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The URL pointing to the contact information. MUST be in the format of a URL.
     *
     * @param url the url value to set.
     * @return the ApiContactInformation object itself.
     */
    public ApiContactInformation withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the email property: The email address of the contact person/organization. MUST be in the format of an email
     * address.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: The email address of the contact person/organization. MUST be in the format of an email
     * address.
     *
     * @param email the email value to set.
     * @return the ApiContactInformation object itself.
     */
    public ApiContactInformation withEmail(String email) {
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
