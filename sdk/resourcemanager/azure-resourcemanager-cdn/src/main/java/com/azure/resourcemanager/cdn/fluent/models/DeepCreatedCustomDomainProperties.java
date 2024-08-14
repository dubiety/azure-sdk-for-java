// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of the custom domain created on the CDN endpoint.
 */
@Fluent
public final class DeepCreatedCustomDomainProperties implements JsonSerializable<DeepCreatedCustomDomainProperties> {
    /*
     * The host name of the custom domain. Must be a domain name.
     */
    private String hostname;

    /*
     * Special validation or data may be required when delivering CDN to some regions due to local compliance reasons.
     * E.g. ICP license number of a custom domain is required to deliver content in China.
     */
    private String validationData;

    /**
     * Creates an instance of DeepCreatedCustomDomainProperties class.
     */
    public DeepCreatedCustomDomainProperties() {
    }

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     * 
     * @param hostname the hostname value to set.
     * @return the DeepCreatedCustomDomainProperties object itself.
     */
    public DeepCreatedCustomDomainProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     * 
     * @return the validationData value.
     */
    public String validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     * 
     * @param validationData the validationData value to set.
     * @return the DeepCreatedCustomDomainProperties object itself.
     */
    public DeepCreatedCustomDomainProperties withValidationData(String validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostname() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property hostname in model DeepCreatedCustomDomainProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeepCreatedCustomDomainProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostName", this.hostname);
        jsonWriter.writeStringField("validationData", this.validationData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeepCreatedCustomDomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeepCreatedCustomDomainProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeepCreatedCustomDomainProperties.
     */
    public static DeepCreatedCustomDomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeepCreatedCustomDomainProperties deserializedDeepCreatedCustomDomainProperties
                = new DeepCreatedCustomDomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostName".equals(fieldName)) {
                    deserializedDeepCreatedCustomDomainProperties.hostname = reader.getString();
                } else if ("validationData".equals(fieldName)) {
                    deserializedDeepCreatedCustomDomainProperties.validationData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeepCreatedCustomDomainProperties;
        });
    }
}
