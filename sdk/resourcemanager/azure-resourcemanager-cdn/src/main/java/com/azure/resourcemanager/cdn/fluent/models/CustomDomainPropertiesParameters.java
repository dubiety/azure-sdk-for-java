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
 * The JSON object that contains the properties of the custom domain to create.
 */
@Fluent
public final class CustomDomainPropertiesParameters implements JsonSerializable<CustomDomainPropertiesParameters> {
    /*
     * The host name of the custom domain. Must be a domain name.
     */
    private String hostname;

    /**
     * Creates an instance of CustomDomainPropertiesParameters class.
     */
    public CustomDomainPropertiesParameters() {
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
     * @return the CustomDomainPropertiesParameters object itself.
     */
    public CustomDomainPropertiesParameters withHostname(String hostname) {
        this.hostname = hostname;
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
                    "Missing required property hostname in model CustomDomainPropertiesParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainPropertiesParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostName", this.hostname);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainPropertiesParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainPropertiesParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomDomainPropertiesParameters.
     */
    public static CustomDomainPropertiesParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainPropertiesParameters deserializedCustomDomainPropertiesParameters
                = new CustomDomainPropertiesParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostName".equals(fieldName)) {
                    deserializedCustomDomainPropertiesParameters.hostname = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainPropertiesParameters;
        });
    }
}
