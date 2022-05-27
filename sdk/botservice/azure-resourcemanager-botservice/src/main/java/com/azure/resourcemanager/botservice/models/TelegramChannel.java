// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Telegram channel definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "channelName")
@JsonTypeName("TelegramChannel")
@Fluent
public final class TelegramChannel extends Channel {
    /*
     * The set of properties specific to Telegram channel resource
     */
    @JsonProperty(value = "properties")
    private TelegramChannelProperties properties;

    /**
     * Get the properties property: The set of properties specific to Telegram channel resource.
     *
     * @return the properties value.
     */
    public TelegramChannelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Telegram channel resource.
     *
     * @param properties the properties value to set.
     * @return the TelegramChannel object itself.
     */
    public TelegramChannel withProperties(TelegramChannelProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TelegramChannel withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TelegramChannel withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
