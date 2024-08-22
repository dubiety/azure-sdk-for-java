// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentVersionInner;
import com.azure.resourcemanager.machinelearning.models.DestinationAsset;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersion;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersionProperties;

public final class EnvironmentVersionImpl
    implements EnvironmentVersion, EnvironmentVersion.Definition, EnvironmentVersion.Update {
    private EnvironmentVersionInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public EnvironmentVersionProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public EnvironmentVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    private String version;

    public EnvironmentVersionImpl withExistingEnvironment(String resourceGroupName, String workspaceName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.name = name;
        return this;
    }

    public EnvironmentVersion create() {
        this.innerObject = serviceManager.serviceClient()
            .getEnvironmentVersions()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public EnvironmentVersion create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getEnvironmentVersions()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
            .getValue();
        return this;
    }

    EnvironmentVersionImpl(String name,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new EnvironmentVersionInner();
        this.serviceManager = serviceManager;
        this.version = name;
    }

    public EnvironmentVersionImpl update() {
        return this;
    }

    public EnvironmentVersion apply() {
        this.innerObject = serviceManager.serviceClient()
            .getEnvironmentVersions()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public EnvironmentVersion apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getEnvironmentVersions()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
            .getValue();
        return this;
    }

    EnvironmentVersionImpl(EnvironmentVersionInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "environments");
        this.version = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "versions");
    }

    public EnvironmentVersion refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getEnvironmentVersions()
            .getWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE)
            .getValue();
        return this;
    }

    public EnvironmentVersion refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getEnvironmentVersions()
            .getWithResponse(resourceGroupName, workspaceName, name, version, context)
            .getValue();
        return this;
    }

    public void publish(DestinationAsset body) {
        serviceManager.environmentVersions().publish(resourceGroupName, workspaceName, name, version, body);
    }

    public void publish(DestinationAsset body, Context context) {
        serviceManager.environmentVersions().publish(resourceGroupName, workspaceName, name, version, body, context);
    }

    public EnvironmentVersionImpl withProperties(EnvironmentVersionProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
