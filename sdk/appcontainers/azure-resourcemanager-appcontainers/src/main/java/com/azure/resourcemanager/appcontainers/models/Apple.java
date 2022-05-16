// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the Apple provider. */
@Fluent
public final class Apple {
    /*
     * <code>false</code> if the Apple provider should not be enabled despite
     * the set registration; otherwise, <code>true</code>.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The configuration settings of the Apple registration.
     */
    @JsonProperty(value = "registration")
    private AppleRegistration registration;

    /*
     * The configuration settings of the login flow.
     */
    @JsonProperty(value = "login")
    private LoginScopes login;

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Apple provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Apple provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param enabled the enabled value to set.
     * @return the Apple object itself.
     */
    public Apple withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the Apple registration.
     *
     * @return the registration value.
     */
    public AppleRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the Apple registration.
     *
     * @param registration the registration value to set.
     * @return the Apple object itself.
     */
    public Apple withRegistration(AppleRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow.
     *
     * @return the login value.
     */
    public LoginScopes login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the login flow.
     *
     * @param login the login value to set.
     * @return the Apple object itself.
     */
    public Apple withLogin(LoginScopes login) {
        this.login = login;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registration() != null) {
            registration().validate();
        }
        if (login() != null) {
            login().validate();
        }
    }
}
