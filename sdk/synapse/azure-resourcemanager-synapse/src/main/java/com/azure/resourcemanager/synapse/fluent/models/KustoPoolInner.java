// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.LanguageExtensionsList;
import com.azure.resourcemanager.synapse.models.OptimizedAutoscale;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.azure.resourcemanager.synapse.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Class representing a Kusto kusto pool. */
@Fluent
public final class KustoPoolInner extends Resource {
    /*
     * The SKU of the kusto pool.
     */
    @JsonProperty(value = "sku", required = true)
    private AzureSku sku;

    /*
     * The kusto pool properties.
     */
    @JsonProperty(value = "properties")
    private KustoPoolProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the sku property: The SKU of the kusto pool.
     *
     * @return the sku value.
     */
    public AzureSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the kusto pool.
     *
     * @param sku the sku value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withSku(AzureSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: The kusto pool properties.
     *
     * @return the innerProperties value.
     */
    private KustoPoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public KustoPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KustoPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the state property: The state of the resource.
     *
     * @return the state value.
     */
    public State state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the uri property: The Kusto Pool URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.innerProperties() == null ? null : this.innerProperties().uri();
    }

    /**
     * Get the dataIngestionUri property: The Kusto Pool data ingestion URI.
     *
     * @return the dataIngestionUri value.
     */
    public String dataIngestionUri() {
        return this.innerProperties() == null ? null : this.innerProperties().dataIngestionUri();
    }

    /**
     * Get the stateReason property: The reason for the Kusto Pool's current state.
     *
     * @return the stateReason value.
     */
    public String stateReason() {
        return this.innerProperties() == null ? null : this.innerProperties().stateReason();
    }

    /**
     * Get the optimizedAutoscale property: Optimized auto scale definition.
     *
     * @return the optimizedAutoscale value.
     */
    public OptimizedAutoscale optimizedAutoscale() {
        return this.innerProperties() == null ? null : this.innerProperties().optimizedAutoscale();
    }

    /**
     * Set the optimizedAutoscale property: Optimized auto scale definition.
     *
     * @param optimizedAutoscale the optimizedAutoscale value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KustoPoolProperties();
        }
        this.innerProperties().withOptimizedAutoscale(optimizedAutoscale);
        return this;
    }

    /**
     * Get the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     *
     * @return the enableStreamingIngest value.
     */
    public Boolean enableStreamingIngest() {
        return this.innerProperties() == null ? null : this.innerProperties().enableStreamingIngest();
    }

    /**
     * Set the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     *
     * @param enableStreamingIngest the enableStreamingIngest value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withEnableStreamingIngest(Boolean enableStreamingIngest) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KustoPoolProperties();
        }
        this.innerProperties().withEnableStreamingIngest(enableStreamingIngest);
        return this;
    }

    /**
     * Get the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     *
     * @return the enablePurge value.
     */
    public Boolean enablePurge() {
        return this.innerProperties() == null ? null : this.innerProperties().enablePurge();
    }

    /**
     * Set the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     *
     * @param enablePurge the enablePurge value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withEnablePurge(Boolean enablePurge) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KustoPoolProperties();
        }
        this.innerProperties().withEnablePurge(enablePurge);
        return this;
    }

    /**
     * Get the languageExtensions property: List of the Kusto Pool's language extensions.
     *
     * @return the languageExtensions value.
     */
    public LanguageExtensionsList languageExtensions() {
        return this.innerProperties() == null ? null : this.innerProperties().languageExtensions();
    }

    /**
     * Get the workspaceUid property: The workspace unique identifier.
     *
     * @return the workspaceUid value.
     */
    public String workspaceUid() {
        return this.innerProperties() == null ? null : this.innerProperties().workspaceUid();
    }

    /**
     * Set the workspaceUid property: The workspace unique identifier.
     *
     * @param workspaceUid the workspaceUid value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withWorkspaceUid(String workspaceUid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KustoPoolProperties();
        }
        this.innerProperties().withWorkspaceUid(workspaceUid);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model KustoPoolInner"));
        } else {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KustoPoolInner.class);
}
