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
import java.util.List;

/**
 * Details for each region the registry is in.
 */
@Fluent
public final class RegistryRegionArmDetails implements JsonSerializable<RegistryRegionArmDetails> {
    /*
     * List of ACR accounts
     */
    private List<AcrDetails> acrDetails;

    /*
     * The location where the registry exists
     */
    private String location;

    /*
     * List of storage accounts
     */
    private List<StorageAccountDetails> storageAccountDetails;

    /**
     * Creates an instance of RegistryRegionArmDetails class.
     */
    public RegistryRegionArmDetails() {
    }

    /**
     * Get the acrDetails property: List of ACR accounts.
     * 
     * @return the acrDetails value.
     */
    public List<AcrDetails> acrDetails() {
        return this.acrDetails;
    }

    /**
     * Set the acrDetails property: List of ACR accounts.
     * 
     * @param acrDetails the acrDetails value to set.
     * @return the RegistryRegionArmDetails object itself.
     */
    public RegistryRegionArmDetails withAcrDetails(List<AcrDetails> acrDetails) {
        this.acrDetails = acrDetails;
        return this;
    }

    /**
     * Get the location property: The location where the registry exists.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location where the registry exists.
     * 
     * @param location the location value to set.
     * @return the RegistryRegionArmDetails object itself.
     */
    public RegistryRegionArmDetails withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the storageAccountDetails property: List of storage accounts.
     * 
     * @return the storageAccountDetails value.
     */
    public List<StorageAccountDetails> storageAccountDetails() {
        return this.storageAccountDetails;
    }

    /**
     * Set the storageAccountDetails property: List of storage accounts.
     * 
     * @param storageAccountDetails the storageAccountDetails value to set.
     * @return the RegistryRegionArmDetails object itself.
     */
    public RegistryRegionArmDetails withStorageAccountDetails(List<StorageAccountDetails> storageAccountDetails) {
        this.storageAccountDetails = storageAccountDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (acrDetails() != null) {
            acrDetails().forEach(e -> e.validate());
        }
        if (storageAccountDetails() != null) {
            storageAccountDetails().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("acrDetails", this.acrDetails, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeArrayField("storageAccountDetails", this.storageAccountDetails,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistryRegionArmDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistryRegionArmDetails if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegistryRegionArmDetails.
     */
    public static RegistryRegionArmDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistryRegionArmDetails deserializedRegistryRegionArmDetails = new RegistryRegionArmDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("acrDetails".equals(fieldName)) {
                    List<AcrDetails> acrDetails = reader.readArray(reader1 -> AcrDetails.fromJson(reader1));
                    deserializedRegistryRegionArmDetails.acrDetails = acrDetails;
                } else if ("location".equals(fieldName)) {
                    deserializedRegistryRegionArmDetails.location = reader.getString();
                } else if ("storageAccountDetails".equals(fieldName)) {
                    List<StorageAccountDetails> storageAccountDetails
                        = reader.readArray(reader1 -> StorageAccountDetails.fromJson(reader1));
                    deserializedRegistryRegionArmDetails.storageAccountDetails = storageAccountDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistryRegionArmDetails;
        });
    }
}
