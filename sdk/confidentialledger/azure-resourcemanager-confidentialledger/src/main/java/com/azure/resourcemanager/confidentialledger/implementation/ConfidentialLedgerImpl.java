// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerInner;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedger;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import java.util.Collections;
import java.util.Map;

public final class ConfidentialLedgerImpl
    implements ConfidentialLedger, ConfidentialLedger.Definition, ConfidentialLedger.Update {
    private ConfidentialLedgerInner innerObject;

    private final com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public LedgerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
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

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ConfidentialLedgerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ledgerName;

    public ConfidentialLedgerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ConfidentialLedger create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLedgers()
                .create(resourceGroupName, ledgerName, this.innerModel(), Context.NONE);
        return this;
    }

    public ConfidentialLedger create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLedgers()
                .create(resourceGroupName, ledgerName, this.innerModel(), context);
        return this;
    }

    ConfidentialLedgerImpl(
        String name, com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager) {
        this.innerObject = new ConfidentialLedgerInner();
        this.serviceManager = serviceManager;
        this.ledgerName = name;
    }

    public ConfidentialLedgerImpl update() {
        return this;
    }

    public ConfidentialLedger apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLedgers()
                .update(resourceGroupName, ledgerName, this.innerModel(), Context.NONE);
        return this;
    }

    public ConfidentialLedger apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLedgers()
                .update(resourceGroupName, ledgerName, this.innerModel(), context);
        return this;
    }

    ConfidentialLedgerImpl(
        ConfidentialLedgerInner innerObject,
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.ledgerName = Utils.getValueFromIdByName(innerObject.id(), "ledgers");
    }

    public ConfidentialLedger refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLedgers()
                .getByResourceGroupWithResponse(resourceGroupName, ledgerName, Context.NONE)
                .getValue();
        return this;
    }

    public ConfidentialLedger refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLedgers()
                .getByResourceGroupWithResponse(resourceGroupName, ledgerName, context)
                .getValue();
        return this;
    }

    public ConfidentialLedgerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ConfidentialLedgerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ConfidentialLedgerImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ConfidentialLedgerImpl withProperties(LedgerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
