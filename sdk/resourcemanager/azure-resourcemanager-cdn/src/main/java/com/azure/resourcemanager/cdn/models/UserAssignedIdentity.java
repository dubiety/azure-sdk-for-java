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
import java.util.UUID;

/**
 * User assigned identity properties.
 */
@Immutable
public final class UserAssignedIdentity implements JsonSerializable<UserAssignedIdentity> {
    /*
     * The principal ID of the assigned identity.
     */
    private UUID principalId;

    /*
     * The client ID of the assigned identity.
     */
    private UUID clientId;

    /**
     * Creates an instance of UserAssignedIdentity class.
     */
    public UserAssignedIdentity() {
    }

    /**
     * Get the principalId property: The principal ID of the assigned identity.
     * 
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The client ID of the assigned identity.
     * 
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
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
     * Reads an instance of UserAssignedIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserAssignedIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserAssignedIdentity.
     */
    public static UserAssignedIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserAssignedIdentity deserializedUserAssignedIdentity = new UserAssignedIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedUserAssignedIdentity.principalId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("clientId".equals(fieldName)) {
                    deserializedUserAssignedIdentity.clientId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserAssignedIdentity;
        });
    }
}
