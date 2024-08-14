// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.ManagedRuleSetDefinitionInner;
import java.io.IOException;
import java.util.List;

/**
 * List of managed rule set definitions available for use in a policy.
 */
@Fluent
public final class ManagedRuleSetDefinitionList implements JsonSerializable<ManagedRuleSetDefinitionList> {
    /*
     * List of managed rule set definitions.
     */
    private List<ManagedRuleSetDefinitionInner> value;

    /*
     * URL to retrieve next set of managed rule set definitions.
     */
    private String nextLink;

    /**
     * Creates an instance of ManagedRuleSetDefinitionList class.
     */
    public ManagedRuleSetDefinitionList() {
    }

    /**
     * Get the value property: List of managed rule set definitions.
     * 
     * @return the value value.
     */
    public List<ManagedRuleSetDefinitionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to retrieve next set of managed rule set definitions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to retrieve next set of managed rule set definitions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ManagedRuleSetDefinitionList object itself.
     */
    public ManagedRuleSetDefinitionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRuleSetDefinitionList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRuleSetDefinitionList if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedRuleSetDefinitionList.
     */
    public static ManagedRuleSetDefinitionList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRuleSetDefinitionList deserializedManagedRuleSetDefinitionList = new ManagedRuleSetDefinitionList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ManagedRuleSetDefinitionInner> value
                        = reader.readArray(reader1 -> ManagedRuleSetDefinitionInner.fromJson(reader1));
                    deserializedManagedRuleSetDefinitionList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRuleSetDefinitionList;
        });
    }
}
