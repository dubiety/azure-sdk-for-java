// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.WorkbooksClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookInner;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;
import com.azure.resourcemanager.applicationinsights.models.Workbook;
import com.azure.resourcemanager.applicationinsights.models.Workbooks;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

public final class WorkbooksImpl implements Workbooks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkbooksImpl.class);

    private final WorkbooksClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public WorkbooksImpl(
        WorkbooksClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Workbook> list(CategoryType category) {
        PagedIterable<WorkbookInner> inner = this.serviceClient().list(category);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<Workbook> list(
        CategoryType category, List<String> tags, Boolean canFetchContent, Context context) {
        PagedIterable<WorkbookInner> inner = this.serviceClient().list(category, tags, canFetchContent, context);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<Workbook> listByResourceGroup(String resourceGroupName, CategoryType category) {
        PagedIterable<WorkbookInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, category);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<Workbook> listByResourceGroup(
        String resourceGroupName,
        CategoryType category,
        List<String> tags,
        String sourceId,
        Boolean canFetchContent,
        Context context) {
        PagedIterable<WorkbookInner> inner =
            this
                .serviceClient()
                .listByResourceGroup(resourceGroupName, category, tags, sourceId, canFetchContent, context);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public Workbook getByResourceGroup(String resourceGroupName, String resourceName) {
        WorkbookInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new WorkbookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Workbook> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<WorkbookInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkbookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, context);
    }

    public PagedIterable<Workbook> revisionsList(String resourceGroupName, String resourceName) {
        PagedIterable<WorkbookInner> inner = this.serviceClient().revisionsList(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<Workbook> revisionsList(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<WorkbookInner> inner =
            this.serviceClient().revisionsList(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public Workbook revisionGet(String resourceGroupName, String resourceName, String revisionId) {
        WorkbookInner inner = this.serviceClient().revisionGet(resourceGroupName, resourceName, revisionId);
        if (inner != null) {
            return new WorkbookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Workbook> revisionGetWithResponse(
        String resourceGroupName, String resourceName, String revisionId, Context context) {
        Response<WorkbookInner> inner =
            this.serviceClient().revisionGetWithResponse(resourceGroupName, resourceName, revisionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkbookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Workbook getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<Workbook> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, context);
    }

    private WorkbooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    public WorkbookImpl define(String name) {
        return new WorkbookImpl(name, this.manager());
    }
}
