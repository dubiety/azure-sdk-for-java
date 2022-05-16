// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Common Data Service for Apps sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CommonDataServiceForAppsSink")
@Fluent
public final class CommonDataServiceForAppsSink extends CopySink {
    /*
     * The write behavior for the operation.
     */
    @JsonProperty(value = "writeBehavior", required = true)
    private DynamicsSinkWriteBehavior writeBehavior;

    /*
     * The flag indicating whether to ignore null values from input dataset
     * (except key fields) during write operation. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "ignoreNullValues")
    private Object ignoreNullValues;

    /*
     * The logical name of the alternate key which will be used when upserting
     * records. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "alternateKeyName")
    private Object alternateKeyName;

    /**
     * Get the writeBehavior property: The write behavior for the operation.
     *
     * @return the writeBehavior value.
     */
    public DynamicsSinkWriteBehavior getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: The write behavior for the operation.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the CommonDataServiceForAppsSink object itself.
     */
    public CommonDataServiceForAppsSink setWriteBehavior(DynamicsSinkWriteBehavior writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * Get the ignoreNullValues property: The flag indicating whether to ignore null values from input dataset (except
     * key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the ignoreNullValues value.
     */
    public Object getIgnoreNullValues() {
        return this.ignoreNullValues;
    }

    /**
     * Set the ignoreNullValues property: The flag indicating whether to ignore null values from input dataset (except
     * key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param ignoreNullValues the ignoreNullValues value to set.
     * @return the CommonDataServiceForAppsSink object itself.
     */
    public CommonDataServiceForAppsSink setIgnoreNullValues(Object ignoreNullValues) {
        this.ignoreNullValues = ignoreNullValues;
        return this;
    }

    /**
     * Get the alternateKeyName property: The logical name of the alternate key which will be used when upserting
     * records. Type: string (or Expression with resultType string).
     *
     * @return the alternateKeyName value.
     */
    public Object getAlternateKeyName() {
        return this.alternateKeyName;
    }

    /**
     * Set the alternateKeyName property: The logical name of the alternate key which will be used when upserting
     * records. Type: string (or Expression with resultType string).
     *
     * @param alternateKeyName the alternateKeyName value to set.
     * @return the CommonDataServiceForAppsSink object itself.
     */
    public CommonDataServiceForAppsSink setAlternateKeyName(Object alternateKeyName) {
        this.alternateKeyName = alternateKeyName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
