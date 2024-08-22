// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Docker container configuration.
 */
@Fluent
public final class Docker implements JsonSerializable<Docker> {
    /*
     * Indicate whether container shall run in privileged or non-privileged mode.
     */
    private Boolean privileged;

    /*
     * Docker container configuration
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of Docker class.
     */
    public Docker() {
    }

    /**
     * Get the privileged property: Indicate whether container shall run in privileged or non-privileged mode.
     * 
     * @return the privileged value.
     */
    public Boolean privileged() {
        return this.privileged;
    }

    /**
     * Set the privileged property: Indicate whether container shall run in privileged or non-privileged mode.
     * 
     * @param privileged the privileged value to set.
     * @return the Docker object itself.
     */
    public Docker withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * Get the additionalProperties property: Docker container configuration.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Docker container configuration.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the Docker object itself.
     */
    public Docker withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("privileged", this.privileged);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Docker from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Docker if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Docker.
     */
    public static Docker fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Docker deserializedDocker = new Docker();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privileged".equals(fieldName)) {
                    deserializedDocker.privileged = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedDocker.additionalProperties = additionalProperties;

            return deserializedDocker;
        });
    }
}
