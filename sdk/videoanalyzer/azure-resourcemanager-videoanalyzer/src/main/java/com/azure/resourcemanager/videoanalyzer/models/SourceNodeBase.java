// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for topology source nodes. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@type",
    defaultImpl = SourceNodeBase.class)
@JsonTypeName("#Microsoft.VideoAnalyzer.SourceNodeBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.RtspSource", value = RtspSource.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.VideoSource", value = VideoSource.class)
})
@Fluent
public class SourceNodeBase extends NodeBase {
    /** {@inheritDoc} */
    @Override
    public SourceNodeBase withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
