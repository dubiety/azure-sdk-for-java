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
 * Settings for a personal compute instance.
 */
@Fluent
public final class PersonalComputeInstanceSettings implements JsonSerializable<PersonalComputeInstanceSettings> {
    /*
     * A user explicitly assigned to a personal compute instance.
     */
    private AssignedUser assignedUser;

    /**
     * Creates an instance of PersonalComputeInstanceSettings class.
     */
    public PersonalComputeInstanceSettings() {
    }

    /**
     * Get the assignedUser property: A user explicitly assigned to a personal compute instance.
     * 
     * @return the assignedUser value.
     */
    public AssignedUser assignedUser() {
        return this.assignedUser;
    }

    /**
     * Set the assignedUser property: A user explicitly assigned to a personal compute instance.
     * 
     * @param assignedUser the assignedUser value to set.
     * @return the PersonalComputeInstanceSettings object itself.
     */
    public PersonalComputeInstanceSettings withAssignedUser(AssignedUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (assignedUser() != null) {
            assignedUser().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("assignedUser", this.assignedUser);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PersonalComputeInstanceSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonalComputeInstanceSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PersonalComputeInstanceSettings.
     */
    public static PersonalComputeInstanceSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PersonalComputeInstanceSettings deserializedPersonalComputeInstanceSettings
                = new PersonalComputeInstanceSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("assignedUser".equals(fieldName)) {
                    deserializedPersonalComputeInstanceSettings.assignedUser = AssignedUser.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPersonalComputeInstanceSettings;
        });
    }
}
