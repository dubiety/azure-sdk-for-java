// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ExecutionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Response for the LTR backup API call.
 */
@Fluent
public final class LtrBackupResponseInner {
    /*
     * Long Term Retention Backup Operation Resource Properties
     */
    @JsonProperty(value = "properties")
    private LtrBackupOperationResponseProperties innerProperties;

    /**
     * Creates an instance of LtrBackupResponseInner class.
     */
    public LtrBackupResponseInner() {
    }

    /**
     * Get the innerProperties property: Long Term Retention Backup Operation Resource Properties.
     * 
     * @return the innerProperties value.
     */
    private LtrBackupOperationResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the datasourceSizeInBytes property: Size of datasource in bytes.
     * 
     * @return the datasourceSizeInBytes value.
     */
    public Long datasourceSizeInBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().datasourceSizeInBytes();
    }

    /**
     * Set the datasourceSizeInBytes property: Size of datasource in bytes.
     * 
     * @param datasourceSizeInBytes the datasourceSizeInBytes value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withDatasourceSizeInBytes(Long datasourceSizeInBytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withDatasourceSizeInBytes(datasourceSizeInBytes);
        return this;
    }

    /**
     * Get the dataTransferredInBytes property: Data transferred in bytes.
     * 
     * @return the dataTransferredInBytes value.
     */
    public Long dataTransferredInBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().dataTransferredInBytes();
    }

    /**
     * Set the dataTransferredInBytes property: Data transferred in bytes.
     * 
     * @param dataTransferredInBytes the dataTransferredInBytes value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withDataTransferredInBytes(Long dataTransferredInBytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withDataTransferredInBytes(dataTransferredInBytes);
        return this;
    }

    /**
     * Get the backupName property: Name of Backup operation.
     * 
     * @return the backupName value.
     */
    public String backupName() {
        return this.innerProperties() == null ? null : this.innerProperties().backupName();
    }

    /**
     * Set the backupName property: Name of Backup operation.
     * 
     * @param backupName the backupName value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withBackupName(String backupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withBackupName(backupName);
        return this;
    }

    /**
     * Get the backupMetadata property: Metadata to be stored in RP. Store everything that will be required to perform
     * a successful restore using this Recovery point. e.g. Versions, DataFormat etc.
     * 
     * @return the backupMetadata value.
     */
    public String backupMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().backupMetadata();
    }

    /**
     * Set the backupMetadata property: Metadata to be stored in RP. Store everything that will be required to perform
     * a successful restore using this Recovery point. e.g. Versions, DataFormat etc.
     * 
     * @param backupMetadata the backupMetadata value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withBackupMetadata(String backupMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withBackupMetadata(backupMetadata);
        return this;
    }

    /**
     * Get the status property: Service-set extensible enum indicating the status of operation.
     * 
     * @return the status value.
     */
    public ExecutionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Service-set extensible enum indicating the status of operation.
     * 
     * @param status the status value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withStatus(ExecutionStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the startTime property: Start time of the operation.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Start time of the operation.
     * 
     * @param startTime the startTime value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: End time of the operation.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: End time of the operation.
     * 
     * @param endTime the endTime value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the percentComplete property: PercentageCompleted.
     * 
     * @return the percentComplete value.
     */
    public Double percentComplete() {
        return this.innerProperties() == null ? null : this.innerProperties().percentComplete();
    }

    /**
     * Set the percentComplete property: PercentageCompleted.
     * 
     * @param percentComplete the percentComplete value to set.
     * @return the LtrBackupResponseInner object itself.
     */
    public LtrBackupResponseInner withPercentComplete(Double percentComplete) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LtrBackupOperationResponseProperties();
        }
        this.innerProperties().withPercentComplete(percentComplete);
        return this;
    }

    /**
     * Get the errorCode property: The error code.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.innerProperties() == null ? null : this.innerProperties().errorCode();
    }

    /**
     * Get the errorMessage property: The error message.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().errorMessage();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
