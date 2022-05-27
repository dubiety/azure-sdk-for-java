// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.WebTableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The dataset points to a HTML table in the web page. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebTable")
@Fluent
public final class WebTableDataset extends Dataset {
    /*
     * Web table dataset properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private WebTableDatasetTypeProperties innerTypeProperties = new WebTableDatasetTypeProperties();

    /**
     * Get the innerTypeProperties property: Web table dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private WebTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the index property: The zero-based index of the table in the web page. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @return the index value.
     */
    public Object index() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().index();
    }

    /**
     * Set the index property: The zero-based index of the table in the web page. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @param index the index value to set.
     * @return the WebTableDataset object itself.
     */
    public WebTableDataset withIndex(Object index) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withIndex(index);
        return this;
    }

    /**
     * Get the path property: The relative URL to the web page from the linked service URL. Type: string (or Expression
     * with resultType string).
     *
     * @return the path value.
     */
    public Object path() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().path();
    }

    /**
     * Set the path property: The relative URL to the web page from the linked service URL. Type: string (or Expression
     * with resultType string).
     *
     * @param path the path value to set.
     * @return the WebTableDataset object itself.
     */
    public WebTableDataset withPath(Object path) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withPath(path);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model WebTableDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebTableDataset.class);
}
