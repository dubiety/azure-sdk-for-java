// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User identity configuration.
 */
@Immutable
public final class UserIdentity extends IdentityConfiguration {
    /*
     * [Required] Specifies the type of identity framework.
     */
    private IdentityConfigurationType identityType = IdentityConfigurationType.USER_IDENTITY;

    /**
     * Creates an instance of UserIdentity class.
     */
    public UserIdentity() {
    }

    /**
     * Get the identityType property: [Required] Specifies the type of identity framework.
     * 
     * @return the identityType value.
     */
    @Override
    public IdentityConfigurationType identityType() {
        return this.identityType;
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
        jsonWriter.writeStringField("identityType", this.identityType == null ? null : this.identityType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserIdentity.
     */
    public static UserIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserIdentity deserializedUserIdentity = new UserIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("identityType".equals(fieldName)) {
                    deserializedUserIdentity.identityType = IdentityConfigurationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserIdentity;
        });
    }
}
