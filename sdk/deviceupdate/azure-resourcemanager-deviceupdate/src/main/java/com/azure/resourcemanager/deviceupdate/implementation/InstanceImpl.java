// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceupdate.fluent.models.InstanceInner;
import com.azure.resourcemanager.deviceupdate.models.DiagnosticStorageProperties;
import com.azure.resourcemanager.deviceupdate.models.Instance;
import com.azure.resourcemanager.deviceupdate.models.IotHubSettings;
import com.azure.resourcemanager.deviceupdate.models.ProvisioningState;
import com.azure.resourcemanager.deviceupdate.models.TagUpdate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class InstanceImpl implements Instance, Instance.Definition, Instance.Update {
    private InstanceInner innerObject;

    private final com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String accountName() {
        return this.innerModel().accountName();
    }

    public List<IotHubSettings> iotHubs() {
        List<IotHubSettings> inner = this.innerModel().iotHubs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableDiagnostics() {
        return this.innerModel().enableDiagnostics();
    }

    public DiagnosticStorageProperties diagnosticStorageProperties() {
        return this.innerModel().diagnosticStorageProperties();
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

    public InstanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String instanceName;

    private TagUpdate updateTagUpdatePayload;

    public InstanceImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Instance create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInstances()
                .create(resourceGroupName, accountName, instanceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Instance create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInstances()
                .create(resourceGroupName, accountName, instanceName, this.innerModel(), context);
        return this;
    }

    InstanceImpl(String name, com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager) {
        this.innerObject = new InstanceInner();
        this.serviceManager = serviceManager;
        this.instanceName = name;
    }

    public InstanceImpl update() {
        this.updateTagUpdatePayload = new TagUpdate();
        return this;
    }

    public Instance apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInstances()
                .updateWithResponse(resourceGroupName, accountName, instanceName, updateTagUpdatePayload, Context.NONE)
                .getValue();
        return this;
    }

    public Instance apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInstances()
                .updateWithResponse(resourceGroupName, accountName, instanceName, updateTagUpdatePayload, context)
                .getValue();
        return this;
    }

    InstanceImpl(InstanceInner innerObject, com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
        this.instanceName = Utils.getValueFromIdByName(innerObject.id(), "instances");
    }

    public Instance refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInstances()
                .getWithResponse(resourceGroupName, accountName, instanceName, Context.NONE)
                .getValue();
        return this;
    }

    public Instance refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInstances()
                .getWithResponse(resourceGroupName, accountName, instanceName, context)
                .getValue();
        return this;
    }

    public InstanceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public InstanceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public InstanceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateTagUpdatePayload.withTags(tags);
            return this;
        }
    }

    public InstanceImpl withIotHubs(List<IotHubSettings> iotHubs) {
        this.innerModel().withIotHubs(iotHubs);
        return this;
    }

    public InstanceImpl withEnableDiagnostics(Boolean enableDiagnostics) {
        this.innerModel().withEnableDiagnostics(enableDiagnostics);
        return this;
    }

    public InstanceImpl withDiagnosticStorageProperties(DiagnosticStorageProperties diagnosticStorageProperties) {
        this.innerModel().withDiagnosticStorageProperties(diagnosticStorageProperties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
