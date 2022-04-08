// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for Content Key Policy configuration. A derived class must be used to create a configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = ContentKeyPolicyConfiguration.class)
@JsonTypeName("ContentKeyPolicyConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyClearKeyConfiguration",
        value = ContentKeyPolicyClearKeyConfiguration.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyUnknownConfiguration",
        value = ContentKeyPolicyUnknownConfiguration.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyWidevineConfiguration",
        value = ContentKeyPolicyWidevineConfiguration.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyPlayReadyConfiguration",
        value = ContentKeyPolicyPlayReadyConfiguration.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration",
        value = ContentKeyPolicyFairPlayConfiguration.class)
})
@Immutable
public class ContentKeyPolicyConfiguration {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
