// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** Azure storage specific job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("AzureWorkloadJob")
@Fluent
public final class AzureWorkloadJob extends Job {
    /*
     * Workload type of the job
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /*
     * Time elapsed during the execution of this job.
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * Gets or sets the state/actions applicable on this job like cancel/retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /*
     * Error details on execution of this job.
     */
    @JsonProperty(value = "errorDetails")
    private List<AzureWorkloadErrorInfo> errorDetails;

    /*
     * Additional information about the job.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureWorkloadJobExtendedInfo extendedInfo;

    /**
     * Get the workloadType property: Workload type of the job.
     *
     * @return the workloadType value.
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: Workload type of the job.
     *
     * @param workloadType the workloadType value to set.
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the duration property: Time elapsed during the execution of this job.
     *
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Time elapsed during the execution of this job.
     *
     * @param duration the duration value to set.
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the actionsInfo property: Gets or sets the state/actions applicable on this job like cancel/retry.
     *
     * @return the actionsInfo value.
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set the actionsInfo property: Gets or sets the state/actions applicable on this job like cancel/retry.
     *
     * @param actionsInfo the actionsInfo value to set.
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get the errorDetails property: Error details on execution of this job.
     *
     * @return the errorDetails value.
     */
    public List<AzureWorkloadErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails property: Error details on execution of this job.
     *
     * @param errorDetails the errorDetails value to set.
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withErrorDetails(List<AzureWorkloadErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information about the job.
     *
     * @return the extendedInfo value.
     */
    public AzureWorkloadJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information about the job.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withExtendedInfo(AzureWorkloadJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withEntityFriendlyName(String entityFriendlyName) {
        super.withEntityFriendlyName(entityFriendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withOperation(String operation) {
        super.withOperation(operation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withStatus(String status) {
        super.withStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withStartTime(OffsetDateTime startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withEndTime(OffsetDateTime endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadJob withActivityId(String activityId) {
        super.withActivityId(activityId);
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
        if (errorDetails() != null) {
            errorDetails().forEach(e -> e.validate());
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
    }
}
