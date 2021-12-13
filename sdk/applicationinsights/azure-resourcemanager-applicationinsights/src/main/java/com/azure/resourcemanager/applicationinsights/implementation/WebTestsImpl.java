// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.WebTestsClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.WebTestInner;
import com.azure.resourcemanager.applicationinsights.models.WebTest;
import com.azure.resourcemanager.applicationinsights.models.WebTests;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WebTestsImpl implements WebTests {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebTestsImpl.class);

    private final WebTestsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public WebTestsImpl(
        WebTestsClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WebTest> listByResourceGroup(String resourceGroupName) {
        PagedIterable<WebTestInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<WebTestInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public WebTest getByResourceGroup(String resourceGroupName, String webTestName) {
        WebTestInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, webTestName);
        if (inner != null) {
            return new WebTestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WebTest> getByResourceGroupWithResponse(
        String resourceGroupName, String webTestName, Context context) {
        Response<WebTestInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, webTestName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WebTestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String webTestName) {
        this.serviceClient().delete(resourceGroupName, webTestName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String webTestName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, webTestName, context);
    }

    public PagedIterable<WebTest> list() {
        PagedIterable<WebTestInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> list(Context context) {
        PagedIterable<WebTestInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> listByComponent(String componentName, String resourceGroupName) {
        PagedIterable<WebTestInner> inner = this.serviceClient().listByComponent(componentName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> listByComponent(String componentName, String resourceGroupName, Context context) {
        PagedIterable<WebTestInner> inner =
            this.serviceClient().listByComponent(componentName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public WebTest getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, webTestName, Context.NONE).getValue();
    }

    public Response<WebTest> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, webTestName, context);
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
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, webTestName, Context.NONE);
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
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, webTestName, context);
    }

    private WebTestsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    public WebTestImpl define(String name) {
        return new WebTestImpl(name, this.manager());
    }
}
