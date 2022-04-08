// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.UserIdentitiesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.azure.resourcemanager.apimanagement.models.UserIdentities;
import com.azure.resourcemanager.apimanagement.models.UserIdentityContract;

public final class UserIdentitiesImpl implements UserIdentities {
    private static final ClientLogger LOGGER = new ClientLogger(UserIdentitiesImpl.class);

    private final UserIdentitiesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public UserIdentitiesImpl(
        UserIdentitiesClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UserIdentityContract> list(String resourceGroupName, String serviceName, String userId) {
        PagedIterable<UserIdentityContractInner> inner =
            this.serviceClient().list(resourceGroupName, serviceName, userId);
        return Utils.mapPage(inner, inner1 -> new UserIdentityContractImpl(inner1, this.manager()));
    }

    public PagedIterable<UserIdentityContract> list(
        String resourceGroupName, String serviceName, String userId, Context context) {
        PagedIterable<UserIdentityContractInner> inner =
            this.serviceClient().list(resourceGroupName, serviceName, userId, context);
        return Utils.mapPage(inner, inner1 -> new UserIdentityContractImpl(inner1, this.manager()));
    }

    private UserIdentitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
