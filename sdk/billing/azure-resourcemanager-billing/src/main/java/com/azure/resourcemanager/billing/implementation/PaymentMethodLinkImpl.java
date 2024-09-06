// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.PaymentMethodLinkInner;
import com.azure.resourcemanager.billing.fluent.models.PaymentMethodProperties;
import com.azure.resourcemanager.billing.models.PaymentMethodFamily;
import com.azure.resourcemanager.billing.models.PaymentMethodLink;
import com.azure.resourcemanager.billing.models.PaymentMethodLogo;
import com.azure.resourcemanager.billing.models.PaymentMethodStatus;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PaymentMethodLinkImpl implements PaymentMethodLink {
    private PaymentMethodLinkInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    PaymentMethodLinkImpl(PaymentMethodLinkInner innerObject,
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

    public String accountHolderName() {
        return this.innerModel().accountHolderName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String expiration() {
        return this.innerModel().expiration();
    }

    public PaymentMethodFamily family() {
        return this.innerModel().family();
    }

    public String lastFourDigits() {
        return this.innerModel().lastFourDigits();
    }

    public List<PaymentMethodLogo> logos() {
        List<PaymentMethodLogo> inner = this.innerModel().logos();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PaymentMethodProperties paymentMethod() {
        return this.innerModel().paymentMethod();
    }

    public String paymentMethodId() {
        return this.innerModel().paymentMethodId();
    }

    public String paymentMethodType() {
        return this.innerModel().paymentMethodType();
    }

    public PaymentMethodStatus status() {
        return this.innerModel().status();
    }

    public PaymentMethodLinkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
