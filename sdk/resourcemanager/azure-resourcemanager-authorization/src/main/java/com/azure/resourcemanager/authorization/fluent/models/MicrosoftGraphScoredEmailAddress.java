// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** scoredEmailAddress. */
@Fluent
public final class MicrosoftGraphScoredEmailAddress {
    /*
     * The email address.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * The itemId property.
     */
    @JsonProperty(value = "itemId")
    private String itemId;

    /*
     * The relevance score of the email address. A relevance score is used as a
     * sort key, in relation to the other returned results. A higher relevance
     * score value corresponds to a more relevant result. Relevance is
     * determined by the user’s communication and collaboration patterns and
     * business relationships.
     */
    @JsonProperty(value = "relevanceScore")
    private Double relevanceScore;

    /*
     * selectionLikelihoodInfo
     */
    @JsonProperty(value = "selectionLikelihood")
    private MicrosoftGraphSelectionLikelihoodInfo selectionLikelihood;

    /*
     * scoredEmailAddress
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the address property: The email address.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The email address.
     *
     * @param address the address value to set.
     * @return the MicrosoftGraphScoredEmailAddress object itself.
     */
    public MicrosoftGraphScoredEmailAddress withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the itemId property: The itemId property.
     *
     * @return the itemId value.
     */
    public String itemId() {
        return this.itemId;
    }

    /**
     * Set the itemId property: The itemId property.
     *
     * @param itemId the itemId value to set.
     * @return the MicrosoftGraphScoredEmailAddress object itself.
     */
    public MicrosoftGraphScoredEmailAddress withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Get the relevanceScore property: The relevance score of the email address. A relevance score is used as a sort
     * key, in relation to the other returned results. A higher relevance score value corresponds to a more relevant
     * result. Relevance is determined by the user’s communication and collaboration patterns and business
     * relationships.
     *
     * @return the relevanceScore value.
     */
    public Double relevanceScore() {
        return this.relevanceScore;
    }

    /**
     * Set the relevanceScore property: The relevance score of the email address. A relevance score is used as a sort
     * key, in relation to the other returned results. A higher relevance score value corresponds to a more relevant
     * result. Relevance is determined by the user’s communication and collaboration patterns and business
     * relationships.
     *
     * @param relevanceScore the relevanceScore value to set.
     * @return the MicrosoftGraphScoredEmailAddress object itself.
     */
    public MicrosoftGraphScoredEmailAddress withRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
        return this;
    }

    /**
     * Get the selectionLikelihood property: selectionLikelihoodInfo.
     *
     * @return the selectionLikelihood value.
     */
    public MicrosoftGraphSelectionLikelihoodInfo selectionLikelihood() {
        return this.selectionLikelihood;
    }

    /**
     * Set the selectionLikelihood property: selectionLikelihoodInfo.
     *
     * @param selectionLikelihood the selectionLikelihood value to set.
     * @return the MicrosoftGraphScoredEmailAddress object itself.
     */
    public MicrosoftGraphScoredEmailAddress withSelectionLikelihood(
        MicrosoftGraphSelectionLikelihoodInfo selectionLikelihood) {
        this.selectionLikelihood = selectionLikelihood;
        return this;
    }

    /**
     * Get the additionalProperties property: scoredEmailAddress.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: scoredEmailAddress.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphScoredEmailAddress object itself.
     */
    public MicrosoftGraphScoredEmailAddress withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
