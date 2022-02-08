// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.AlertRuleTemplateInner;
import com.azure.resourcemanager.securityinsights.fluent.models.FusionAlertRuleTemplateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents Fusion alert rule template. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Fusion")
@Fluent
public final class FusionAlertRuleTemplate extends AlertRuleTemplateInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FusionAlertRuleTemplate.class);

    /*
     * Fusion alert rule template properties
     */
    @JsonProperty(value = "properties")
    private FusionAlertRuleTemplateProperties innerProperties;

    /**
     * Get the innerProperties property: Fusion alert rule template properties.
     *
     * @return the innerProperties value.
     */
    private FusionAlertRuleTemplateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity for alerts created by this alert rule.
     *
     * @param severity the severity value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withSeverity(AlertSeverity severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the tactics property: The tactics of the alert rule template.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.innerProperties() == null ? null : this.innerProperties().tactics();
    }

    /**
     * Set the tactics property: The tactics of the alert rule template.
     *
     * @param tactics the tactics value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withTactics(List<AttackTactic> tactics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withTactics(tactics);
        return this;
    }

    /**
     * Get the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     *
     * @return the alertRulesCreatedByTemplateCount value.
     */
    public Integer alertRulesCreatedByTemplateCount() {
        return this.innerProperties() == null ? null : this.innerProperties().alertRulesCreatedByTemplateCount();
    }

    /**
     * Set the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     *
     * @param alertRulesCreatedByTemplateCount the alertRulesCreatedByTemplateCount value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withAlertRulesCreatedByTemplateCount(Integer alertRulesCreatedByTemplateCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withAlertRulesCreatedByTemplateCount(alertRulesCreatedByTemplateCount);
        return this;
    }

    /**
     * Get the lastUpdatedDateUtc property: The last time that this alert rule template has been updated.
     *
     * @return the lastUpdatedDateUtc value.
     */
    public OffsetDateTime lastUpdatedDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedDateUtc();
    }

    /**
     * Get the createdDateUtc property: The time that this alert rule template has been added.
     *
     * @return the createdDateUtc value.
     */
    public OffsetDateTime createdDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateUtc();
    }

    /**
     * Get the description property: The description of the alert rule template.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the alert rule template.
     *
     * @param description the description value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the displayName property: The display name for alert rule template.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for alert rule template.
     *
     * @param displayName the displayName value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the requiredDataConnectors property: The required data sources for this template.
     *
     * @return the requiredDataConnectors value.
     */
    public List<AlertRuleTemplateDataSource> requiredDataConnectors() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredDataConnectors();
    }

    /**
     * Set the requiredDataConnectors property: The required data sources for this template.
     *
     * @param requiredDataConnectors the requiredDataConnectors value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withRequiredDataConnectors(
        List<AlertRuleTemplateDataSource> requiredDataConnectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withRequiredDataConnectors(requiredDataConnectors);
        return this;
    }

    /**
     * Get the status property: The alert rule template status.
     *
     * @return the status value.
     */
    public TemplateStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The alert rule template status.
     *
     * @param status the status value to set.
     * @return the FusionAlertRuleTemplate object itself.
     */
    public FusionAlertRuleTemplate withStatus(TemplateStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FusionAlertRuleTemplateProperties();
        }
        this.innerProperties().withStatus(status);
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
