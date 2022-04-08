// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.SimPoliciesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicies;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicy;

public final class SimPoliciesImpl implements SimPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(SimPoliciesImpl.class);

    private final SimPoliciesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public SimPoliciesImpl(
        SimPoliciesClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String simPolicyName) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, simPolicyName);
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String simPolicyName, Context context) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, simPolicyName, context);
    }

    public SimPolicy get(String resourceGroupName, String mobileNetworkName, String simPolicyName) {
        SimPolicyInner inner = this.serviceClient().get(resourceGroupName, mobileNetworkName, simPolicyName);
        if (inner != null) {
            return new SimPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SimPolicy> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String simPolicyName, Context context) {
        Response<SimPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, mobileNetworkName, simPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SimPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SimPolicy> listByMobileNetwork(String resourceGroupName, String mobileNetworkName) {
        PagedIterable<SimPolicyInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName);
        return Utils.mapPage(inner, inner1 -> new SimPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<SimPolicy> listByMobileNetwork(
        String resourceGroupName, String mobileNetworkName, Context context) {
        PagedIterable<SimPolicyInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName, context);
        return Utils.mapPage(inner, inner1 -> new SimPolicyImpl(inner1, this.manager()));
    }

    public SimPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String simPolicyName = Utils.getValueFromIdByName(id, "simPolicies");
        if (simPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, simPolicyName, Context.NONE).getValue();
    }

    public Response<SimPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String simPolicyName = Utils.getValueFromIdByName(id, "simPolicies");
        if (simPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, simPolicyName, context);
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
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String simPolicyName = Utils.getValueFromIdByName(id, "simPolicies");
        if (simPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simPolicies'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, simPolicyName, Context.NONE);
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
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String simPolicyName = Utils.getValueFromIdByName(id, "simPolicies");
        if (simPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simPolicies'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, simPolicyName, context);
    }

    private SimPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public SimPolicyImpl define(String name) {
        return new SimPolicyImpl(name, this.manager());
    }
}
