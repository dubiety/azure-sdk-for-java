// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.JobsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.JobBaseInner;
import com.azure.resourcemanager.machinelearning.models.JobBase;
import com.azure.resourcemanager.machinelearning.models.Jobs;
import com.azure.resourcemanager.machinelearning.models.ListViewType;

public final class JobsImpl implements Jobs {
    private static final ClientLogger LOGGER = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public JobsImpl(JobsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JobBase> list(String resourceGroupName, String workspaceName) {
        PagedIterable<JobBaseInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new JobBaseImpl(inner1, this.manager()));
    }

    public PagedIterable<JobBase> list(String resourceGroupName, String workspaceName, String skip, String jobType,
        String tag, ListViewType listViewType, String properties, Context context) {
        PagedIterable<JobBaseInner> inner = this.serviceClient()
            .list(resourceGroupName, workspaceName, skip, jobType, tag, listViewType, properties, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new JobBaseImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String id) {
        this.serviceClient().delete(resourceGroupName, workspaceName, id);
    }

    public void delete(String resourceGroupName, String workspaceName, String id, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, id, context);
    }

    public Response<JobBase> getWithResponse(String resourceGroupName, String workspaceName, String id,
        Context context) {
        Response<JobBaseInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, workspaceName, id, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new JobBaseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobBase get(String resourceGroupName, String workspaceName, String id) {
        JobBaseInner inner = this.serviceClient().get(resourceGroupName, workspaceName, id);
        if (inner != null) {
            return new JobBaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void cancel(String resourceGroupName, String workspaceName, String id) {
        this.serviceClient().cancel(resourceGroupName, workspaceName, id);
    }

    public void cancel(String resourceGroupName, String workspaceName, String id, Context context) {
        this.serviceClient().cancel(resourceGroupName, workspaceName, id, context);
    }

    public JobBase getById(String id) {
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
        String varId = ResourceManagerUtils.getValueFromIdByName(id, "jobs");
        if (varId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, varId, Context.NONE).getValue();
    }

    public Response<JobBase> getByIdWithResponse(String id, Context context) {
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
        String varId = ResourceManagerUtils.getValueFromIdByName(id, "jobs");
        if (varId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, varId, context);
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
        String varId = ResourceManagerUtils.getValueFromIdByName(id, "jobs");
        if (varId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, varId, Context.NONE);
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
        String varId = ResourceManagerUtils.getValueFromIdByName(id, "jobs");
        if (varId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, varId, context);
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public JobBaseImpl define(String name) {
        return new JobBaseImpl(name, this.manager());
    }
}
