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
 * Base definition for Azure datastore contents configuration.
 */
@Fluent
public class AzureDatastore implements JsonSerializable<AzureDatastore> {
    /*
     * Azure Subscription Id
     */
    private String subscriptionId;

    /*
     * Azure Resource Group name
     */
    private String resourceGroup;

    /**
     * Creates an instance of AzureDatastore class.
     */
    public AzureDatastore() {
    }

    /**
     * Get the subscriptionId property: Azure Subscription Id.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Azure Subscription Id.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDatastore object itself.
     */
    public AzureDatastore withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: Azure Resource Group name.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Azure Resource Group name.
     * 
     * @param resourceGroup the resourceGroup value to set.
     * @return the AzureDatastore object itself.
     */
    public AzureDatastore withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
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
        jsonWriter.writeStringField("subscriptionId", this.subscriptionId);
        jsonWriter.writeStringField("resourceGroup", this.resourceGroup);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDatastore from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDatastore if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureDatastore.
     */
    public static AzureDatastore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDatastore deserializedAzureDatastore = new AzureDatastore();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscriptionId".equals(fieldName)) {
                    deserializedAzureDatastore.subscriptionId = reader.getString();
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedAzureDatastore.resourceGroup = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureDatastore;
        });
    }
}
