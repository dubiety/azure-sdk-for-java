// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.identity.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CommunicationIdentity model. */
@Fluent
public final class CommunicationIdentity {
    /*
     * Identifier of the identity.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Identifier of the identity.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Identifier of the identity.
     *
     * @param id the id value to set.
     * @return the CommunicationIdentity object itself.
     */
    public CommunicationIdentity setId(String id) {
        this.id = id;
        return this;
    }
}
