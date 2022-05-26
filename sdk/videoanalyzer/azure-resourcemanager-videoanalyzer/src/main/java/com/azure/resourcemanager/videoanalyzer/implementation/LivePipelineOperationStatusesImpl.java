// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.LivePipelineOperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.LivePipelineOperationStatusInner;
import com.azure.resourcemanager.videoanalyzer.models.LivePipelineOperationStatus;
import com.azure.resourcemanager.videoanalyzer.models.LivePipelineOperationStatuses;

public final class LivePipelineOperationStatusesImpl implements LivePipelineOperationStatuses {
    private static final ClientLogger LOGGER = new ClientLogger(LivePipelineOperationStatusesImpl.class);

    private final LivePipelineOperationStatusesClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public LivePipelineOperationStatusesImpl(
        LivePipelineOperationStatusesClient innerClient,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LivePipelineOperationStatus get(
        String resourceGroupName, String accountName, String livePipelineName, String operationId) {
        LivePipelineOperationStatusInner inner =
            this.serviceClient().get(resourceGroupName, accountName, livePipelineName, operationId);
        if (inner != null) {
            return new LivePipelineOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LivePipelineOperationStatus> getWithResponse(
        String resourceGroupName, String accountName, String livePipelineName, String operationId, Context context) {
        Response<LivePipelineOperationStatusInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, livePipelineName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LivePipelineOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LivePipelineOperationStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }
}
