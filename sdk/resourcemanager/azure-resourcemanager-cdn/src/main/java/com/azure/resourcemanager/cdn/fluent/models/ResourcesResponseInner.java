// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.ResourcesResponseCustomDomainsItem;
import com.azure.resourcemanager.cdn.models.ResourcesResponseEndpointsItem;
import java.io.IOException;
import java.util.List;

/**
 * Resources Response.
 */
@Fluent
public final class ResourcesResponseInner implements JsonSerializable<ResourcesResponseInner> {
    /*
     * The endpoints property.
     */
    private List<ResourcesResponseEndpointsItem> endpoints;

    /*
     * The customDomains property.
     */
    private List<ResourcesResponseCustomDomainsItem> customDomains;

    /**
     * Creates an instance of ResourcesResponseInner class.
     */
    public ResourcesResponseInner() {
    }

    /**
     * Get the endpoints property: The endpoints property.
     * 
     * @return the endpoints value.
     */
    public List<ResourcesResponseEndpointsItem> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints property.
     * 
     * @param endpoints the endpoints value to set.
     * @return the ResourcesResponseInner object itself.
     */
    public ResourcesResponseInner withEndpoints(List<ResourcesResponseEndpointsItem> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the customDomains property: The customDomains property.
     * 
     * @return the customDomains value.
     */
    public List<ResourcesResponseCustomDomainsItem> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains property: The customDomains property.
     * 
     * @param customDomains the customDomains value to set.
     * @return the ResourcesResponseInner object itself.
     */
    public ResourcesResponseInner withCustomDomains(List<ResourcesResponseCustomDomainsItem> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (customDomains() != null) {
            customDomains().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("endpoints", this.endpoints, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("customDomains", this.customDomains, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourcesResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourcesResponseInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourcesResponseInner.
     */
    public static ResourcesResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourcesResponseInner deserializedResourcesResponseInner = new ResourcesResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpoints".equals(fieldName)) {
                    List<ResourcesResponseEndpointsItem> endpoints
                        = reader.readArray(reader1 -> ResourcesResponseEndpointsItem.fromJson(reader1));
                    deserializedResourcesResponseInner.endpoints = endpoints;
                } else if ("customDomains".equals(fieldName)) {
                    List<ResourcesResponseCustomDomainsItem> customDomains
                        = reader.readArray(reader1 -> ResourcesResponseCustomDomainsItem.fromJson(reader1));
                    deserializedResourcesResponseInner.customDomains = customDomains;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourcesResponseInner;
        });
    }
}
