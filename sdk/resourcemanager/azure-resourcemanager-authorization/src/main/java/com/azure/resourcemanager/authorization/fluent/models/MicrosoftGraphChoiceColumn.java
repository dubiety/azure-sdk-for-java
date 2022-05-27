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
import java.util.List;
import java.util.Map;

/** choiceColumn. */
@Fluent
public final class MicrosoftGraphChoiceColumn {
    /*
     * If true, allows custom values that aren't in the configured choices.
     */
    @JsonProperty(value = "allowTextEntry")
    private Boolean allowTextEntry;

    /*
     * The list of values available for this column.
     */
    @JsonProperty(value = "choices")
    private List<String> choices;

    /*
     * How the choices are to be presented in the UX. Must be one of
     * checkBoxes, dropDownMenu, or radioButtons
     */
    @JsonProperty(value = "displayAs")
    private String displayAs;

    /*
     * choiceColumn
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowTextEntry property: If true, allows custom values that aren't in the configured choices.
     *
     * @return the allowTextEntry value.
     */
    public Boolean allowTextEntry() {
        return this.allowTextEntry;
    }

    /**
     * Set the allowTextEntry property: If true, allows custom values that aren't in the configured choices.
     *
     * @param allowTextEntry the allowTextEntry value to set.
     * @return the MicrosoftGraphChoiceColumn object itself.
     */
    public MicrosoftGraphChoiceColumn withAllowTextEntry(Boolean allowTextEntry) {
        this.allowTextEntry = allowTextEntry;
        return this;
    }

    /**
     * Get the choices property: The list of values available for this column.
     *
     * @return the choices value.
     */
    public List<String> choices() {
        return this.choices;
    }

    /**
     * Set the choices property: The list of values available for this column.
     *
     * @param choices the choices value to set.
     * @return the MicrosoftGraphChoiceColumn object itself.
     */
    public MicrosoftGraphChoiceColumn withChoices(List<String> choices) {
        this.choices = choices;
        return this;
    }

    /**
     * Get the displayAs property: How the choices are to be presented in the UX. Must be one of checkBoxes,
     * dropDownMenu, or radioButtons.
     *
     * @return the displayAs value.
     */
    public String displayAs() {
        return this.displayAs;
    }

    /**
     * Set the displayAs property: How the choices are to be presented in the UX. Must be one of checkBoxes,
     * dropDownMenu, or radioButtons.
     *
     * @param displayAs the displayAs value to set.
     * @return the MicrosoftGraphChoiceColumn object itself.
     */
    public MicrosoftGraphChoiceColumn withDisplayAs(String displayAs) {
        this.displayAs = displayAs;
        return this;
    }

    /**
     * Get the additionalProperties property: choiceColumn.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: choiceColumn.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChoiceColumn object itself.
     */
    public MicrosoftGraphChoiceColumn withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
