// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.EntitiesClient;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityExpandResponseInner;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityGetInsightsResponseInner;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.GetQueriesResponseInner;
import com.azure.resourcemanager.securityinsights.models.Entities;
import com.azure.resourcemanager.securityinsights.models.Entity;
import com.azure.resourcemanager.securityinsights.models.EntityExpandParameters;
import com.azure.resourcemanager.securityinsights.models.EntityExpandResponse;
import com.azure.resourcemanager.securityinsights.models.EntityGetInsightsParameters;
import com.azure.resourcemanager.securityinsights.models.EntityGetInsightsResponse;
import com.azure.resourcemanager.securityinsights.models.EntityItemQueryKind;
import com.azure.resourcemanager.securityinsights.models.GetQueriesResponse;

public final class EntitiesImpl implements Entities {
    private static final ClientLogger LOGGER = new ClientLogger(EntitiesImpl.class);

    private final EntitiesClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public EntitiesImpl(
        EntitiesClient innerClient, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Entity> list(String resourceGroupName, String workspaceName) {
        PagedIterable<EntityInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new EntityImpl(inner1, this.manager()));
    }

    public PagedIterable<Entity> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<EntityInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new EntityImpl(inner1, this.manager()));
    }

    public Entity get(String resourceGroupName, String workspaceName, String entityId) {
        EntityInner inner = this.serviceClient().get(resourceGroupName, workspaceName, entityId);
        if (inner != null) {
            return new EntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Entity> getWithResponse(
        String resourceGroupName, String workspaceName, String entityId, Context context) {
        Response<EntityInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, entityId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EntityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EntityExpandResponse expand(
        String resourceGroupName, String workspaceName, String entityId, EntityExpandParameters parameters) {
        EntityExpandResponseInner inner =
            this.serviceClient().expand(resourceGroupName, workspaceName, entityId, parameters);
        if (inner != null) {
            return new EntityExpandResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EntityExpandResponse> expandWithResponse(
        String resourceGroupName,
        String workspaceName,
        String entityId,
        EntityExpandParameters parameters,
        Context context) {
        Response<EntityExpandResponseInner> inner =
            this.serviceClient().expandWithResponse(resourceGroupName, workspaceName, entityId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EntityExpandResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GetQueriesResponse queries(
        String resourceGroupName, String workspaceName, String entityId, EntityItemQueryKind kind) {
        GetQueriesResponseInner inner = this.serviceClient().queries(resourceGroupName, workspaceName, entityId, kind);
        if (inner != null) {
            return new GetQueriesResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GetQueriesResponse> queriesWithResponse(
        String resourceGroupName, String workspaceName, String entityId, EntityItemQueryKind kind, Context context) {
        Response<GetQueriesResponseInner> inner =
            this.serviceClient().queriesWithResponse(resourceGroupName, workspaceName, entityId, kind, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GetQueriesResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EntityGetInsightsResponse getInsights(
        String resourceGroupName, String workspaceName, String entityId, EntityGetInsightsParameters parameters) {
        EntityGetInsightsResponseInner inner =
            this.serviceClient().getInsights(resourceGroupName, workspaceName, entityId, parameters);
        if (inner != null) {
            return new EntityGetInsightsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EntityGetInsightsResponse> getInsightsWithResponse(
        String resourceGroupName,
        String workspaceName,
        String entityId,
        EntityGetInsightsParameters parameters,
        Context context) {
        Response<EntityGetInsightsResponseInner> inner =
            this
                .serviceClient()
                .getInsightsWithResponse(resourceGroupName, workspaceName, entityId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EntityGetInsightsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private EntitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
