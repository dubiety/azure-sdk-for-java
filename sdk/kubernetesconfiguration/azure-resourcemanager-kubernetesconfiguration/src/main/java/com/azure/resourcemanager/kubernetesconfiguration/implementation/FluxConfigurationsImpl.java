// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.FluxConfigurationsClient;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.FluxConfigurationInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.FluxConfiguration;
import com.azure.resourcemanager.kubernetesconfiguration.models.FluxConfigurationPatch;
import com.azure.resourcemanager.kubernetesconfiguration.models.FluxConfigurations;

public final class FluxConfigurationsImpl implements FluxConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(FluxConfigurationsImpl.class);

    private final FluxConfigurationsClient innerClient;

    private final com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager;

    public FluxConfigurationsImpl(
        FluxConfigurationsClient innerClient,
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public FluxConfiguration get(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName) {
        FluxConfigurationInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, clusterRp, clusterResourceName, clusterName, fluxConfigurationName);
        if (inner != null) {
            return new FluxConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FluxConfiguration> getWithResponse(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        Context context) {
        Response<FluxConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, clusterRp, clusterResourceName, clusterName, fluxConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FluxConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FluxConfiguration createOrUpdate(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationInner fluxConfiguration) {
        FluxConfigurationInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    fluxConfigurationName,
                    fluxConfiguration);
        if (inner != null) {
            return new FluxConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FluxConfiguration createOrUpdate(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationInner fluxConfiguration,
        Context context) {
        FluxConfigurationInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    fluxConfigurationName,
                    fluxConfiguration,
                    context);
        if (inner != null) {
            return new FluxConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FluxConfiguration update(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationPatch fluxConfigurationPatch) {
        FluxConfigurationInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    fluxConfigurationName,
                    fluxConfigurationPatch);
        if (inner != null) {
            return new FluxConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FluxConfiguration update(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        FluxConfigurationPatch fluxConfigurationPatch,
        Context context) {
        FluxConfigurationInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    fluxConfigurationName,
                    fluxConfigurationPatch,
                    context);
        if (inner != null) {
            return new FluxConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        Boolean forceDelete) {
        this
            .serviceClient()
            .delete(resourceGroupName, clusterRp, clusterResourceName, clusterName, fluxConfigurationName, forceDelete);
    }

    public void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName) {
        this
            .serviceClient()
            .delete(resourceGroupName, clusterRp, clusterResourceName, clusterName, fluxConfigurationName);
    }

    public void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String fluxConfigurationName,
        Boolean forceDelete,
        Context context) {
        this
            .serviceClient()
            .delete(
                resourceGroupName,
                clusterRp,
                clusterResourceName,
                clusterName,
                fluxConfigurationName,
                forceDelete,
                context);
    }

    public PagedIterable<FluxConfiguration> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName) {
        PagedIterable<FluxConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, clusterRp, clusterResourceName, clusterName);
        return Utils.mapPage(inner, inner1 -> new FluxConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<FluxConfiguration> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context) {
        PagedIterable<FluxConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, clusterRp, clusterResourceName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new FluxConfigurationImpl(inner1, this.manager()));
    }

    private FluxConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager() {
        return this.serviceManager;
    }
}
