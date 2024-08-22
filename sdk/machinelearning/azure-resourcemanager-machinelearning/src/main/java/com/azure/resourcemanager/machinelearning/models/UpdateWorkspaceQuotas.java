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
 * The properties for update Quota response.
 */
@Fluent
public final class UpdateWorkspaceQuotas implements JsonSerializable<UpdateWorkspaceQuotas> {
    /*
     * Specifies the resource ID.
     */
    private String id;

    /*
     * Specifies the resource type.
     */
    private String type;

    /*
     * The maximum permitted quota of the resource.
     */
    private Long limit;

    /*
     * An enum describing the unit of quota measurement.
     */
    private QuotaUnit unit;

    /*
     * Status of update workspace quota.
     */
    private Status status;

    /**
     * Creates an instance of UpdateWorkspaceQuotas class.
     */
    public UpdateWorkspaceQuotas() {
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
     * Get the type property: Specifies the resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the limit property: The maximum permitted quota of the resource.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The maximum permitted quota of the resource.
     * 
     * @param limit the limit value to set.
     * @return the UpdateWorkspaceQuotas object itself.
     */
    public UpdateWorkspaceQuotas withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the unit property: An enum describing the unit of quota measurement.
     * 
     * @return the unit value.
     */
    public QuotaUnit unit() {
        return this.unit;
    }

    /**
     * Get the status property: Status of update workspace quota.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Status of update workspace quota.
     * 
     * @param status the status value to set.
     * @return the UpdateWorkspaceQuotas object itself.
     */
    public UpdateWorkspaceQuotas withStatus(Status status) {
        this.status = status;
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
        jsonWriter.writeNumberField("limit", this.limit);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateWorkspaceQuotas from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateWorkspaceQuotas if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateWorkspaceQuotas.
     */
    public static UpdateWorkspaceQuotas fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateWorkspaceQuotas deserializedUpdateWorkspaceQuotas = new UpdateWorkspaceQuotas();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedUpdateWorkspaceQuotas.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedUpdateWorkspaceQuotas.type = reader.getString();
                } else if ("limit".equals(fieldName)) {
                    deserializedUpdateWorkspaceQuotas.limit = reader.getNullable(JsonReader::getLong);
                } else if ("unit".equals(fieldName)) {
                    deserializedUpdateWorkspaceQuotas.unit = QuotaUnit.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedUpdateWorkspaceQuotas.status = Status.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateWorkspaceQuotas;
        });
    }
}
