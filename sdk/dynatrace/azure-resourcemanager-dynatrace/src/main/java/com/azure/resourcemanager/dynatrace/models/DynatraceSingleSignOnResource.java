// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dynatrace.fluent.models.DynatraceSingleSignOnResourceInner;
import java.util.List;

/** An immutable client-side representation of DynatraceSingleSignOnResource. */
public interface DynatraceSingleSignOnResource {
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
     * Gets the systemData property: System metadata for this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the singleSignOnState property: State of Single Sign On.
     *
     * @return the singleSignOnState value.
     */
    SingleSignOnStates singleSignOnState();

    /**
     * Gets the enterpriseAppId property: Version of the Dynatrace agent installed on the VM.
     *
     * @return the enterpriseAppId value.
     */
    String enterpriseAppId();

    /**
     * Gets the singleSignOnUrl property: The login URL specific to this Dynatrace Environment.
     *
     * @return the singleSignOnUrl value.
     */
    String singleSignOnUrl();

    /**
     * Gets the aadDomains property: array of Aad(azure active directory) domains.
     *
     * @return the aadDomains value.
     */
    List<String> aadDomains();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
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
     * Gets the inner com.azure.resourcemanager.dynatrace.fluent.models.DynatraceSingleSignOnResourceInner object.
     *
     * @return the inner object.
     */
    DynatraceSingleSignOnResourceInner innerModel();

    /** The entirety of the DynatraceSingleSignOnResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The DynatraceSingleSignOnResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DynatraceSingleSignOnResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DynatraceSingleSignOnResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, monitorName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param monitorName Monitor resource name.
             * @return the next definition stage.
             */
            WithCreate withExistingMonitor(String resourceGroupName, String monitorName);
        }
        /**
         * The stage of the DynatraceSingleSignOnResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithSingleSignOnState,
                DefinitionStages.WithEnterpriseAppId,
                DefinitionStages.WithSingleSignOnUrl,
                DefinitionStages.WithAadDomains {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DynatraceSingleSignOnResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DynatraceSingleSignOnResource create(Context context);
        }
        /** The stage of the DynatraceSingleSignOnResource definition allowing to specify singleSignOnState. */
        interface WithSingleSignOnState {
            /**
             * Specifies the singleSignOnState property: State of Single Sign On.
             *
             * @param singleSignOnState State of Single Sign On.
             * @return the next definition stage.
             */
            WithCreate withSingleSignOnState(SingleSignOnStates singleSignOnState);
        }
        /** The stage of the DynatraceSingleSignOnResource definition allowing to specify enterpriseAppId. */
        interface WithEnterpriseAppId {
            /**
             * Specifies the enterpriseAppId property: Version of the Dynatrace agent installed on the VM..
             *
             * @param enterpriseAppId Version of the Dynatrace agent installed on the VM.
             * @return the next definition stage.
             */
            WithCreate withEnterpriseAppId(String enterpriseAppId);
        }
        /** The stage of the DynatraceSingleSignOnResource definition allowing to specify singleSignOnUrl. */
        interface WithSingleSignOnUrl {
            /**
             * Specifies the singleSignOnUrl property: The login URL specific to this Dynatrace Environment.
             *
             * @param singleSignOnUrl The login URL specific to this Dynatrace Environment.
             * @return the next definition stage.
             */
            WithCreate withSingleSignOnUrl(String singleSignOnUrl);
        }
        /** The stage of the DynatraceSingleSignOnResource definition allowing to specify aadDomains. */
        interface WithAadDomains {
            /**
             * Specifies the aadDomains property: array of Aad(azure active directory) domains.
             *
             * @param aadDomains array of Aad(azure active directory) domains.
             * @return the next definition stage.
             */
            WithCreate withAadDomains(List<String> aadDomains);
        }
    }
    /**
     * Begins update for the DynatraceSingleSignOnResource resource.
     *
     * @return the stage of resource update.
     */
    DynatraceSingleSignOnResource.Update update();

    /** The template for DynatraceSingleSignOnResource update. */
    interface Update
        extends UpdateStages.WithSingleSignOnState,
            UpdateStages.WithEnterpriseAppId,
            UpdateStages.WithSingleSignOnUrl,
            UpdateStages.WithAadDomains {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DynatraceSingleSignOnResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DynatraceSingleSignOnResource apply(Context context);
    }
    /** The DynatraceSingleSignOnResource update stages. */
    interface UpdateStages {
        /** The stage of the DynatraceSingleSignOnResource update allowing to specify singleSignOnState. */
        interface WithSingleSignOnState {
            /**
             * Specifies the singleSignOnState property: State of Single Sign On.
             *
             * @param singleSignOnState State of Single Sign On.
             * @return the next definition stage.
             */
            Update withSingleSignOnState(SingleSignOnStates singleSignOnState);
        }
        /** The stage of the DynatraceSingleSignOnResource update allowing to specify enterpriseAppId. */
        interface WithEnterpriseAppId {
            /**
             * Specifies the enterpriseAppId property: Version of the Dynatrace agent installed on the VM..
             *
             * @param enterpriseAppId Version of the Dynatrace agent installed on the VM.
             * @return the next definition stage.
             */
            Update withEnterpriseAppId(String enterpriseAppId);
        }
        /** The stage of the DynatraceSingleSignOnResource update allowing to specify singleSignOnUrl. */
        interface WithSingleSignOnUrl {
            /**
             * Specifies the singleSignOnUrl property: The login URL specific to this Dynatrace Environment.
             *
             * @param singleSignOnUrl The login URL specific to this Dynatrace Environment.
             * @return the next definition stage.
             */
            Update withSingleSignOnUrl(String singleSignOnUrl);
        }
        /** The stage of the DynatraceSingleSignOnResource update allowing to specify aadDomains. */
        interface WithAadDomains {
            /**
             * Specifies the aadDomains property: array of Aad(azure active directory) domains.
             *
             * @param aadDomains array of Aad(azure active directory) domains.
             * @return the next definition stage.
             */
            Update withAadDomains(List<String> aadDomains);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DynatraceSingleSignOnResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DynatraceSingleSignOnResource refresh(Context context);
}
