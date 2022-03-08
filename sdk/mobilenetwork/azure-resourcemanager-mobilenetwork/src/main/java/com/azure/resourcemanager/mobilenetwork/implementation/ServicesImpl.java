// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.ServicesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ServiceInner;
import com.azure.resourcemanager.mobilenetwork.models.Service;
import com.azure.resourcemanager.mobilenetwork.models.Services;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServicesImpl implements Services {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public ServicesImpl(
        ServicesClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String serviceName) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, serviceName);
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String serviceName, Context context) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, serviceName, context);
    }

    public Service get(String resourceGroupName, String mobileNetworkName, String serviceName) {
        ServiceInner inner = this.serviceClient().get(resourceGroupName, mobileNetworkName, serviceName);
        if (inner != null) {
            return new ServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Service> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String serviceName, Context context) {
        Response<ServiceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, mobileNetworkName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Service> listByMobileNetwork(String resourceGroupName, String mobileNetworkName) {
        PagedIterable<ServiceInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName);
        return Utils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<Service> listByMobileNetwork(
        String resourceGroupName, String mobileNetworkName, Context context) {
        PagedIterable<ServiceInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName, context);
        return Utils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public Service getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, serviceName, Context.NONE).getValue();
    }

    public Response<Service> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, serviceName, context);
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
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, serviceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, serviceName, context);
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public ServiceImpl define(String name) {
        return new ServiceImpl(name, this.manager());
    }
}
