// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.BillingRequestProperties;
import com.azure.resourcemanager.billing.models.ProxyResourceWithTags;
import java.io.IOException;
import java.util.Map;

/**
 * A request submitted by a user to manage billing. Users with an owner role on the scope can approve or decline these
 * requests.
 */
@Fluent
public final class BillingRequestInner extends ProxyResourceWithTags {
    /*
     * A request submitted by a user to manage billing. Users with an owner role on the scope can approve or decline
     * these requests.
     */
    private BillingRequestProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Creates an instance of BillingRequestInner class.
     */
    public BillingRequestInner() {
    }

    /**
     * Get the properties property: A request submitted by a user to manage billing. Users with an owner role on the
     * scope can approve or decline these requests.
     * 
     * @return the properties value.
     */
    public BillingRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: A request submitted by a user to manage billing. Users with an owner role on the
     * scope can approve or decline these requests.
     * 
     * @param properties the properties value to set.
     * @return the BillingRequestInner object itself.
     */
    public BillingRequestInner withProperties(BillingRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
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
     * {@inheritDoc}
     */
    @Override
    public BillingRequestInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BillingRequestInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingRequestInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BillingRequestInner.
     */
    public static BillingRequestInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BillingRequestInner deserializedBillingRequestInner = new BillingRequestInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBillingRequestInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBillingRequestInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBillingRequestInner.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBillingRequestInner.withTags(tags);
                } else if ("systemData".equals(fieldName)) {
                    deserializedBillingRequestInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedBillingRequestInner.properties = BillingRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingRequestInner;
        });
    }
}
