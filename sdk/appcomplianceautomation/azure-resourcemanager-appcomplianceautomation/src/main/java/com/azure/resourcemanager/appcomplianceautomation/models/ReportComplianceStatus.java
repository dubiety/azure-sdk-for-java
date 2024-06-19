// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A list which includes all the compliance result for one report.
 */
@Immutable
public final class ReportComplianceStatus implements JsonSerializable<ReportComplianceStatus> {
    /*
     * The Microsoft 365 certification name.
     */
    private OverviewStatus m365;

    /**
     * Creates an instance of ReportComplianceStatus class.
     */
    public ReportComplianceStatus() {
    }

    /**
     * Get the m365 property: The Microsoft 365 certification name.
     * 
     * @return the m365 value.
     */
    public OverviewStatus m365() {
        return this.m365;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (m365() != null) {
            m365().validate();
        }
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
     * Reads an instance of ReportComplianceStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReportComplianceStatus if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReportComplianceStatus.
     */
    public static ReportComplianceStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReportComplianceStatus deserializedReportComplianceStatus = new ReportComplianceStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("m365".equals(fieldName)) {
                    deserializedReportComplianceStatus.m365 = OverviewStatus.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReportComplianceStatus;
        });
    }
}
