// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.BatchEndpointsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchEndpointInner;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointAuthKeysInner;
import com.azure.resourcemanager.machinelearning.models.BatchEndpoint;
import com.azure.resourcemanager.machinelearning.models.BatchEndpoints;
import com.azure.resourcemanager.machinelearning.models.EndpointAuthKeys;

public final class BatchEndpointsImpl implements BatchEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(BatchEndpointsImpl.class);

    private final BatchEndpointsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public BatchEndpointsImpl(BatchEndpointsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BatchEndpoint> list(String resourceGroupName, String workspaceName) {
        PagedIterable<BatchEndpointInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BatchEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<BatchEndpoint> list(String resourceGroupName, String workspaceName, Integer count, String skip,
        Context context) {
        PagedIterable<BatchEndpointInner> inner
            = this.serviceClient().list(resourceGroupName, workspaceName, count, skip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BatchEndpointImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String endpointName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName);
    }

    public void delete(String resourceGroupName, String workspaceName, String endpointName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName, context);
    }

    public Response<BatchEndpoint> getWithResponse(String resourceGroupName, String workspaceName, String endpointName,
        Context context) {
        Response<BatchEndpointInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, workspaceName, endpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BatchEndpointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BatchEndpoint get(String resourceGroupName, String workspaceName, String endpointName) {
        BatchEndpointInner inner = this.serviceClient().get(resourceGroupName, workspaceName, endpointName);
        if (inner != null) {
            return new BatchEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EndpointAuthKeys> listKeysWithResponse(String resourceGroupName, String workspaceName,
        String endpointName, Context context) {
        Response<EndpointAuthKeysInner> inner
            = this.serviceClient().listKeysWithResponse(resourceGroupName, workspaceName, endpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EndpointAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EndpointAuthKeys listKeys(String resourceGroupName, String workspaceName, String endpointName) {
        EndpointAuthKeysInner inner = this.serviceClient().listKeys(resourceGroupName, workspaceName, endpointName);
        if (inner != null) {
            return new EndpointAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BatchEndpoint getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = ResourceManagerUtils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, endpointName, Context.NONE).getValue();
    }

    public Response<BatchEndpoint> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = ResourceManagerUtils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, endpointName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = ResourceManagerUtils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = ResourceManagerUtils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, context);
    }

    private BatchEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public BatchEndpointImpl define(String name) {
        return new BatchEndpointImpl(name, this.manager());
    }
}
