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
 * The EncryptionKeyVaultProperties model.
 */
@Fluent
public final class EncryptionKeyVaultProperties implements JsonSerializable<EncryptionKeyVaultProperties> {
    /*
     * The ArmId of the keyVault where the customer owned encryption key is present.
     */
    private String keyVaultArmId;

    /*
     * Key vault uri to access the encryption key.
     */
    private String keyIdentifier;

    /*
     * For future use - The client id of the identity which will be used to access key vault.
     */
    private String identityClientId;

    /**
     * Creates an instance of EncryptionKeyVaultProperties class.
     */
    public EncryptionKeyVaultProperties() {
    }

    /**
     * Get the keyVaultArmId property: The ArmId of the keyVault where the customer owned encryption key is present.
     * 
     * @return the keyVaultArmId value.
     */
    public String keyVaultArmId() {
        return this.keyVaultArmId;
    }

    /**
     * Set the keyVaultArmId property: The ArmId of the keyVault where the customer owned encryption key is present.
     * 
     * @param keyVaultArmId the keyVaultArmId value to set.
     * @return the EncryptionKeyVaultProperties object itself.
     */
    public EncryptionKeyVaultProperties withKeyVaultArmId(String keyVaultArmId) {
        this.keyVaultArmId = keyVaultArmId;
        return this;
    }

    /**
     * Get the keyIdentifier property: Key vault uri to access the encryption key.
     * 
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: Key vault uri to access the encryption key.
     * 
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the EncryptionKeyVaultProperties object itself.
     */
    public EncryptionKeyVaultProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the identityClientId property: For future use - The client id of the identity which will be used to access
     * key vault.
     * 
     * @return the identityClientId value.
     */
    public String identityClientId() {
        return this.identityClientId;
    }

    /**
     * Set the identityClientId property: For future use - The client id of the identity which will be used to access
     * key vault.
     * 
     * @param identityClientId the identityClientId value to set.
     * @return the EncryptionKeyVaultProperties object itself.
     */
    public EncryptionKeyVaultProperties withIdentityClientId(String identityClientId) {
        this.identityClientId = identityClientId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultArmId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyVaultArmId in model EncryptionKeyVaultProperties"));
        }
        if (keyIdentifier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyIdentifier in model EncryptionKeyVaultProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionKeyVaultProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("keyVaultArmId", this.keyVaultArmId);
        jsonWriter.writeStringField("keyIdentifier", this.keyIdentifier);
        jsonWriter.writeStringField("identityClientId", this.identityClientId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionKeyVaultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionKeyVaultProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EncryptionKeyVaultProperties.
     */
    public static EncryptionKeyVaultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionKeyVaultProperties deserializedEncryptionKeyVaultProperties = new EncryptionKeyVaultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyVaultArmId".equals(fieldName)) {
                    deserializedEncryptionKeyVaultProperties.keyVaultArmId = reader.getString();
                } else if ("keyIdentifier".equals(fieldName)) {
                    deserializedEncryptionKeyVaultProperties.keyIdentifier = reader.getString();
                } else if ("identityClientId".equals(fieldName)) {
                    deserializedEncryptionKeyVaultProperties.identityClientId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionKeyVaultProperties;
        });
    }
}
