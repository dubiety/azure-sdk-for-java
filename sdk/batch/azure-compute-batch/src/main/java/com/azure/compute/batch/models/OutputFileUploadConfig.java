// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Options for an output file upload operation, including under what conditions
 * to perform the upload.
 */
@Immutable
public final class OutputFileUploadConfig implements JsonSerializable<OutputFileUploadConfig> {

    /*
     * The conditions under which the Task output file or set of files should be uploaded. The default is taskcompletion.
     */
    @Generated
    private final OutputFileUploadCondition uploadCondition;

    /**
     * Creates an instance of OutputFileUploadConfig class.
     *
     * @param uploadCondition the uploadCondition value to set.
     */
    @Generated
    public OutputFileUploadConfig(OutputFileUploadCondition uploadCondition) {
        this.uploadCondition = uploadCondition;
    }

    /**
     * Get the uploadCondition property: The conditions under which the Task output file or set of files should be
     * uploaded. The default is taskcompletion.
     *
     * @return the uploadCondition value.
     */
    @Generated
    public OutputFileUploadCondition getUploadCondition() {
        return this.uploadCondition;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("uploadCondition",
            this.uploadCondition == null ? null : this.uploadCondition.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutputFileUploadConfig from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputFileUploadConfig if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OutputFileUploadConfig.
     */
    @Generated
    public static OutputFileUploadConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutputFileUploadCondition uploadCondition = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("uploadCondition".equals(fieldName)) {
                    uploadCondition = OutputFileUploadCondition.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new OutputFileUploadConfig(uploadCondition);
        });
    }
}
