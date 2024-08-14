// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.models.ActionList;
import com.azure.resourcemanager.monitor.models.ActivityLogAlertAllOfCondition;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * An Activity Log Alert rule resource.
 */
@Fluent
public final class ActivityLogAlertResourceInner extends Resource {
    /*
     * The Activity Log Alert rule properties of the resource.
     */
    private AlertRuleProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ActivityLogAlertResourceInner class.
     */
    public ActivityLogAlertResourceInner() {
    }

    /**
     * Get the innerProperties property: The Activity Log Alert rule properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private AlertRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActivityLogAlertResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActivityLogAlertResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.innerProperties() == null ? null : this.innerProperties().scopes();
    }

    /**
     * Set the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     * 
     * @param scopes the scopes value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withScopes(List<String> scopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRuleProperties();
        }
        this.innerProperties().withScopes(scopes);
        return this;
    }

    /**
     * Get the condition property: The condition that will cause this alert to activate.
     * 
     * @return the condition value.
     */
    public ActivityLogAlertAllOfCondition condition() {
        return this.innerProperties() == null ? null : this.innerProperties().condition();
    }

    /**
     * Set the condition property: The condition that will cause this alert to activate.
     * 
     * @param condition the condition value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withCondition(ActivityLogAlertAllOfCondition condition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRuleProperties();
        }
        this.innerProperties().withCondition(condition);
        return this;
    }

    /**
     * Get the actions property: The actions that will activate when the condition is met.
     * 
     * @return the actions value.
     */
    public ActionList actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: The actions that will activate when the condition is met.
     * 
     * @param actions the actions value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withActions(ActionList actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRuleProperties();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @param enabled the enabled value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRuleProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the description property: A description of this Activity Log Alert rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of this Activity Log Alert rule.
     * 
     * @param description the description value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRuleProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActivityLogAlertResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActivityLogAlertResourceInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ActivityLogAlertResourceInner.
     */
    public static ActivityLogAlertResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActivityLogAlertResourceInner deserializedActivityLogAlertResourceInner
                = new ActivityLogAlertResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedActivityLogAlertResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedActivityLogAlertResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedActivityLogAlertResourceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedActivityLogAlertResourceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedActivityLogAlertResourceInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedActivityLogAlertResourceInner.innerProperties = AlertRuleProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActivityLogAlertResourceInner;
        });
    }
}
