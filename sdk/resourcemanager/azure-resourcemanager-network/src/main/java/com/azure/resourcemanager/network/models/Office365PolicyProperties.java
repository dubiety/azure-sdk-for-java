// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network Virtual Appliance Sku Properties. */
@Fluent
public final class Office365PolicyProperties {
    /*
     * Office 365 breakout categories.
     */
    @JsonProperty(value = "breakOutCategories")
    private BreakOutCategoryPolicies breakOutCategories;

    /**
     * Get the breakOutCategories property: Office 365 breakout categories.
     *
     * @return the breakOutCategories value.
     */
    public BreakOutCategoryPolicies breakOutCategories() {
        return this.breakOutCategories;
    }

    /**
     * Set the breakOutCategories property: Office 365 breakout categories.
     *
     * @param breakOutCategories the breakOutCategories value to set.
     * @return the Office365PolicyProperties object itself.
     */
    public Office365PolicyProperties withBreakOutCategories(BreakOutCategoryPolicies breakOutCategories) {
        this.breakOutCategories = breakOutCategories;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (breakOutCategories() != null) {
            breakOutCategories().validate();
        }
    }
}
