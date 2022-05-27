// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** todoTaskList. */
@Fluent
public final class MicrosoftGraphTodoTaskList extends MicrosoftGraphEntity {
    /*
     * The name of the task list.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * True if the user is owner of the given task list.
     */
    @JsonProperty(value = "isOwner")
    private Boolean isOwner;

    /*
     * True if the task list is shared with other users
     */
    @JsonProperty(value = "isShared")
    private Boolean isShared;

    /*
     * wellknownListName
     */
    @JsonProperty(value = "wellknownListName")
    private MicrosoftGraphWellknownListName wellknownListName;

    /*
     * The collection of open extensions defined for the task list. Nullable.
     */
    @JsonProperty(value = "extensions")
    private List<MicrosoftGraphExtension> extensions;

    /*
     * The tasks in this task list. Read-only. Nullable.
     */
    @JsonProperty(value = "tasks")
    private List<MicrosoftGraphTodoTask> tasks;

    /*
     * todoTaskList
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The name of the task list.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the task list.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isOwner property: True if the user is owner of the given task list.
     *
     * @return the isOwner value.
     */
    public Boolean isOwner() {
        return this.isOwner;
    }

    /**
     * Set the isOwner property: True if the user is owner of the given task list.
     *
     * @param isOwner the isOwner value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    /**
     * Get the isShared property: True if the task list is shared with other users.
     *
     * @return the isShared value.
     */
    public Boolean isShared() {
        return this.isShared;
    }

    /**
     * Set the isShared property: True if the task list is shared with other users.
     *
     * @param isShared the isShared value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }

    /**
     * Get the wellknownListName property: wellknownListName.
     *
     * @return the wellknownListName value.
     */
    public MicrosoftGraphWellknownListName wellknownListName() {
        return this.wellknownListName;
    }

    /**
     * Set the wellknownListName property: wellknownListName.
     *
     * @param wellknownListName the wellknownListName value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withWellknownListName(MicrosoftGraphWellknownListName wellknownListName) {
        this.wellknownListName = wellknownListName;
        return this;
    }

    /**
     * Get the extensions property: The collection of open extensions defined for the task list. Nullable.
     *
     * @return the extensions value.
     */
    public List<MicrosoftGraphExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The collection of open extensions defined for the task list. Nullable.
     *
     * @param extensions the extensions value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withExtensions(List<MicrosoftGraphExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the tasks property: The tasks in this task list. Read-only. Nullable.
     *
     * @return the tasks value.
     */
    public List<MicrosoftGraphTodoTask> tasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The tasks in this task list. Read-only. Nullable.
     *
     * @param tasks the tasks value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withTasks(List<MicrosoftGraphTodoTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the additionalProperties property: todoTaskList.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: todoTaskList.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTodoTaskList object itself.
     */
    public MicrosoftGraphTodoTaskList withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTodoTaskList withId(String id) {
        super.withId(id);
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
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
        if (tasks() != null) {
            tasks().forEach(e -> e.validate());
        }
    }
}
