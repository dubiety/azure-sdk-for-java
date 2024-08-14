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
 * Defines the parameters for UrlFilename match conditions.
 */
@Fluent
public final class UrlFileNameMatchConditionParameters
    implements JsonSerializable<UrlFileNameMatchConditionParameters> {
    /*
     * The typeName property.
     */
    private String typeName = "DeliveryRuleUrlFilenameConditionParameters";

    /*
     * Describes operator to be matched
     */
    private UrlFileNameOperator operator;

    /*
     * Describes if this is negate condition or not
     */
    private Boolean negateCondition;

    /*
     * The match value for the condition of the delivery rule
     */
    private List<String> matchValues;

    /*
     * List of transforms
     */
    private List<Transform> transforms;

    /**
     * Creates an instance of UrlFileNameMatchConditionParameters class.
     */
    public UrlFileNameMatchConditionParameters() {
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
     * @return the UrlFileNameMatchConditionParameters object itself.
     */
    public UrlFileNameMatchConditionParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     * 
     * @return the operator value.
     */
    public UrlFileNameOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     * 
     * @param operator the operator value to set.
     * @return the UrlFileNameMatchConditionParameters object itself.
     */
    public UrlFileNameMatchConditionParameters withOperator(UrlFileNameOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if this is negate condition or not.
     * 
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if this is negate condition or not.
     * 
     * @param negateCondition the negateCondition value to set.
     * @return the UrlFileNameMatchConditionParameters object itself.
     */
    public UrlFileNameMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the matchValues property: The match value for the condition of the delivery rule.
     * 
     * @return the matchValues value.
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the matchValues property: The match value for the condition of the delivery rule.
     * 
     * @param matchValues the matchValues value to set.
     * @return the UrlFileNameMatchConditionParameters object itself.
     */
    public UrlFileNameMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     * 
     * @return the transforms value.
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     * 
     * @param transforms the transforms value to set.
     * @return the UrlFileNameMatchConditionParameters object itself.
     */
    public UrlFileNameMatchConditionParameters withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property operator in model UrlFileNameMatchConditionParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UrlFileNameMatchConditionParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("typeName", this.typeName);
        jsonWriter.writeStringField("operator", this.operator == null ? null : this.operator.toString());
        jsonWriter.writeBooleanField("negateCondition", this.negateCondition);
        jsonWriter.writeArrayField("matchValues", this.matchValues, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("transforms", this.transforms,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UrlFileNameMatchConditionParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UrlFileNameMatchConditionParameters if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UrlFileNameMatchConditionParameters.
     */
    public static UrlFileNameMatchConditionParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UrlFileNameMatchConditionParameters deserializedUrlFileNameMatchConditionParameters
                = new UrlFileNameMatchConditionParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operator".equals(fieldName)) {
                    deserializedUrlFileNameMatchConditionParameters.operator
                        = UrlFileNameOperator.fromString(reader.getString());
                } else if ("negateCondition".equals(fieldName)) {
                    deserializedUrlFileNameMatchConditionParameters.negateCondition
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("matchValues".equals(fieldName)) {
                    List<String> matchValues = reader.readArray(reader1 -> reader1.getString());
                    deserializedUrlFileNameMatchConditionParameters.matchValues = matchValues;
                } else if ("transforms".equals(fieldName)) {
                    List<Transform> transforms = reader.readArray(reader1 -> Transform.fromString(reader1.getString()));
                    deserializedUrlFileNameMatchConditionParameters.transforms = transforms;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUrlFileNameMatchConditionParameters;
        });
    }
}
