// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the endpoint name reuse scope. The default value is TenantReuse.
 */
public final class AutoGeneratedDomainNameLabelScope extends ExpandableStringEnum<AutoGeneratedDomainNameLabelScope> {
    /**
     * Static value TenantReuse for AutoGeneratedDomainNameLabelScope.
     */
    public static final AutoGeneratedDomainNameLabelScope TENANT_REUSE = fromString("TenantReuse");

    /**
     * Static value SubscriptionReuse for AutoGeneratedDomainNameLabelScope.
     */
    public static final AutoGeneratedDomainNameLabelScope SUBSCRIPTION_REUSE = fromString("SubscriptionReuse");

    /**
     * Static value ResourceGroupReuse for AutoGeneratedDomainNameLabelScope.
     */
    public static final AutoGeneratedDomainNameLabelScope RESOURCE_GROUP_REUSE = fromString("ResourceGroupReuse");

    /**
     * Static value NoReuse for AutoGeneratedDomainNameLabelScope.
     */
    public static final AutoGeneratedDomainNameLabelScope NO_REUSE = fromString("NoReuse");

    /**
     * Creates a new instance of AutoGeneratedDomainNameLabelScope value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoGeneratedDomainNameLabelScope() {
    }

    /**
     * Creates or finds a AutoGeneratedDomainNameLabelScope from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AutoGeneratedDomainNameLabelScope.
     */
    public static AutoGeneratedDomainNameLabelScope fromString(String name) {
        return fromString(name, AutoGeneratedDomainNameLabelScope.class);
    }

    /**
     * Gets known AutoGeneratedDomainNameLabelScope values.
     * 
     * @return known AutoGeneratedDomainNameLabelScope values.
     */
    public static Collection<AutoGeneratedDomainNameLabelScope> values() {
        return values(AutoGeneratedDomainNameLabelScope.class);
    }
}
