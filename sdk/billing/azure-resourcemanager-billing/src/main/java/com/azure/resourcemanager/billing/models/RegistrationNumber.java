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
import java.util.List;

/**
 * Describes the registration number of the organization linked with the billing account.
 */
@Fluent
public class RegistrationNumber implements JsonSerializable<RegistrationNumber> {
    /*
     * The unique identification number of the organization linked with the billing account.
     */
    private String id;

    /*
     * Identifies if the registration number is required for the billing account.
     */
    private Boolean required;

    /*
     * The types of registration number allowed based on the country of the billing account.
     */
    private List<String> type;

    /**
     * Creates an instance of RegistrationNumber class.
     */
    public RegistrationNumber() {
    }

    /**
     * Get the id property: The unique identification number of the organization linked with the billing account.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The unique identification number of the organization linked with the billing account.
     * 
     * @param id the id value to set.
     * @return the RegistrationNumber object itself.
     */
    public RegistrationNumber withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the required property: Identifies if the registration number is required for the billing account.
     * 
     * @return the required value.
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set the required property: Identifies if the registration number is required for the billing account.
     * 
     * @param required the required value to set.
     * @return the RegistrationNumber object itself.
     */
    RegistrationNumber withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get the type property: The types of registration number allowed based on the country of the billing account.
     * 
     * @return the type value.
     */
    public List<String> type() {
        return this.type;
    }

    /**
     * Set the type property: The types of registration number allowed based on the country of the billing account.
     * 
     * @param type the type value to set.
     * @return the RegistrationNumber object itself.
     */
    RegistrationNumber withType(List<String> type) {
        this.type = type;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistrationNumber from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistrationNumber if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegistrationNumber.
     */
    public static RegistrationNumber fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistrationNumber deserializedRegistrationNumber = new RegistrationNumber();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRegistrationNumber.id = reader.getString();
                } else if ("required".equals(fieldName)) {
                    deserializedRegistrationNumber.required = reader.getNullable(JsonReader::getBoolean);
                } else if ("type".equals(fieldName)) {
                    List<String> type = reader.readArray(reader1 -> reader1.getString());
                    deserializedRegistrationNumber.type = type;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistrationNumber;
        });
    }
}
