// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * AutoMLJob Task type.
 */
public final class TaskType extends ExpandableStringEnum<TaskType> {
    /**
     * Static value Classification for TaskType.
     */
    public static final TaskType CLASSIFICATION = fromString("Classification");

    /**
     * Static value Regression for TaskType.
     */
    public static final TaskType REGRESSION = fromString("Regression");

    /**
     * Static value Forecasting for TaskType.
     */
    public static final TaskType FORECASTING = fromString("Forecasting");

    /**
     * Static value ImageClassification for TaskType.
     */
    public static final TaskType IMAGE_CLASSIFICATION = fromString("ImageClassification");

    /**
     * Static value ImageClassificationMultilabel for TaskType.
     */
    public static final TaskType IMAGE_CLASSIFICATION_MULTILABEL = fromString("ImageClassificationMultilabel");

    /**
     * Static value ImageObjectDetection for TaskType.
     */
    public static final TaskType IMAGE_OBJECT_DETECTION = fromString("ImageObjectDetection");

    /**
     * Static value ImageInstanceSegmentation for TaskType.
     */
    public static final TaskType IMAGE_INSTANCE_SEGMENTATION = fromString("ImageInstanceSegmentation");

    /**
     * Static value TextClassification for TaskType.
     */
    public static final TaskType TEXT_CLASSIFICATION = fromString("TextClassification");

    /**
     * Static value TextClassificationMultilabel for TaskType.
     */
    public static final TaskType TEXT_CLASSIFICATION_MULTILABEL = fromString("TextClassificationMultilabel");

    /**
     * Static value TextNER for TaskType.
     */
    public static final TaskType TEXT_NER = fromString("TextNER");

    /**
     * Creates a new instance of TaskType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TaskType() {
    }

    /**
     * Creates or finds a TaskType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TaskType.
     */
    public static TaskType fromString(String name) {
        return fromString(name, TaskType.class);
    }

    /**
     * Gets known TaskType values.
     * 
     * @return known TaskType values.
     */
    public static Collection<TaskType> values() {
        return values(TaskType.class);
    }
}
