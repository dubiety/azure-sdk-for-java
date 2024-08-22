// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Abstract class for AutoML tasks that use table dataset as input - such as Classification/Regression/Forecasting.
 */
@Fluent
public class TableVertical implements JsonSerializable<TableVertical> {
    /*
     * Execution constraints for AutoMLJob.
     */
    private TableVerticalLimitSettings limitSettings;

    /*
     * Number of cross validation folds to be applied on training dataset
     * when validation dataset is not provided.
     */
    private NCrossValidations nCrossValidations;

    /*
     * Columns to use for CVSplit data.
     */
    private List<String> cvSplitColumnNames;

    /*
     * The name of the sample weight column. Automated ML supports a weighted column as an input, causing rows in the
     * data to be weighted up or down.
     */
    private String weightColumnName;

    /*
     * Validation data inputs.
     */
    private MLTableJobInput validationData;

    /*
     * Test data input.
     */
    private MLTableJobInput testData;

    /*
     * The fraction of training dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     */
    private Double validationDataSize;

    /*
     * The fraction of test dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     */
    private Double testDataSize;

    /*
     * Featurization inputs needed for AutoML job.
     */
    private TableVerticalFeaturizationSettings featurizationSettings;

    /**
     * Creates an instance of TableVertical class.
     */
    public TableVertical() {
    }

    /**
     * Get the limitSettings property: Execution constraints for AutoMLJob.
     * 
     * @return the limitSettings value.
     */
    public TableVerticalLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: Execution constraints for AutoMLJob.
     * 
     * @param limitSettings the limitSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withLimitSettings(TableVerticalLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /**
     * Get the nCrossValidations property: Number of cross validation folds to be applied on training dataset
     * when validation dataset is not provided.
     * 
     * @return the nCrossValidations value.
     */
    public NCrossValidations nCrossValidations() {
        return this.nCrossValidations;
    }

    /**
     * Set the nCrossValidations property: Number of cross validation folds to be applied on training dataset
     * when validation dataset is not provided.
     * 
     * @param nCrossValidations the nCrossValidations value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withNCrossValidations(NCrossValidations nCrossValidations) {
        this.nCrossValidations = nCrossValidations;
        return this;
    }

    /**
     * Get the cvSplitColumnNames property: Columns to use for CVSplit data.
     * 
     * @return the cvSplitColumnNames value.
     */
    public List<String> cvSplitColumnNames() {
        return this.cvSplitColumnNames;
    }

    /**
     * Set the cvSplitColumnNames property: Columns to use for CVSplit data.
     * 
     * @param cvSplitColumnNames the cvSplitColumnNames value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withCvSplitColumnNames(List<String> cvSplitColumnNames) {
        this.cvSplitColumnNames = cvSplitColumnNames;
        return this;
    }

    /**
     * Get the weightColumnName property: The name of the sample weight column. Automated ML supports a weighted column
     * as an input, causing rows in the data to be weighted up or down.
     * 
     * @return the weightColumnName value.
     */
    public String weightColumnName() {
        return this.weightColumnName;
    }

    /**
     * Set the weightColumnName property: The name of the sample weight column. Automated ML supports a weighted column
     * as an input, causing rows in the data to be weighted up or down.
     * 
     * @param weightColumnName the weightColumnName value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withWeightColumnName(String weightColumnName) {
        this.weightColumnName = weightColumnName;
        return this;
    }

    /**
     * Get the validationData property: Validation data inputs.
     * 
     * @return the validationData value.
     */
    public MLTableJobInput validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Validation data inputs.
     * 
     * @param validationData the validationData value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withValidationData(MLTableJobInput validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get the testData property: Test data input.
     * 
     * @return the testData value.
     */
    public MLTableJobInput testData() {
        return this.testData;
    }

    /**
     * Set the testData property: Test data input.
     * 
     * @param testData the testData value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withTestData(MLTableJobInput testData) {
        this.testData = testData;
        return this;
    }

    /**
     * Get the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     * 
     * @return the validationDataSize value.
     */
    public Double validationDataSize() {
        return this.validationDataSize;
    }

    /**
     * Set the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     * 
     * @param validationDataSize the validationDataSize value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withValidationDataSize(Double validationDataSize) {
        this.validationDataSize = validationDataSize;
        return this;
    }

    /**
     * Get the testDataSize property: The fraction of test dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     * 
     * @return the testDataSize value.
     */
    public Double testDataSize() {
        return this.testDataSize;
    }

    /**
     * Set the testDataSize property: The fraction of test dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     * 
     * @param testDataSize the testDataSize value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withTestDataSize(Double testDataSize) {
        this.testDataSize = testDataSize;
        return this;
    }

    /**
     * Get the featurizationSettings property: Featurization inputs needed for AutoML job.
     * 
     * @return the featurizationSettings value.
     */
    public TableVerticalFeaturizationSettings featurizationSettings() {
        return this.featurizationSettings;
    }

    /**
     * Set the featurizationSettings property: Featurization inputs needed for AutoML job.
     * 
     * @param featurizationSettings the featurizationSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withFeaturizationSettings(TableVerticalFeaturizationSettings featurizationSettings) {
        this.featurizationSettings = featurizationSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (limitSettings() != null) {
            limitSettings().validate();
        }
        if (nCrossValidations() != null) {
            nCrossValidations().validate();
        }
        if (validationData() != null) {
            validationData().validate();
        }
        if (testData() != null) {
            testData().validate();
        }
        if (featurizationSettings() != null) {
            featurizationSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("limitSettings", this.limitSettings);
        jsonWriter.writeJsonField("nCrossValidations", this.nCrossValidations);
        jsonWriter.writeArrayField("cvSplitColumnNames", this.cvSplitColumnNames,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("weightColumnName", this.weightColumnName);
        jsonWriter.writeJsonField("validationData", this.validationData);
        jsonWriter.writeJsonField("testData", this.testData);
        jsonWriter.writeNumberField("validationDataSize", this.validationDataSize);
        jsonWriter.writeNumberField("testDataSize", this.testDataSize);
        jsonWriter.writeJsonField("featurizationSettings", this.featurizationSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableVertical from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableVertical if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableVertical.
     */
    public static TableVertical fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableVertical deserializedTableVertical = new TableVertical();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("limitSettings".equals(fieldName)) {
                    deserializedTableVertical.limitSettings = TableVerticalLimitSettings.fromJson(reader);
                } else if ("nCrossValidations".equals(fieldName)) {
                    deserializedTableVertical.nCrossValidations = NCrossValidations.fromJson(reader);
                } else if ("cvSplitColumnNames".equals(fieldName)) {
                    List<String> cvSplitColumnNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedTableVertical.cvSplitColumnNames = cvSplitColumnNames;
                } else if ("weightColumnName".equals(fieldName)) {
                    deserializedTableVertical.weightColumnName = reader.getString();
                } else if ("validationData".equals(fieldName)) {
                    deserializedTableVertical.validationData = MLTableJobInput.fromJson(reader);
                } else if ("testData".equals(fieldName)) {
                    deserializedTableVertical.testData = MLTableJobInput.fromJson(reader);
                } else if ("validationDataSize".equals(fieldName)) {
                    deserializedTableVertical.validationDataSize = reader.getNullable(JsonReader::getDouble);
                } else if ("testDataSize".equals(fieldName)) {
                    deserializedTableVertical.testDataSize = reader.getNullable(JsonReader::getDouble);
                } else if ("featurizationSettings".equals(fieldName)) {
                    deserializedTableVertical.featurizationSettings
                        = TableVerticalFeaturizationSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableVertical;
        });
    }
}
