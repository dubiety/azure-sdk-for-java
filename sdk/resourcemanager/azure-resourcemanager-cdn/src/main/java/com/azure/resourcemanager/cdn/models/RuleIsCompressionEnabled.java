// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates whether content compression is enabled. If compression is enabled, content will be served as compressed if
 * user requests for a compressed version. Content won't be compressed on AzureFrontDoor when requested content is
 * smaller than 1 byte or larger than 1 MB.
 */
public final class RuleIsCompressionEnabled extends ExpandableStringEnum<RuleIsCompressionEnabled> {
    /**
     * Static value Enabled for RuleIsCompressionEnabled.
     */
    public static final RuleIsCompressionEnabled ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for RuleIsCompressionEnabled.
     */
    public static final RuleIsCompressionEnabled DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of RuleIsCompressionEnabled value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuleIsCompressionEnabled() {
    }

    /**
     * Creates or finds a RuleIsCompressionEnabled from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RuleIsCompressionEnabled.
     */
    public static RuleIsCompressionEnabled fromString(String name) {
        return fromString(name, RuleIsCompressionEnabled.class);
    }

    /**
     * Gets known RuleIsCompressionEnabled values.
     * 
     * @return known RuleIsCompressionEnabled values.
     */
    public static Collection<RuleIsCompressionEnabled> values() {
        return values(RuleIsCompressionEnabled.class);
    }
}
