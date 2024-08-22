// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturestoreEntityVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * A paginated list of FeaturestoreEntityVersion entities.
 */
@Fluent
public final class FeaturestoreEntityVersionResourceArmPaginatedResult
    implements JsonSerializable<FeaturestoreEntityVersionResourceArmPaginatedResult> {
    /*
     * An array of objects of type FeaturestoreEntityVersion.
     */
    private List<FeaturestoreEntityVersionInner> value;

    /*
     * The link to the next page of FeaturestoreEntityVersion objects. If null, there are no additional pages.
     */
    private String nextLink;

    /**
     * Creates an instance of FeaturestoreEntityVersionResourceArmPaginatedResult class.
     */
    public FeaturestoreEntityVersionResourceArmPaginatedResult() {
    }

    /**
     * Get the value property: An array of objects of type FeaturestoreEntityVersion.
     * 
     * @return the value value.
     */
    public List<FeaturestoreEntityVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type FeaturestoreEntityVersion.
     * 
     * @param value the value value to set.
     * @return the FeaturestoreEntityVersionResourceArmPaginatedResult object itself.
     */
    public FeaturestoreEntityVersionResourceArmPaginatedResult withValue(List<FeaturestoreEntityVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of FeaturestoreEntityVersion objects. If null, there are no
     * additional pages.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of FeaturestoreEntityVersion objects. If null, there are no
     * additional pages.
     * 
     * @param nextLink the nextLink value to set.
     * @return the FeaturestoreEntityVersionResourceArmPaginatedResult object itself.
     */
    public FeaturestoreEntityVersionResourceArmPaginatedResult withNextLink(String nextLink) {
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FeaturestoreEntityVersionResourceArmPaginatedResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FeaturestoreEntityVersionResourceArmPaginatedResult if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FeaturestoreEntityVersionResourceArmPaginatedResult.
     */
    public static FeaturestoreEntityVersionResourceArmPaginatedResult fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            FeaturestoreEntityVersionResourceArmPaginatedResult deserializedFeaturestoreEntityVersionResourceArmPaginatedResult
                = new FeaturestoreEntityVersionResourceArmPaginatedResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<FeaturestoreEntityVersionInner> value
                        = reader.readArray(reader1 -> FeaturestoreEntityVersionInner.fromJson(reader1));
                    deserializedFeaturestoreEntityVersionResourceArmPaginatedResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedFeaturestoreEntityVersionResourceArmPaginatedResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFeaturestoreEntityVersionResourceArmPaginatedResult;
        });
    }
}
