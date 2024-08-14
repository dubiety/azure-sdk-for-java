// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Error response indicates CDN service is not able to process the incoming request. The reason is provided in the error
 * message.
 */
@Immutable
public final class MigrationErrorType implements JsonSerializable<MigrationErrorType> {
    /*
     * Error code.
     */
    private String code;

    /*
     * Resource which has the problem.
     */
    private String resourceName;

    /*
     * Error message indicating why the operation failed.
     */
    private String errorMessage;

    /*
     * Describes what needs to be done to fix the problem
     */
    private String nextSteps;

    /**
     * Creates an instance of MigrationErrorType class.
     */
    public MigrationErrorType() {
    }

    /**
     * Get the code property: Error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the resourceName property: Resource which has the problem.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the errorMessage property: Error message indicating why the operation failed.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the nextSteps property: Describes what needs to be done to fix the problem.
     * 
     * @return the nextSteps value.
     */
    public String nextSteps() {
        return this.nextSteps;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MigrationErrorType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MigrationErrorType if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MigrationErrorType.
     */
    public static MigrationErrorType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MigrationErrorType deserializedMigrationErrorType = new MigrationErrorType();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedMigrationErrorType.code = reader.getString();
                } else if ("resourceName".equals(fieldName)) {
                    deserializedMigrationErrorType.resourceName = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedMigrationErrorType.errorMessage = reader.getString();
                } else if ("nextSteps".equals(fieldName)) {
                    deserializedMigrationErrorType.nextSteps = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMigrationErrorType;
        });
    }
}
