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
 * Resource requirements for each container instance within an online deployment.
 */
@Fluent
public final class ContainerResourceRequirements implements JsonSerializable<ContainerResourceRequirements> {
    /*
     * Container resource request info:
     */
    private ContainerResourceSettings containerResourceRequests;

    /*
     * Container resource limit info:
     */
    private ContainerResourceSettings containerResourceLimits;

    /**
     * Creates an instance of ContainerResourceRequirements class.
     */
    public ContainerResourceRequirements() {
    }

    /**
     * Get the containerResourceRequests property: Container resource request info:.
     * 
     * @return the containerResourceRequests value.
     */
    public ContainerResourceSettings containerResourceRequests() {
        return this.containerResourceRequests;
    }

    /**
     * Set the containerResourceRequests property: Container resource request info:.
     * 
     * @param containerResourceRequests the containerResourceRequests value to set.
     * @return the ContainerResourceRequirements object itself.
     */
    public ContainerResourceRequirements
        withContainerResourceRequests(ContainerResourceSettings containerResourceRequests) {
        this.containerResourceRequests = containerResourceRequests;
        return this;
    }

    /**
     * Get the containerResourceLimits property: Container resource limit info:.
     * 
     * @return the containerResourceLimits value.
     */
    public ContainerResourceSettings containerResourceLimits() {
        return this.containerResourceLimits;
    }

    /**
     * Set the containerResourceLimits property: Container resource limit info:.
     * 
     * @param containerResourceLimits the containerResourceLimits value to set.
     * @return the ContainerResourceRequirements object itself.
     */
    public ContainerResourceRequirements
        withContainerResourceLimits(ContainerResourceSettings containerResourceLimits) {
        this.containerResourceLimits = containerResourceLimits;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerResourceRequests() != null) {
            containerResourceRequests().validate();
        }
        if (containerResourceLimits() != null) {
            containerResourceLimits().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("containerResourceRequests", this.containerResourceRequests);
        jsonWriter.writeJsonField("containerResourceLimits", this.containerResourceLimits);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerResourceRequirements from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerResourceRequirements if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerResourceRequirements.
     */
    public static ContainerResourceRequirements fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerResourceRequirements deserializedContainerResourceRequirements
                = new ContainerResourceRequirements();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("containerResourceRequests".equals(fieldName)) {
                    deserializedContainerResourceRequirements.containerResourceRequests
                        = ContainerResourceSettings.fromJson(reader);
                } else if ("containerResourceLimits".equals(fieldName)) {
                    deserializedContainerResourceRequirements.containerResourceLimits
                        = ContainerResourceSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerResourceRequirements;
        });
    }
}
