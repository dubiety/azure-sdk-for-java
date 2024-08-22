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
 * SKU capacity information.
 */
@Fluent
public final class SkuCapacity implements JsonSerializable<SkuCapacity> {
    /*
     * Gets or sets the minimum.
     */
    private Integer minimum;

    /*
     * Gets or sets the maximum.
     */
    private Integer maximum;

    /*
     * Gets or sets the default capacity.
     */
    private Integer defaultProperty;

    /*
     * Gets or sets the type of the scale.
     */
    private SkuScaleType scaleType;

    /**
     * Creates an instance of SkuCapacity class.
     */
    public SkuCapacity() {
    }

    /**
     * Get the minimum property: Gets or sets the minimum.
     * 
     * @return the minimum value.
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Gets or sets the minimum.
     * 
     * @param minimum the minimum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Gets or sets the maximum.
     * 
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Gets or sets the maximum.
     * 
     * @param maximum the maximum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: Gets or sets the default capacity.
     * 
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Gets or sets the default capacity.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the scaleType property: Gets or sets the type of the scale.
     * 
     * @return the scaleType value.
     */
    public SkuScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType property: Gets or sets the type of the scale.
     * 
     * @param scaleType the scaleType value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withScaleType(SkuScaleType scaleType) {
        this.scaleType = scaleType;
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
        jsonWriter.writeNumberField("minimum", this.minimum);
        jsonWriter.writeNumberField("maximum", this.maximum);
        jsonWriter.writeNumberField("default", this.defaultProperty);
        jsonWriter.writeStringField("scaleType", this.scaleType == null ? null : this.scaleType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SkuCapacity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkuCapacity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SkuCapacity.
     */
    public static SkuCapacity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkuCapacity deserializedSkuCapacity = new SkuCapacity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minimum".equals(fieldName)) {
                    deserializedSkuCapacity.minimum = reader.getNullable(JsonReader::getInt);
                } else if ("maximum".equals(fieldName)) {
                    deserializedSkuCapacity.maximum = reader.getNullable(JsonReader::getInt);
                } else if ("default".equals(fieldName)) {
                    deserializedSkuCapacity.defaultProperty = reader.getNullable(JsonReader::getInt);
                } else if ("scaleType".equals(fieldName)) {
                    deserializedSkuCapacity.scaleType = SkuScaleType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkuCapacity;
        });
    }
}
