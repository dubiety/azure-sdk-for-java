// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.BillingAccountPolicyInner;
import com.azure.resourcemanager.billing.models.BillingAccountPolicy;
import com.azure.resourcemanager.billing.models.BillingAccountPolicyProperties;
import java.util.Collections;
import java.util.Map;

public final class BillingAccountPolicyImpl implements BillingAccountPolicy {
    private BillingAccountPolicyInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    BillingAccountPolicyImpl(BillingAccountPolicyInner innerObject,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public BillingAccountPolicyProperties properties() {
        return this.innerModel().properties();
    }

    public BillingAccountPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
