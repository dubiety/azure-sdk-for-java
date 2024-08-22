// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An Azure Machine Learning compute instance.
 */
@Fluent
public final class ComputeInstance extends Compute {
    /*
     * The type of compute
     */
    private ComputeType computeType = ComputeType.COMPUTE_INSTANCE;

    /*
     * Properties of ComputeInstance
     */
    private ComputeInstanceProperties properties;

    /*
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     */
    private ProvisioningState provisioningState;

    /*
     * The time at which the compute was created.
     */
    private OffsetDateTime createdOn;

    /*
     * The time at which the compute was last modified.
     */
    private OffsetDateTime modifiedOn;

    /*
     * Errors during provisioning
     */
    private List<ManagementError> provisioningErrors;

    /*
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning
     * service provisioned it if false.
     */
    private Boolean isAttachedCompute;

    /**
     * Creates an instance of ComputeInstance class.
     */
    public ComputeInstance() {
    }

    /**
     * Get the computeType property: The type of compute.
     * 
     * @return the computeType value.
     */
    @Override
    public ComputeType computeType() {
        return this.computeType;
    }

    /**
     * Get the properties property: Properties of ComputeInstance.
     * 
     * @return the properties value.
     */
    public ComputeInstanceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of ComputeInstance.
     * 
     * @param properties the properties value to set.
     * @return the ComputeInstance object itself.
     */
    public ComputeInstance withProperties(ComputeInstanceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the provisioningState property: The provision state of the cluster. Valid values are Unknown, Updating,
     * Provisioning, Succeeded, and Failed.
     * 
     * @return the provisioningState value.
     */
    @Override
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdOn property: The time at which the compute was created.
     * 
     * @return the createdOn value.
     */
    @Override
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the modifiedOn property: The time at which the compute was last modified.
     * 
     * @return the modifiedOn value.
     */
    @Override
    public OffsetDateTime modifiedOn() {
        return this.modifiedOn;
    }

    /**
     * Get the provisioningErrors property: Errors during provisioning.
     * 
     * @return the provisioningErrors value.
     */
    @Override
    public List<ManagementError> provisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * Get the isAttachedCompute property: Indicating whether the compute was provisioned by user and brought from
     * outside if true, or machine learning service provisioned it if false.
     * 
     * @return the isAttachedCompute value.
     */
    @Override
    public Boolean isAttachedCompute() {
        return this.isAttachedCompute;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComputeInstance withComputeLocation(String computeLocation) {
        super.withComputeLocation(computeLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComputeInstance withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComputeInstance withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComputeInstance withDisableLocalAuth(Boolean disableLocalAuth) {
        super.withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("computeLocation", computeLocation());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("resourceId", resourceId());
        jsonWriter.writeBooleanField("disableLocalAuth", disableLocalAuth());
        jsonWriter.writeStringField("computeType", this.computeType == null ? null : this.computeType.toString());
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeInstance from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeInstance if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComputeInstance.
     */
    public static ComputeInstance fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeInstance deserializedComputeInstance = new ComputeInstance();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("computeLocation".equals(fieldName)) {
                    deserializedComputeInstance.withComputeLocation(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedComputeInstance.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedComputeInstance.withDescription(reader.getString());
                } else if ("createdOn".equals(fieldName)) {
                    deserializedComputeInstance.createdOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("modifiedOn".equals(fieldName)) {
                    deserializedComputeInstance.modifiedOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("resourceId".equals(fieldName)) {
                    deserializedComputeInstance.withResourceId(reader.getString());
                } else if ("provisioningErrors".equals(fieldName)) {
                    List<ManagementError> provisioningErrors
                        = reader.readArray(reader1 -> ManagementError.fromJson(reader1));
                    deserializedComputeInstance.provisioningErrors = provisioningErrors;
                } else if ("isAttachedCompute".equals(fieldName)) {
                    deserializedComputeInstance.isAttachedCompute = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableLocalAuth".equals(fieldName)) {
                    deserializedComputeInstance.withDisableLocalAuth(reader.getNullable(JsonReader::getBoolean));
                } else if ("computeType".equals(fieldName)) {
                    deserializedComputeInstance.computeType = ComputeType.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedComputeInstance.properties = ComputeInstanceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeInstance;
        });
    }
}
