// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Category of a managed network Outbound Rule of a machine learning workspace.
 */
public final class RuleCategory extends ExpandableStringEnum<RuleCategory> {
    /**
     * Static value Required for RuleCategory.
     */
    public static final RuleCategory REQUIRED = fromString("Required");

    /**
     * Static value Recommended for RuleCategory.
     */
    public static final RuleCategory RECOMMENDED = fromString("Recommended");

    /**
     * Static value UserDefined for RuleCategory.
     */
    public static final RuleCategory USER_DEFINED = fromString("UserDefined");

    /**
     * Static value Dependency for RuleCategory.
     */
    public static final RuleCategory DEPENDENCY = fromString("Dependency");

    /**
     * Creates a new instance of RuleCategory value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuleCategory() {
    }

    /**
     * Creates or finds a RuleCategory from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RuleCategory.
     */
    public static RuleCategory fromString(String name) {
        return fromString(name, RuleCategory.class);
    }

    /**
     * Gets known RuleCategory values.
     * 
     * @return known RuleCategory values.
     */
    public static Collection<RuleCategory> values() {
        return values(RuleCategory.class);
    }
}
