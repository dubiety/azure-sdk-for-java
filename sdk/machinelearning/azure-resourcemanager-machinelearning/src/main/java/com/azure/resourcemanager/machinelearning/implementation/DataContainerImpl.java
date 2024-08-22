// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.DataContainerInner;
import com.azure.resourcemanager.machinelearning.models.DataContainer;
import com.azure.resourcemanager.machinelearning.models.DataContainerProperties;

public final class DataContainerImpl implements DataContainer, DataContainer.Definition, DataContainer.Update {
    private DataContainerInner innerObject;

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

    public DataContainerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DataContainerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    public DataContainerImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public DataContainer create() {
        this.innerObject = serviceManager.serviceClient()
            .getDataContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public DataContainer create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDataContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    DataContainerImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new DataContainerInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DataContainerImpl update() {
        return this;
    }

    public DataContainer apply() {
        this.innerObject = serviceManager.serviceClient()
            .getDataContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public DataContainer apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDataContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    DataContainerImpl(DataContainerInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "data");
    }

    public DataContainer refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getDataContainers()
            .getWithResponse(resourceGroupName, workspaceName, name, Context.NONE)
            .getValue();
        return this;
    }

    public DataContainer refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDataContainers()
            .getWithResponse(resourceGroupName, workspaceName, name, context)
            .getValue();
        return this;
    }

    public DataContainerImpl withProperties(DataContainerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
