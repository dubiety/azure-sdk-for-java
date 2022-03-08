// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;

/** Contains all response data for the update operation. */
public final class ManagedPrivateEndpointsUpdateResponse
    extends ResponseBase<ManagedPrivateEndpointsUpdateHeaders, ManagedPrivateEndpointInner> {
    /**
     * Creates an instance of ManagedPrivateEndpointsUpdateResponse.
     *
     * @param request the request which resulted in this ManagedPrivateEndpointsUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ManagedPrivateEndpointsUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ManagedPrivateEndpointInner value,
        ManagedPrivateEndpointsUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ManagedPrivateEndpointInner getValue() {
        return super.getValue();
    }
}
