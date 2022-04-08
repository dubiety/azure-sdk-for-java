// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for Jobs List. */
public final class JobsListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all-filter-by-state-ne.json
     */
    /**
     * Sample code: Lists Jobs for the Transform filter by state not equal.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsJobsForTheTransformFilterByStateNotEqual(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .jobs()
            .list(
                "contosoresources",
                "contosomedia",
                "exampleTransform",
                "properties/state ne Microsoft.Media.JobState'processing'",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all-filter-by-state-eq.json
     */
    /**
     * Sample code: Lists Jobs for the Transform filter by state equal.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsJobsForTheTransformFilterByStateEqual(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .jobs()
            .list(
                "contosoresources",
                "contosomedia",
                "exampleTransform",
                "properties/state eq Microsoft.Media.JobState'Processing'",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all-filter-by-name.json
     */
    /**
     * Sample code: Lists Jobs for the Transform filter by name.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsJobsForTheTransformFilterByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .jobs()
            .list(
                "contosoresources",
                "contosomedia",
                "exampleTransform",
                "name eq 'job1' or name eq 'job2'",
                "name",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all-filter-by-lastmodified.json
     */
    /**
     * Sample code: Lists Jobs for the Transform filter by lastmodified.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsJobsForTheTransformFilterByLastmodified(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .jobs()
            .list(
                "contosoresources",
                "contosomedia",
                "exampleTransform",
                "properties/lastmodified ge 2021-11-01T00:00:10.0000000Z and properties/lastmodified le"
                    + " 2021-11-01T00:00:20.0000000Z",
                "properties/lastmodified desc",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all-filter-by-created.json
     */
    /**
     * Sample code: Lists Jobs for the Transform filter by created.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsJobsForTheTransformFilterByCreated(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .jobs()
            .list(
                "contosoresources",
                "contosomedia",
                "exampleTransform",
                "properties/created ge 2021-11-01T00:00:10.0000000Z and properties/created le"
                    + " 2021-11-01T00:00:20.0000000Z",
                "properties/created",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all.json
     */
    /**
     * Sample code: Lists all of the Jobs for the Transform.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsAllOfTheJobsForTheTransform(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.jobs().list("contosoresources", "contosomedia", "exampleTransform", null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/jobs-list-all-filter-by-name-and-state.json
     */
    /**
     * Sample code: Lists Jobs for the Transform filter by name and state.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsJobsForTheTransformFilterByNameAndState(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .jobs()
            .list(
                "contosoresources",
                "contosomedia",
                "exampleTransform",
                "name eq 'job3' and properties/state eq Microsoft.Media.JobState'finished'",
                null,
                Context.NONE);
    }
}
