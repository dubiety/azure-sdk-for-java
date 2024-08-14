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
import java.util.List;

/**
 * Definition of which syslog data will be collected and how it will be collected.
 * Only collected from Linux machines.
 */
@Fluent
public final class SyslogDataSource implements JsonSerializable<SyslogDataSource> {
    /*
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will
     * be sent to.
     */
    private List<KnownSyslogDataSourceStreams> streams;

    /*
     * The list of facility names.
     */
    private List<KnownSyslogDataSourceFacilityNames> facilityNames;

    /*
     * The log levels to collect.
     */
    private List<KnownSyslogDataSourceLogLevels> logLevels;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     */
    private String name;

    /**
     * Creates an instance of SyslogDataSource class.
     */
    public SyslogDataSource() {
    }

    /**
     * Get the streams property: List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will
     * be sent to.
     * 
     * @return the streams value.
     */
    public List<KnownSyslogDataSourceStreams> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will
     * be sent to.
     * 
     * @param streams the streams value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withStreams(List<KnownSyslogDataSourceStreams> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the facilityNames property: The list of facility names.
     * 
     * @return the facilityNames value.
     */
    public List<KnownSyslogDataSourceFacilityNames> facilityNames() {
        return this.facilityNames;
    }

    /**
     * Set the facilityNames property: The list of facility names.
     * 
     * @param facilityNames the facilityNames value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withFacilityNames(List<KnownSyslogDataSourceFacilityNames> facilityNames) {
        this.facilityNames = facilityNames;
        return this;
    }

    /**
     * Get the logLevels property: The log levels to collect.
     * 
     * @return the logLevels value.
     */
    public List<KnownSyslogDataSourceLogLevels> logLevels() {
        return this.logLevels;
    }

    /**
     * Set the logLevels property: The log levels to collect.
     * 
     * @param logLevels the logLevels value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withLogLevels(List<KnownSyslogDataSourceLogLevels> logLevels) {
        this.logLevels = logLevels;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     * @param name the name value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withName(String name) {
        this.name = name;
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
        jsonWriter.writeArrayField("streams", this.streams,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("facilityNames", this.facilityNames,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("logLevels", this.logLevels,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SyslogDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SyslogDataSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SyslogDataSource.
     */
    public static SyslogDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SyslogDataSource deserializedSyslogDataSource = new SyslogDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("streams".equals(fieldName)) {
                    List<KnownSyslogDataSourceStreams> streams
                        = reader.readArray(reader1 -> KnownSyslogDataSourceStreams.fromString(reader1.getString()));
                    deserializedSyslogDataSource.streams = streams;
                } else if ("facilityNames".equals(fieldName)) {
                    List<KnownSyslogDataSourceFacilityNames> facilityNames = reader
                        .readArray(reader1 -> KnownSyslogDataSourceFacilityNames.fromString(reader1.getString()));
                    deserializedSyslogDataSource.facilityNames = facilityNames;
                } else if ("logLevels".equals(fieldName)) {
                    List<KnownSyslogDataSourceLogLevels> logLevels
                        = reader.readArray(reader1 -> KnownSyslogDataSourceLogLevels.fromString(reader1.getString()));
                    deserializedSyslogDataSource.logLevels = logLevels;
                } else if ("name".equals(fieldName)) {
                    deserializedSyslogDataSource.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSyslogDataSource;
        });
    }
}
