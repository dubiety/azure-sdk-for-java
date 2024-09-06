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

/**
 * It is an organizational hierarchy within a billing account to administer and manage azure costs.
 */
@Fluent
public final class EnrollmentAccountProperties implements JsonSerializable<EnrollmentAccountProperties> {
    /*
     * The cost center associated with the enrollment account.
     */
    private String costCenter;

    /*
     * The name of the enrollment account.
     */
    private String displayName;

    /*
     * The name of the department under which the enrollment account exists.
     */
    private String departmentDisplayName;

    /*
     * The ID that uniquely identifies the department.
     */
    private String departmentId;

    /*
     * Boolean flag which enables subscribers to run development and testing workloads on Azure at special Dev/Test
     * rates.
     */
    private Boolean isDevTestEnabled;

    /*
     * The owner of the enrollment account.
     */
    private String accountOwner;

    /*
     * The authorization type of the enrollment account.
     */
    private String authType;

    /*
     * The status of the enrollment account.
     */
    private String status;

    /*
     * The date from which the enrollment account became valid and functional.
     */
    private OffsetDateTime startDate;

    /*
     * The date of expiration of the enrollment account.
     */
    private OffsetDateTime endDate;

    /**
     * Creates an instance of EnrollmentAccountProperties class.
     */
    public EnrollmentAccountProperties() {
    }

    /**
     * Get the costCenter property: The cost center associated with the enrollment account.
     * 
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Set the costCenter property: The cost center associated with the enrollment account.
     * 
     * @param costCenter the costCenter value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Get the displayName property: The name of the enrollment account.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the enrollment account.
     * 
     * @param displayName the displayName value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the departmentDisplayName property: The name of the department under which the enrollment account exists.
     * 
     * @return the departmentDisplayName value.
     */
    public String departmentDisplayName() {
        return this.departmentDisplayName;
    }

    /**
     * Get the departmentId property: The ID that uniquely identifies the department.
     * 
     * @return the departmentId value.
     */
    public String departmentId() {
        return this.departmentId;
    }

    /**
     * Get the isDevTestEnabled property: Boolean flag which enables subscribers to run development and testing
     * workloads on Azure at special Dev/Test rates.
     * 
     * @return the isDevTestEnabled value.
     */
    public Boolean isDevTestEnabled() {
        return this.isDevTestEnabled;
    }

    /**
     * Set the isDevTestEnabled property: Boolean flag which enables subscribers to run development and testing
     * workloads on Azure at special Dev/Test rates.
     * 
     * @param isDevTestEnabled the isDevTestEnabled value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withIsDevTestEnabled(Boolean isDevTestEnabled) {
        this.isDevTestEnabled = isDevTestEnabled;
        return this;
    }

    /**
     * Get the accountOwner property: The owner of the enrollment account.
     * 
     * @return the accountOwner value.
     */
    public String accountOwner() {
        return this.accountOwner;
    }

    /**
     * Get the authType property: The authorization type of the enrollment account.
     * 
     * @return the authType value.
     */
    public String authType() {
        return this.authType;
    }

    /**
     * Get the status property: The status of the enrollment account.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the startDate property: The date from which the enrollment account became valid and functional.
     * 
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Get the endDate property: The date of expiration of the enrollment account.
     * 
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
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
        jsonWriter.writeStringField("costCenter", this.costCenter);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeBooleanField("isDevTestEnabled", this.isDevTestEnabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnrollmentAccountProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnrollmentAccountProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EnrollmentAccountProperties.
     */
    public static EnrollmentAccountProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnrollmentAccountProperties deserializedEnrollmentAccountProperties = new EnrollmentAccountProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("costCenter".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.costCenter = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.displayName = reader.getString();
                } else if ("departmentDisplayName".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.departmentDisplayName = reader.getString();
                } else if ("departmentId".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.departmentId = reader.getString();
                } else if ("isDevTestEnabled".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.isDevTestEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("accountOwner".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.accountOwner = reader.getString();
                } else if ("authType".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.authType = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.status = reader.getString();
                } else if ("startDate".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.startDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endDate".equals(fieldName)) {
                    deserializedEnrollmentAccountProperties.endDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnrollmentAccountProperties;
        });
    }
}
