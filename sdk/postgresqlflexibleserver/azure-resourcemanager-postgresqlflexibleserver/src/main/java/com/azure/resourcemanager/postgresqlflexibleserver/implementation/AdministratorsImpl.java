// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.AdministratorsClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ActiveDirectoryAdministratorInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ActiveDirectoryAdministrator;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Administrators;

public final class AdministratorsImpl implements Administrators {
    private static final ClientLogger LOGGER = new ClientLogger(AdministratorsImpl.class);

    private final AdministratorsClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public AdministratorsImpl(AdministratorsClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String serverName, String objectId) {
        this.serviceClient().delete(resourceGroupName, serverName, objectId);
    }

    public void delete(String resourceGroupName, String serverName, String objectId, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, objectId, context);
    }

    public Response<ActiveDirectoryAdministrator> getWithResponse(String resourceGroupName, String serverName,
        String objectId, Context context) {
        Response<ActiveDirectoryAdministratorInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, serverName, objectId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ActiveDirectoryAdministratorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ActiveDirectoryAdministrator get(String resourceGroupName, String serverName, String objectId) {
        ActiveDirectoryAdministratorInner inner = this.serviceClient().get(resourceGroupName, serverName, objectId);
        if (inner != null) {
            return new ActiveDirectoryAdministratorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ActiveDirectoryAdministrator> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ActiveDirectoryAdministratorInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ActiveDirectoryAdministratorImpl(inner1, this.manager()));
    }

    public PagedIterable<ActiveDirectoryAdministrator> listByServer(String resourceGroupName, String serverName,
        Context context) {
        PagedIterable<ActiveDirectoryAdministratorInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ActiveDirectoryAdministratorImpl(inner1, this.manager()));
    }

    public ActiveDirectoryAdministrator getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = ResourceManagerUtils.getValueFromIdByName(id, "flexibleServers");
        if (serverName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'flexibleServers'.", id)));
        }
        String objectId = ResourceManagerUtils.getValueFromIdByName(id, "administrators");
        if (objectId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, objectId, Context.NONE).getValue();
    }

    public Response<ActiveDirectoryAdministrator> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = ResourceManagerUtils.getValueFromIdByName(id, "flexibleServers");
        if (serverName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'flexibleServers'.", id)));
        }
        String objectId = ResourceManagerUtils.getValueFromIdByName(id, "administrators");
        if (objectId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, objectId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = ResourceManagerUtils.getValueFromIdByName(id, "flexibleServers");
        if (serverName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'flexibleServers'.", id)));
        }
        String objectId = ResourceManagerUtils.getValueFromIdByName(id, "administrators");
        if (objectId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        this.delete(resourceGroupName, serverName, objectId, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = ResourceManagerUtils.getValueFromIdByName(id, "flexibleServers");
        if (serverName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'flexibleServers'.", id)));
        }
        String objectId = ResourceManagerUtils.getValueFromIdByName(id, "administrators");
        if (objectId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        this.delete(resourceGroupName, serverName, objectId, context);
    }

    private AdministratorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }

    public ActiveDirectoryAdministratorImpl define(String name) {
        return new ActiveDirectoryAdministratorImpl(name, this.manager());
    }
}
