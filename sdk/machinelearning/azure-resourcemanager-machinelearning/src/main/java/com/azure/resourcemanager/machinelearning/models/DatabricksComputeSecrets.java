// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeSecretsInner;
import java.io.IOException;

/**
 * Secrets related to a Machine Learning compute based on Databricks.
 */
@Fluent
public final class DatabricksComputeSecrets extends ComputeSecretsInner {
    /*
     * The type of compute
     */
    private ComputeType computeType = ComputeType.DATABRICKS;

    /*
     * access token for databricks account.
     */
    private String databricksAccessToken;

    /**
     * Creates an instance of DatabricksComputeSecrets class.
     */
    public DatabricksComputeSecrets() {
    }

    /**
     * Get the computeType property: The type of compute.
     * 
     * @return the computeType value.
     */
    @Override
    public ComputeType computeType() {
        return this.computeType;
    }

    /**
     * Get the databricksAccessToken property: access token for databricks account.
     * 
     * @return the databricksAccessToken value.
     */
    public String databricksAccessToken() {
        return this.databricksAccessToken;
    }

    /**
     * Set the databricksAccessToken property: access token for databricks account.
     * 
     * @param databricksAccessToken the databricksAccessToken value to set.
     * @return the DatabricksComputeSecrets object itself.
     */
    public DatabricksComputeSecrets withDatabricksAccessToken(String databricksAccessToken) {
        this.databricksAccessToken = databricksAccessToken;
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("computeType", this.computeType == null ? null : this.computeType.toString());
        jsonWriter.writeStringField("databricksAccessToken", this.databricksAccessToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabricksComputeSecrets from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabricksComputeSecrets if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatabricksComputeSecrets.
     */
    public static DatabricksComputeSecrets fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabricksComputeSecrets deserializedDatabricksComputeSecrets = new DatabricksComputeSecrets();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("computeType".equals(fieldName)) {
                    deserializedDatabricksComputeSecrets.computeType = ComputeType.fromString(reader.getString());
                } else if ("databricksAccessToken".equals(fieldName)) {
                    deserializedDatabricksComputeSecrets.databricksAccessToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabricksComputeSecrets;
        });
    }
}
