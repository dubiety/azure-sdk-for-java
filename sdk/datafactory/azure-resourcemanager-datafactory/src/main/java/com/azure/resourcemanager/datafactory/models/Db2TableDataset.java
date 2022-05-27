// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.Db2TableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Db2 table dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Db2Table")
@Fluent
public final class Db2TableDataset extends Dataset {
    /*
     * Db2 table dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private Db2TableDatasetTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: Db2 table dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private Db2TableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2TableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @param tableName the tableName value to set.
     * @return the Db2TableDataset object itself.
     */
    public Db2TableDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2TableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the schema property: The Db2 schema name. Type: string (or Expression with resultType string).
     *
     * @return the schema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().schema();
    }

    /**
     * Set the schema property: The Db2 schema name. Type: string (or Expression with resultType string).
     *
     * @param schema the schema value to set.
     * @return the Db2TableDataset object itself.
     */
    public Db2TableDataset withSchemaTypePropertiesSchema(Object schema) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2TableDatasetTypeProperties();
        }
        this.innerTypeProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: The Db2 table name. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The Db2 table name. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the Db2TableDataset object itself.
     */
    public Db2TableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2TableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
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
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
