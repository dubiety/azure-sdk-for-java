// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.IncidentAdditionalData;
import com.azure.resourcemanager.securityinsights.models.IncidentClassification;
import com.azure.resourcemanager.securityinsights.models.IncidentClassificationReason;
import com.azure.resourcemanager.securityinsights.models.IncidentLabel;
import com.azure.resourcemanager.securityinsights.models.IncidentOwnerInfo;
import com.azure.resourcemanager.securityinsights.models.IncidentSeverity;
import com.azure.resourcemanager.securityinsights.models.IncidentStatus;
import com.azure.resourcemanager.securityinsights.models.ResourceWithEtag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents an incident in Azure Security Insights. */
@Fluent
public final class IncidentInner extends ResourceWithEtag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IncidentInner.class);

    /*
     * Incident properties
     */
    @JsonProperty(value = "properties")
    private IncidentPropertiesInner innerProperties;

    /**
     * Get the innerProperties property: Incident properties.
     *
     * @return the innerProperties value.
     */
    private IncidentPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public IncidentInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the additionalData property: Additional data on the incident.
     *
     * @return the additionalData value.
     */
    public IncidentAdditionalData additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the classification property: The reason the incident was closed.
     *
     * @return the classification value.
     */
    public IncidentClassification classification() {
        return this.innerProperties() == null ? null : this.innerProperties().classification();
    }

    /**
     * Set the classification property: The reason the incident was closed.
     *
     * @param classification the classification value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withClassification(IncidentClassification classification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withClassification(classification);
        return this;
    }

    /**
     * Get the classificationComment property: Describes the reason the incident was closed.
     *
     * @return the classificationComment value.
     */
    public String classificationComment() {
        return this.innerProperties() == null ? null : this.innerProperties().classificationComment();
    }

    /**
     * Set the classificationComment property: Describes the reason the incident was closed.
     *
     * @param classificationComment the classificationComment value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withClassificationComment(String classificationComment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withClassificationComment(classificationComment);
        return this;
    }

    /**
     * Get the classificationReason property: The classification reason the incident was closed with.
     *
     * @return the classificationReason value.
     */
    public IncidentClassificationReason classificationReason() {
        return this.innerProperties() == null ? null : this.innerProperties().classificationReason();
    }

    /**
     * Set the classificationReason property: The classification reason the incident was closed with.
     *
     * @param classificationReason the classificationReason value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withClassificationReason(IncidentClassificationReason classificationReason) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withClassificationReason(classificationReason);
        return this;
    }

    /**
     * Get the createdTimeUtc property: The time the incident was created.
     *
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTimeUtc();
    }

    /**
     * Get the description property: The description of the incident.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the incident.
     *
     * @param description the description value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the firstActivityTimeUtc property: The time of the first activity in the incident.
     *
     * @return the firstActivityTimeUtc value.
     */
    public OffsetDateTime firstActivityTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().firstActivityTimeUtc();
    }

    /**
     * Set the firstActivityTimeUtc property: The time of the first activity in the incident.
     *
     * @param firstActivityTimeUtc the firstActivityTimeUtc value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withFirstActivityTimeUtc(OffsetDateTime firstActivityTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withFirstActivityTimeUtc(firstActivityTimeUtc);
        return this;
    }

    /**
     * Get the incidentUrl property: The deep-link url to the incident in Azure portal.
     *
     * @return the incidentUrl value.
     */
    public String incidentUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().incidentUrl();
    }

    /**
     * Get the incidentNumber property: A sequential number.
     *
     * @return the incidentNumber value.
     */
    public Integer incidentNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().incidentNumber();
    }

    /**
     * Get the labels property: List of labels relevant to this incident.
     *
     * @return the labels value.
     */
    public List<IncidentLabel> labels() {
        return this.innerProperties() == null ? null : this.innerProperties().labels();
    }

    /**
     * Set the labels property: List of labels relevant to this incident.
     *
     * @param labels the labels value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withLabels(List<IncidentLabel> labels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withLabels(labels);
        return this;
    }

    /**
     * Get the providerName property: The name of the source provider that generated the incident.
     *
     * @return the providerName value.
     */
    public String providerName() {
        return this.innerProperties() == null ? null : this.innerProperties().providerName();
    }

    /**
     * Set the providerName property: The name of the source provider that generated the incident.
     *
     * @param providerName the providerName value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withProviderName(String providerName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withProviderName(providerName);
        return this;
    }

    /**
     * Get the providerIncidentId property: The incident ID assigned by the incident provider.
     *
     * @return the providerIncidentId value.
     */
    public String providerIncidentId() {
        return this.innerProperties() == null ? null : this.innerProperties().providerIncidentId();
    }

    /**
     * Set the providerIncidentId property: The incident ID assigned by the incident provider.
     *
     * @param providerIncidentId the providerIncidentId value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withProviderIncidentId(String providerIncidentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withProviderIncidentId(providerIncidentId);
        return this;
    }

    /**
     * Get the lastActivityTimeUtc property: The time of the last activity in the incident.
     *
     * @return the lastActivityTimeUtc value.
     */
    public OffsetDateTime lastActivityTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastActivityTimeUtc();
    }

    /**
     * Set the lastActivityTimeUtc property: The time of the last activity in the incident.
     *
     * @param lastActivityTimeUtc the lastActivityTimeUtc value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withLastActivityTimeUtc(OffsetDateTime lastActivityTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withLastActivityTimeUtc(lastActivityTimeUtc);
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc property: The last time the incident was updated.
     *
     * @return the lastModifiedTimeUtc value.
     */
    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTimeUtc();
    }

    /**
     * Get the owner property: Describes a user that the incident is assigned to.
     *
     * @return the owner value.
     */
    public IncidentOwnerInfo owner() {
        return this.innerProperties() == null ? null : this.innerProperties().owner();
    }

    /**
     * Set the owner property: Describes a user that the incident is assigned to.
     *
     * @param owner the owner value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withOwner(IncidentOwnerInfo owner) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withOwner(owner);
        return this;
    }

    /**
     * Get the relatedAnalyticRuleIds property: List of resource ids of Analytic rules related to the incident.
     *
     * @return the relatedAnalyticRuleIds value.
     */
    public List<String> relatedAnalyticRuleIds() {
        return this.innerProperties() == null ? null : this.innerProperties().relatedAnalyticRuleIds();
    }

    /**
     * Get the severity property: The severity of the incident.
     *
     * @return the severity value.
     */
    public IncidentSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity of the incident.
     *
     * @param severity the severity value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withSeverity(IncidentSeverity severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the status property: The status of the incident.
     *
     * @return the status value.
     */
    public IncidentStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the incident.
     *
     * @param status the status value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withStatus(IncidentStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the teamInformation property: Describes a team for the incident.
     *
     * @return the teamInformation value.
     */
    public TeamInformationInner teamInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().teamInformation();
    }

    /**
     * Set the teamInformation property: Describes a team for the incident.
     *
     * @param teamInformation the teamInformation value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withTeamInformation(TeamInformationInner teamInformation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withTeamInformation(teamInformation);
        return this;
    }

    /**
     * Get the title property: The title of the incident.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: The title of the incident.
     *
     * @param title the title value to set.
     * @return the IncidentInner object itself.
     */
    public IncidentInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IncidentPropertiesInner();
        }
        this.innerProperties().withTitle(title);
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
