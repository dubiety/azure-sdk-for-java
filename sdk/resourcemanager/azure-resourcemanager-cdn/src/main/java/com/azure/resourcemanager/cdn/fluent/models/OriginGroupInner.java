// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
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
 * Origin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
 */
@Fluent
public final class OriginGroupInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the origin group.
     */
    private OriginGroupProperties innerProperties;

    /*
     * Read only system data
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of OriginGroupInner class.
     */
    public OriginGroupInner() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin group.
     * 
     * @return the innerProperties value.
     */
    private OriginGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the resourceState property: Resource status of the origin group.
     * 
     * @return the resourceState value.
     */
    public OriginGroupResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the provisioningState property: Provisioning status of the origin group.
     * 
     * @return the provisioningState value.
     */
    public OriginGroupProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
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
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withOrigins(List<ResourceReference> origins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
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
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
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
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
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
     * Reads an instance of OriginGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OriginGroupInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OriginGroupInner.
     */
    public static OriginGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OriginGroupInner deserializedOriginGroupInner = new OriginGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOriginGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOriginGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOriginGroupInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOriginGroupInner.innerProperties = OriginGroupProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedOriginGroupInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOriginGroupInner;
        });
    }
}
