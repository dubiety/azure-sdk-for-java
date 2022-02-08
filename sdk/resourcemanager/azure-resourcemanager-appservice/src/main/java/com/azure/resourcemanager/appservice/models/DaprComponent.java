// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Dapr component configuration. */
@Fluent
public final class DaprComponent {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DaprComponent.class);

    /*
     * Component name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Component type
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Component version
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Component metadata
     */
    @JsonProperty(value = "metadata")
    private List<DaprMetadata> metadata;

    /**
     * Get the name property: Component name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Component name.
     *
     * @param name the name value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Component type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Component type.
     *
     * @param type the type value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version property: Component version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Component version.
     *
     * @param version the version value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the metadata property: Component metadata.
     *
     * @return the metadata value.
     */
    public List<DaprMetadata> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Component metadata.
     *
     * @param metadata the metadata value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withMetadata(List<DaprMetadata> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }
}
