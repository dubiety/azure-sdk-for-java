// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.VnetValidationTestFailureProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class that describes a test that failed during NSG and UDR validation. */
@Fluent
public final class VnetValidationTestFailure extends ProxyOnlyResource {
    /*
     * VnetValidationTestFailure resource specific properties
     */
    @JsonProperty(value = "properties")
    private VnetValidationTestFailureProperties innerProperties;

    /**
     * Get the innerProperties property: VnetValidationTestFailure resource specific properties.
     *
     * @return the innerProperties value.
     */
    private VnetValidationTestFailureProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VnetValidationTestFailure withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the testName property: The name of the test that failed.
     *
     * @return the testName value.
     */
    public String testName() {
        return this.innerProperties() == null ? null : this.innerProperties().testName();
    }

    /**
     * Set the testName property: The name of the test that failed.
     *
     * @param testName the testName value to set.
     * @return the VnetValidationTestFailure object itself.
     */
    public VnetValidationTestFailure withTestName(String testName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetValidationTestFailureProperties();
        }
        this.innerProperties().withTestName(testName);
        return this;
    }

    /**
     * Get the details property: The details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @return the details value.
     */
    public String details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Set the details property: The details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @param details the details value to set.
     * @return the VnetValidationTestFailure object itself.
     */
    public VnetValidationTestFailure withDetails(String details) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetValidationTestFailureProperties();
        }
        this.innerProperties().withDetails(details);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
