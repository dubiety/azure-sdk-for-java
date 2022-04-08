// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.BookmarkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List all the bookmarks. */
@Fluent
public final class BookmarkList {
    /*
     * URL to fetch the next set of bookmarks.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of bookmarks.
     */
    @JsonProperty(value = "value", required = true)
    private List<BookmarkInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of bookmarks.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of bookmarks.
     *
     * @return the value value.
     */
    public List<BookmarkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of bookmarks.
     *
     * @param value the value value to set.
     * @return the BookmarkList object itself.
     */
    public BookmarkList withValue(List<BookmarkInner> value) {
        this.value = value;
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
                    new IllegalArgumentException("Missing required property value in model BookmarkList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BookmarkList.class);
}
