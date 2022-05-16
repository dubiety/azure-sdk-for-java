// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkConnection model. */
@Fluent
public final class LinkConnection {
    /*
     * Properties of link connection's source database
     */
    @JsonProperty(value = "sourceDatabase")
    private LinkConnectionSourceDatabase sourceDatabase;

    /*
     * Properties of link connection's target database
     */
    @JsonProperty(value = "targetDatabase")
    private LinkConnectionTargetDatabase targetDatabase;

    /*
     * Properties of link connection's landing zone
     */
    @JsonProperty(value = "landingZone")
    private LinkConnectionLandingZone landingZone;

    /*
     * Properties of link connection's compute
     */
    @JsonProperty(value = "compute")
    private LinkConnectionCompute compute;

    /**
     * Get the sourceDatabase property: Properties of link connection's source database.
     *
     * @return the sourceDatabase value.
     */
    public LinkConnectionSourceDatabase getSourceDatabase() {
        return this.sourceDatabase;
    }

    /**
     * Set the sourceDatabase property: Properties of link connection's source database.
     *
     * @param sourceDatabase the sourceDatabase value to set.
     * @return the LinkConnection object itself.
     */
    public LinkConnection setSourceDatabase(LinkConnectionSourceDatabase sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
        return this;
    }

    /**
     * Get the targetDatabase property: Properties of link connection's target database.
     *
     * @return the targetDatabase value.
     */
    public LinkConnectionTargetDatabase getTargetDatabase() {
        return this.targetDatabase;
    }

    /**
     * Set the targetDatabase property: Properties of link connection's target database.
     *
     * @param targetDatabase the targetDatabase value to set.
     * @return the LinkConnection object itself.
     */
    public LinkConnection setTargetDatabase(LinkConnectionTargetDatabase targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }

    /**
     * Get the landingZone property: Properties of link connection's landing zone.
     *
     * @return the landingZone value.
     */
    public LinkConnectionLandingZone getLandingZone() {
        return this.landingZone;
    }

    /**
     * Set the landingZone property: Properties of link connection's landing zone.
     *
     * @param landingZone the landingZone value to set.
     * @return the LinkConnection object itself.
     */
    public LinkConnection setLandingZone(LinkConnectionLandingZone landingZone) {
        this.landingZone = landingZone;
        return this;
    }

    /**
     * Get the compute property: Properties of link connection's compute.
     *
     * @return the compute value.
     */
    public LinkConnectionCompute getCompute() {
        return this.compute;
    }

    /**
     * Set the compute property: Properties of link connection's compute.
     *
     * @param compute the compute value to set.
     * @return the LinkConnection object itself.
     */
    public LinkConnection setCompute(LinkConnectionCompute compute) {
        this.compute = compute;
        return this;
    }
}
