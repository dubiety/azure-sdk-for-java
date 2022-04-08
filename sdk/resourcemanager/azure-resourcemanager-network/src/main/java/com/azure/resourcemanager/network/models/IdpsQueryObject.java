// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Will describe the query to run against the IDPS signatures DB. */
@Fluent
public final class IdpsQueryObject {
    /*
     * Contain all filters names and values
     */
    @JsonProperty(value = "filters")
    private List<FilterItems> filters;

    /*
     * Search term in all columns
     */
    @JsonProperty(value = "search")
    private String search;

    /*
     * Column to sort response by
     */
    @JsonProperty(value = "orderBy")
    private OrderBy orderBy;

    /*
     * The number of the results to return in each page
     */
    @JsonProperty(value = "resultsPerPage")
    private Integer resultsPerPage;

    /*
     * The number of records matching the filter to skip
     */
    @JsonProperty(value = "skip")
    private Integer skip;

    /**
     * Get the filters property: Contain all filters names and values.
     *
     * @return the filters value.
     */
    public List<FilterItems> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: Contain all filters names and values.
     *
     * @param filters the filters value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withFilters(List<FilterItems> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the search property: Search term in all columns.
     *
     * @return the search value.
     */
    public String search() {
        return this.search;
    }

    /**
     * Set the search property: Search term in all columns.
     *
     * @param search the search value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * Get the orderBy property: Column to sort response by.
     *
     * @return the orderBy value.
     */
    public OrderBy orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: Column to sort response by.
     *
     * @param orderBy the orderBy value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the resultsPerPage property: The number of the results to return in each page.
     *
     * @return the resultsPerPage value.
     */
    public Integer resultsPerPage() {
        return this.resultsPerPage;
    }

    /**
     * Set the resultsPerPage property: The number of the results to return in each page.
     *
     * @param resultsPerPage the resultsPerPage value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
        return this;
    }

    /**
     * Get the skip property: The number of records matching the filter to skip.
     *
     * @return the skip value.
     */
    public Integer skip() {
        return this.skip;
    }

    /**
     * Set the skip property: The number of records matching the filter to skip.
     *
     * @param skip the skip value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() != null) {
            filters().forEach(e -> e.validate());
        }
        if (orderBy() != null) {
            orderBy().validate();
        }
    }
}
