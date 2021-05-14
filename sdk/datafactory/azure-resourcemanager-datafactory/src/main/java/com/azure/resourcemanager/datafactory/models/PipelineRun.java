// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.PipelineRunInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of PipelineRun. */
public interface PipelineRun {
    /**
     * Gets the runId property: Identifier of a run.
     *
     * @return the runId value.
     */
    String runId();

    /**
     * Gets the runGroupId property: Identifier that correlates all the recovery runs of a pipeline run.
     *
     * @return the runGroupId value.
     */
    String runGroupId();

    /**
     * Gets the isLatest property: Indicates if the recovered pipeline run is the latest in its group.
     *
     * @return the isLatest value.
     */
    Boolean isLatest();

    /**
     * Gets the pipelineName property: The pipeline name.
     *
     * @return the pipelineName value.
     */
    String pipelineName();

    /**
     * Gets the parameters property: The full or partial list of parameter name, value pair used in the pipeline run.
     *
     * @return the parameters value.
     */
    Map<String, String> parameters();

    /**
     * Gets the runDimensions property: Run dimensions emitted by Pipeline run.
     *
     * @return the runDimensions value.
     */
    Map<String, String> runDimensions();

    /**
     * Gets the invokedBy property: Entity that started the pipeline run.
     *
     * @return the invokedBy value.
     */
    PipelineRunInvokedBy invokedBy();

    /**
     * Gets the lastUpdated property: The last updated timestamp for the pipeline run event in ISO8601 format.
     *
     * @return the lastUpdated value.
     */
    OffsetDateTime lastUpdated();

    /**
     * Gets the runStart property: The start time of a pipeline run in ISO8601 format.
     *
     * @return the runStart value.
     */
    OffsetDateTime runStart();

    /**
     * Gets the runEnd property: The end time of a pipeline run in ISO8601 format.
     *
     * @return the runEnd value.
     */
    OffsetDateTime runEnd();

    /**
     * Gets the durationInMs property: The duration of a pipeline run.
     *
     * @return the durationInMs value.
     */
    Integer durationInMs();

    /**
     * Gets the status property: The status of a pipeline run.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the message property: The message from a pipeline run.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the additionalProperties property: Information about a pipeline run.
     *
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.PipelineRunInner object.
     *
     * @return the inner object.
     */
    PipelineRunInner innerModel();
}
