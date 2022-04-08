// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.CsmOperationDescriptionProperties;
import com.azure.resourcemanager.appservice.models.CsmOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of an operation available for Microsoft.Web resource provider. */
@Fluent
public final class CsmOperationDescriptionInner {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The isDataAction property.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Meta data about operation used for display in portal.
     */
    @JsonProperty(value = "display")
    private CsmOperationDisplay display;

    /*
     * The origin property.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Properties available for a Microsoft.Web resource provider operation.
     */
    @JsonProperty(value = "properties")
    private CsmOperationDescriptionProperties properties;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: The isDataAction property.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: The isDataAction property.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: Meta data about operation used for display in portal.
     *
     * @return the display value.
     */
    public CsmOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Meta data about operation used for display in portal.
     *
     * @param display the display value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withDisplay(CsmOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The origin property.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin property.
     *
     * @param origin the origin value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Properties available for a Microsoft.Web resource provider operation.
     *
     * @return the properties value.
     */
    public CsmOperationDescriptionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties available for a Microsoft.Web resource provider operation.
     *
     * @param properties the properties value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withProperties(CsmOperationDescriptionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
