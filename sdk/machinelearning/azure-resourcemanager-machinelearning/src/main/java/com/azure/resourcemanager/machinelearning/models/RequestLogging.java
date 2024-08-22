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
import java.util.List;

/**
 * The RequestLogging model.
 */
@Fluent
public final class RequestLogging implements JsonSerializable<RequestLogging> {
    /*
     * For payload logging, we only collect payload by default. If customers also want to collect the specified headers,
     * they can set them in captureHeaders so that backend will collect those headers along with payload.
     */
    private List<String> captureHeaders;

    /**
     * Creates an instance of RequestLogging class.
     */
    public RequestLogging() {
    }

    /**
     * Get the captureHeaders property: For payload logging, we only collect payload by default. If customers also want
     * to collect the specified headers, they can set them in captureHeaders so that backend will collect those headers
     * along with payload.
     * 
     * @return the captureHeaders value.
     */
    public List<String> captureHeaders() {
        return this.captureHeaders;
    }

    /**
     * Set the captureHeaders property: For payload logging, we only collect payload by default. If customers also want
     * to collect the specified headers, they can set them in captureHeaders so that backend will collect those headers
     * along with payload.
     * 
     * @param captureHeaders the captureHeaders value to set.
     * @return the RequestLogging object itself.
     */
    public RequestLogging withCaptureHeaders(List<String> captureHeaders) {
        this.captureHeaders = captureHeaders;
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
        jsonWriter.writeArrayField("captureHeaders", this.captureHeaders,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RequestLogging from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RequestLogging if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RequestLogging.
     */
    public static RequestLogging fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RequestLogging deserializedRequestLogging = new RequestLogging();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("captureHeaders".equals(fieldName)) {
                    List<String> captureHeaders = reader.readArray(reader1 -> reader1.getString());
                    deserializedRequestLogging.captureHeaders = captureHeaders;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRequestLogging;
        });
    }
}
