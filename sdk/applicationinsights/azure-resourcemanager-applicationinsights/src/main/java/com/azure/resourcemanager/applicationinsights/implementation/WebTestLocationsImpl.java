// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.WebTestLocationsClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentWebTestLocationInner;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentWebTestLocation;
import com.azure.resourcemanager.applicationinsights.models.WebTestLocations;

public final class WebTestLocationsImpl implements WebTestLocations {
    private static final ClientLogger LOGGER = new ClientLogger(WebTestLocationsImpl.class);

    private final WebTestLocationsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public WebTestLocationsImpl(
        WebTestLocationsClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplicationInsightsComponentWebTestLocation> list(
        String resourceGroupName, String resourceName) {
        PagedIterable<ApplicationInsightsComponentWebTestLocationInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName);
        return Utils
            .mapPage(inner, inner1 -> new ApplicationInsightsComponentWebTestLocationImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationInsightsComponentWebTestLocation> list(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<ApplicationInsightsComponentWebTestLocationInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils
            .mapPage(inner, inner1 -> new ApplicationInsightsComponentWebTestLocationImpl(inner1, this.manager()));
    }

    private WebTestLocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
