// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookChartSeriesFormat. */
@Fluent
public final class MicrosoftGraphWorkbookChartSeriesFormat extends MicrosoftGraphEntity {
    /*
     * workbookChartFill
     */
    @JsonProperty(value = "fill")
    private MicrosoftGraphWorkbookChartFill fill;

    /*
     * workbookChartLineFormat
     */
    @JsonProperty(value = "line")
    private MicrosoftGraphWorkbookChartLineFormat line;

    /*
     * workbookChartSeriesFormat
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the fill property: workbookChartFill.
     *
     * @return the fill value.
     */
    public MicrosoftGraphWorkbookChartFill fill() {
        return this.fill;
    }

    /**
     * Set the fill property: workbookChartFill.
     *
     * @param fill the fill value to set.
     * @return the MicrosoftGraphWorkbookChartSeriesFormat object itself.
     */
    public MicrosoftGraphWorkbookChartSeriesFormat withFill(MicrosoftGraphWorkbookChartFill fill) {
        this.fill = fill;
        return this;
    }

    /**
     * Get the line property: workbookChartLineFormat.
     *
     * @return the line value.
     */
    public MicrosoftGraphWorkbookChartLineFormat line() {
        return this.line;
    }

    /**
     * Set the line property: workbookChartLineFormat.
     *
     * @param line the line value to set.
     * @return the MicrosoftGraphWorkbookChartSeriesFormat object itself.
     */
    public MicrosoftGraphWorkbookChartSeriesFormat withLine(MicrosoftGraphWorkbookChartLineFormat line) {
        this.line = line;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartSeriesFormat.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartSeriesFormat.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartSeriesFormat object itself.
     */
    public MicrosoftGraphWorkbookChartSeriesFormat withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookChartSeriesFormat withId(String id) {
        super.withId(id);
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
        if (fill() != null) {
            fill().validate();
        }
        if (line() != null) {
            line().validate();
        }
    }
}
