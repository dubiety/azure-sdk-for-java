// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.BillingPropertiesClient;
import com.azure.resourcemanager.billing.fluent.models.BillingPropertyInner;
import com.azure.resourcemanager.billing.models.BillingProperties;
import com.azure.resourcemanager.billing.models.BillingProperty;

public final class BillingPropertiesImpl implements BillingProperties {
    private static final ClientLogger LOGGER = new ClientLogger(BillingPropertiesImpl.class);

    private final BillingPropertiesClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public BillingPropertiesImpl(BillingPropertiesClient innerClient,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<BillingProperty> getWithResponse(Boolean includeBillingCountry, Boolean includeTransitionStatus,
        Context context) {
        Response<BillingPropertyInner> inner
            = this.serviceClient().getWithResponse(includeBillingCountry, includeTransitionStatus, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BillingPropertyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingProperty get() {
        BillingPropertyInner inner = this.serviceClient().get();
        if (inner != null) {
            return new BillingPropertyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BillingProperty> updateWithResponse(BillingPropertyInner parameters, Context context) {
        Response<BillingPropertyInner> inner = this.serviceClient().updateWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BillingPropertyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingProperty update(BillingPropertyInner parameters) {
        BillingPropertyInner inner = this.serviceClient().update(parameters);
        if (inner != null) {
            return new BillingPropertyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private BillingPropertiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
