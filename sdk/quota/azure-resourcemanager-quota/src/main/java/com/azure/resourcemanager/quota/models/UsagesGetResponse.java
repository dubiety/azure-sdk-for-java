// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.quota.fluent.models.CurrentUsagesBaseInner;

/** Contains all response data for the get operation. */
public final class UsagesGetResponse extends ResponseBase<UsagesGetHeaders, CurrentUsagesBaseInner> {
    /**
     * Creates an instance of UsagesGetResponse.
     *
     * @param request the request which resulted in this UsagesGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public UsagesGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        CurrentUsagesBaseInner value,
        UsagesGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public CurrentUsagesBaseInner getValue() {
        return super.getValue();
    }
}
