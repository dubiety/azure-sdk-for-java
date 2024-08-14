// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a managed rule definition.
 */
@Immutable
public final class ManagedRuleDefinition implements JsonSerializable<ManagedRuleDefinition> {
    /*
     * Identifier for the managed rule.
     */
    private String ruleId;

    /*
     * Describes the functionality of the managed rule.
     */
    private String description;

    /**
     * Creates an instance of ManagedRuleDefinition class.
     */
    public ManagedRuleDefinition() {
    }

    /**
     * Get the ruleId property: Identifier for the managed rule.
     * 
     * @return the ruleId value.
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Get the description property: Describes the functionality of the managed rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRuleDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRuleDefinition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedRuleDefinition.
     */
    public static ManagedRuleDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRuleDefinition deserializedManagedRuleDefinition = new ManagedRuleDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleId".equals(fieldName)) {
                    deserializedManagedRuleDefinition.ruleId = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedManagedRuleDefinition.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRuleDefinition;
        });
    }
}
