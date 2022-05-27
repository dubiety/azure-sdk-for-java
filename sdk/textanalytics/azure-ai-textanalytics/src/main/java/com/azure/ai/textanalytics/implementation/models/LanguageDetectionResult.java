// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LanguageDetectionResult model. */
@Fluent
public final class LanguageDetectionResult extends PreBuiltResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<LanguageDetectionDocumentResult> documents;

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<LanguageDetectionDocumentResult> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the LanguageDetectionResult object itself.
     */
    public LanguageDetectionResult setDocuments(List<LanguageDetectionDocumentResult> documents) {
        this.documents = documents;
        return this;
    }
}
