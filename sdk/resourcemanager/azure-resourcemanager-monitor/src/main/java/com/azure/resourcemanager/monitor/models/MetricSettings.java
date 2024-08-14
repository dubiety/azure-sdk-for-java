// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular metric.
 */
@Fluent
public final class MetricSettings implements JsonSerializable<MetricSettings> {
    /*
     * the timegrain of the metric in ISO8601 format.
     */
    private Duration timeGrain;

    /*
     * Name of a Diagnostic Metric category for a resource type this setting is applied to. To obtain the list of
     * Diagnostic metric categories for a resource, first perform a GET diagnostic settings operation.
     */
    private String category;

    /*
     * a value indicating whether this category is enabled.
     */
    private boolean enabled;

    /*
     * the retention policy for this category.
     */
    private RetentionPolicy retentionPolicy;

    /**
     * Creates an instance of MetricSettings class.
     */
    public MetricSettings() {
    }

    /**
     * Get the timeGrain property: the timegrain of the metric in ISO8601 format.
     * 
     * @return the timeGrain value.
     */
    public Duration timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: the timegrain of the metric in ISO8601 format.
     * 
     * @param timeGrain the timeGrain value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withTimeGrain(Duration timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the category property: Name of a Diagnostic Metric category for a resource type this setting is applied to.
     * To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings
     * operation.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Name of a Diagnostic Metric category for a resource type this setting is applied to.
     * To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings
     * operation.
     * 
     * @param category the category value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the enabled property: a value indicating whether this category is enabled.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: a value indicating whether this category is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy for this category.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy for this category.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("timeGrain", CoreUtils.durationToStringWithDays(this.timeGrain));
        jsonWriter.writeStringField("category", this.category);
        jsonWriter.writeJsonField("retentionPolicy", this.retentionPolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricSettings.
     */
    public static MetricSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricSettings deserializedMetricSettings = new MetricSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedMetricSettings.enabled = reader.getBoolean();
                } else if ("timeGrain".equals(fieldName)) {
                    deserializedMetricSettings.timeGrain
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("category".equals(fieldName)) {
                    deserializedMetricSettings.category = reader.getString();
                } else if ("retentionPolicy".equals(fieldName)) {
                    deserializedMetricSettings.retentionPolicy = RetentionPolicy.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricSettings;
        });
    }
}
