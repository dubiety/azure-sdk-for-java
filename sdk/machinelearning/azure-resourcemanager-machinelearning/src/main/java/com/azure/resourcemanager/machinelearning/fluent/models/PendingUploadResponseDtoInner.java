// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.BlobReferenceForConsumptionDto;
import com.azure.resourcemanager.machinelearning.models.PendingUploadType;
import java.io.IOException;

/**
 * The PendingUploadResponseDto model.
 */
@Fluent
public final class PendingUploadResponseDtoInner implements JsonSerializable<PendingUploadResponseDtoInner> {
    /*
     * Container level read, write, list SAS
     */
    private BlobReferenceForConsumptionDto blobReferenceForConsumption;

    /*
     * ID for this upload request
     */
    private String pendingUploadId;

    /*
     * TemporaryBlobReference is the only supported type
     */
    private PendingUploadType pendingUploadType;

    /**
     * Creates an instance of PendingUploadResponseDtoInner class.
     */
    public PendingUploadResponseDtoInner() {
    }

    /**
     * Get the blobReferenceForConsumption property: Container level read, write, list SAS.
     * 
     * @return the blobReferenceForConsumption value.
     */
    public BlobReferenceForConsumptionDto blobReferenceForConsumption() {
        return this.blobReferenceForConsumption;
    }

    /**
     * Set the blobReferenceForConsumption property: Container level read, write, list SAS.
     * 
     * @param blobReferenceForConsumption the blobReferenceForConsumption value to set.
     * @return the PendingUploadResponseDtoInner object itself.
     */
    public PendingUploadResponseDtoInner
        withBlobReferenceForConsumption(BlobReferenceForConsumptionDto blobReferenceForConsumption) {
        this.blobReferenceForConsumption = blobReferenceForConsumption;
        return this;
    }

    /**
     * Get the pendingUploadId property: ID for this upload request.
     * 
     * @return the pendingUploadId value.
     */
    public String pendingUploadId() {
        return this.pendingUploadId;
    }

    /**
     * Set the pendingUploadId property: ID for this upload request.
     * 
     * @param pendingUploadId the pendingUploadId value to set.
     * @return the PendingUploadResponseDtoInner object itself.
     */
    public PendingUploadResponseDtoInner withPendingUploadId(String pendingUploadId) {
        this.pendingUploadId = pendingUploadId;
        return this;
    }

    /**
     * Get the pendingUploadType property: TemporaryBlobReference is the only supported type.
     * 
     * @return the pendingUploadType value.
     */
    public PendingUploadType pendingUploadType() {
        return this.pendingUploadType;
    }

    /**
     * Set the pendingUploadType property: TemporaryBlobReference is the only supported type.
     * 
     * @param pendingUploadType the pendingUploadType value to set.
     * @return the PendingUploadResponseDtoInner object itself.
     */
    public PendingUploadResponseDtoInner withPendingUploadType(PendingUploadType pendingUploadType) {
        this.pendingUploadType = pendingUploadType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blobReferenceForConsumption() != null) {
            blobReferenceForConsumption().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("blobReferenceForConsumption", this.blobReferenceForConsumption);
        jsonWriter.writeStringField("pendingUploadId", this.pendingUploadId);
        jsonWriter.writeStringField("pendingUploadType",
            this.pendingUploadType == null ? null : this.pendingUploadType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PendingUploadResponseDtoInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PendingUploadResponseDtoInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PendingUploadResponseDtoInner.
     */
    public static PendingUploadResponseDtoInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PendingUploadResponseDtoInner deserializedPendingUploadResponseDtoInner
                = new PendingUploadResponseDtoInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blobReferenceForConsumption".equals(fieldName)) {
                    deserializedPendingUploadResponseDtoInner.blobReferenceForConsumption
                        = BlobReferenceForConsumptionDto.fromJson(reader);
                } else if ("pendingUploadId".equals(fieldName)) {
                    deserializedPendingUploadResponseDtoInner.pendingUploadId = reader.getString();
                } else if ("pendingUploadType".equals(fieldName)) {
                    deserializedPendingUploadResponseDtoInner.pendingUploadType
                        = PendingUploadType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPendingUploadResponseDtoInner;
        });
    }
}
