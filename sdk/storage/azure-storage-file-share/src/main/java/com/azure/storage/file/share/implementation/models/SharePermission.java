// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A permission (a security descriptor) at the share level.
 */
@Fluent
public final class SharePermission implements JsonSerializable<SharePermission> {
    /*
     * The permission in the Security Descriptor Definition Language (SDDL).
     */
    private String permission;

    /**
     * Creates an instance of SharePermission class.
     */
    public SharePermission() {
    }

    /**
     * Get the permission property: The permission in the Security Descriptor Definition Language (SDDL).
     * 
     * @return the permission value.
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * Set the permission property: The permission in the Security Descriptor Definition Language (SDDL).
     * 
     * @param permission the permission value to set.
     * @return the SharePermission object itself.
     */
    public SharePermission setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("permission", this.permission);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharePermission from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharePermission if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SharePermission.
     */
    public static SharePermission fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharePermission deserializedSharePermission = new SharePermission();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("permission".equals(fieldName)) {
                    deserializedSharePermission.permission = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharePermission;
        });
    }
}
