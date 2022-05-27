// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines an early termination policy based on running averages of the primary metric of all runs. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "policyType")
@JsonTypeName("MedianStopping")
@Fluent
public final class MedianStoppingPolicy extends EarlyTerminationPolicy {
    /** {@inheritDoc} */
    @Override
    public MedianStoppingPolicy withDelayEvaluation(Integer delayEvaluation) {
        super.withDelayEvaluation(delayEvaluation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MedianStoppingPolicy withEvaluationInterval(Integer evaluationInterval) {
        super.withEvaluationInterval(evaluationInterval);
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
    }
}
