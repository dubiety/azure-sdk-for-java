// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines the Web Application Firewall policy for the endpoint (if applicable).
 */
@Fluent
public final class EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink
    implements JsonSerializable<EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink> {
    /*
     * Resource ID.
     */
    private String id;

    /**
     * Creates an instance of EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink class.
     */
    public EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink() {
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink object itself.
     */
    public EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink.
     */
    public static EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink deserializedEndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink
                = new EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink.id
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink;
        });
    }
}
