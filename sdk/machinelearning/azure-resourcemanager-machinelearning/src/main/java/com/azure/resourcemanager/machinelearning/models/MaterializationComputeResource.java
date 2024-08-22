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
 * DTO object representing compute resource.
 */
@Fluent
public final class MaterializationComputeResource implements JsonSerializable<MaterializationComputeResource> {
    /*
     * Specifies the instance type
     */
    private String instanceType;

    /**
     * Creates an instance of MaterializationComputeResource class.
     */
    public MaterializationComputeResource() {
    }

    /**
     * Get the instanceType property: Specifies the instance type.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Set the instanceType property: Specifies the instance type.
     * 
     * @param instanceType the instanceType value to set.
     * @return the MaterializationComputeResource object itself.
     */
    public MaterializationComputeResource withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaterializationComputeResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaterializationComputeResource if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaterializationComputeResource.
     */
    public static MaterializationComputeResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaterializationComputeResource deserializedMaterializationComputeResource
                = new MaterializationComputeResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedMaterializationComputeResource.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaterializationComputeResource;
        });
    }
}
