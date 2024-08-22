// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The DataQualityMonitoringSignal model.
 */
@Fluent
public final class DataQualityMonitoringSignal extends MonitoringSignalBase {
    /*
     * [Required] Specifies the type of signal to monitor.
     */
    private MonitoringSignalType signalType = MonitoringSignalType.DATA_QUALITY;

    /*
     * The features to calculate drift over.
     */
    private MonitoringFeatureFilterBase features;

    /*
     * The settings for computing feature importance.
     */
    private FeatureImportanceSettings featureImportanceSettings;

    /*
     * [Required] A list of metrics to calculate and their associated thresholds.
     */
    private List<DataQualityMetricThresholdBase> metricThresholds;

    /*
     * [Required] The data produced by the production service which drift will be calculated for.
     */
    private MonitoringInputDataBase productionData;

    /*
     * [Required] The data to calculate drift against.
     */
    private MonitoringInputDataBase referenceData;

    /*
     * A dictionary that maps feature names to their respective data types.
     */
    private Map<String, MonitoringFeatureDataType> featureDataTypeOverride;

    /**
     * Creates an instance of DataQualityMonitoringSignal class.
     */
    public DataQualityMonitoringSignal() {
    }

    /**
     * Get the signalType property: [Required] Specifies the type of signal to monitor.
     * 
     * @return the signalType value.
     */
    @Override
    public MonitoringSignalType signalType() {
        return this.signalType;
    }

    /**
     * Get the features property: The features to calculate drift over.
     * 
     * @return the features value.
     */
    public MonitoringFeatureFilterBase features() {
        return this.features;
    }

    /**
     * Set the features property: The features to calculate drift over.
     * 
     * @param features the features value to set.
     * @return the DataQualityMonitoringSignal object itself.
     */
    public DataQualityMonitoringSignal withFeatures(MonitoringFeatureFilterBase features) {
        this.features = features;
        return this;
    }

    /**
     * Get the featureImportanceSettings property: The settings for computing feature importance.
     * 
     * @return the featureImportanceSettings value.
     */
    public FeatureImportanceSettings featureImportanceSettings() {
        return this.featureImportanceSettings;
    }

    /**
     * Set the featureImportanceSettings property: The settings for computing feature importance.
     * 
     * @param featureImportanceSettings the featureImportanceSettings value to set.
     * @return the DataQualityMonitoringSignal object itself.
     */
    public DataQualityMonitoringSignal
        withFeatureImportanceSettings(FeatureImportanceSettings featureImportanceSettings) {
        this.featureImportanceSettings = featureImportanceSettings;
        return this;
    }

    /**
     * Get the metricThresholds property: [Required] A list of metrics to calculate and their associated thresholds.
     * 
     * @return the metricThresholds value.
     */
    public List<DataQualityMetricThresholdBase> metricThresholds() {
        return this.metricThresholds;
    }

    /**
     * Set the metricThresholds property: [Required] A list of metrics to calculate and their associated thresholds.
     * 
     * @param metricThresholds the metricThresholds value to set.
     * @return the DataQualityMonitoringSignal object itself.
     */
    public DataQualityMonitoringSignal withMetricThresholds(List<DataQualityMetricThresholdBase> metricThresholds) {
        this.metricThresholds = metricThresholds;
        return this;
    }

    /**
     * Get the productionData property: [Required] The data produced by the production service which drift will be
     * calculated for.
     * 
     * @return the productionData value.
     */
    public MonitoringInputDataBase productionData() {
        return this.productionData;
    }

    /**
     * Set the productionData property: [Required] The data produced by the production service which drift will be
     * calculated for.
     * 
     * @param productionData the productionData value to set.
     * @return the DataQualityMonitoringSignal object itself.
     */
    public DataQualityMonitoringSignal withProductionData(MonitoringInputDataBase productionData) {
        this.productionData = productionData;
        return this;
    }

    /**
     * Get the referenceData property: [Required] The data to calculate drift against.
     * 
     * @return the referenceData value.
     */
    public MonitoringInputDataBase referenceData() {
        return this.referenceData;
    }

    /**
     * Set the referenceData property: [Required] The data to calculate drift against.
     * 
     * @param referenceData the referenceData value to set.
     * @return the DataQualityMonitoringSignal object itself.
     */
    public DataQualityMonitoringSignal withReferenceData(MonitoringInputDataBase referenceData) {
        this.referenceData = referenceData;
        return this;
    }

    /**
     * Get the featureDataTypeOverride property: A dictionary that maps feature names to their respective data types.
     * 
     * @return the featureDataTypeOverride value.
     */
    public Map<String, MonitoringFeatureDataType> featureDataTypeOverride() {
        return this.featureDataTypeOverride;
    }

    /**
     * Set the featureDataTypeOverride property: A dictionary that maps feature names to their respective data types.
     * 
     * @param featureDataTypeOverride the featureDataTypeOverride value to set.
     * @return the DataQualityMonitoringSignal object itself.
     */
    public DataQualityMonitoringSignal
        withFeatureDataTypeOverride(Map<String, MonitoringFeatureDataType> featureDataTypeOverride) {
        this.featureDataTypeOverride = featureDataTypeOverride;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataQualityMonitoringSignal withNotificationTypes(List<MonitoringNotificationType> notificationTypes) {
        super.withNotificationTypes(notificationTypes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataQualityMonitoringSignal withProperties(Map<String, String> properties) {
        super.withProperties(properties);
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
        if (features() != null) {
            features().validate();
        }
        if (featureImportanceSettings() != null) {
            featureImportanceSettings().validate();
        }
        if (metricThresholds() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property metricThresholds in model DataQualityMonitoringSignal"));
        } else {
            metricThresholds().forEach(e -> e.validate());
        }
        if (productionData() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property productionData in model DataQualityMonitoringSignal"));
        } else {
            productionData().validate();
        }
        if (referenceData() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property referenceData in model DataQualityMonitoringSignal"));
        } else {
            referenceData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataQualityMonitoringSignal.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("notificationTypes", notificationTypes(),
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("metricThresholds", this.metricThresholds,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("productionData", this.productionData);
        jsonWriter.writeJsonField("referenceData", this.referenceData);
        jsonWriter.writeStringField("signalType", this.signalType == null ? null : this.signalType.toString());
        jsonWriter.writeJsonField("features", this.features);
        jsonWriter.writeJsonField("featureImportanceSettings", this.featureImportanceSettings);
        jsonWriter.writeMapField("featureDataTypeOverride", this.featureDataTypeOverride,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataQualityMonitoringSignal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataQualityMonitoringSignal if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataQualityMonitoringSignal.
     */
    public static DataQualityMonitoringSignal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataQualityMonitoringSignal deserializedDataQualityMonitoringSignal = new DataQualityMonitoringSignal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("notificationTypes".equals(fieldName)) {
                    List<MonitoringNotificationType> notificationTypes
                        = reader.readArray(reader1 -> MonitoringNotificationType.fromString(reader1.getString()));
                    deserializedDataQualityMonitoringSignal.withNotificationTypes(notificationTypes);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedDataQualityMonitoringSignal.withProperties(properties);
                } else if ("metricThresholds".equals(fieldName)) {
                    List<DataQualityMetricThresholdBase> metricThresholds
                        = reader.readArray(reader1 -> DataQualityMetricThresholdBase.fromJson(reader1));
                    deserializedDataQualityMonitoringSignal.metricThresholds = metricThresholds;
                } else if ("productionData".equals(fieldName)) {
                    deserializedDataQualityMonitoringSignal.productionData = MonitoringInputDataBase.fromJson(reader);
                } else if ("referenceData".equals(fieldName)) {
                    deserializedDataQualityMonitoringSignal.referenceData = MonitoringInputDataBase.fromJson(reader);
                } else if ("signalType".equals(fieldName)) {
                    deserializedDataQualityMonitoringSignal.signalType
                        = MonitoringSignalType.fromString(reader.getString());
                } else if ("features".equals(fieldName)) {
                    deserializedDataQualityMonitoringSignal.features = MonitoringFeatureFilterBase.fromJson(reader);
                } else if ("featureImportanceSettings".equals(fieldName)) {
                    deserializedDataQualityMonitoringSignal.featureImportanceSettings
                        = FeatureImportanceSettings.fromJson(reader);
                } else if ("featureDataTypeOverride".equals(fieldName)) {
                    Map<String, MonitoringFeatureDataType> featureDataTypeOverride
                        = reader.readMap(reader1 -> MonitoringFeatureDataType.fromString(reader1.getString()));
                    deserializedDataQualityMonitoringSignal.featureDataTypeOverride = featureDataTypeOverride;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataQualityMonitoringSignal;
        });
    }
}
