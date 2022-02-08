// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.resourcemanager.securityinsights.fluent.models.EnrichmentDomainWhoisInner;
import com.azure.resourcemanager.securityinsights.models.EnrichmentDomainWhois;
import com.azure.resourcemanager.securityinsights.models.EnrichmentDomainWhoisDetails;
import java.time.OffsetDateTime;

public final class EnrichmentDomainWhoisImpl implements EnrichmentDomainWhois {
    private EnrichmentDomainWhoisInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    EnrichmentDomainWhoisImpl(
        EnrichmentDomainWhoisInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String domain() {
        return this.innerModel().domain();
    }

    public String server() {
        return this.innerModel().server();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime updated() {
        return this.innerModel().updated();
    }

    public OffsetDateTime expires() {
        return this.innerModel().expires();
    }

    public EnrichmentDomainWhoisDetails parsedWhois() {
        return this.innerModel().parsedWhois();
    }

    public EnrichmentDomainWhoisInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
