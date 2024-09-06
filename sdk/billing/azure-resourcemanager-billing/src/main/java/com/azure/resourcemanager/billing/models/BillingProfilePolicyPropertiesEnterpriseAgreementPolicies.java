// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The policies for Enterprise Agreement enrollments.
 */
@Fluent
public final class BillingProfilePolicyPropertiesEnterpriseAgreementPolicies extends EnterpriseAgreementPolicies {
    /**
     * Creates an instance of BillingProfilePolicyPropertiesEnterpriseAgreementPolicies class.
     */
    public BillingProfilePolicyPropertiesEnterpriseAgreementPolicies() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfilePolicyPropertiesEnterpriseAgreementPolicies
        withAuthenticationType(EnrollmentAuthLevelState authenticationType) {
        super.withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfilePolicyPropertiesEnterpriseAgreementPolicies
        withAccountOwnerViewCharges(EnrollmentAccountOwnerViewCharges accountOwnerViewCharges) {
        super.withAccountOwnerViewCharges(accountOwnerViewCharges);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfilePolicyPropertiesEnterpriseAgreementPolicies
        withDepartmentAdminViewCharges(EnrollmentDepartmentAdminViewCharges departmentAdminViewCharges) {
        super.withDepartmentAdminViewCharges(departmentAdminViewCharges);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("authenticationType",
            authenticationType() == null ? null : authenticationType().toString());
        jsonWriter.writeStringField("accountOwnerViewCharges",
            accountOwnerViewCharges() == null ? null : accountOwnerViewCharges().toString());
        jsonWriter.writeStringField("departmentAdminViewCharges",
            departmentAdminViewCharges() == null ? null : departmentAdminViewCharges().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BillingProfilePolicyPropertiesEnterpriseAgreementPolicies from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingProfilePolicyPropertiesEnterpriseAgreementPolicies if the JsonReader was pointing
     * to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * BillingProfilePolicyPropertiesEnterpriseAgreementPolicies.
     */
    public static BillingProfilePolicyPropertiesEnterpriseAgreementPolicies fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            BillingProfilePolicyPropertiesEnterpriseAgreementPolicies deserializedBillingProfilePolicyPropertiesEnterpriseAgreementPolicies
                = new BillingProfilePolicyPropertiesEnterpriseAgreementPolicies();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authenticationType".equals(fieldName)) {
                    deserializedBillingProfilePolicyPropertiesEnterpriseAgreementPolicies
                        .withAuthenticationType(EnrollmentAuthLevelState.fromString(reader.getString()));
                } else if ("accountOwnerViewCharges".equals(fieldName)) {
                    deserializedBillingProfilePolicyPropertiesEnterpriseAgreementPolicies
                        .withAccountOwnerViewCharges(EnrollmentAccountOwnerViewCharges.fromString(reader.getString()));
                } else if ("departmentAdminViewCharges".equals(fieldName)) {
                    deserializedBillingProfilePolicyPropertiesEnterpriseAgreementPolicies
                        .withDepartmentAdminViewCharges(
                            EnrollmentDepartmentAdminViewCharges.fromString(reader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingProfilePolicyPropertiesEnterpriseAgreementPolicies;
        });
    }
}
