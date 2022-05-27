// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Video preview image URLs. These URLs can be used in conjunction with the video content authorization token to
 * download the most recent still image from the video archive in different resolutions. They are available when the
 * video type is 'archive' and preview images are enabled.
 */
@Fluent
public final class VideoPreviewImageUrls {
    /*
     * Low resolution preview image URL.
     */
    @JsonProperty(value = "small")
    private String small;

    /*
     * Medium resolution preview image URL.
     */
    @JsonProperty(value = "medium")
    private String medium;

    /*
     * High resolution preview image URL.
     */
    @JsonProperty(value = "large")
    private String large;

    /**
     * Get the small property: Low resolution preview image URL.
     *
     * @return the small value.
     */
    public String small() {
        return this.small;
    }

    /**
     * Set the small property: Low resolution preview image URL.
     *
     * @param small the small value to set.
     * @return the VideoPreviewImageUrls object itself.
     */
    public VideoPreviewImageUrls withSmall(String small) {
        this.small = small;
        return this;
    }

    /**
     * Get the medium property: Medium resolution preview image URL.
     *
     * @return the medium value.
     */
    public String medium() {
        return this.medium;
    }

    /**
     * Set the medium property: Medium resolution preview image URL.
     *
     * @param medium the medium value to set.
     * @return the VideoPreviewImageUrls object itself.
     */
    public VideoPreviewImageUrls withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * Get the large property: High resolution preview image URL.
     *
     * @return the large value.
     */
    public String large() {
        return this.large;
    }

    /**
     * Set the large property: High resolution preview image URL.
     *
     * @param large the large value to set.
     * @return the VideoPreviewImageUrls object itself.
     */
    public VideoPreviewImageUrls withLarge(String large) {
        this.large = large;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
