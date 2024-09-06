// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.MoveProductEligibilityResultErrorDetails;
import java.io.IOException;

/**
 * Result of the transfer eligibility validation.
 */
@Fluent
public final class MoveProductEligibilityResultInner implements JsonSerializable<MoveProductEligibilityResultInner> {
    /*
     * Specifies whether the subscription is eligible to be transferred.
     */
    private Boolean isMoveEligible;

    /*
     * Error details of the transfer eligibility validation.
     */
    private MoveProductEligibilityResultErrorDetails errorDetails;

    /**
     * Creates an instance of MoveProductEligibilityResultInner class.
     */
    public MoveProductEligibilityResultInner() {
    }

    /**
     * Get the isMoveEligible property: Specifies whether the subscription is eligible to be transferred.
     * 
     * @return the isMoveEligible value.
     */
    public Boolean isMoveEligible() {
        return this.isMoveEligible;
    }

    /**
     * Set the isMoveEligible property: Specifies whether the subscription is eligible to be transferred.
     * 
     * @param isMoveEligible the isMoveEligible value to set.
     * @return the MoveProductEligibilityResultInner object itself.
     */
    public MoveProductEligibilityResultInner withIsMoveEligible(Boolean isMoveEligible) {
        this.isMoveEligible = isMoveEligible;
        return this;
    }

    /**
     * Get the errorDetails property: Error details of the transfer eligibility validation.
     * 
     * @return the errorDetails value.
     */
    public MoveProductEligibilityResultErrorDetails errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails property: Error details of the transfer eligibility validation.
     * 
     * @param errorDetails the errorDetails value to set.
     * @return the MoveProductEligibilityResultInner object itself.
     */
    public MoveProductEligibilityResultInner withErrorDetails(MoveProductEligibilityResultErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorDetails() != null) {
            errorDetails().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isMoveEligible", this.isMoveEligible);
        jsonWriter.writeJsonField("errorDetails", this.errorDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MoveProductEligibilityResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MoveProductEligibilityResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MoveProductEligibilityResultInner.
     */
    public static MoveProductEligibilityResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MoveProductEligibilityResultInner deserializedMoveProductEligibilityResultInner
                = new MoveProductEligibilityResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isMoveEligible".equals(fieldName)) {
                    deserializedMoveProductEligibilityResultInner.isMoveEligible
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("errorDetails".equals(fieldName)) {
                    deserializedMoveProductEligibilityResultInner.errorDetails
                        = MoveProductEligibilityResultErrorDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMoveProductEligibilityResultInner;
        });
    }
}
