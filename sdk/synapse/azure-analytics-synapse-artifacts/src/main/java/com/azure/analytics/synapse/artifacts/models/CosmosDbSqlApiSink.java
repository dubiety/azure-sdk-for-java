// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure CosmosDB (SQL API) Collection sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbSqlApiSink")
@Fluent
public final class CosmosDbSqlApiSink extends CopySink {
    /*
     * Describes how to write data to Azure Cosmos DB. Type: string (or
     * Expression with resultType string). Allowed values: insert and upsert.
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Get the writeBehavior property: Describes how to write data to Azure Cosmos DB. Type: string (or Expression with
     * resultType string). Allowed values: insert and upsert.
     *
     * @return the writeBehavior value.
     */
    public Object getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Describes how to write data to Azure Cosmos DB. Type: string (or Expression with
     * resultType string). Allowed values: insert and upsert.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the CosmosDbSqlApiSink object itself.
     */
    public CosmosDbSqlApiSink setWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
