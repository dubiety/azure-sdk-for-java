// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.models.SensitivityLabelRank;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a sensitivity label. */
@Fluent
public final class SensitivityLabelProperties {
    /*
     * The schema name.
     */
    @JsonProperty(value = "schemaName", access = JsonProperty.Access.WRITE_ONLY)
    private String schemaName;

    /*
     * The table name.
     */
    @JsonProperty(value = "tableName", access = JsonProperty.Access.WRITE_ONLY)
    private String tableName;

    /*
     * The column name.
     */
    @JsonProperty(value = "columnName", access = JsonProperty.Access.WRITE_ONLY)
    private String columnName;

    /*
     * The label name.
     */
    @JsonProperty(value = "labelName")
    private String labelName;

    /*
     * The label ID.
     */
    @JsonProperty(value = "labelId")
    private String labelId;

    /*
     * The information type.
     */
    @JsonProperty(value = "informationType")
    private String informationType;

    /*
     * The information type ID.
     */
    @JsonProperty(value = "informationTypeId")
    private String informationTypeId;

    /*
     * Is sensitivity recommendation disabled. Applicable for recommended
     * sensitivity label only. Specifies whether the sensitivity recommendation
     * on this column is disabled (dismissed) or not.
     */
    @JsonProperty(value = "isDisabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDisabled;

    /*
     * The rank property.
     */
    @JsonProperty(value = "rank")
    private SensitivityLabelRank rank;

    /**
     * Get the schemaName property: The schema name.
     *
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Get the tableName property: The table name.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Get the columnName property: The column name.
     *
     * @return the columnName value.
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * Get the labelName property: The label name.
     *
     * @return the labelName value.
     */
    public String labelName() {
        return this.labelName;
    }

    /**
     * Set the labelName property: The label name.
     *
     * @param labelName the labelName value to set.
     * @return the SensitivityLabelProperties object itself.
     */
    public SensitivityLabelProperties withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * Get the labelId property: The label ID.
     *
     * @return the labelId value.
     */
    public String labelId() {
        return this.labelId;
    }

    /**
     * Set the labelId property: The label ID.
     *
     * @param labelId the labelId value to set.
     * @return the SensitivityLabelProperties object itself.
     */
    public SensitivityLabelProperties withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * Get the informationType property: The information type.
     *
     * @return the informationType value.
     */
    public String informationType() {
        return this.informationType;
    }

    /**
     * Set the informationType property: The information type.
     *
     * @param informationType the informationType value to set.
     * @return the SensitivityLabelProperties object itself.
     */
    public SensitivityLabelProperties withInformationType(String informationType) {
        this.informationType = informationType;
        return this;
    }

    /**
     * Get the informationTypeId property: The information type ID.
     *
     * @return the informationTypeId value.
     */
    public String informationTypeId() {
        return this.informationTypeId;
    }

    /**
     * Set the informationTypeId property: The information type ID.
     *
     * @param informationTypeId the informationTypeId value to set.
     * @return the SensitivityLabelProperties object itself.
     */
    public SensitivityLabelProperties withInformationTypeId(String informationTypeId) {
        this.informationTypeId = informationTypeId;
        return this;
    }

    /**
     * Get the isDisabled property: Is sensitivity recommendation disabled. Applicable for recommended sensitivity label
     * only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * Get the rank property: The rank property.
     *
     * @return the rank value.
     */
    public SensitivityLabelRank rank() {
        return this.rank;
    }

    /**
     * Set the rank property: The rank property.
     *
     * @param rank the rank value to set.
     * @return the SensitivityLabelProperties object itself.
     */
    public SensitivityLabelProperties withRank(SensitivityLabelRank rank) {
        this.rank = rank;
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
