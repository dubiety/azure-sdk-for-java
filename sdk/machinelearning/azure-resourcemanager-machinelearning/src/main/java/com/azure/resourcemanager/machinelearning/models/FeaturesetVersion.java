// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturesetVersionInner;

/**
 * An immutable client-side representation of FeaturesetVersion.
 */
public interface FeaturesetVersion {
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
    FeaturesetVersionProperties properties();

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
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.FeaturesetVersionInner object.
     * 
     * @return the inner object.
     */
    FeaturesetVersionInner innerModel();

    /**
     * The entirety of the FeaturesetVersion definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The FeaturesetVersion definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FeaturesetVersion definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the FeaturesetVersion definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, name.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @param name Container name. This is case-sensitive.
             * @return the next definition stage.
             */
            WithProperties withExistingFeatureset(String resourceGroupName, String workspaceName, String name);
        }

        /**
         * The stage of the FeaturesetVersion definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             * 
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            WithCreate withProperties(FeaturesetVersionProperties properties);
        }

        /**
         * The stage of the FeaturesetVersion definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FeaturesetVersion create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FeaturesetVersion create(Context context);
        }
    }

    /**
     * Begins update for the FeaturesetVersion resource.
     * 
     * @return the stage of resource update.
     */
    FeaturesetVersion.Update update();

    /**
     * The template for FeaturesetVersion update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        FeaturesetVersion apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FeaturesetVersion apply(Context context);
    }

    /**
     * The FeaturesetVersion update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the FeaturesetVersion update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             * 
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            Update withProperties(FeaturesetVersionProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FeaturesetVersion refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FeaturesetVersion refresh(Context context);

    /**
     * Backfill.
     * 
     * @param body Feature set version backfill request entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response payload for creating a backfill request for a given feature set version.
     */
    FeaturesetVersionBackfillResponse backfill(FeaturesetVersionBackfillRequest body);

    /**
     * Backfill.
     * 
     * @param body Feature set version backfill request entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response payload for creating a backfill request for a given feature set version.
     */
    FeaturesetVersionBackfillResponse backfill(FeaturesetVersionBackfillRequest body, Context context);
}
