// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.fluent.SignalRPrivateEndpointConnectionsClient;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.signalr.models.PrivateEndpointConnection;
import com.azure.resourcemanager.signalr.models.SignalRPrivateEndpointConnections;

public final class SignalRPrivateEndpointConnectionsImpl implements SignalRPrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(SignalRPrivateEndpointConnectionsImpl.class);

    private final SignalRPrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    public SignalRPrivateEndpointConnectionsImpl(
        SignalRPrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String resourceName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> list(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection get(
        String privateEndpointConnectionName, String resourceGroupName, String resourceName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(privateEndpointConnectionName, resourceGroupName, resourceName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String privateEndpointConnectionName, String resourceGroupName, String resourceName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(privateEndpointConnectionName, resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String resourceName,
        PrivateEndpointConnectionInner parameters) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().update(privateEndpointConnectionName, resourceGroupName, resourceName, parameters);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> updateWithResponse(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String resourceName,
        PrivateEndpointConnectionInner parameters,
        Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .updateWithResponse(
                    privateEndpointConnectionName, resourceGroupName, resourceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String privateEndpointConnectionName, String resourceGroupName, String resourceName) {
        this.serviceClient().delete(privateEndpointConnectionName, resourceGroupName, resourceName);
    }

    public void delete(
        String privateEndpointConnectionName, String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(privateEndpointConnectionName, resourceGroupName, resourceName, context);
    }

    private SignalRPrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }
}
