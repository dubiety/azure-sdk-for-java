// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.ModelContainerInner;
import com.azure.resourcemanager.machinelearning.models.ModelContainer;
import com.azure.resourcemanager.machinelearning.models.ModelContainerProperties;

public final class ModelContainerImpl implements ModelContainer, ModelContainer.Definition, ModelContainer.Update {
    private ModelContainerInner innerObject;

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

    public ModelContainerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ModelContainerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    public ModelContainerImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public ModelContainer create() {
        this.innerObject = serviceManager.serviceClient()
            .getModelContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public ModelContainer create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getModelContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    ModelContainerImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new ModelContainerInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ModelContainerImpl update() {
        return this;
    }

    public ModelContainer apply() {
        this.innerObject = serviceManager.serviceClient()
            .getModelContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public ModelContainer apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getModelContainers()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    ModelContainerImpl(ModelContainerInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "models");
    }

    public ModelContainer refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getModelContainers()
            .getWithResponse(resourceGroupName, workspaceName, name, Context.NONE)
            .getValue();
        return this;
    }

    public ModelContainer refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getModelContainers()
            .getWithResponse(resourceGroupName, workspaceName, name, context)
            .getValue();
        return this;
    }

    public ModelContainerImpl withProperties(ModelContainerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
