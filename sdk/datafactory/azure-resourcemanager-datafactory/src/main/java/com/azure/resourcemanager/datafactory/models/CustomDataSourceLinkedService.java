// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Custom linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomDataSource")
@Fluent
public final class CustomDataSourceLinkedService extends LinkedService {
    /*
     * Custom linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private Object typeProperties;

    /**
     * Get the typeProperties property: Custom linked service properties.
     *
     * @return the typeProperties value.
     */
    public Object typeProperties() {
        return this.typeProperties;
    }

    /**
     * Set the typeProperties property: Custom linked service properties.
     *
     * @param typeProperties the typeProperties value to set.
     * @return the CustomDataSourceLinkedService object itself.
     */
    public CustomDataSourceLinkedService withTypeProperties(Object typeProperties) {
        this.typeProperties = typeProperties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomDataSourceLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomDataSourceLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomDataSourceLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomDataSourceLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
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
        if (typeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property typeProperties in model CustomDataSourceLinkedService"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDataSourceLinkedService.class);
}
