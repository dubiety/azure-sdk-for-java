// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Ssis environment reference. */
@Fluent
public final class SsisEnvironmentReference {
    /*
     * Environment reference id.
     */
    @JsonProperty(value = "id")
    private Long id;

    /*
     * Environment folder name.
     */
    @JsonProperty(value = "environmentFolderName")
    private String environmentFolderName;

    /*
     * Environment name.
     */
    @JsonProperty(value = "environmentName")
    private String environmentName;

    /*
     * Reference type
     */
    @JsonProperty(value = "referenceType")
    private String referenceType;

    /**
     * Get the id property: Environment reference id.
     *
     * @return the id value.
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set the id property: Environment reference id.
     *
     * @param id the id value to set.
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get the environmentFolderName property: Environment folder name.
     *
     * @return the environmentFolderName value.
     */
    public String environmentFolderName() {
        return this.environmentFolderName;
    }

    /**
     * Set the environmentFolderName property: Environment folder name.
     *
     * @param environmentFolderName the environmentFolderName value to set.
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withEnvironmentFolderName(String environmentFolderName) {
        this.environmentFolderName = environmentFolderName;
        return this;
    }

    /**
     * Get the environmentName property: Environment name.
     *
     * @return the environmentName value.
     */
    public String environmentName() {
        return this.environmentName;
    }

    /**
     * Set the environmentName property: Environment name.
     *
     * @param environmentName the environmentName value to set.
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * Get the referenceType property: Reference type.
     *
     * @return the referenceType value.
     */
    public String referenceType() {
        return this.referenceType;
    }

    /**
     * Set the referenceType property: Reference type.
     *
     * @param referenceType the referenceType value to set.
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
