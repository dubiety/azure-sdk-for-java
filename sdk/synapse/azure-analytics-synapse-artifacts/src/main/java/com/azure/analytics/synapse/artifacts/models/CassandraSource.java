// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for a Cassandra database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CassandraSource")
@Fluent
public final class CassandraSource extends TabularSource {
    /*
     * Database query. Should be a SQL-92 query expression or Cassandra Query
     * Language (CQL) command. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The consistency level specifies how many Cassandra servers must respond
     * to a read request before returning data to the client application.
     * Cassandra checks the specified number of Cassandra servers for data to
     * satisfy the read request. Must be one of
     * cassandraSourceReadConsistencyLevels. The default value is 'ONE'. It is
     * case-insensitive.
     */
    @JsonProperty(value = "consistencyLevel")
    private CassandraSourceReadConsistencyLevels consistencyLevel;

    /**
     * Get the query property: Database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL)
     * command. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL)
     * command. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the CassandraSource object itself.
     */
    public CassandraSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the consistencyLevel property: The consistency level specifies how many Cassandra servers must respond to a
     * read request before returning data to the client application. Cassandra checks the specified number of Cassandra
     * servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default
     * value is 'ONE'. It is case-insensitive.
     *
     * @return the consistencyLevel value.
     */
    public CassandraSourceReadConsistencyLevels getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * Set the consistencyLevel property: The consistency level specifies how many Cassandra servers must respond to a
     * read request before returning data to the client application. Cassandra checks the specified number of Cassandra
     * servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default
     * value is 'ONE'. It is case-insensitive.
     *
     * @param consistencyLevel the consistencyLevel value to set.
     * @return the CassandraSource object itself.
     */
    public CassandraSource setConsistencyLevel(CassandraSourceReadConsistencyLevels consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
