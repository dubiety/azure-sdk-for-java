// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturestoreEntityContainerInner;

/**
 * An immutable client-side representation of FeaturestoreEntityContainer.
 */
public interface FeaturestoreEntityContainer {
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
     * Gets the properties property: [Required] Additional attributes of the entity.
     * 
     * @return the properties value.
     */
    FeaturestoreEntityContainerProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.FeaturestoreEntityContainerInner object.
     * 
     * @return the inner object.
     */
    FeaturestoreEntityContainerInner innerModel();

    /**
     * The entirety of the FeaturestoreEntityContainer definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The FeaturestoreEntityContainer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FeaturestoreEntityContainer definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the FeaturestoreEntityContainer definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the FeaturestoreEntityContainer definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             * 
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            WithCreate withProperties(FeaturestoreEntityContainerProperties properties);
        }

        /**
         * The stage of the FeaturestoreEntityContainer definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FeaturestoreEntityContainer create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FeaturestoreEntityContainer create(Context context);
        }
    }

    /**
     * Begins update for the FeaturestoreEntityContainer resource.
     * 
     * @return the stage of resource update.
     */
    FeaturestoreEntityContainer.Update update();

    /**
     * The template for FeaturestoreEntityContainer update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        FeaturestoreEntityContainer apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FeaturestoreEntityContainer apply(Context context);
    }

    /**
     * The FeaturestoreEntityContainer update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the FeaturestoreEntityContainer update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             * 
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            Update withProperties(FeaturestoreEntityContainerProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FeaturestoreEntityContainer refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FeaturestoreEntityContainer refresh(Context context);
}
