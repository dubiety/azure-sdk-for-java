// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.fluent.models.DatastoreSecretsInner;
import java.io.IOException;

/**
 * Datastore account key secrets.
 */
@Fluent
public final class AccountKeyDatastoreSecrets extends DatastoreSecretsInner {
    /*
     * [Required] Credential type used to authentication with storage.
     */
    private SecretsType secretsType = SecretsType.ACCOUNT_KEY;

    /*
     * Storage account key.
     */
    private String key;

    /**
     * Creates an instance of AccountKeyDatastoreSecrets class.
     */
    public AccountKeyDatastoreSecrets() {
    }

    /**
     * Get the secretsType property: [Required] Credential type used to authentication with storage.
     * 
     * @return the secretsType value.
     */
    @Override
    public SecretsType secretsType() {
        return this.secretsType;
    }

    /**
     * Get the key property: Storage account key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Storage account key.
     * 
     * @param key the key value to set.
     * @return the AccountKeyDatastoreSecrets object itself.
     */
    public AccountKeyDatastoreSecrets withKey(String key) {
        this.key = key;
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
        jsonWriter.writeStringField("secretsType", this.secretsType == null ? null : this.secretsType.toString());
        jsonWriter.writeStringField("key", this.key);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountKeyDatastoreSecrets from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountKeyDatastoreSecrets if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountKeyDatastoreSecrets.
     */
    public static AccountKeyDatastoreSecrets fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountKeyDatastoreSecrets deserializedAccountKeyDatastoreSecrets = new AccountKeyDatastoreSecrets();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretsType".equals(fieldName)) {
                    deserializedAccountKeyDatastoreSecrets.secretsType = SecretsType.fromString(reader.getString());
                } else if ("key".equals(fieldName)) {
                    deserializedAccountKeyDatastoreSecrets.key = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountKeyDatastoreSecrets;
        });
    }
}
