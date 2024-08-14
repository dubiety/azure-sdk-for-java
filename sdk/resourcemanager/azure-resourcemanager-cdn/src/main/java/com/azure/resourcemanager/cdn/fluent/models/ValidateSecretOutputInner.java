// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.Status;
import java.io.IOException;

/**
 * Output of the validated secret.
 */
@Fluent
public final class ValidateSecretOutputInner implements JsonSerializable<ValidateSecretOutputInner> {
    /*
     * The validation status.
     */
    private Status status;

    /*
     * Detailed error message
     */
    private String message;

    /**
     * Creates an instance of ValidateSecretOutputInner class.
     */
    public ValidateSecretOutputInner() {
    }

    /**
     * Get the status property: The validation status.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The validation status.
     * 
     * @param status the status value to set.
     * @return the ValidateSecretOutputInner object itself.
     */
    public ValidateSecretOutputInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the message property: Detailed error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Detailed error message.
     * 
     * @param message the message value to set.
     * @return the ValidateSecretOutputInner object itself.
     */
    public ValidateSecretOutputInner withMessage(String message) {
        this.message = message;
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
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateSecretOutputInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateSecretOutputInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ValidateSecretOutputInner.
     */
    public static ValidateSecretOutputInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateSecretOutputInner deserializedValidateSecretOutputInner = new ValidateSecretOutputInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedValidateSecretOutputInner.status = Status.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedValidateSecretOutputInner.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateSecretOutputInner;
        });
    }
}
