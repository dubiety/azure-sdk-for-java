// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Describes all the properties of a JobOutput. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = JobOutput.class)
@JsonTypeName("JobOutput")
@JsonSubTypes({@JsonSubTypes.Type(name = "#Microsoft.Media.JobOutputAsset", value = JobOutputAsset.class)})
@Fluent
public class JobOutput {
    /*
     * If the JobOutput is in the Error state, it contains the details of the
     * error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private JobError error;

    /*
     * A preset used to override the preset in the corresponding transform
     * output.
     */
    @JsonProperty(value = "presetOverride")
    private Preset presetOverride;

    /*
     * Describes the state of the JobOutput.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /*
     * If the JobOutput is in a Processing state, this contains the Job
     * completion percentage. The value is an estimate and not intended to be
     * used to predict Job completion times. To determine if the JobOutput is
     * complete, use the State property.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private Integer progress;

    /*
     * A label that is assigned to a JobOutput in order to help uniquely
     * identify it. This is useful when your Transform has more than one
     * TransformOutput, whereby your Job has more than one JobOutput. In such
     * cases, when you submit the Job, you will add two or more JobOutputs, in
     * the same order as TransformOutputs in the Transform. Subsequently, when
     * you retrieve the Job, either through events or on a GET request, you can
     * use the label to easily identify the JobOutput. If a label is not
     * provided, a default value of '{presetName}_{outputIndex}' will be used,
     * where the preset name is the name of the preset in the corresponding
     * TransformOutput and the output index is the relative index of the this
     * JobOutput within the Job. Note that this index is the same as the
     * relative index of the corresponding TransformOutput within its
     * Transform.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The UTC date and time at which this Job Output began processing.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The UTC date and time at which this Job Output finished processing.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /**
     * Get the error property: If the JobOutput is in the Error state, it contains the details of the error.
     *
     * @return the error value.
     */
    public JobError error() {
        return this.error;
    }

    /**
     * Get the presetOverride property: A preset used to override the preset in the corresponding transform output.
     *
     * @return the presetOverride value.
     */
    public Preset presetOverride() {
        return this.presetOverride;
    }

    /**
     * Set the presetOverride property: A preset used to override the preset in the corresponding transform output.
     *
     * @param presetOverride the presetOverride value to set.
     * @return the JobOutput object itself.
     */
    public JobOutput withPresetOverride(Preset presetOverride) {
        this.presetOverride = presetOverride;
        return this;
    }

    /**
     * Get the state property: Describes the state of the JobOutput.
     *
     * @return the state value.
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get the progress property: If the JobOutput is in a Processing state, this contains the Job completion
     * percentage. The value is an estimate and not intended to be used to predict Job completion times. To determine if
     * the JobOutput is complete, use the State property.
     *
     * @return the progress value.
     */
    public Integer progress() {
        return this.progress;
    }

    /**
     * Get the label property: A label that is assigned to a JobOutput in order to help uniquely identify it. This is
     * useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In
     * such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs
     * in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use
     * the label to easily identify the JobOutput. If a label is not provided, a default value of
     * '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding
     * TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this
     * index is the same as the relative index of the corresponding TransformOutput within its Transform.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: A label that is assigned to a JobOutput in order to help uniquely identify it. This is
     * useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In
     * such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs
     * in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use
     * the label to easily identify the JobOutput. If a label is not provided, a default value of
     * '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding
     * TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this
     * index is the same as the relative index of the corresponding TransformOutput within its Transform.
     *
     * @param label the label value to set.
     * @return the JobOutput object itself.
     */
    public JobOutput withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the startTime property: The UTC date and time at which this Job Output began processing.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The UTC date and time at which this Job Output finished processing.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
        if (presetOverride() != null) {
            presetOverride().validate();
        }
    }
}
