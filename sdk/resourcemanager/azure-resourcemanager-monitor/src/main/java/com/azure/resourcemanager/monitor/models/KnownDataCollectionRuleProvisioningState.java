// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The resource provisioning state.
 */
public final class KnownDataCollectionRuleProvisioningState
    extends ExpandableStringEnum<KnownDataCollectionRuleProvisioningState> {
    /**
     * Static value Creating for KnownDataCollectionRuleProvisioningState.
     */
    public static final KnownDataCollectionRuleProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for KnownDataCollectionRuleProvisioningState.
     */
    public static final KnownDataCollectionRuleProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for KnownDataCollectionRuleProvisioningState.
     */
    public static final KnownDataCollectionRuleProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for KnownDataCollectionRuleProvisioningState.
     */
    public static final KnownDataCollectionRuleProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for KnownDataCollectionRuleProvisioningState.
     */
    public static final KnownDataCollectionRuleProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of KnownDataCollectionRuleProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KnownDataCollectionRuleProvisioningState() {
    }

    /**
     * Creates or finds a KnownDataCollectionRuleProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KnownDataCollectionRuleProvisioningState.
     */
    public static KnownDataCollectionRuleProvisioningState fromString(String name) {
        return fromString(name, KnownDataCollectionRuleProvisioningState.class);
    }

    /**
     * Gets known KnownDataCollectionRuleProvisioningState values.
     * 
     * @return known KnownDataCollectionRuleProvisioningState values.
     */
    public static Collection<KnownDataCollectionRuleProvisioningState> values() {
        return values(KnownDataCollectionRuleProvisioningState.class);
    }
}
