// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the list of Application Insights Resources. */
@Fluent
public final class ApplicationInsightsComponentListResult {
    /*
     * List of Application Insights component definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<ApplicationInsightsComponentInner> value;

    /*
     * The URI to get the next set of Application Insights component
     * definitions if too many components where returned in the result set.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Application Insights component definitions.
     *
     * @return the value value.
     */
    public List<ApplicationInsightsComponentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Application Insights component definitions.
     *
     * @param value the value value to set.
     * @return the ApplicationInsightsComponentListResult object itself.
     */
    public ApplicationInsightsComponentListResult withValue(List<ApplicationInsightsComponentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Application Insights component definitions if too many
     * components where returned in the result set.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Application Insights component definitions if too many
     * components where returned in the result set.
     *
     * @param nextLink the nextLink value to set.
     * @return the ApplicationInsightsComponentListResult object itself.
     */
    public ApplicationInsightsComponentListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ApplicationInsightsComponentListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationInsightsComponentListResult.class);
}
