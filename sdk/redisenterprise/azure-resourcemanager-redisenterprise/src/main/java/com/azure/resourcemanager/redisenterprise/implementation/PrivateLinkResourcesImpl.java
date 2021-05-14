// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redisenterprise.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.redisenterprise.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.redisenterprise.models.PrivateLinkResource;
import com.azure.resourcemanager.redisenterprise.models.PrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByCluster(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager() {
        return this.serviceManager;
    }
}
