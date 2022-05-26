// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.CertificateInner;
import com.azure.resourcemanager.appcontainers.models.Certificate;
import com.azure.resourcemanager.appcontainers.models.CertificatePatch;
import com.azure.resourcemanager.appcontainers.models.CertificateProperties;
import java.util.Collections;
import java.util.Map;

public final class CertificateImpl implements Certificate, Certificate.Definition, Certificate.Update {
    private CertificateInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public CertificateProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CertificateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String environmentName;

    private String certificateName;

    private CertificatePatch updateCertificateEnvelope;

    public CertificateImpl withExistingManagedEnvironment(String resourceGroupName, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.environmentName = environmentName;
        return this;
    }

    public Certificate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, environmentName, certificateName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Certificate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, environmentName, certificateName, this.innerModel(), context)
                .getValue();
        return this;
    }

    CertificateImpl(String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new CertificateInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
    }

    public CertificateImpl update() {
        this.updateCertificateEnvelope = new CertificatePatch();
        return this;
    }

    public Certificate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .updateWithResponse(
                    resourceGroupName, environmentName, certificateName, updateCertificateEnvelope, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .updateWithResponse(
                    resourceGroupName, environmentName, certificateName, updateCertificateEnvelope, context)
                .getValue();
        return this;
    }

    CertificateImpl(
        CertificateInner innerObject, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.environmentName = Utils.getValueFromIdByName(innerObject.id(), "managedEnvironments");
        this.certificateName = Utils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public Certificate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, environmentName, certificateName, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, environmentName, certificateName, context)
                .getValue();
        return this;
    }

    public CertificateImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CertificateImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CertificateImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateCertificateEnvelope.withTags(tags);
            return this;
        }
    }

    public CertificateImpl withProperties(CertificateProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
