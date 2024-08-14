// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ResourcesResponseCustomDomainsItem model.
 */
@Fluent
public final class ResourcesResponseCustomDomainsItem implements JsonSerializable<ResourcesResponseCustomDomainsItem> {
    /*
     * The id property.
     */
    private String id;

    /*
     * The name property.
     */
    private String name;

    /*
     * The endpointId property.
     */
    private String endpointId;

    /*
     * The history property.
     */
    private Boolean history;

    /**
     * Creates an instance of ResourcesResponseCustomDomainsItem class.
     */
    public ResourcesResponseCustomDomainsItem() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     * 
     * @param id the id value to set.
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpointId property: The endpointId property.
     * 
     * @return the endpointId value.
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Set the endpointId property: The endpointId property.
     * 
     * @param endpointId the endpointId value to set.
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Get the history property: The history property.
     * 
     * @return the history value.
     */
    public Boolean history() {
        return this.history;
    }

    /**
     * Set the history property: The history property.
     * 
     * @param history the history value to set.
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withHistory(Boolean history) {
        this.history = history;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("endpointId", this.endpointId);
        jsonWriter.writeBooleanField("history", this.history);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourcesResponseCustomDomainsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourcesResponseCustomDomainsItem if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourcesResponseCustomDomainsItem.
     */
    public static ResourcesResponseCustomDomainsItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourcesResponseCustomDomainsItem deserializedResourcesResponseCustomDomainsItem
                = new ResourcesResponseCustomDomainsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedResourcesResponseCustomDomainsItem.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedResourcesResponseCustomDomainsItem.name = reader.getString();
                } else if ("endpointId".equals(fieldName)) {
                    deserializedResourcesResponseCustomDomainsItem.endpointId = reader.getString();
                } else if ("history".equals(fieldName)) {
                    deserializedResourcesResponseCustomDomainsItem.history = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourcesResponseCustomDomainsItem;
        });
    }
}
