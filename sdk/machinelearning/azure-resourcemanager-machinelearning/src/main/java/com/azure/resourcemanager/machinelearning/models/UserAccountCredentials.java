// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings for user account that gets created on each on the nodes of a compute.
 */
@Fluent
public final class UserAccountCredentials implements JsonSerializable<UserAccountCredentials> {
    /*
     * Name of the administrator user account which can be used to SSH to nodes.
     */
    private String adminUsername;

    /*
     * SSH public key of the administrator user account.
     */
    private String adminUserSshPublicKey;

    /*
     * Password of the administrator user account.
     */
    private String adminUserPassword;

    /**
     * Creates an instance of UserAccountCredentials class.
     */
    public UserAccountCredentials() {
    }

    /**
     * Get the adminUsername property: Name of the administrator user account which can be used to SSH to nodes.
     * 
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: Name of the administrator user account which can be used to SSH to nodes.
     * 
     * @param adminUsername the adminUsername value to set.
     * @return the UserAccountCredentials object itself.
     */
    public UserAccountCredentials withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the adminUserSshPublicKey property: SSH public key of the administrator user account.
     * 
     * @return the adminUserSshPublicKey value.
     */
    public String adminUserSshPublicKey() {
        return this.adminUserSshPublicKey;
    }

    /**
     * Set the adminUserSshPublicKey property: SSH public key of the administrator user account.
     * 
     * @param adminUserSshPublicKey the adminUserSshPublicKey value to set.
     * @return the UserAccountCredentials object itself.
     */
    public UserAccountCredentials withAdminUserSshPublicKey(String adminUserSshPublicKey) {
        this.adminUserSshPublicKey = adminUserSshPublicKey;
        return this;
    }

    /**
     * Get the adminUserPassword property: Password of the administrator user account.
     * 
     * @return the adminUserPassword value.
     */
    public String adminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * Set the adminUserPassword property: Password of the administrator user account.
     * 
     * @param adminUserPassword the adminUserPassword value to set.
     * @return the UserAccountCredentials object itself.
     */
    public UserAccountCredentials withAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property adminUsername in model UserAccountCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserAccountCredentials.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("adminUserName", this.adminUsername);
        jsonWriter.writeStringField("adminUserSshPublicKey", this.adminUserSshPublicKey);
        jsonWriter.writeStringField("adminUserPassword", this.adminUserPassword);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserAccountCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserAccountCredentials if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UserAccountCredentials.
     */
    public static UserAccountCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserAccountCredentials deserializedUserAccountCredentials = new UserAccountCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("adminUserName".equals(fieldName)) {
                    deserializedUserAccountCredentials.adminUsername = reader.getString();
                } else if ("adminUserSshPublicKey".equals(fieldName)) {
                    deserializedUserAccountCredentials.adminUserSshPublicKey = reader.getString();
                } else if ("adminUserPassword".equals(fieldName)) {
                    deserializedUserAccountCredentials.adminUserPassword = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserAccountCredentials;
        });
    }
}
