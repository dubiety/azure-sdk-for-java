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

/**
 * Identity that will be used to access key vault for encryption at rest.
 */
@Fluent
public final class IdentityForCmk implements JsonSerializable<IdentityForCmk> {
    /*
     * The ArmId of the user assigned identity that will be used to access the customer managed key vault
     */
    private String userAssignedIdentity;

    /**
     * Creates an instance of IdentityForCmk class.
     */
    public IdentityForCmk() {
    }

    /**
     * Get the userAssignedIdentity property: The ArmId of the user assigned identity that will be used to access the
     * customer managed key vault.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The ArmId of the user assigned identity that will be used to access the
     * customer managed key vault.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the IdentityForCmk object itself.
     */
    public IdentityForCmk withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
        jsonWriter.writeStringField("userAssignedIdentity", this.userAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdentityForCmk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdentityForCmk if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IdentityForCmk.
     */
    public static IdentityForCmk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IdentityForCmk deserializedIdentityForCmk = new IdentityForCmk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userAssignedIdentity".equals(fieldName)) {
                    deserializedIdentityForCmk.userAssignedIdentity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdentityForCmk;
        });
    }
}
