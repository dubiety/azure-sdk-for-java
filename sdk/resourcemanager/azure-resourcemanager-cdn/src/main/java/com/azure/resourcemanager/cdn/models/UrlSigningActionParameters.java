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
import java.util.List;

/**
 * Defines the parameters for the Url Signing action.
 */
@Fluent
public final class UrlSigningActionParameters implements JsonSerializable<UrlSigningActionParameters> {
    /*
     * The typeName property.
     */
    private String typeName = "DeliveryRuleUrlSigningActionParameters";

    /*
     * Algorithm to use for URL signing
     */
    private Algorithm algorithm;

    /*
     * Defines which query string parameters in the url to be considered for expires, key id etc.
     */
    private List<UrlSigningParamIdentifier> parameterNameOverride;

    /**
     * Creates an instance of UrlSigningActionParameters class.
     */
    public UrlSigningActionParameters() {
    }

    /**
     * Get the typeName property: The typeName property.
     * 
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     * 
     * @param typeName the typeName value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the algorithm property: Algorithm to use for URL signing.
     * 
     * @return the algorithm value.
     */
    public Algorithm algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Algorithm to use for URL signing.
     * 
     * @param algorithm the algorithm value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the parameterNameOverride property: Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     * 
     * @return the parameterNameOverride value.
     */
    public List<UrlSigningParamIdentifier> parameterNameOverride() {
        return this.parameterNameOverride;
    }

    /**
     * Set the parameterNameOverride property: Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     * 
     * @param parameterNameOverride the parameterNameOverride value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withParameterNameOverride(List<UrlSigningParamIdentifier> parameterNameOverride) {
        this.parameterNameOverride = parameterNameOverride;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameterNameOverride() != null) {
            parameterNameOverride().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("typeName", this.typeName);
        jsonWriter.writeStringField("algorithm", this.algorithm == null ? null : this.algorithm.toString());
        jsonWriter.writeArrayField("parameterNameOverride", this.parameterNameOverride,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UrlSigningActionParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UrlSigningActionParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UrlSigningActionParameters.
     */
    public static UrlSigningActionParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UrlSigningActionParameters deserializedUrlSigningActionParameters = new UrlSigningActionParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("algorithm".equals(fieldName)) {
                    deserializedUrlSigningActionParameters.algorithm = Algorithm.fromString(reader.getString());
                } else if ("parameterNameOverride".equals(fieldName)) {
                    List<UrlSigningParamIdentifier> parameterNameOverride
                        = reader.readArray(reader1 -> UrlSigningParamIdentifier.fromJson(reader1));
                    deserializedUrlSigningActionParameters.parameterNameOverride = parameterNameOverride;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUrlSigningActionParameters;
        });
    }
}
