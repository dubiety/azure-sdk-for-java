// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum for all Regression models supported by AutoML.
 */
public final class RegressionModels extends ExpandableStringEnum<RegressionModels> {
    /**
     * Static value ElasticNet for RegressionModels.
     */
    public static final RegressionModels ELASTIC_NET = fromString("ElasticNet");

    /**
     * Static value GradientBoosting for RegressionModels.
     */
    public static final RegressionModels GRADIENT_BOOSTING = fromString("GradientBoosting");

    /**
     * Static value DecisionTree for RegressionModels.
     */
    public static final RegressionModels DECISION_TREE = fromString("DecisionTree");

    /**
     * Static value KNN for RegressionModels.
     */
    public static final RegressionModels KNN = fromString("KNN");

    /**
     * Static value LassoLars for RegressionModels.
     */
    public static final RegressionModels LASSO_LARS = fromString("LassoLars");

    /**
     * Static value SGD for RegressionModels.
     */
    public static final RegressionModels SGD = fromString("SGD");

    /**
     * Static value RandomForest for RegressionModels.
     */
    public static final RegressionModels RANDOM_FOREST = fromString("RandomForest");

    /**
     * Static value ExtremeRandomTrees for RegressionModels.
     */
    public static final RegressionModels EXTREME_RANDOM_TREES = fromString("ExtremeRandomTrees");

    /**
     * Static value LightGBM for RegressionModels.
     */
    public static final RegressionModels LIGHT_GBM = fromString("LightGBM");

    /**
     * Static value XGBoostRegressor for RegressionModels.
     */
    public static final RegressionModels XGBOOST_REGRESSOR = fromString("XGBoostRegressor");

    /**
     * Creates a new instance of RegressionModels value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RegressionModels() {
    }

    /**
     * Creates or finds a RegressionModels from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RegressionModels.
     */
    public static RegressionModels fromString(String name) {
        return fromString(name, RegressionModels.class);
    }

    /**
     * Gets known RegressionModels values.
     * 
     * @return known RegressionModels values.
     */
    public static Collection<RegressionModels> values() {
        return values(RegressionModels.class);
    }
}
