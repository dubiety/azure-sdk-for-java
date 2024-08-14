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
import java.util.List;

/**
 * The WafMetricsResponseSeriesItem model.
 */
@Fluent
public final class WafMetricsResponseSeriesItem implements JsonSerializable<WafMetricsResponseSeriesItem> {
    /*
     * The metric property.
     */
    private String metric;

    /*
     * The unit property.
     */
    private WafMetricsSeriesUnit unit;

    /*
     * The groups property.
     */
    private List<WafMetricsResponseSeriesPropertiesItemsItem> groups;

    /*
     * The data property.
     */
    private List<WafMetricsResponseSeriesItemData> data;

    /**
     * Creates an instance of WafMetricsResponseSeriesItem class.
     */
    public WafMetricsResponseSeriesItem() {
    }

    /**
     * Get the metric property: The metric property.
     * 
     * @return the metric value.
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set the metric property: The metric property.
     * 
     * @param metric the metric value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the unit property: The unit property.
     * 
     * @return the unit value.
     */
    public WafMetricsSeriesUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit property.
     * 
     * @param unit the unit value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withUnit(WafMetricsSeriesUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the groups property: The groups property.
     * 
     * @return the groups value.
     */
    public List<WafMetricsResponseSeriesPropertiesItemsItem> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The groups property.
     * 
     * @param groups the groups value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withGroups(List<WafMetricsResponseSeriesPropertiesItemsItem> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    public List<WafMetricsResponseSeriesItemData> data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     * 
     * @param data the data value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withData(List<WafMetricsResponseSeriesItemData> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("metric", this.metric);
        jsonWriter.writeStringField("unit", this.unit == null ? null : this.unit.toString());
        jsonWriter.writeArrayField("groups", this.groups, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WafMetricsResponseSeriesItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WafMetricsResponseSeriesItem if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WafMetricsResponseSeriesItem.
     */
    public static WafMetricsResponseSeriesItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WafMetricsResponseSeriesItem deserializedWafMetricsResponseSeriesItem = new WafMetricsResponseSeriesItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metric".equals(fieldName)) {
                    deserializedWafMetricsResponseSeriesItem.metric = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedWafMetricsResponseSeriesItem.unit = WafMetricsSeriesUnit.fromString(reader.getString());
                } else if ("groups".equals(fieldName)) {
                    List<WafMetricsResponseSeriesPropertiesItemsItem> groups
                        = reader.readArray(reader1 -> WafMetricsResponseSeriesPropertiesItemsItem.fromJson(reader1));
                    deserializedWafMetricsResponseSeriesItem.groups = groups;
                } else if ("data".equals(fieldName)) {
                    List<WafMetricsResponseSeriesItemData> data
                        = reader.readArray(reader1 -> WafMetricsResponseSeriesItemData.fromJson(reader1));
                    deserializedWafMetricsResponseSeriesItem.data = data;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWafMetricsResponseSeriesItem;
        });
    }
}
