// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for specifying a clip time. Use sub classes of this class to specify the time position in the media. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = ClipTime.class)
@JsonTypeName("ClipTime")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AbsoluteClipTime", value = AbsoluteClipTime.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.UtcClipTime", value = UtcClipTime.class)
})
@Immutable
public class ClipTime {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
