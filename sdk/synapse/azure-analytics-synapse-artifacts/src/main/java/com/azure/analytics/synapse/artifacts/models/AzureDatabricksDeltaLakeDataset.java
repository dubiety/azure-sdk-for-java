// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure Databricks Delta Lake dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeDataset")
@JsonFlatten
@Fluent
public class AzureDatabricksDeltaLakeDataset extends Dataset {
    /*
     * The name of delta table. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /*
     * The database name of delta table. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database")
    private Object database;

    /**
     * Get the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the AzureDatabricksDeltaLakeDataset object itself.
     */
    public AzureDatabricksDeltaLakeDataset setTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the AzureDatabricksDeltaLakeDataset object itself.
     */
    public AzureDatabricksDeltaLakeDataset setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
