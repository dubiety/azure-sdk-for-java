// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Get Operation response object.
 */
@Immutable
public final class DocumentClassifierBuildOperationDetails extends OperationDetails {
    /*
     * Type of operation.
     */
    @Generated
    private OperationKind kind = OperationKind.DOCUMENT_CLASSIFIER_BUILD;

    /*
     * Operation result upon success.
     */
    @Generated
    private DocumentClassifierDetails result;

    /*
     * Encountered error.
     */
    @Generated
    private Error error;

    /*
     * List of key-value tag attributes associated with the document model.
     */
    @Generated
    private Map<String, String> tags;

    /*
     * API version used to create this operation.
     */
    @Generated
    private String apiVersion;

    /*
     * Operation progress (0-100).
     */
    @Generated
    private Integer percentCompleted;

    /**
     * Creates an instance of DocumentClassifierBuildOperationDetails class.
     * 
     * @param status the status value to set.
     * @param createdDateTime the createdDateTime value to set.
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @param resourceLocation the resourceLocation value to set.
     */
    @Generated
    private DocumentClassifierBuildOperationDetails(OperationStatus status, OffsetDateTime createdDateTime,
        OffsetDateTime lastUpdatedDateTime, String resourceLocation) {
        super(status, createdDateTime, lastUpdatedDateTime, resourceLocation);
    }

    /**
     * Get the kind property: Type of operation.
     * 
     * @return the kind value.
     */
    @Generated
    @Override
    public OperationKind getKind() {
        return this.kind;
    }

    /**
     * Get the result property: Operation result upon success.
     * 
     * @return the result value.
     */
    @Generated
    public DocumentClassifierDetails getResult() {
        return this.result;
    }

    /**
     * Get the error property: Encountered error.
     * 
     * @return the error value.
     */
    @Generated
    @Override
    public Error getError() {
        return this.error;
    }

    /**
     * Get the tags property: List of key-value tag attributes associated with the document model.
     * 
     * @return the tags value.
     */
    @Generated
    @Override
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Get the apiVersion property: API version used to create this operation.
     * 
     * @return the apiVersion value.
     */
    @Generated
    @Override
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Get the percentCompleted property: Operation progress (0-100).
     * 
     * @return the percentCompleted value.
     */
    @Generated
    @Override
    public Integer getPercentCompleted() {
        return this.percentCompleted;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", getStatus() == null ? null : getStatus().toString());
        jsonWriter.writeStringField("createdDateTime",
            getCreatedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getCreatedDateTime()));
        jsonWriter.writeStringField("lastUpdatedDateTime",
            getLastUpdatedDateTime() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getLastUpdatedDateTime()));
        jsonWriter.writeStringField("resourceLocation", getResourceLocation());
        jsonWriter.writeNumberField("percentCompleted", getPercentCompleted());
        jsonWriter.writeStringField("apiVersion", getApiVersion());
        jsonWriter.writeMapField("tags", getTags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("error", getError());
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("result", this.result);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentClassifierBuildOperationDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentClassifierBuildOperationDetails if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentClassifierBuildOperationDetails.
     */
    @Generated
    public static DocumentClassifierBuildOperationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String operationId = null;
            OperationStatus status = null;
            OffsetDateTime createdDateTime = null;
            OffsetDateTime lastUpdatedDateTime = null;
            String resourceLocation = null;
            Integer percentCompleted = null;
            String apiVersion = null;
            Map<String, String> tags = null;
            Error error = null;
            OperationKind kind = OperationKind.DOCUMENT_CLASSIFIER_BUILD;
            DocumentClassifierDetails result = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    operationId = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = OperationStatus.fromString(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    lastUpdatedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("resourceLocation".equals(fieldName)) {
                    resourceLocation = reader.getString();
                } else if ("percentCompleted".equals(fieldName)) {
                    percentCompleted = reader.getNullable(JsonReader::getInt);
                } else if ("apiVersion".equals(fieldName)) {
                    apiVersion = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else if ("error".equals(fieldName)) {
                    error = Error.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    kind = OperationKind.fromString(reader.getString());
                } else if ("result".equals(fieldName)) {
                    result = DocumentClassifierDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            DocumentClassifierBuildOperationDetails deserializedDocumentClassifierBuildOperationDetails
                = new DocumentClassifierBuildOperationDetails(status, createdDateTime, lastUpdatedDateTime,
                    resourceLocation);
            deserializedDocumentClassifierBuildOperationDetails.setOperationId(operationId);
            deserializedDocumentClassifierBuildOperationDetails.percentCompleted = percentCompleted;
            deserializedDocumentClassifierBuildOperationDetails.apiVersion = apiVersion;
            deserializedDocumentClassifierBuildOperationDetails.tags = tags;
            deserializedDocumentClassifierBuildOperationDetails.error = error;
            deserializedDocumentClassifierBuildOperationDetails.kind = kind;
            deserializedDocumentClassifierBuildOperationDetails.result = result;

            return deserializedDocumentClassifierBuildOperationDetails;
        });
    }
}
