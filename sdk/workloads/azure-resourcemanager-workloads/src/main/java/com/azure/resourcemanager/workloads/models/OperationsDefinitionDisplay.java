// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;

/** Display information of the operation. */
@Fluent
public final class OperationsDefinitionDisplay extends OperationsDisplayDefinition {
    /** {@inheritDoc} */
    @Override
    public OperationsDefinitionDisplay withProvider(String provider) {
        super.withProvider(provider);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OperationsDefinitionDisplay withResource(String resource) {
        super.withResource(resource);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OperationsDefinitionDisplay withOperation(String operation) {
        super.withOperation(operation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OperationsDefinitionDisplay withDescription(String description) {
        super.withDescription(description);
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
