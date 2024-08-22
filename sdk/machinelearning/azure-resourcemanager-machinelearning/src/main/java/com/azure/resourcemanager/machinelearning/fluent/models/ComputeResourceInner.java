// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.Compute;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.Sku;
import java.io.IOException;
import java.util.Map;

/**
 * Machine Learning compute object wrapped into ARM resource envelope.
 */
@Fluent
public final class ComputeResourceInner extends ProxyResource {
    /*
     * The identity of the resource.
     */
    private ManagedServiceIdentity identity;

    /*
     * Specifies the location of the resource.
     */
    private String location;

    /*
     * Contains resource tags defined as key/value pairs.
     */
    private Map<String, String> tags;

    /*
     * The sku of the workspace.
     */
    private Sku sku;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Compute properties
     */
    private Compute properties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ComputeResourceInner class.
     */
    public ComputeResourceInner() {
    }

    /**
     * Get the identity property: The identity of the resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     * 
     * @param identity the identity value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the location property: Specifies the location of the resource.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Specifies the location of the resource.
     * 
     * @param location the location value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Contains resource tags defined as key/value pairs.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Contains resource tags defined as key/value pairs.
     * 
     * @param tags the tags value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The sku of the workspace.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the workspace.
     * 
     * @param sku the sku value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the properties property: Compute properties.
     * 
     * @return the properties value.
     */
    public Compute properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Compute properties.
     * 
     * @param properties the properties value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withProperties(Compute properties) {
        this.properties = properties;
        return this;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
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
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeResourceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ComputeResourceInner.
     */
    public static ComputeResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeResourceInner deserializedComputeResourceInner = new ComputeResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedComputeResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedComputeResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedComputeResourceInner.type = reader.getString();
                } else if ("identity".equals(fieldName)) {
                    deserializedComputeResourceInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedComputeResourceInner.location = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedComputeResourceInner.tags = tags;
                } else if ("sku".equals(fieldName)) {
                    deserializedComputeResourceInner.sku = Sku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedComputeResourceInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedComputeResourceInner.properties = Compute.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeResourceInner;
        });
    }
}
