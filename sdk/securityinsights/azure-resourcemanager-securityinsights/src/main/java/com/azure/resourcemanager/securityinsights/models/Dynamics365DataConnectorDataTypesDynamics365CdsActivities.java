// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;

/** Common Data Service data type connection. */
@Fluent
public final class Dynamics365DataConnectorDataTypesDynamics365CdsActivities extends DataConnectorDataTypeCommon {
    /** {@inheritDoc} */
    @Override
    public Dynamics365DataConnectorDataTypesDynamics365CdsActivities withState(DataTypeState state) {
        super.withState(state);
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
    }
}
