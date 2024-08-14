// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The tracking states for afd resources.
 */
@Immutable
public class AfdStateProperties implements JsonSerializable<AfdStateProperties> {
    /*
     * Provisioning status
     */
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    private DeploymentStatus deploymentStatus;

    /**
     * Creates an instance of AfdStateProperties class.
     */
    public AfdStateProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning status.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the AfdStateProperties object itself.
     */
    AfdStateProperties withProvisioningState(AfdProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Set the deploymentStatus property: The deploymentStatus property.
     * 
     * @param deploymentStatus the deploymentStatus value to set.
     * @return the AfdStateProperties object itself.
     */
    AfdStateProperties withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AfdStateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdStateProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AfdStateProperties.
     */
    public static AfdStateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdStateProperties deserializedAfdStateProperties = new AfdStateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedAfdStateProperties.provisioningState
                        = AfdProvisioningState.fromString(reader.getString());
                } else if ("deploymentStatus".equals(fieldName)) {
                    deserializedAfdStateProperties.deploymentStatus = DeploymentStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdStateProperties;
        });
    }
}
