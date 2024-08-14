// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Specifies the action to post to service when the rule condition is evaluated. The discriminator is always
 * RuleWebhookAction in this case.
 */
@Fluent
public final class RuleWebhookAction extends RuleAction {
    /*
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     */
    private String odataType = "Microsoft.Azure.Management.Insights.Models.RuleWebhookAction";

    /*
     * the service uri to Post the notification when the alert activates or resolves.
     */
    private String serviceUri;

    /*
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook
     * payload.
     */
    private Map<String, String> properties;

    /**
     * Creates an instance of RuleWebhookAction class.
     */
    public RuleWebhookAction() {
    }

    /**
     * Get the odataType property: specifies the type of the action. There are two types of actions: RuleEmailAction and
     * RuleWebhookAction.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the serviceUri property: the service uri to Post the notification when the alert activates or resolves.
     * 
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: the service uri to Post the notification when the alert activates or resolves.
     * 
     * @param serviceUri the serviceUri value to set.
     * @return the RuleWebhookAction object itself.
     */
    public RuleWebhookAction withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the properties property: the dictionary of custom properties to include with the post operation. These data
     * are appended to the webhook payload.
     * 
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: the dictionary of custom properties to include with the post operation. These data
     * are appended to the webhook payload.
     * 
     * @param properties the properties value to set.
     * @return the RuleWebhookAction object itself.
     */
    public RuleWebhookAction withProperties(Map<String, String> properties) {
        this.properties = properties;
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("odata.type", this.odataType);
        jsonWriter.writeStringField("serviceUri", this.serviceUri);
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleWebhookAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleWebhookAction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleWebhookAction.
     */
    public static RuleWebhookAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleWebhookAction deserializedRuleWebhookAction = new RuleWebhookAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("odata.type".equals(fieldName)) {
                    deserializedRuleWebhookAction.odataType = reader.getString();
                } else if ("serviceUri".equals(fieldName)) {
                    deserializedRuleWebhookAction.serviceUri = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedRuleWebhookAction.properties = properties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleWebhookAction;
        });
    }
}
