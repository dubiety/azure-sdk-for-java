// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum to determine the webhook callback service type.
 */
public final class WebhookType extends ExpandableStringEnum<WebhookType> {
    /**
     * Static value AzureDevOps for WebhookType.
     */
    public static final WebhookType AZURE_DEV_OPS = fromString("AzureDevOps");

    /**
     * Creates a new instance of WebhookType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WebhookType() {
    }

    /**
     * Creates or finds a WebhookType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WebhookType.
     */
    public static WebhookType fromString(String name) {
        return fromString(name, WebhookType.class);
    }

    /**
     * Gets known WebhookType values.
     * 
     * @return known WebhookType values.
     */
    public static Collection<WebhookType> values() {
        return values(WebhookType.class);
    }
}
