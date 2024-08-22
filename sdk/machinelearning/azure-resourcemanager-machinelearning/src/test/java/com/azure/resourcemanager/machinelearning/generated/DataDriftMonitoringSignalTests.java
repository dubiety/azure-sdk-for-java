// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.DataDriftMetricThresholdBase;
import com.azure.resourcemanager.machinelearning.models.DataDriftMonitoringSignal;
import com.azure.resourcemanager.machinelearning.models.FeatureImportanceMode;
import com.azure.resourcemanager.machinelearning.models.FeatureImportanceSettings;
import com.azure.resourcemanager.machinelearning.models.JobInputType;
import com.azure.resourcemanager.machinelearning.models.MonitoringFeatureDataType;
import com.azure.resourcemanager.machinelearning.models.MonitoringFeatureFilterBase;
import com.azure.resourcemanager.machinelearning.models.MonitoringInputDataBase;
import com.azure.resourcemanager.machinelearning.models.MonitoringNotificationType;
import com.azure.resourcemanager.machinelearning.models.MonitoringThreshold;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataDriftMonitoringSignalTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataDriftMonitoringSignal model = BinaryData.fromString(
            "{\"signalType\":\"DataDrift\",\"features\":{\"filterType\":\"MonitoringFeatureFilterBase\"},\"featureImportanceSettings\":{\"mode\":\"Disabled\",\"targetColumn\":\"gbjbhrp\"},\"metricThresholds\":[{\"dataType\":\"DataDriftMetricThresholdBase\",\"threshold\":{\"value\":44.85113411986268}},{\"dataType\":\"DataDriftMetricThresholdBase\",\"threshold\":{\"value\":50.380142949889816}}],\"productionData\":{\"inputDataType\":\"MonitoringInputDataBase\",\"dataContext\":\"mmaixpqji\",\"jobInputType\":\"mlflow_model\",\"uri\":\"f\",\"columns\":{\"tohqclna\":\"sld\",\"gsiqikvllr\":\"h\",\"wrqkza\":\"tpmglxkoikmtr\",\"paklw\":\"bun\"}},\"referenceData\":{\"inputDataType\":\"MonitoringInputDataBase\",\"dataContext\":\"wee\",\"jobInputType\":\"uri_folder\",\"uri\":\"nejzltkaszfjsxs\",\"columns\":{\"lnwsbvvdlsf\":\"uxapgrcqebmvrdjo\"}},\"featureDataTypeOverride\":{\"esdfedsb\":\"Numerical\"},\"notificationTypes\":[\"AmlNotification\",\"AmlNotification\",\"AmlNotification\",\"AmlNotification\"],\"properties\":{\"i\":\"phymc\",\"e\":\"kltvdhqnufbx\",\"ntojovfnybydhuih\":\"i\"}}")
            .toObject(DataDriftMonitoringSignal.class);
        Assertions.assertEquals(MonitoringNotificationType.AML_NOTIFICATION, model.notificationTypes().get(0));
        Assertions.assertEquals("phymc", model.properties().get("i"));
        Assertions.assertEquals(FeatureImportanceMode.DISABLED, model.featureImportanceSettings().mode());
        Assertions.assertEquals("gbjbhrp", model.featureImportanceSettings().targetColumn());
        Assertions.assertEquals(44.85113411986268D, model.metricThresholds().get(0).threshold().value());
        Assertions.assertEquals("mmaixpqji", model.productionData().dataContext());
        Assertions.assertEquals(JobInputType.MLFLOW_MODEL, model.productionData().jobInputType());
        Assertions.assertEquals("f", model.productionData().uri());
        Assertions.assertEquals("sld", model.productionData().columns().get("tohqclna"));
        Assertions.assertEquals("wee", model.referenceData().dataContext());
        Assertions.assertEquals(JobInputType.URI_FOLDER, model.referenceData().jobInputType());
        Assertions.assertEquals("nejzltkaszfjsxs", model.referenceData().uri());
        Assertions.assertEquals("uxapgrcqebmvrdjo", model.referenceData().columns().get("lnwsbvvdlsf"));
        Assertions.assertEquals(MonitoringFeatureDataType.NUMERICAL, model.featureDataTypeOverride().get("esdfedsb"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataDriftMonitoringSignal model = new DataDriftMonitoringSignal()
            .withNotificationTypes(
                Arrays.asList(MonitoringNotificationType.AML_NOTIFICATION, MonitoringNotificationType.AML_NOTIFICATION,
                    MonitoringNotificationType.AML_NOTIFICATION, MonitoringNotificationType.AML_NOTIFICATION))
            .withProperties(mapOf("i", "phymc", "e", "kltvdhqnufbx", "ntojovfnybydhuih", "i"))
            .withFeatures(new MonitoringFeatureFilterBase())
            .withFeatureImportanceSettings(
                new FeatureImportanceSettings().withMode(FeatureImportanceMode.DISABLED).withTargetColumn("gbjbhrp"))
            .withMetricThresholds(Arrays.asList(
                new DataDriftMetricThresholdBase()
                    .withThreshold(new MonitoringThreshold().withValue(44.85113411986268D)),
                new DataDriftMetricThresholdBase()
                    .withThreshold(new MonitoringThreshold().withValue(50.380142949889816D))))
            .withProductionData(new MonitoringInputDataBase().withDataContext("mmaixpqji")
                .withJobInputType(JobInputType.MLFLOW_MODEL)
                .withUri("f")
                .withColumns(mapOf("tohqclna", "sld", "gsiqikvllr", "h", "wrqkza", "tpmglxkoikmtr", "paklw", "bun")))
            .withReferenceData(new MonitoringInputDataBase().withDataContext("wee")
                .withJobInputType(JobInputType.URI_FOLDER)
                .withUri("nejzltkaszfjsxs")
                .withColumns(mapOf("lnwsbvvdlsf", "uxapgrcqebmvrdjo")))
            .withFeatureDataTypeOverride(mapOf("esdfedsb", MonitoringFeatureDataType.NUMERICAL));
        model = BinaryData.fromObject(model).toObject(DataDriftMonitoringSignal.class);
        Assertions.assertEquals(MonitoringNotificationType.AML_NOTIFICATION, model.notificationTypes().get(0));
        Assertions.assertEquals("phymc", model.properties().get("i"));
        Assertions.assertEquals(FeatureImportanceMode.DISABLED, model.featureImportanceSettings().mode());
        Assertions.assertEquals("gbjbhrp", model.featureImportanceSettings().targetColumn());
        Assertions.assertEquals(44.85113411986268D, model.metricThresholds().get(0).threshold().value());
        Assertions.assertEquals("mmaixpqji", model.productionData().dataContext());
        Assertions.assertEquals(JobInputType.MLFLOW_MODEL, model.productionData().jobInputType());
        Assertions.assertEquals("f", model.productionData().uri());
        Assertions.assertEquals("sld", model.productionData().columns().get("tohqclna"));
        Assertions.assertEquals("wee", model.referenceData().dataContext());
        Assertions.assertEquals(JobInputType.URI_FOLDER, model.referenceData().jobInputType());
        Assertions.assertEquals("nejzltkaszfjsxs", model.referenceData().uri());
        Assertions.assertEquals("uxapgrcqebmvrdjo", model.referenceData().columns().get("lnwsbvvdlsf"));
        Assertions.assertEquals(MonitoringFeatureDataType.NUMERICAL, model.featureDataTypeOverride().get("esdfedsb"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
