// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CorsRuleAllowedMethodsItem. */
public final class CorsRuleAllowedMethodsItem extends ExpandableStringEnum<CorsRuleAllowedMethodsItem> {
    /** Static value DELETE for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem DELETE = fromString("DELETE");

    /** Static value GET for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem GET = fromString("GET");

    /** Static value HEAD for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem HEAD = fromString("HEAD");

    /** Static value MERGE for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem MERGE = fromString("MERGE");

    /** Static value POST for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem POST = fromString("POST");

    /** Static value OPTIONS for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem OPTIONS = fromString("OPTIONS");

    /** Static value PUT for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem PUT = fromString("PUT");

    /** Static value PATCH for CorsRuleAllowedMethodsItem. */
    public static final CorsRuleAllowedMethodsItem PATCH = fromString("PATCH");

    /**
     * Creates or finds a CorsRuleAllowedMethodsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CorsRuleAllowedMethodsItem.
     */
    @JsonCreator
    public static CorsRuleAllowedMethodsItem fromString(String name) {
        return fromString(name, CorsRuleAllowedMethodsItem.class);
    }

    /**
     * Gets known CorsRuleAllowedMethodsItem values.
     *
     * @return known CorsRuleAllowedMethodsItem values.
     */
    public static Collection<CorsRuleAllowedMethodsItem> values() {
        return values(CorsRuleAllowedMethodsItem.class);
    }
}
