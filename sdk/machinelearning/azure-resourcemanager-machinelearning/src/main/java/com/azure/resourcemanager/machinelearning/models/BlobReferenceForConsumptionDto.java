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
 * The BlobReferenceForConsumptionDto model.
 */
@Fluent
public final class BlobReferenceForConsumptionDto implements JsonSerializable<BlobReferenceForConsumptionDto> {
    /*
     * Blob URI path for client to upload data.
     * Example: https://blob.windows.core.net/Container/Path
     */
    private String blobUri;

    /*
     * Arm ID of the storage account to use
     */
    private String storageAccountArmId;

    /*
     * Credential info to access storage account
     */
    private PendingUploadCredentialDto credential;

    /**
     * Creates an instance of BlobReferenceForConsumptionDto class.
     */
    public BlobReferenceForConsumptionDto() {
    }

    /**
     * Get the blobUri property: Blob URI path for client to upload data.
     * Example: https://blob.windows.core.net/Container/Path.
     * 
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set the blobUri property: Blob URI path for client to upload data.
     * Example: https://blob.windows.core.net/Container/Path.
     * 
     * @param blobUri the blobUri value to set.
     * @return the BlobReferenceForConsumptionDto object itself.
     */
    public BlobReferenceForConsumptionDto withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the storageAccountArmId property: Arm ID of the storage account to use.
     * 
     * @return the storageAccountArmId value.
     */
    public String storageAccountArmId() {
        return this.storageAccountArmId;
    }

    /**
     * Set the storageAccountArmId property: Arm ID of the storage account to use.
     * 
     * @param storageAccountArmId the storageAccountArmId value to set.
     * @return the BlobReferenceForConsumptionDto object itself.
     */
    public BlobReferenceForConsumptionDto withStorageAccountArmId(String storageAccountArmId) {
        this.storageAccountArmId = storageAccountArmId;
        return this;
    }

    /**
     * Get the credential property: Credential info to access storage account.
     * 
     * @return the credential value.
     */
    public PendingUploadCredentialDto credential() {
        return this.credential;
    }

    /**
     * Set the credential property: Credential info to access storage account.
     * 
     * @param credential the credential value to set.
     * @return the BlobReferenceForConsumptionDto object itself.
     */
    public BlobReferenceForConsumptionDto withCredential(PendingUploadCredentialDto credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credential() != null) {
            credential().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("blobUri", this.blobUri);
        jsonWriter.writeStringField("storageAccountArmId", this.storageAccountArmId);
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobReferenceForConsumptionDto from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobReferenceForConsumptionDto if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BlobReferenceForConsumptionDto.
     */
    public static BlobReferenceForConsumptionDto fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobReferenceForConsumptionDto deserializedBlobReferenceForConsumptionDto
                = new BlobReferenceForConsumptionDto();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blobUri".equals(fieldName)) {
                    deserializedBlobReferenceForConsumptionDto.blobUri = reader.getString();
                } else if ("storageAccountArmId".equals(fieldName)) {
                    deserializedBlobReferenceForConsumptionDto.storageAccountArmId = reader.getString();
                } else if ("credential".equals(fieldName)) {
                    deserializedBlobReferenceForConsumptionDto.credential = PendingUploadCredentialDto.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobReferenceForConsumptionDto;
        });
    }
}
