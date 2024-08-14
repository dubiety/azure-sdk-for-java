// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Definition of the network rules.
 */
@Fluent
public class NetworkRuleSet implements JsonSerializable<NetworkRuleSet> {
    /*
     * The configuration to set whether network access from public internet to the endpoints are allowed.
     */
    private KnownPublicNetworkAccessOptions publicNetworkAccess;

    /**
     * Creates an instance of NetworkRuleSet class.
     */
    public NetworkRuleSet() {
    }

    /**
     * Get the publicNetworkAccess property: The configuration to set whether network access from public internet to the
     * endpoints are allowed.
     * 
     * @return the publicNetworkAccess value.
     */
    public KnownPublicNetworkAccessOptions publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: The configuration to set whether network access from public internet to the
     * endpoints are allowed.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withPublicNetworkAccess(KnownPublicNetworkAccessOptions publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
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
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkRuleSet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkRuleSet.
     */
    public static NetworkRuleSet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSet deserializedNetworkRuleSet = new NetworkRuleSet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedNetworkRuleSet.publicNetworkAccess
                        = KnownPublicNetworkAccessOptions.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkRuleSet;
        });
    }
}
