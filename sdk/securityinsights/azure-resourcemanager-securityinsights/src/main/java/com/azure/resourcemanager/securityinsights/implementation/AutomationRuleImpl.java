// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.AutomationRuleInner;
import com.azure.resourcemanager.securityinsights.models.AutomationRule;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleAction;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleTriggeringLogic;
import com.azure.resourcemanager.securityinsights.models.ClientInfo;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class AutomationRuleImpl implements AutomationRule, AutomationRule.Definition, AutomationRule.Update {
    private AutomationRuleInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public int order() {
        return this.innerModel().order();
    }

    public AutomationRuleTriggeringLogic triggeringLogic() {
        return this.innerModel().triggeringLogic();
    }

    public List<AutomationRuleAction> actions() {
        List<AutomationRuleAction> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerModel().lastModifiedTimeUtc();
    }

    public OffsetDateTime createdTimeUtc() {
        return this.innerModel().createdTimeUtc();
    }

    public ClientInfo lastModifiedBy() {
        return this.innerModel().lastModifiedBy();
    }

    public ClientInfo createdBy() {
        return this.innerModel().createdBy();
    }

    public AutomationRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String automationRuleId;

    public AutomationRuleImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public AutomationRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, automationRuleId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AutomationRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, automationRuleId, this.innerModel(), context)
                .getValue();
        return this;
    }

    AutomationRuleImpl(String name, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = new AutomationRuleInner();
        this.serviceManager = serviceManager;
        this.automationRuleId = name;
    }

    public AutomationRuleImpl update() {
        return this;
    }

    public AutomationRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, automationRuleId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AutomationRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, automationRuleId, this.innerModel(), context)
                .getValue();
        return this;
    }

    AutomationRuleImpl(
        AutomationRuleInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.automationRuleId = Utils.getValueFromIdByName(innerObject.id(), "automationRules");
    }

    public AutomationRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationRules()
                .getWithResponse(resourceGroupName, workspaceName, automationRuleId, Context.NONE)
                .getValue();
        return this;
    }

    public AutomationRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationRules()
                .getWithResponse(resourceGroupName, workspaceName, automationRuleId, context)
                .getValue();
        return this;
    }

    public AutomationRuleImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public AutomationRuleImpl withOrder(int order) {
        this.innerModel().withOrder(order);
        return this;
    }

    public AutomationRuleImpl withTriggeringLogic(AutomationRuleTriggeringLogic triggeringLogic) {
        this.innerModel().withTriggeringLogic(triggeringLogic);
        return this;
    }

    public AutomationRuleImpl withActions(List<AutomationRuleAction> actions) {
        this.innerModel().withActions(actions);
        return this;
    }

    public AutomationRuleImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
