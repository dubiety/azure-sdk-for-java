// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagemover.fluent.JobDefinitionsClient;
import com.azure.resourcemanager.storagemover.fluent.models.JobDefinitionInner;
import com.azure.resourcemanager.storagemover.fluent.models.JobRunResourceIdInner;
import com.azure.resourcemanager.storagemover.models.JobDefinition;
import com.azure.resourcemanager.storagemover.models.JobDefinitions;
import com.azure.resourcemanager.storagemover.models.JobRunResourceId;

public final class JobDefinitionsImpl implements JobDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(JobDefinitionsImpl.class);

    private final JobDefinitionsClient innerClient;

    private final com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager;

    public JobDefinitionsImpl(
        JobDefinitionsClient innerClient, com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JobDefinition> list(String resourceGroupName, String storageMoverName, String projectName) {
        PagedIterable<JobDefinitionInner> inner =
            this.serviceClient().list(resourceGroupName, storageMoverName, projectName);
        return Utils.mapPage(inner, inner1 -> new JobDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<JobDefinition> list(
        String resourceGroupName, String storageMoverName, String projectName, Context context) {
        PagedIterable<JobDefinitionInner> inner =
            this.serviceClient().list(resourceGroupName, storageMoverName, projectName, context);
        return Utils.mapPage(inner, inner1 -> new JobDefinitionImpl(inner1, this.manager()));
    }

    public Response<JobDefinition> getWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
        Response<JobDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobDefinition get(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
        JobDefinitionInner inner =
            this.serviceClient().get(resourceGroupName, storageMoverName, projectName, jobDefinitionName);
        if (inner != null) {
            return new JobDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, projectName, jobDefinitionName);
    }

    public void delete(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
    }

    public Response<JobRunResourceId> startJobWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
        Response<JobRunResourceIdInner> inner =
            this
                .serviceClient()
                .startJobWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobRunResourceIdImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobRunResourceId startJob(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
        JobRunResourceIdInner inner =
            this.serviceClient().startJob(resourceGroupName, storageMoverName, projectName, jobDefinitionName);
        if (inner != null) {
            return new JobRunResourceIdImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobRunResourceId> stopJobWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
        Response<JobRunResourceIdInner> inner =
            this
                .serviceClient()
                .stopJobWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobRunResourceIdImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobRunResourceId stopJob(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
        JobRunResourceIdInner inner =
            this.serviceClient().stopJob(resourceGroupName, storageMoverName, projectName, jobDefinitionName);
        if (inner != null) {
            return new JobRunResourceIdImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public JobDefinition getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, Context.NONE)
            .getValue();
    }

    public Response<JobDefinition> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, projectName, jobDefinitionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
    }

    private JobDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagemover.StorageMoverManager manager() {
        return this.serviceManager;
    }

    public JobDefinitionImpl define(String name) {
        return new JobDefinitionImpl(name, this.manager());
    }
}
