// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.fluent.models.ClusterUpdateProperties;
import java.io.IOException;

/**
 * AmlCompute update parameters.
 */
@Fluent
public final class ClusterUpdateParameters implements JsonSerializable<ClusterUpdateParameters> {
    /*
     * The properties of the amlCompute.
     */
    private ClusterUpdateProperties innerProperties;

    /**
     * Creates an instance of ClusterUpdateParameters class.
     */
    public ClusterUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The properties of the amlCompute.
     * 
     * @return the innerProperties value.
     */
    private ClusterUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the properties property: Properties of ClusterUpdate.
     * 
     * @return the properties value.
     */
    public ScaleSettingsInformation properties() {
        return this.innerProperties() == null ? null : this.innerProperties().properties();
    }

    /**
     * Set the properties property: Properties of ClusterUpdate.
     * 
     * @param properties the properties value to set.
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withProperties(ScaleSettingsInformation properties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterUpdateProperties();
        }
        this.innerProperties().withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterUpdateParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterUpdateParameters.
     */
    public static ClusterUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterUpdateParameters deserializedClusterUpdateParameters = new ClusterUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedClusterUpdateParameters.innerProperties = ClusterUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterUpdateParameters;
        });
    }
}
