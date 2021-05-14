// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.NodeCount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Gets the count of nodes by count type. */
@Fluent
public final class NodeCountsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NodeCountsInner.class);

    /*
     * Gets an array of counts
     */
    @JsonProperty(value = "value")
    private List<NodeCount> value;

    /*
     * Gets the total number of records matching countType criteria.
     */
    @JsonProperty(value = "totalCount")
    private Integer totalCount;

    /**
     * Get the value property: Gets an array of counts.
     *
     * @return the value value.
     */
    public List<NodeCount> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets an array of counts.
     *
     * @param value the value value to set.
     * @return the NodeCountsInner object itself.
     */
    public NodeCountsInner withValue(List<NodeCount> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the totalCount property: Gets the total number of records matching countType criteria.
     *
     * @return the totalCount value.
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Gets the total number of records matching countType criteria.
     *
     * @param totalCount the totalCount value to set.
     * @return the NodeCountsInner object itself.
     */
    public NodeCountsInner withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
