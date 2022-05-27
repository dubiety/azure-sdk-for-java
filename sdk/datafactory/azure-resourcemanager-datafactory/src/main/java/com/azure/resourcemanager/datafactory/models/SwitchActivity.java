// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SwitchActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * This activity evaluates an expression and executes activities under the cases property that correspond to the
 * expression evaluation expected in the equals property.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Switch")
@Fluent
public final class SwitchActivity extends ControlActivity {
    /*
     * Switch activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SwitchActivityTypeProperties innerTypeProperties = new SwitchActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: Switch activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private SwitchActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SwitchActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SwitchActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SwitchActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SwitchActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the on property: An expression that would evaluate to a string or integer. This is used to determine the
     * block of activities in cases that will be executed.
     *
     * @return the on value.
     */
    public Expression on() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().on();
    }

    /**
     * Set the on property: An expression that would evaluate to a string or integer. This is used to determine the
     * block of activities in cases that will be executed.
     *
     * @param on the on value to set.
     * @return the SwitchActivity object itself.
     */
    public SwitchActivity withOn(Expression on) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SwitchActivityTypeProperties();
        }
        this.innerTypeProperties().withOn(on);
        return this;
    }

    /**
     * Get the cases property: List of cases that correspond to expected values of the 'on' property. This is an
     * optional property and if not provided, the activity will execute activities provided in defaultActivities.
     *
     * @return the cases value.
     */
    public List<SwitchCase> cases() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().cases();
    }

    /**
     * Set the cases property: List of cases that correspond to expected values of the 'on' property. This is an
     * optional property and if not provided, the activity will execute activities provided in defaultActivities.
     *
     * @param cases the cases value to set.
     * @return the SwitchActivity object itself.
     */
    public SwitchActivity withCases(List<SwitchCase> cases) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SwitchActivityTypeProperties();
        }
        this.innerTypeProperties().withCases(cases);
        return this;
    }

    /**
     * Get the defaultActivities property: List of activities to execute if no case condition is satisfied. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @return the defaultActivities value.
     */
    public List<Activity> defaultActivities() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().defaultActivities();
    }

    /**
     * Set the defaultActivities property: List of activities to execute if no case condition is satisfied. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @param defaultActivities the defaultActivities value to set.
     * @return the SwitchActivity object itself.
     */
    public SwitchActivity withDefaultActivities(List<Activity> defaultActivities) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SwitchActivityTypeProperties();
        }
        this.innerTypeProperties().withDefaultActivities(defaultActivities);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SwitchActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SwitchActivity.class);
}
