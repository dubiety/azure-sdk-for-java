// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The mapping between a particular client IP and the type of access client has on the NFS share. */
@Fluent
public final class ClientAccessRight {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClientAccessRight.class);

    /*
     * IP of the client.
     */
    @JsonProperty(value = "client", required = true)
    private String client;

    /*
     * Type of access to be allowed for the client.
     */
    @JsonProperty(value = "accessPermission", required = true)
    private ClientPermissionType accessPermission;

    /**
     * Get the client property: IP of the client.
     *
     * @return the client value.
     */
    public String client() {
        return this.client;
    }

    /**
     * Set the client property: IP of the client.
     *
     * @param client the client value to set.
     * @return the ClientAccessRight object itself.
     */
    public ClientAccessRight withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * Get the accessPermission property: Type of access to be allowed for the client.
     *
     * @return the accessPermission value.
     */
    public ClientPermissionType accessPermission() {
        return this.accessPermission;
    }

    /**
     * Set the accessPermission property: Type of access to be allowed for the client.
     *
     * @param accessPermission the accessPermission value to set.
     * @return the ClientAccessRight object itself.
     */
    public ClientAccessRight withAccessPermission(ClientPermissionType accessPermission) {
        this.accessPermission = accessPermission;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (client() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property client in model ClientAccessRight"));
        }
        if (accessPermission() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accessPermission in model ClientAccessRight"));
        }
    }
}
