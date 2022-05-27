// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of SimPolicy. */
public interface SimPolicy {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the sim policy resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the ueAmbr property: Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given
     * UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
     *
     * @return the ueAmbr value.
     */
    Ambr ueAmbr();

    /**
     * Gets the defaultSlice property: The default slice to use if the UE does not explicitly specify it. This slice
     * must exist in the `sliceConfigurations` map.
     *
     * @return the defaultSlice value.
     */
    SliceResourceId defaultSlice();

    /**
     * Gets the rfspIndex property: RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an
     * optional setting and by default is unspecified.
     *
     * @return the rfspIndex value.
     */
    Integer rfspIndex();

    /**
     * Gets the registrationTimer property: Interval for the UE periodic registration update procedure, in seconds.
     *
     * @return the registrationTimer value.
     */
    Integer registrationTimer();

    /**
     * Gets the sliceConfigurations property: The allowed slices and the settings to use for them. The list must not
     * contain duplicate items and must contain at least one item.
     *
     * @return the sliceConfigurations value.
     */
    List<SliceConfiguration> sliceConfigurations();

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
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner object.
     *
     * @return the inner object.
     */
    SimPolicyInner innerModel();

    /** The entirety of the SimPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithUeAmbr,
            DefinitionStages.WithDefaultSlice,
            DefinitionStages.WithSliceConfigurations,
            DefinitionStages.WithCreate {
    }
    /** The SimPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the SimPolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SimPolicy definition allowing to specify location. */
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
        /** The stage of the SimPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, mobileNetworkName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param mobileNetworkName The name of the mobile network.
             * @return the next definition stage.
             */
            WithUeAmbr withExistingMobileNetwork(String resourceGroupName, String mobileNetworkName);
        }
        /** The stage of the SimPolicy definition allowing to specify ueAmbr. */
        interface WithUeAmbr {
            /**
             * Specifies the ueAmbr property: Aggregate maximum bit rate across all non-GBR QoS flows of all PDU
             * sessions of a given UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR..
             *
             * @param ueAmbr Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given UE.
             *     See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
             * @return the next definition stage.
             */
            WithDefaultSlice withUeAmbr(Ambr ueAmbr);
        }
        /** The stage of the SimPolicy definition allowing to specify defaultSlice. */
        interface WithDefaultSlice {
            /**
             * Specifies the defaultSlice property: The default slice to use if the UE does not explicitly specify it.
             * This slice must exist in the `sliceConfigurations` map..
             *
             * @param defaultSlice The default slice to use if the UE does not explicitly specify it. This slice must
             *     exist in the `sliceConfigurations` map.
             * @return the next definition stage.
             */
            WithSliceConfigurations withDefaultSlice(SliceResourceId defaultSlice);
        }
        /** The stage of the SimPolicy definition allowing to specify sliceConfigurations. */
        interface WithSliceConfigurations {
            /**
             * Specifies the sliceConfigurations property: The allowed slices and the settings to use for them. The list
             * must not contain duplicate items and must contain at least one item..
             *
             * @param sliceConfigurations The allowed slices and the settings to use for them. The list must not contain
             *     duplicate items and must contain at least one item.
             * @return the next definition stage.
             */
            WithCreate withSliceConfigurations(List<SliceConfiguration> sliceConfigurations);
        }
        /**
         * The stage of the SimPolicy definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithRfspIndex, DefinitionStages.WithRegistrationTimer {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SimPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SimPolicy create(Context context);
        }
        /** The stage of the SimPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SimPolicy definition allowing to specify rfspIndex. */
        interface WithRfspIndex {
            /**
             * Specifies the rfspIndex property: RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This
             * is an optional setting and by default is unspecified..
             *
             * @param rfspIndex RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an optional
             *     setting and by default is unspecified.
             * @return the next definition stage.
             */
            WithCreate withRfspIndex(Integer rfspIndex);
        }
        /** The stage of the SimPolicy definition allowing to specify registrationTimer. */
        interface WithRegistrationTimer {
            /**
             * Specifies the registrationTimer property: Interval for the UE periodic registration update procedure, in
             * seconds..
             *
             * @param registrationTimer Interval for the UE periodic registration update procedure, in seconds.
             * @return the next definition stage.
             */
            WithCreate withRegistrationTimer(Integer registrationTimer);
        }
    }
    /**
     * Begins update for the SimPolicy resource.
     *
     * @return the stage of resource update.
     */
    SimPolicy.Update update();

    /** The template for SimPolicy update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SimPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SimPolicy apply(Context context);
    }
    /** The SimPolicy update stages. */
    interface UpdateStages {
        /** The stage of the SimPolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SimPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SimPolicy refresh(Context context);
}
