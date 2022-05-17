// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainInner;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.Domain;
import com.azure.resourcemanager.eventgrid.models.DomainProvisioningState;
import com.azure.resourcemanager.eventgrid.models.DomainRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.models.DomainSharedAccessKeys;
import com.azure.resourcemanager.eventgrid.models.DomainUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InputSchema;
import com.azure.resourcemanager.eventgrid.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.ResourceSku;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class DomainImpl implements Domain, Domain.Definition, Domain.Update {
    private DomainInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

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

    public ResourceSku sku() {
        return this.innerModel().sku();
    }

    public IdentityInfo identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public DomainProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public InputSchema inputSchema() {
        return this.innerModel().inputSchema();
    }

    public InputSchemaMapping inputSchemaMapping() {
        return this.innerModel().inputSchemaMapping();
    }

    public String metricResourceId() {
        return this.innerModel().metricResourceId();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<InboundIpRule> inboundIpRules() {
        List<InboundIpRule> inner = this.innerModel().inboundIpRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean disableLocalAuth() {
        return this.innerModel().disableLocalAuth();
    }

    public Boolean autoCreateTopicWithFirstSubscription() {
        return this.innerModel().autoCreateTopicWithFirstSubscription();
    }

    public Boolean autoDeleteTopicWithLastSubscription() {
        return this.innerModel().autoDeleteTopicWithLastSubscription();
    }

    public DataResidencyBoundary dataResidencyBoundary() {
        return this.innerModel().dataResidencyBoundary();
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

    public DomainInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String domainName;

    private DomainUpdateParameters updateDomainUpdateParameters;

    public DomainImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Domain create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDomains()
                .createOrUpdate(resourceGroupName, domainName, this.innerModel(), Context.NONE);
        return this;
    }

    public Domain create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDomains()
                .createOrUpdate(resourceGroupName, domainName, this.innerModel(), context);
        return this;
    }

    DomainImpl(String name, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = new DomainInner();
        this.serviceManager = serviceManager;
        this.domainName = name;
    }

    public DomainImpl update() {
        this.updateDomainUpdateParameters = new DomainUpdateParameters();
        return this;
    }

    public Domain apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDomains()
                .update(resourceGroupName, domainName, updateDomainUpdateParameters, Context.NONE);
        return this;
    }

    public Domain apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDomains()
                .update(resourceGroupName, domainName, updateDomainUpdateParameters, context);
        return this;
    }

    DomainImpl(DomainInner innerObject, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.domainName = Utils.getValueFromIdByName(innerObject.id(), "domains");
    }

    public Domain refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDomains()
                .getByResourceGroupWithResponse(resourceGroupName, domainName, Context.NONE)
                .getValue();
        return this;
    }

    public Domain refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDomains()
                .getByResourceGroupWithResponse(resourceGroupName, domainName, context)
                .getValue();
        return this;
    }

    public DomainSharedAccessKeys listSharedAccessKeys() {
        return serviceManager.domains().listSharedAccessKeys(resourceGroupName, domainName);
    }

    public Response<DomainSharedAccessKeys> listSharedAccessKeysWithResponse(Context context) {
        return serviceManager.domains().listSharedAccessKeysWithResponse(resourceGroupName, domainName, context);
    }

    public DomainSharedAccessKeys regenerateKey(DomainRegenerateKeyRequest regenerateKeyRequest) {
        return serviceManager.domains().regenerateKey(resourceGroupName, domainName, regenerateKeyRequest);
    }

    public Response<DomainSharedAccessKeys> regenerateKeyWithResponse(
        DomainRegenerateKeyRequest regenerateKeyRequest, Context context) {
        return serviceManager
            .domains()
            .regenerateKeyWithResponse(resourceGroupName, domainName, regenerateKeyRequest, context);
    }

    public DomainImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DomainImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DomainImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDomainUpdateParameters.withTags(tags);
            return this;
        }
    }

    public DomainImpl withSku(ResourceSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateDomainUpdateParameters.withSku(sku);
            return this;
        }
    }

    public DomainImpl withIdentity(IdentityInfo identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateDomainUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public DomainImpl withInputSchema(InputSchema inputSchema) {
        this.innerModel().withInputSchema(inputSchema);
        return this;
    }

    public DomainImpl withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.innerModel().withInputSchemaMapping(inputSchemaMapping);
        return this;
    }

    public DomainImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateDomainUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public DomainImpl withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (isInCreateMode()) {
            this.innerModel().withInboundIpRules(inboundIpRules);
            return this;
        } else {
            this.updateDomainUpdateParameters.withInboundIpRules(inboundIpRules);
            return this;
        }
    }

    public DomainImpl withDisableLocalAuth(Boolean disableLocalAuth) {
        if (isInCreateMode()) {
            this.innerModel().withDisableLocalAuth(disableLocalAuth);
            return this;
        } else {
            this.updateDomainUpdateParameters.withDisableLocalAuth(disableLocalAuth);
            return this;
        }
    }

    public DomainImpl withAutoCreateTopicWithFirstSubscription(Boolean autoCreateTopicWithFirstSubscription) {
        if (isInCreateMode()) {
            this.innerModel().withAutoCreateTopicWithFirstSubscription(autoCreateTopicWithFirstSubscription);
            return this;
        } else {
            this
                .updateDomainUpdateParameters
                .withAutoCreateTopicWithFirstSubscription(autoCreateTopicWithFirstSubscription);
            return this;
        }
    }

    public DomainImpl withAutoDeleteTopicWithLastSubscription(Boolean autoDeleteTopicWithLastSubscription) {
        if (isInCreateMode()) {
            this.innerModel().withAutoDeleteTopicWithLastSubscription(autoDeleteTopicWithLastSubscription);
            return this;
        } else {
            this
                .updateDomainUpdateParameters
                .withAutoDeleteTopicWithLastSubscription(autoDeleteTopicWithLastSubscription);
            return this;
        }
    }

    public DomainImpl withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary) {
        if (isInCreateMode()) {
            this.innerModel().withDataResidencyBoundary(dataResidencyBoundary);
            return this;
        } else {
            this.updateDomainUpdateParameters.withDataResidencyBoundary(dataResidencyBoundary);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
