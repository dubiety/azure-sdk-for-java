// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagemover.fluent.models.AgentInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Agent. */
public interface Agent {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Resource system metadata.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: A description for the Agent.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the agentVersion property: The Agent version.
     *
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * Gets the arcResourceId property: The fully qualified resource ID of the Hybrid Compute resource for the Agent.
     *
     * @return the arcResourceId value.
     */
    String arcResourceId();

    /**
     * Gets the arcVmUuid property: The VM UUID of the Hybrid Compute resource for the Agent.
     *
     * @return the arcVmUuid value.
     */
    String arcVmUuid();

    /**
     * Gets the agentStatus property: The Agent status.
     *
     * @return the agentStatus value.
     */
    AgentStatus agentStatus();

    /**
     * Gets the lastStatusUpdate property: The last updated time of the Agent status.
     *
     * @return the lastStatusUpdate value.
     */
    OffsetDateTime lastStatusUpdate();

    /**
     * Gets the localIpAddress property: Local IP address reported by the Agent.
     *
     * @return the localIpAddress value.
     */
    String localIpAddress();

    /**
     * Gets the memoryInMB property: Available memory reported by the Agent, in MB.
     *
     * @return the memoryInMB value.
     */
    Long memoryInMB();

    /**
     * Gets the numberOfCores property: Available compute cores reported by the Agent.
     *
     * @return the numberOfCores value.
     */
    Long numberOfCores();

    /**
     * Gets the uptimeInSeconds property: Uptime of the Agent in seconds.
     *
     * @return the uptimeInSeconds value.
     */
    Long uptimeInSeconds();

    /**
     * Gets the errorDetails property: The errorDetails property.
     *
     * @return the errorDetails value.
     */
    AgentPropertiesErrorDetails errorDetails();

    /**
     * Gets the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storagemover.fluent.models.AgentInner object.
     *
     * @return the inner object.
     */
    AgentInner innerModel();

    /** The entirety of the Agent definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithArcResourceId,
            DefinitionStages.WithArcVmUuid,
            DefinitionStages.WithCreate {
    }
    /** The Agent definition stages. */
    interface DefinitionStages {
        /** The first stage of the Agent definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Agent definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, storageMoverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param storageMoverName The name of the Storage Mover resource.
             * @return the next definition stage.
             */
            WithArcResourceId withExistingStorageMover(String resourceGroupName, String storageMoverName);
        }
        /** The stage of the Agent definition allowing to specify arcResourceId. */
        interface WithArcResourceId {
            /**
             * Specifies the arcResourceId property: The fully qualified resource ID of the Hybrid Compute resource for
             * the Agent..
             *
             * @param arcResourceId The fully qualified resource ID of the Hybrid Compute resource for the Agent.
             * @return the next definition stage.
             */
            WithArcVmUuid withArcResourceId(String arcResourceId);
        }
        /** The stage of the Agent definition allowing to specify arcVmUuid. */
        interface WithArcVmUuid {
            /**
             * Specifies the arcVmUuid property: The VM UUID of the Hybrid Compute resource for the Agent..
             *
             * @param arcVmUuid The VM UUID of the Hybrid Compute resource for the Agent.
             * @return the next definition stage.
             */
            WithCreate withArcVmUuid(String arcVmUuid);
        }
        /**
         * The stage of the Agent definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Agent create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Agent create(Context context);
        }
        /** The stage of the Agent definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the Agent..
             *
             * @param description A description for the Agent.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }
    /**
     * Begins update for the Agent resource.
     *
     * @return the stage of resource update.
     */
    Agent.Update update();

    /** The template for Agent update. */
    interface Update extends UpdateStages.WithDescription {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Agent apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Agent apply(Context context);
    }
    /** The Agent update stages. */
    interface UpdateStages {
        /** The stage of the Agent update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the Agent..
             *
             * @param description A description for the Agent.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Agent refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Agent refresh(Context context);
}
