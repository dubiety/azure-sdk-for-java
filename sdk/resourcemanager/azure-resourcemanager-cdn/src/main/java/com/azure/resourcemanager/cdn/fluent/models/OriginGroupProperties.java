// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.models.OriginGroupProvisioningState;
import com.azure.resourcemanager.cdn.models.OriginGroupResourceState;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.azure.resourcemanager.cdn.models.ResponseBasedOriginErrorDetectionParameters;
import java.io.IOException;
import java.util.List;

/**
 * The JSON object that contains the properties of the origin group.
 */
@Fluent
public final class OriginGroupProperties extends OriginGroupUpdatePropertiesParameters {
    /*
     * Resource status of the origin group.
     */
    private OriginGroupResourceState resourceState;

    /*
     * Provisioning status of the origin group.
     */
    private OriginGroupProvisioningState provisioningState;

    /**
     * Creates an instance of OriginGroupProperties class.
     */
    public OriginGroupProperties() {
    }

    /**
     * Get the resourceState property: Resource status of the origin group.
     * 
     * @return the resourceState value.
     */
    public OriginGroupResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the origin group.
     * 
     * @return the provisioningState value.
     */
    public OriginGroupProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginGroupProperties withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        super.withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginGroupProperties withOrigins(List<ResourceReference> origins) {
        super.withOrigins(origins);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginGroupProperties withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        super.withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
            trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginGroupProperties withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        super.withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
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
        jsonWriter.writeJsonField("healthProbeSettings", healthProbeSettings());
        jsonWriter.writeArrayField("origins", origins(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("trafficRestorationTimeToHealedOrNewEndpointsInMinutes",
            trafficRestorationTimeToHealedOrNewEndpointsInMinutes());
        jsonWriter.writeJsonField("responseBasedOriginErrorDetectionSettings",
            responseBasedOriginErrorDetectionSettings());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OriginGroupProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OriginGroupProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OriginGroupProperties.
     */
    public static OriginGroupProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OriginGroupProperties deserializedOriginGroupProperties = new OriginGroupProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("healthProbeSettings".equals(fieldName)) {
                    deserializedOriginGroupProperties.withHealthProbeSettings(HealthProbeParameters.fromJson(reader));
                } else if ("origins".equals(fieldName)) {
                    List<ResourceReference> origins = reader.readArray(reader1 -> ResourceReference.fromJson(reader1));
                    deserializedOriginGroupProperties.withOrigins(origins);
                } else if ("trafficRestorationTimeToHealedOrNewEndpointsInMinutes".equals(fieldName)) {
                    deserializedOriginGroupProperties.withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                        reader.getNullable(JsonReader::getInt));
                } else if ("responseBasedOriginErrorDetectionSettings".equals(fieldName)) {
                    deserializedOriginGroupProperties.withResponseBasedOriginErrorDetectionSettings(
                        ResponseBasedOriginErrorDetectionParameters.fromJson(reader));
                } else if ("resourceState".equals(fieldName)) {
                    deserializedOriginGroupProperties.resourceState
                        = OriginGroupResourceState.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedOriginGroupProperties.provisioningState
                        = OriginGroupProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOriginGroupProperties;
        });
    }
}
