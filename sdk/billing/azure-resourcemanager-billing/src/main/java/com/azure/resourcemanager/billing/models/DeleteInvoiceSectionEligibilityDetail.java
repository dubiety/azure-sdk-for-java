// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The details of delete invoice section eligibility result.
 */
@Fluent
public final class DeleteInvoiceSectionEligibilityDetail
    implements JsonSerializable<DeleteInvoiceSectionEligibilityDetail> {
    /*
     * Code for the delete invoice section validation.
     */
    private DeleteInvoiceSectionEligibilityCode code;

    /*
     * Validation message.
     */
    private String message;

    /**
     * Creates an instance of DeleteInvoiceSectionEligibilityDetail class.
     */
    public DeleteInvoiceSectionEligibilityDetail() {
    }

    /**
     * Get the code property: Code for the delete invoice section validation.
     * 
     * @return the code value.
     */
    public DeleteInvoiceSectionEligibilityCode code() {
        return this.code;
    }

    /**
     * Set the code property: Code for the delete invoice section validation.
     * 
     * @param code the code value to set.
     * @return the DeleteInvoiceSectionEligibilityDetail object itself.
     */
    public DeleteInvoiceSectionEligibilityDetail withCode(DeleteInvoiceSectionEligibilityCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Validation message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Validation message.
     * 
     * @param message the message value to set.
     * @return the DeleteInvoiceSectionEligibilityDetail object itself.
     */
    public DeleteInvoiceSectionEligibilityDetail withMessage(String message) {
        this.message = message;
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
        jsonWriter.writeStringField("code", this.code == null ? null : this.code.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeleteInvoiceSectionEligibilityDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeleteInvoiceSectionEligibilityDetail if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeleteInvoiceSectionEligibilityDetail.
     */
    public static DeleteInvoiceSectionEligibilityDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeleteInvoiceSectionEligibilityDetail deserializedDeleteInvoiceSectionEligibilityDetail
                = new DeleteInvoiceSectionEligibilityDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedDeleteInvoiceSectionEligibilityDetail.code
                        = DeleteInvoiceSectionEligibilityCode.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedDeleteInvoiceSectionEligibilityDetail.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeleteInvoiceSectionEligibilityDetail;
        });
    }
}
