// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.IncidentsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentAlertListInner;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentBookmarkListInner;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentEntitiesResponseInner;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentInner;
import com.azure.resourcemanager.securityinsights.fluent.models.TeamInformationInner;
import com.azure.resourcemanager.securityinsights.models.Incident;
import com.azure.resourcemanager.securityinsights.models.IncidentAlertList;
import com.azure.resourcemanager.securityinsights.models.IncidentBookmarkList;
import com.azure.resourcemanager.securityinsights.models.IncidentEntitiesResponse;
import com.azure.resourcemanager.securityinsights.models.Incidents;
import com.azure.resourcemanager.securityinsights.models.ManualTriggerRequestBody;
import com.azure.resourcemanager.securityinsights.models.TeamInformation;
import com.azure.resourcemanager.securityinsights.models.TeamProperties;

public final class IncidentsImpl implements Incidents {
    private static final ClientLogger LOGGER = new ClientLogger(IncidentsImpl.class);

    private final IncidentsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public IncidentsImpl(
        IncidentsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Object runPlaybook(String resourceGroupName, String workspaceName, String incidentIdentifier) {
        return this.serviceClient().runPlaybook(resourceGroupName, workspaceName, incidentIdentifier);
    }

    public Response<Object> runPlaybookWithResponse(
        String resourceGroupName,
        String workspaceName,
        String incidentIdentifier,
        ManualTriggerRequestBody requestBody,
        Context context) {
        return this
            .serviceClient()
            .runPlaybookWithResponse(resourceGroupName, workspaceName, incidentIdentifier, requestBody, context);
    }

    public PagedIterable<Incident> list(String resourceGroupName, String workspaceName) {
        PagedIterable<IncidentInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new IncidentImpl(inner1, this.manager()));
    }

    public PagedIterable<Incident> list(
        String resourceGroupName,
        String workspaceName,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context) {
        PagedIterable<IncidentInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, filter, orderby, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new IncidentImpl(inner1, this.manager()));
    }

    public Incident get(String resourceGroupName, String workspaceName, String incidentId) {
        IncidentInner inner = this.serviceClient().get(resourceGroupName, workspaceName, incidentId);
        if (inner != null) {
            return new IncidentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Incident> getWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context) {
        Response<IncidentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, incidentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IncidentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String incidentId) {
        this.serviceClient().delete(resourceGroupName, workspaceName, incidentId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, incidentId, context);
    }

    public TeamInformation createTeam(
        String resourceGroupName, String workspaceName, String incidentId, TeamProperties teamProperties) {
        TeamInformationInner inner =
            this.serviceClient().createTeam(resourceGroupName, workspaceName, incidentId, teamProperties);
        if (inner != null) {
            return new TeamInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TeamInformation> createTeamWithResponse(
        String resourceGroupName,
        String workspaceName,
        String incidentId,
        TeamProperties teamProperties,
        Context context) {
        Response<TeamInformationInner> inner =
            this
                .serviceClient()
                .createTeamWithResponse(resourceGroupName, workspaceName, incidentId, teamProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TeamInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IncidentAlertList listAlerts(String resourceGroupName, String workspaceName, String incidentId) {
        IncidentAlertListInner inner = this.serviceClient().listAlerts(resourceGroupName, workspaceName, incidentId);
        if (inner != null) {
            return new IncidentAlertListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IncidentAlertList> listAlertsWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context) {
        Response<IncidentAlertListInner> inner =
            this.serviceClient().listAlertsWithResponse(resourceGroupName, workspaceName, incidentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IncidentAlertListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IncidentBookmarkList listBookmarks(String resourceGroupName, String workspaceName, String incidentId) {
        IncidentBookmarkListInner inner =
            this.serviceClient().listBookmarks(resourceGroupName, workspaceName, incidentId);
        if (inner != null) {
            return new IncidentBookmarkListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IncidentBookmarkList> listBookmarksWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context) {
        Response<IncidentBookmarkListInner> inner =
            this.serviceClient().listBookmarksWithResponse(resourceGroupName, workspaceName, incidentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IncidentBookmarkListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IncidentEntitiesResponse listEntities(String resourceGroupName, String workspaceName, String incidentId) {
        IncidentEntitiesResponseInner inner =
            this.serviceClient().listEntities(resourceGroupName, workspaceName, incidentId);
        if (inner != null) {
            return new IncidentEntitiesResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IncidentEntitiesResponse> listEntitiesWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context) {
        Response<IncidentEntitiesResponseInner> inner =
            this.serviceClient().listEntitiesWithResponse(resourceGroupName, workspaceName, incidentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IncidentEntitiesResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Incident getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String incidentId = Utils.getValueFromIdByName(id, "incidents");
        if (incidentId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'incidents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, incidentId, Context.NONE).getValue();
    }

    public Response<Incident> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String incidentId = Utils.getValueFromIdByName(id, "incidents");
        if (incidentId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'incidents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, incidentId, context);
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String incidentId = Utils.getValueFromIdByName(id, "incidents");
        if (incidentId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'incidents'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, incidentId, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String incidentId = Utils.getValueFromIdByName(id, "incidents");
        if (incidentId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'incidents'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, incidentId, context);
    }

    private IncidentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    public IncidentImpl define(String name) {
        return new IncidentImpl(name, this.manager());
    }
}
