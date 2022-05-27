// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.JobBaseDataInner;
import com.azure.resourcemanager.machinelearning.models.JobBaseData;
import com.azure.resourcemanager.machinelearning.models.JobBaseDetails;

public final class JobBaseDataImpl implements JobBaseData, JobBaseData.Definition, JobBaseData.Update {
    private JobBaseDataInner innerObject;

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

    public JobBaseDetails properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public JobBaseDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String id;

    public JobBaseDataImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public JobBaseData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobBaseData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobBaseDataImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new JobBaseDataInner();
        this.serviceManager = serviceManager;
        this.id = name;
    }

    public JobBaseDataImpl update() {
        return this;
    }

    public JobBaseData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobBaseData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobBaseDataImpl(
        JobBaseDataInner innerObject, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.id = Utils.getValueFromIdByName(innerObject.id(), "jobs");
    }

    public JobBaseData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getWithResponse(resourceGroupName, workspaceName, id, Context.NONE)
                .getValue();
        return this;
    }

    public JobBaseData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getWithResponse(resourceGroupName, workspaceName, id, context)
                .getValue();
        return this;
    }

    public void cancel() {
        serviceManager.jobs().cancel(resourceGroupName, workspaceName, id);
    }

    public Response<Void> cancelWithResponse(Context context) {
        return serviceManager.jobs().cancelWithResponse(resourceGroupName, workspaceName, id, context);
    }

    public JobBaseDataImpl withProperties(JobBaseDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
