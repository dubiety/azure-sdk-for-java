// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentInner;
import java.util.Map;

/**
 * An immutable client-side representation of BatchDeployment.
 */
public interface BatchDeployment {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: [Required] Additional attributes of the entity.
     * 
     * @return the properties value.
     */
    BatchDeploymentProperties properties();

    /**
     * Gets the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the sku property: Sku details required for ARM contract for Autoscaling.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentInner object.
     * 
     * @return the inner object.
     */
    BatchDeploymentInner innerModel();

    /**
     * The entirety of the BatchDeployment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The BatchDeployment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the BatchDeployment definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, endpointName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @param endpointName Inference endpoint name.
             * @return the next definition stage.
             */
            WithProperties withExistingBatchEndpoint(String resourceGroupName, String workspaceName,
                String endpointName);
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             * 
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            WithCreate withProperties(BatchDeploymentProperties properties);
        }

        /**
         * The stage of the BatchDeployment definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithKind,
            DefinitionStages.WithIdentity, DefinitionStages.WithSku {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            BatchDeployment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BatchDeployment create(Context context);
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Metadata used by portal/tooling/etc to render different UX experiences for
             * resources of the same type..
             * 
             * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the
             * same type.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity (system assigned and/or user assigned
             * identities).
             * 
             * @param identity Managed service identity (system assigned and/or user assigned identities).
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the BatchDeployment definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: Sku details required for ARM contract for Autoscaling..
             * 
             * @param sku Sku details required for ARM contract for Autoscaling.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
    }

    /**
     * Begins update for the BatchDeployment resource.
     * 
     * @return the stage of resource update.
     */
    BatchDeployment.Update update();

    /**
     * The template for BatchDeployment update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        BatchDeployment apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BatchDeployment apply(Context context);
    }

    /**
     * The BatchDeployment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the BatchDeployment update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the BatchDeployment update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Additional attributes of the entity..
             * 
             * @param properties Additional attributes of the entity.
             * @return the next definition stage.
             */
            Update withProperties(PartialBatchDeployment properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    BatchDeployment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BatchDeployment refresh(Context context);
}
