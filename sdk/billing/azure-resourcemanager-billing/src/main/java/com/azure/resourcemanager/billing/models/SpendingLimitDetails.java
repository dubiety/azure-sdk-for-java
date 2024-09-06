// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The billing profile spending limit.
 */
@Fluent
public final class SpendingLimitDetails implements JsonSerializable<SpendingLimitDetails> {
    /*
     * The initial amount for the billing profile.
     */
    private Float amount;

    /*
     * The currency in which the charges for the billing profile are billed.
     */
    private String currency;

    /*
     * The date when this spending limit goes into effect.
     */
    private OffsetDateTime startDate;

    /*
     * The date when this spending limit is no longer in effect.
     */
    private OffsetDateTime endDate;

    /*
     * The type of spending limit.
     */
    private SpendingLimitType type;

    /*
     * The status of current spending limit.
     */
    private SpendingLimitStatus status;

    /**
     * Creates an instance of SpendingLimitDetails class.
     */
    public SpendingLimitDetails() {
    }

    /**
     * Get the amount property: The initial amount for the billing profile.
     * 
     * @return the amount value.
     */
    public Float amount() {
        return this.amount;
    }

    /**
     * Set the amount property: The initial amount for the billing profile.
     * 
     * @param amount the amount value to set.
     * @return the SpendingLimitDetails object itself.
     */
    public SpendingLimitDetails withAmount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the currency property: The currency in which the charges for the billing profile are billed.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Set the currency property: The currency in which the charges for the billing profile are billed.
     * 
     * @param currency the currency value to set.
     * @return the SpendingLimitDetails object itself.
     */
    public SpendingLimitDetails withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get the startDate property: The date when this spending limit goes into effect.
     * 
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The date when this spending limit goes into effect.
     * 
     * @param startDate the startDate value to set.
     * @return the SpendingLimitDetails object itself.
     */
    public SpendingLimitDetails withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The date when this spending limit is no longer in effect.
     * 
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The date when this spending limit is no longer in effect.
     * 
     * @param endDate the endDate value to set.
     * @return the SpendingLimitDetails object itself.
     */
    public SpendingLimitDetails withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the type property: The type of spending limit.
     * 
     * @return the type value.
     */
    public SpendingLimitType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of spending limit.
     * 
     * @param type the type value to set.
     * @return the SpendingLimitDetails object itself.
     */
    public SpendingLimitDetails withType(SpendingLimitType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the status property: The status of current spending limit.
     * 
     * @return the status value.
     */
    public SpendingLimitStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of current spending limit.
     * 
     * @param status the status value to set.
     * @return the SpendingLimitDetails object itself.
     */
    public SpendingLimitDetails withStatus(SpendingLimitStatus status) {
        this.status = status;
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
        jsonWriter.writeNumberField("amount", this.amount);
        jsonWriter.writeStringField("currency", this.currency);
        jsonWriter.writeStringField("startDate",
            this.startDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startDate));
        jsonWriter.writeStringField("endDate",
            this.endDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endDate));
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SpendingLimitDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpendingLimitDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SpendingLimitDetails.
     */
    public static SpendingLimitDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SpendingLimitDetails deserializedSpendingLimitDetails = new SpendingLimitDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("amount".equals(fieldName)) {
                    deserializedSpendingLimitDetails.amount = reader.getNullable(JsonReader::getFloat);
                } else if ("currency".equals(fieldName)) {
                    deserializedSpendingLimitDetails.currency = reader.getString();
                } else if ("startDate".equals(fieldName)) {
                    deserializedSpendingLimitDetails.startDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endDate".equals(fieldName)) {
                    deserializedSpendingLimitDetails.endDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("type".equals(fieldName)) {
                    deserializedSpendingLimitDetails.type = SpendingLimitType.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedSpendingLimitDetails.status = SpendingLimitStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpendingLimitDetails;
        });
    }
}
