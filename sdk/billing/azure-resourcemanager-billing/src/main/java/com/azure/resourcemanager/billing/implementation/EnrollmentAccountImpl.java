// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.EnrollmentAccountInner;
import com.azure.resourcemanager.billing.models.EnrollmentAccount;
import com.azure.resourcemanager.billing.models.EnrollmentAccountProperties;
import java.util.Collections;
import java.util.Map;

public final class EnrollmentAccountImpl implements EnrollmentAccount {
    private EnrollmentAccountInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    EnrollmentAccountImpl(EnrollmentAccountInner innerObject,
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

    public EnrollmentAccountProperties properties() {
        return this.innerModel().properties();
    }

    public EnrollmentAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
