// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.azure.resourcemanager.securityinsights.models.IncidentInfo;
import com.azure.resourcemanager.securityinsights.models.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Describes bookmark properties. */
@Fluent
public final class HuntingBookmarkProperties extends EntityCommonProperties {
    /*
     * The time the bookmark was created
     */
    @JsonProperty(value = "created")
    private OffsetDateTime created;

    /*
     * Describes a user that created the bookmark
     */
    @JsonProperty(value = "createdBy")
    private UserInfo createdBy;

    /*
     * The display name of the bookmark
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * The time of the event
     */
    @JsonProperty(value = "eventTime")
    private OffsetDateTime eventTime;

    /*
     * List of labels relevant to this bookmark
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /*
     * The notes of the bookmark
     */
    @JsonProperty(value = "notes")
    private String notes;

    /*
     * The query of the bookmark.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * The query result of the bookmark.
     */
    @JsonProperty(value = "queryResult")
    private String queryResult;

    /*
     * The last time the bookmark was updated
     */
    @JsonProperty(value = "updated")
    private OffsetDateTime updated;

    /*
     * Describes a user that updated the bookmark
     */
    @JsonProperty(value = "updatedBy")
    private UserInfo updatedBy;

    /*
     * Describes an incident that relates to bookmark
     */
    @JsonProperty(value = "incidentInfo")
    private IncidentInfo incidentInfo;

    /**
     * Get the created property: The time the bookmark was created.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Set the created property: The time the bookmark was created.
     *
     * @param created the created value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the createdBy property: Describes a user that created the bookmark.
     *
     * @return the createdBy value.
     */
    public UserInfo createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: Describes a user that created the bookmark.
     *
     * @param createdBy the createdBy value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withCreatedBy(UserInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the displayName property: The display name of the bookmark.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the bookmark.
     *
     * @param displayName the displayName value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the eventTime property: The time of the event.
     *
     * @return the eventTime value.
     */
    public OffsetDateTime eventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime property: The time of the event.
     *
     * @param eventTime the eventTime value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withEventTime(OffsetDateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the labels property: List of labels relevant to this bookmark.
     *
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: List of labels relevant to this bookmark.
     *
     * @param labels the labels value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the notes property: The notes of the bookmark.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: The notes of the bookmark.
     *
     * @param notes the notes value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the query property: The query of the bookmark.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The query of the bookmark.
     *
     * @param query the query value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the queryResult property: The query result of the bookmark.
     *
     * @return the queryResult value.
     */
    public String queryResult() {
        return this.queryResult;
    }

    /**
     * Set the queryResult property: The query result of the bookmark.
     *
     * @param queryResult the queryResult value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withQueryResult(String queryResult) {
        this.queryResult = queryResult;
        return this;
    }

    /**
     * Get the updated property: The last time the bookmark was updated.
     *
     * @return the updated value.
     */
    public OffsetDateTime updated() {
        return this.updated;
    }

    /**
     * Set the updated property: The last time the bookmark was updated.
     *
     * @param updated the updated value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the updatedBy property: Describes a user that updated the bookmark.
     *
     * @return the updatedBy value.
     */
    public UserInfo updatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the updatedBy property: Describes a user that updated the bookmark.
     *
     * @param updatedBy the updatedBy value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withUpdatedBy(UserInfo updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get the incidentInfo property: Describes an incident that relates to bookmark.
     *
     * @return the incidentInfo value.
     */
    public IncidentInfo incidentInfo() {
        return this.incidentInfo;
    }

    /**
     * Set the incidentInfo property: Describes an incident that relates to bookmark.
     *
     * @param incidentInfo the incidentInfo value to set.
     * @return the HuntingBookmarkProperties object itself.
     */
    public HuntingBookmarkProperties withIncidentInfo(IncidentInfo incidentInfo) {
        this.incidentInfo = incidentInfo;
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
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model HuntingBookmarkProperties"));
        }
        if (query() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property query in model HuntingBookmarkProperties"));
        }
        if (updatedBy() != null) {
            updatedBy().validate();
        }
        if (incidentInfo() != null) {
            incidentInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HuntingBookmarkProperties.class);
}
