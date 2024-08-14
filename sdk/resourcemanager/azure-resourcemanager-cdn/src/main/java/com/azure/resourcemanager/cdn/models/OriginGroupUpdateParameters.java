// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.OriginGroupUpdatePropertiesParameters;
import java.io.IOException;
import java.util.List;

/**
 * Origin group properties needed for origin group creation or update.
 */
@Fluent
public final class OriginGroupUpdateParameters implements JsonSerializable<OriginGroupUpdateParameters> {
    /*
     * The JSON object that contains the properties of the origin group.
     */
    private OriginGroupUpdatePropertiesParameters innerProperties;

    /**
     * Creates an instance of OriginGroupUpdateParameters class.
     */
    public OriginGroupUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin group.
     * 
     * @return the innerProperties value.
     */
    private OriginGroupUpdatePropertiesParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     * 
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     * 
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN within given origin group.
     * 
     * @return the origins value.
     */
    public List<ResourceReference> origins() {
        return this.innerProperties() == null ? null : this.innerProperties().origins();
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN within given origin group.
     * 
     * @param origins the origins value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withOrigins(List<ResourceReference> origins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties().withOrigins(origins);
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     * 
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     * 
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     * trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties()
            .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * Get the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     * 
     * @return the responseBasedOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().responseBasedOriginErrorDetectionSettings();
    }

    /**
     * Set the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     * 
     * @param responseBasedOriginErrorDetectionSettings the responseBasedOriginErrorDetectionSettings value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupUpdatePropertiesParameters();
        }
        this.innerProperties().withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OriginGroupUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OriginGroupUpdateParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OriginGroupUpdateParameters.
     */
    public static OriginGroupUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OriginGroupUpdateParameters deserializedOriginGroupUpdateParameters = new OriginGroupUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedOriginGroupUpdateParameters.innerProperties
                        = OriginGroupUpdatePropertiesParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOriginGroupUpdateParameters;
        });
    }
}
