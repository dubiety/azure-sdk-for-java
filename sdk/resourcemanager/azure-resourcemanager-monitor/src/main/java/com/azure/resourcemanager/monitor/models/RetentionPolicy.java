// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies the retention policy for the log.
 */
@Fluent
public final class RetentionPolicy implements JsonSerializable<RetentionPolicy> {
    /*
     * a value indicating whether the retention policy is enabled.
     */
    private boolean enabled;

    /*
     * the number of days for the retention in days. A value of 0 will retain the events indefinitely.
     */
    private int days;

    /**
     * Creates an instance of RetentionPolicy class.
     */
    public RetentionPolicy() {
    }

    /**
     * Get the enabled property: a value indicating whether the retention policy is enabled.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: a value indicating whether the retention policy is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: the number of days for the retention in days. A value of 0 will retain the events
     * indefinitely.
     * 
     * @return the days value.
     */
    public int days() {
        return this.days;
    }

    /**
     * Set the days property: the number of days for the retention in days. A value of 0 will retain the events
     * indefinitely.
     * 
     * @param days the days value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withDays(int days) {
        this.days = days;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeIntField("days", this.days);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RetentionPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RetentionPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RetentionPolicy.
     */
    public static RetentionPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RetentionPolicy deserializedRetentionPolicy = new RetentionPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedRetentionPolicy.enabled = reader.getBoolean();
                } else if ("days".equals(fieldName)) {
                    deserializedRetentionPolicy.days = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRetentionPolicy;
        });
    }
}
