// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.ResourceSkuResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The API Management service SKUs operation response. */
@Fluent
public final class ResourceSkuResults {
    /*
     * The list of skus available for the service.
     */
    @JsonProperty(value = "value", required = true)
    private List<ResourceSkuResultInner> value;

    /*
     * The uri to fetch the next page of API Management service Skus.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of skus available for the service.
     *
     * @return the value value.
     */
    public List<ResourceSkuResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of skus available for the service.
     *
     * @param value the value value to set.
     * @return the ResourceSkuResults object itself.
     */
    public ResourceSkuResults withValue(List<ResourceSkuResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of API Management service Skus.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of API Management service Skus.
     *
     * @param nextLink the nextLink value to set.
     * @return the ResourceSkuResults object itself.
     */
    public ResourceSkuResults withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model ResourceSkuResults"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceSkuResults.class);
}
