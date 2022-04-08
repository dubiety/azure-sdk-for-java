// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Annotation associated with an application insights resource. */
@Fluent
public final class AnnotationInner {
    /*
     * Name of annotation
     */
    @JsonProperty(value = "AnnotationName")
    private String annotationName;

    /*
     * Category of annotation, free form
     */
    @JsonProperty(value = "Category")
    private String category;

    /*
     * Time when event occurred
     */
    @JsonProperty(value = "EventTime")
    private OffsetDateTime eventTime;

    /*
     * Unique Id for annotation
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * Serialized JSON object for detailed properties
     */
    @JsonProperty(value = "Properties")
    private String properties;

    /*
     * Related parent annotation if any
     */
    @JsonProperty(value = "RelatedAnnotation")
    private String relatedAnnotation;

    /**
     * Get the annotationName property: Name of annotation.
     *
     * @return the annotationName value.
     */
    public String annotationName() {
        return this.annotationName;
    }

    /**
     * Set the annotationName property: Name of annotation.
     *
     * @param annotationName the annotationName value to set.
     * @return the AnnotationInner object itself.
     */
    public AnnotationInner withAnnotationName(String annotationName) {
        this.annotationName = annotationName;
        return this;
    }

    /**
     * Get the category property: Category of annotation, free form.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Category of annotation, free form.
     *
     * @param category the category value to set.
     * @return the AnnotationInner object itself.
     */
    public AnnotationInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the eventTime property: Time when event occurred.
     *
     * @return the eventTime value.
     */
    public OffsetDateTime eventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime property: Time when event occurred.
     *
     * @param eventTime the eventTime value to set.
     * @return the AnnotationInner object itself.
     */
    public AnnotationInner withEventTime(OffsetDateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the id property: Unique Id for annotation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique Id for annotation.
     *
     * @param id the id value to set.
     * @return the AnnotationInner object itself.
     */
    public AnnotationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties property: Serialized JSON object for detailed properties.
     *
     * @return the properties value.
     */
    public String properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Serialized JSON object for detailed properties.
     *
     * @param properties the properties value to set.
     * @return the AnnotationInner object itself.
     */
    public AnnotationInner withProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the relatedAnnotation property: Related parent annotation if any.
     *
     * @return the relatedAnnotation value.
     */
    public String relatedAnnotation() {
        return this.relatedAnnotation;
    }

    /**
     * Set the relatedAnnotation property: Related parent annotation if any.
     *
     * @param relatedAnnotation the relatedAnnotation value to set.
     * @return the AnnotationInner object itself.
     */
    public AnnotationInner withRelatedAnnotation(String relatedAnnotation) {
        this.relatedAnnotation = relatedAnnotation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
