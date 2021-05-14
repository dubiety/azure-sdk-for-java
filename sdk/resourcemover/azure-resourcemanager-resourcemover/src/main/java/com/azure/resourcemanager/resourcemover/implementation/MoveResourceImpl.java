// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcemover.fluent.models.MoveResourceInner;
import com.azure.resourcemanager.resourcemover.models.MoveResource;
import com.azure.resourcemanager.resourcemover.models.MoveResourceProperties;

public final class MoveResourceImpl implements MoveResource, MoveResource.Definition {
    private MoveResourceInner innerObject;

    private final com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager;

    MoveResourceImpl(
        MoveResourceInner innerObject, com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager) {
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

    public MoveResourceProperties properties() {
        return this.innerModel().properties();
    }

    public MoveResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resourcemover.ResourceMoverManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String moveCollectionName;

    private String moveResourceName;

    public MoveResourceImpl withExistingMoveCollection(String resourceGroupName, String moveCollectionName) {
        this.resourceGroupName = resourceGroupName;
        this.moveCollectionName = moveCollectionName;
        return this;
    }

    public MoveResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveResources()
                .create(resourceGroupName, moveCollectionName, moveResourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public MoveResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveResources()
                .create(resourceGroupName, moveCollectionName, moveResourceName, this.innerModel(), context);
        return this;
    }

    MoveResourceImpl(String name, com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager) {
        this.innerObject = new MoveResourceInner();
        this.serviceManager = serviceManager;
        this.moveResourceName = name;
    }

    public MoveResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveResources()
                .getWithResponse(resourceGroupName, moveCollectionName, moveResourceName, Context.NONE)
                .getValue();
        return this;
    }

    public MoveResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveResources()
                .getWithResponse(resourceGroupName, moveCollectionName, moveResourceName, context)
                .getValue();
        return this;
    }

    public MoveResourceImpl withProperties(MoveResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
