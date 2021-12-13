// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Work item configuration creation payload. */
@Fluent
public final class WorkItemCreateConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkItemCreateConfiguration.class);

    /*
     * Unique connector id
     */
    @JsonProperty(value = "ConnectorId")
    private String connectorId;

    /*
     * Serialized JSON object for detailed properties
     */
    @JsonProperty(value = "ConnectorDataConfiguration")
    private String connectorDataConfiguration;

    /*
     * Boolean indicating validate only
     */
    @JsonProperty(value = "ValidateOnly")
    private Boolean validateOnly;

    /*
     * Custom work item properties
     */
    @JsonProperty(value = "WorkItemProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> workItemProperties;

    /**
     * Get the connectorId property: Unique connector id.
     *
     * @return the connectorId value.
     */
    public String connectorId() {
        return this.connectorId;
    }

    /**
     * Set the connectorId property: Unique connector id.
     *
     * @param connectorId the connectorId value to set.
     * @return the WorkItemCreateConfiguration object itself.
     */
    public WorkItemCreateConfiguration withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * Get the connectorDataConfiguration property: Serialized JSON object for detailed properties.
     *
     * @return the connectorDataConfiguration value.
     */
    public String connectorDataConfiguration() {
        return this.connectorDataConfiguration;
    }

    /**
     * Set the connectorDataConfiguration property: Serialized JSON object for detailed properties.
     *
     * @param connectorDataConfiguration the connectorDataConfiguration value to set.
     * @return the WorkItemCreateConfiguration object itself.
     */
    public WorkItemCreateConfiguration withConnectorDataConfiguration(String connectorDataConfiguration) {
        this.connectorDataConfiguration = connectorDataConfiguration;
        return this;
    }

    /**
     * Get the validateOnly property: Boolean indicating validate only.
     *
     * @return the validateOnly value.
     */
    public Boolean validateOnly() {
        return this.validateOnly;
    }

    /**
     * Set the validateOnly property: Boolean indicating validate only.
     *
     * @param validateOnly the validateOnly value to set.
     * @return the WorkItemCreateConfiguration object itself.
     */
    public WorkItemCreateConfiguration withValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }

    /**
     * Get the workItemProperties property: Custom work item properties.
     *
     * @return the workItemProperties value.
     */
    public Map<String, String> workItemProperties() {
        return this.workItemProperties;
    }

    /**
     * Set the workItemProperties property: Custom work item properties.
     *
     * @param workItemProperties the workItemProperties value to set.
     * @return the WorkItemCreateConfiguration object itself.
     */
    public WorkItemCreateConfiguration withWorkItemProperties(Map<String, String> workItemProperties) {
        this.workItemProperties = workItemProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
