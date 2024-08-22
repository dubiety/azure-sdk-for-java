// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Strictly used in update requests.
 */
@Fluent
public final class PartialMinimalTrackedResourceWithIdentity extends PartialMinimalTrackedResource {
    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    private PartialManagedServiceIdentity identity;

    /**
     * Creates an instance of PartialMinimalTrackedResourceWithIdentity class.
     */
    public PartialMinimalTrackedResourceWithIdentity() {
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public PartialManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the PartialMinimalTrackedResourceWithIdentity object itself.
     */
    public PartialMinimalTrackedResourceWithIdentity withIdentity(PartialManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartialMinimalTrackedResourceWithIdentity withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PartialMinimalTrackedResourceWithIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PartialMinimalTrackedResourceWithIdentity if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PartialMinimalTrackedResourceWithIdentity.
     */
    public static PartialMinimalTrackedResourceWithIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PartialMinimalTrackedResourceWithIdentity deserializedPartialMinimalTrackedResourceWithIdentity
                = new PartialMinimalTrackedResourceWithIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPartialMinimalTrackedResourceWithIdentity.withTags(tags);
                } else if ("identity".equals(fieldName)) {
                    deserializedPartialMinimalTrackedResourceWithIdentity.identity
                        = PartialManagedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPartialMinimalTrackedResourceWithIdentity;
        });
    }
}
