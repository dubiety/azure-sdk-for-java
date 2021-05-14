// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Output directory for the job. */
@Fluent
public final class OutputDirectory {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutputDirectory.class);

    /*
     * The ID of the output directory. The job can use AZ_BATCHAI_OUTPUT_<id>
     * environment variable to find the directory path, where <id> is the value
     * of id attribute.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The prefix path where the output directory will be created. Note, this
     * is an absolute path to prefix. E.g. $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs.
     * The full path to the output directory by combining pathPrefix,
     * jobOutputDirectoryPathSegment (reported by get job) and pathSuffix.
     */
    @JsonProperty(value = "pathPrefix", required = true)
    private String pathPrefix;

    /*
     * The suffix path where the output directory will be created. E.g. models.
     * You can find the full path to the output directory by combining
     * pathPrefix, jobOutputDirectoryPathSegment (reported by get job) and
     * pathSuffix.
     */
    @JsonProperty(value = "pathSuffix")
    private String pathSuffix;

    /**
     * Get the id property: The ID of the output directory. The job can use AZ_BATCHAI_OUTPUT_&lt;id&gt; environment
     * variable to find the directory path, where &lt;id&gt; is the value of id attribute.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the output directory. The job can use AZ_BATCHAI_OUTPUT_&lt;id&gt; environment
     * variable to find the directory path, where &lt;id&gt; is the value of id attribute.
     *
     * @param id the id value to set.
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the pathPrefix property: The prefix path where the output directory will be created. Note, this is an
     * absolute path to prefix. E.g. $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs. The full path to the output directory by
     * combining pathPrefix, jobOutputDirectoryPathSegment (reported by get job) and pathSuffix.
     *
     * @return the pathPrefix value.
     */
    public String pathPrefix() {
        return this.pathPrefix;
    }

    /**
     * Set the pathPrefix property: The prefix path where the output directory will be created. Note, this is an
     * absolute path to prefix. E.g. $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs. The full path to the output directory by
     * combining pathPrefix, jobOutputDirectoryPathSegment (reported by get job) and pathSuffix.
     *
     * @param pathPrefix the pathPrefix value to set.
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Get the pathSuffix property: The suffix path where the output directory will be created. E.g. models. You can
     * find the full path to the output directory by combining pathPrefix, jobOutputDirectoryPathSegment (reported by
     * get job) and pathSuffix.
     *
     * @return the pathSuffix value.
     */
    public String pathSuffix() {
        return this.pathSuffix;
    }

    /**
     * Set the pathSuffix property: The suffix path where the output directory will be created. E.g. models. You can
     * find the full path to the output directory by combining pathPrefix, jobOutputDirectoryPathSegment (reported by
     * get job) and pathSuffix.
     *
     * @param pathSuffix the pathSuffix value to set.
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withPathSuffix(String pathSuffix) {
        this.pathSuffix = pathSuffix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model OutputDirectory"));
        }
        if (pathPrefix() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property pathPrefix in model OutputDirectory"));
        }
    }
}
