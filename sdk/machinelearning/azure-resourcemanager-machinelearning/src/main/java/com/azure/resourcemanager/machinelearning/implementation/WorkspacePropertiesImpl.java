// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.ManagedNetworkSettingsInner;
import com.azure.resourcemanager.machinelearning.fluent.models.NotebookResourceInfoInner;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspacePropertiesInner;
import com.azure.resourcemanager.machinelearning.models.EncryptionProperty;
import com.azure.resourcemanager.machinelearning.models.FeatureStoreSettings;
import com.azure.resourcemanager.machinelearning.models.ManagedNetworkSettings;
import com.azure.resourcemanager.machinelearning.models.NotebookResourceInfo;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointConnection;
import com.azure.resourcemanager.machinelearning.models.ProvisioningState;
import com.azure.resourcemanager.machinelearning.models.PublicNetworkAccess;
import com.azure.resourcemanager.machinelearning.models.ServerlessComputeSettings;
import com.azure.resourcemanager.machinelearning.models.ServiceManagedResourcesSettings;
import com.azure.resourcemanager.machinelearning.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.machinelearning.models.WorkspaceHubConfig;
import com.azure.resourcemanager.machinelearning.models.WorkspaceProperties;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class WorkspacePropertiesImpl implements WorkspaceProperties {
    private WorkspacePropertiesInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    WorkspacePropertiesImpl(WorkspacePropertiesInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String keyVault() {
        return this.innerModel().keyVault();
    }

    public String applicationInsights() {
        return this.innerModel().applicationInsights();
    }

    public String containerRegistry() {
        return this.innerModel().containerRegistry();
    }

    public String storageAccount() {
        return this.innerModel().storageAccount();
    }

    public String discoveryUrl() {
        return this.innerModel().discoveryUrl();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public EncryptionProperty encryption() {
        return this.innerModel().encryption();
    }

    public Boolean hbiWorkspace() {
        return this.innerModel().hbiWorkspace();
    }

    public String serviceProvisionedResourceGroup() {
        return this.innerModel().serviceProvisionedResourceGroup();
    }

    public Integer privateLinkCount() {
        return this.innerModel().privateLinkCount();
    }

    public String imageBuildCompute() {
        return this.innerModel().imageBuildCompute();
    }

    public Boolean allowPublicAccessWhenBehindVnet() {
        return this.innerModel().allowPublicAccessWhenBehindVnet();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ServerlessComputeSettings serverlessComputeSettings() {
        return this.innerModel().serverlessComputeSettings();
    }

    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        List<SharedPrivateLinkResource> inner = this.innerModel().sharedPrivateLinkResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NotebookResourceInfo notebookInfo() {
        NotebookResourceInfoInner inner = this.innerModel().notebookInfo();
        if (inner != null) {
            return new NotebookResourceInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServiceManagedResourcesSettings serviceManagedResourcesSettings() {
        return this.innerModel().serviceManagedResourcesSettings();
    }

    public String primaryUserAssignedIdentity() {
        return this.innerModel().primaryUserAssignedIdentity();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public Boolean storageHnsEnabled() {
        return this.innerModel().storageHnsEnabled();
    }

    public String mlFlowTrackingUri() {
        return this.innerModel().mlFlowTrackingUri();
    }

    public Boolean v1LegacyMode() {
        return this.innerModel().v1LegacyMode();
    }

    public ManagedNetworkSettings managedNetwork() {
        ManagedNetworkSettingsInner inner = this.innerModel().managedNetwork();
        if (inner != null) {
            return new ManagedNetworkSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FeatureStoreSettings featureStoreSettings() {
        return this.innerModel().featureStoreSettings();
    }

    public List<String> associatedWorkspaces() {
        List<String> inner = this.innerModel().associatedWorkspaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableDataIsolation() {
        return this.innerModel().enableDataIsolation();
    }

    public String hubResourceId() {
        return this.innerModel().hubResourceId();
    }

    public WorkspaceHubConfig workspaceHubConfig() {
        return this.innerModel().workspaceHubConfig();
    }

    public WorkspacePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}
