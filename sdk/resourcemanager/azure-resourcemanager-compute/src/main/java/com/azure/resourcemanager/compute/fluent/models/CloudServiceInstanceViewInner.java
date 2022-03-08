// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.InstanceViewStatusesSummary;
import com.azure.resourcemanager.compute.models.ResourceInstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** InstanceView of CloudService as a whole. */
@Fluent
public final class CloudServiceInstanceViewInner {
    /*
     * Instance view statuses.
     */
    @JsonProperty(value = "roleInstance")
    private InstanceViewStatusesSummary roleInstance;

    /*
     * The version of the SDK that was used to generate the package for the
     * cloud service.
     */
    @JsonProperty(value = "sdkVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sdkVersion;

    /*
     * Specifies a list of unique identifiers generated internally for the
     * cloud service. <br /><br /> NOTE: If you are using Azure Diagnostics
     * extension, this property can be used as 'DeploymentId' for querying
     * details.
     */
    @JsonProperty(value = "privateIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> privateIds;

    /*
     * The statuses property.
     */
    @JsonProperty(value = "statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceInstanceViewStatus> statuses;

    /**
     * Get the roleInstance property: Instance view statuses.
     *
     * @return the roleInstance value.
     */
    public InstanceViewStatusesSummary roleInstance() {
        return this.roleInstance;
    }

    /**
     * Set the roleInstance property: Instance view statuses.
     *
     * @param roleInstance the roleInstance value to set.
     * @return the CloudServiceInstanceViewInner object itself.
     */
    public CloudServiceInstanceViewInner withRoleInstance(InstanceViewStatusesSummary roleInstance) {
        this.roleInstance = roleInstance;
        return this;
    }

    /**
     * Get the sdkVersion property: The version of the SDK that was used to generate the package for the cloud service.
     *
     * @return the sdkVersion value.
     */
    public String sdkVersion() {
        return this.sdkVersion;
    }

    /**
     * Get the privateIds property: Specifies a list of unique identifiers generated internally for the cloud service.
     * &lt;br /&gt;&lt;br /&gt; NOTE: If you are using Azure Diagnostics extension, this property can be used as
     * 'DeploymentId' for querying details.
     *
     * @return the privateIds value.
     */
    public List<String> privateIds() {
        return this.privateIds;
    }

    /**
     * Get the statuses property: The statuses property.
     *
     * @return the statuses value.
     */
    public List<ResourceInstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleInstance() != null) {
            roleInstance().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
