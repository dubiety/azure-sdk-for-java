// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum for all classification models supported by AutoML.
 */
public final class BlockedTransformers extends ExpandableStringEnum<BlockedTransformers> {
    /**
     * Static value TextTargetEncoder for BlockedTransformers.
     */
    public static final BlockedTransformers TEXT_TARGET_ENCODER = fromString("TextTargetEncoder");

    /**
     * Static value OneHotEncoder for BlockedTransformers.
     */
    public static final BlockedTransformers ONE_HOT_ENCODER = fromString("OneHotEncoder");

    /**
     * Static value CatTargetEncoder for BlockedTransformers.
     */
    public static final BlockedTransformers CAT_TARGET_ENCODER = fromString("CatTargetEncoder");

    /**
     * Static value TfIdf for BlockedTransformers.
     */
    public static final BlockedTransformers TF_IDF = fromString("TfIdf");

    /**
     * Static value WoETargetEncoder for BlockedTransformers.
     */
    public static final BlockedTransformers WO_ETARGET_ENCODER = fromString("WoETargetEncoder");

    /**
     * Static value LabelEncoder for BlockedTransformers.
     */
    public static final BlockedTransformers LABEL_ENCODER = fromString("LabelEncoder");

    /**
     * Static value WordEmbedding for BlockedTransformers.
     */
    public static final BlockedTransformers WORD_EMBEDDING = fromString("WordEmbedding");

    /**
     * Static value NaiveBayes for BlockedTransformers.
     */
    public static final BlockedTransformers NAIVE_BAYES = fromString("NaiveBayes");

    /**
     * Static value CountVectorizer for BlockedTransformers.
     */
    public static final BlockedTransformers COUNT_VECTORIZER = fromString("CountVectorizer");

    /**
     * Static value HashOneHotEncoder for BlockedTransformers.
     */
    public static final BlockedTransformers HASH_ONE_HOT_ENCODER = fromString("HashOneHotEncoder");

    /**
     * Creates a new instance of BlockedTransformers value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BlockedTransformers() {
    }

    /**
     * Creates or finds a BlockedTransformers from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BlockedTransformers.
     */
    public static BlockedTransformers fromString(String name) {
        return fromString(name, BlockedTransformers.class);
    }

    /**
     * Gets known BlockedTransformers values.
     * 
     * @return known BlockedTransformers values.
     */
    public static Collection<BlockedTransformers> values() {
        return values(BlockedTransformers.class);
    }
}
