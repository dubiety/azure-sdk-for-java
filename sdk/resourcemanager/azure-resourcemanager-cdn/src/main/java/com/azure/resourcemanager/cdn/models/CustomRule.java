// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines the common attributes for a custom rule that can be included in a waf policy.
 */
@Fluent
public class CustomRule implements JsonSerializable<CustomRule> {
    /*
     * Defines the name of the custom rule
     */
    private String name;

    /*
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     */
    private CustomRuleEnabledState enabledState;

    /*
     * Defines in what order this rule be evaluated in the overall list of custom rules
     */
    private int priority;

    /*
     * List of match conditions.
     */
    private List<MatchCondition> matchConditions;

    /*
     * Describes what action to be applied when rule matches
     */
    private ActionType action;

    /**
     * Creates an instance of CustomRule class.
     */
    public CustomRule() {
    }

    /**
     * Get the name property: Defines the name of the custom rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Defines the name of the custom rule.
     * 
     * @param name the name value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the enabledState property: Describes if the custom rule is in enabled or disabled state. Defaults to Enabled
     * if not specified.
     * 
     * @return the enabledState value.
     */
    public CustomRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Describes if the custom rule is in enabled or disabled state. Defaults to Enabled
     * if not specified.
     * 
     * @param enabledState the enabledState value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withEnabledState(CustomRuleEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the priority property: Defines in what order this rule be evaluated in the overall list of custom rules.
     * 
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Defines in what order this rule be evaluated in the overall list of custom rules.
     * 
     * @param priority the priority value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the matchConditions property: List of match conditions.
     * 
     * @return the matchConditions value.
     */
    public List<MatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set the matchConditions property: List of match conditions.
     * 
     * @param matchConditions the matchConditions value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get the action property: Describes what action to be applied when rule matches.
     * 
     * @return the action value.
     */
    public ActionType action() {
        return this.action;
    }

    /**
     * Set the action property: Describes what action to be applied when rule matches.
     * 
     * @param action the action value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withAction(ActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model CustomRule"));
        }
        if (matchConditions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property matchConditions in model CustomRule"));
        } else {
            matchConditions().forEach(e -> e.validate());
        }
        if (action() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property action in model CustomRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeIntField("priority", this.priority);
        jsonWriter.writeArrayField("matchConditions", this.matchConditions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
        jsonWriter.writeStringField("enabledState", this.enabledState == null ? null : this.enabledState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomRule if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomRule.
     */
    public static CustomRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomRule deserializedCustomRule = new CustomRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCustomRule.name = reader.getString();
                } else if ("priority".equals(fieldName)) {
                    deserializedCustomRule.priority = reader.getInt();
                } else if ("matchConditions".equals(fieldName)) {
                    List<MatchCondition> matchConditions
                        = reader.readArray(reader1 -> MatchCondition.fromJson(reader1));
                    deserializedCustomRule.matchConditions = matchConditions;
                } else if ("action".equals(fieldName)) {
                    deserializedCustomRule.action = ActionType.fromString(reader.getString());
                } else if ("enabledState".equals(fieldName)) {
                    deserializedCustomRule.enabledState = CustomRuleEnabledState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomRule;
        });
    }
}
