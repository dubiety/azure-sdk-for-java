// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.UsageName;
import com.azure.resourcemanager.machinelearning.models.UsageUnit;
import java.io.IOException;

/**
 * Describes AML Resource Usage.
 */
@Immutable
public final class UsageInner implements JsonSerializable<UsageInner> {
    /*
     * Specifies the resource ID.
     */
    private String id;

    /*
     * Region of the AML workspace in the id.
     */
    private String amlWorkspaceLocation;

    /*
     * Specifies the resource type.
     */
    private String type;

    /*
     * An enum describing the unit of usage measurement.
     */
    private UsageUnit unit;

    /*
     * The current usage of the resource.
     */
    private Long currentValue;

    /*
     * The maximum permitted usage of the resource.
     */
    private Long limit;

    /*
     * The name of the type of usage.
     */
    private UsageName name;

    /**
     * Creates an instance of UsageInner class.
     */
    public UsageInner() {
    }

    /**
     * Get the id property: Specifies the resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the amlWorkspaceLocation property: Region of the AML workspace in the id.
     * 
     * @return the amlWorkspaceLocation value.
     */
    public String amlWorkspaceLocation() {
        return this.amlWorkspaceLocation;
    }

    /**
     * Get the type property: Specifies the resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the unit property: An enum describing the unit of usage measurement.
     * 
     * @return the unit value.
     */
    public UsageUnit unit() {
        return this.unit;
    }

    /**
     * Get the currentValue property: The current usage of the resource.
     * 
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Get the limit property: The maximum permitted usage of the resource.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Get the name property: The name of the type of usage.
     * 
     * @return the name value.
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
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
     * Reads an instance of UsageInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the UsageInner.
     */
    public static UsageInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageInner deserializedUsageInner = new UsageInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedUsageInner.id = reader.getString();
                } else if ("amlWorkspaceLocation".equals(fieldName)) {
                    deserializedUsageInner.amlWorkspaceLocation = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedUsageInner.type = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedUsageInner.unit = UsageUnit.fromString(reader.getString());
                } else if ("currentValue".equals(fieldName)) {
                    deserializedUsageInner.currentValue = reader.getNullable(JsonReader::getLong);
                } else if ("limit".equals(fieldName)) {
                    deserializedUsageInner.limit = reader.getNullable(JsonReader::getLong);
                } else if ("name".equals(fieldName)) {
                    deserializedUsageInner.name = UsageName.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageInner;
        });
    }
}
