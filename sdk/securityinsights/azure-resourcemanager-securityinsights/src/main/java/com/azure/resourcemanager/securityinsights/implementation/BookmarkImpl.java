// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.BookmarkInner;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.Bookmark;
import com.azure.resourcemanager.securityinsights.models.BookmarkEntityMappings;
import com.azure.resourcemanager.securityinsights.models.IncidentInfo;
import com.azure.resourcemanager.securityinsights.models.UserInfo;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class BookmarkImpl implements Bookmark, Bookmark.Definition, Bookmark.Update {
    private BookmarkInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public UserInfo createdBy() {
        return this.innerModel().createdBy();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public List<String> labels() {
        List<String> inner = this.innerModel().labels();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String notes() {
        return this.innerModel().notes();
    }

    public String query() {
        return this.innerModel().query();
    }

    public String queryResult() {
        return this.innerModel().queryResult();
    }

    public OffsetDateTime updated() {
        return this.innerModel().updated();
    }

    public UserInfo updatedBy() {
        return this.innerModel().updatedBy();
    }

    public OffsetDateTime eventTime() {
        return this.innerModel().eventTime();
    }

    public OffsetDateTime queryStartTime() {
        return this.innerModel().queryStartTime();
    }

    public OffsetDateTime queryEndTime() {
        return this.innerModel().queryEndTime();
    }

    public IncidentInfo incidentInfo() {
        return this.innerModel().incidentInfo();
    }

    public List<BookmarkEntityMappings> entityMappings() {
        List<BookmarkEntityMappings> inner = this.innerModel().entityMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AttackTactic> tactics() {
        List<AttackTactic> inner = this.innerModel().tactics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> techniques() {
        List<String> inner = this.innerModel().techniques();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BookmarkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String bookmarkId;

    public BookmarkImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public Bookmark create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBookmarks()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, bookmarkId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Bookmark create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBookmarks()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, bookmarkId, this.innerModel(), context)
                .getValue();
        return this;
    }

    BookmarkImpl(String name, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = new BookmarkInner();
        this.serviceManager = serviceManager;
        this.bookmarkId = name;
    }

    public BookmarkImpl update() {
        return this;
    }

    public Bookmark apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBookmarks()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, bookmarkId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Bookmark apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBookmarks()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, bookmarkId, this.innerModel(), context)
                .getValue();
        return this;
    }

    BookmarkImpl(
        BookmarkInner innerObject, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.bookmarkId = Utils.getValueFromIdByName(innerObject.id(), "bookmarks");
    }

    public Bookmark refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBookmarks()
                .getWithResponse(resourceGroupName, workspaceName, bookmarkId, Context.NONE)
                .getValue();
        return this;
    }

    public Bookmark refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBookmarks()
                .getWithResponse(resourceGroupName, workspaceName, bookmarkId, context)
                .getValue();
        return this;
    }

    public BookmarkImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public BookmarkImpl withCreated(OffsetDateTime created) {
        this.innerModel().withCreated(created);
        return this;
    }

    public BookmarkImpl withCreatedBy(UserInfo createdBy) {
        this.innerModel().withCreatedBy(createdBy);
        return this;
    }

    public BookmarkImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public BookmarkImpl withLabels(List<String> labels) {
        this.innerModel().withLabels(labels);
        return this;
    }

    public BookmarkImpl withNotes(String notes) {
        this.innerModel().withNotes(notes);
        return this;
    }

    public BookmarkImpl withQuery(String query) {
        this.innerModel().withQuery(query);
        return this;
    }

    public BookmarkImpl withQueryResult(String queryResult) {
        this.innerModel().withQueryResult(queryResult);
        return this;
    }

    public BookmarkImpl withUpdated(OffsetDateTime updated) {
        this.innerModel().withUpdated(updated);
        return this;
    }

    public BookmarkImpl withUpdatedBy(UserInfo updatedBy) {
        this.innerModel().withUpdatedBy(updatedBy);
        return this;
    }

    public BookmarkImpl withEventTime(OffsetDateTime eventTime) {
        this.innerModel().withEventTime(eventTime);
        return this;
    }

    public BookmarkImpl withQueryStartTime(OffsetDateTime queryStartTime) {
        this.innerModel().withQueryStartTime(queryStartTime);
        return this;
    }

    public BookmarkImpl withQueryEndTime(OffsetDateTime queryEndTime) {
        this.innerModel().withQueryEndTime(queryEndTime);
        return this;
    }

    public BookmarkImpl withIncidentInfo(IncidentInfo incidentInfo) {
        this.innerModel().withIncidentInfo(incidentInfo);
        return this;
    }

    public BookmarkImpl withEntityMappings(List<BookmarkEntityMappings> entityMappings) {
        this.innerModel().withEntityMappings(entityMappings);
        return this;
    }

    public BookmarkImpl withTactics(List<AttackTactic> tactics) {
        this.innerModel().withTactics(tactics);
        return this;
    }

    public BookmarkImpl withTechniques(List<String> techniques) {
        this.innerModel().withTechniques(techniques);
        return this;
    }
}
