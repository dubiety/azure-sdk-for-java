// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import java.io.IOException;

/**
 * Friendly RuleSet name mapping to the any RuleSet or secret related information.
 */
@Immutable
public final class RuleSetInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the Rule Set to create.
     */
    private RuleSetProperties innerProperties;

    /*
     * Read only system data
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of RuleSetInner class.
     */
    public RuleSetInner() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the Rule Set to create.
     * 
     * @return the innerProperties value.
     */
    private RuleSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the profileName property: The name of the profile which holds the rule set.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleSetInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleSetInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RuleSetInner.
     */
    public static RuleSetInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleSetInner deserializedRuleSetInner = new RuleSetInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRuleSetInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRuleSetInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRuleSetInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedRuleSetInner.innerProperties = RuleSetProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedRuleSetInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleSetInner;
        });
    }
}
