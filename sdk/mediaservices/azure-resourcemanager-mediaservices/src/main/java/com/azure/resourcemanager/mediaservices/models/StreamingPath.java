// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class of paths for streaming. */
@Fluent
public final class StreamingPath {
    /*
     * Streaming protocol
     */
    @JsonProperty(value = "streamingProtocol", required = true)
    private StreamingPolicyStreamingProtocol streamingProtocol;

    /*
     * Encryption scheme
     */
    @JsonProperty(value = "encryptionScheme", required = true)
    private EncryptionScheme encryptionScheme;

    /*
     * Streaming paths for each protocol and encryptionScheme pair
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /**
     * Get the streamingProtocol property: Streaming protocol.
     *
     * @return the streamingProtocol value.
     */
    public StreamingPolicyStreamingProtocol streamingProtocol() {
        return this.streamingProtocol;
    }

    /**
     * Set the streamingProtocol property: Streaming protocol.
     *
     * @param streamingProtocol the streamingProtocol value to set.
     * @return the StreamingPath object itself.
     */
    public StreamingPath withStreamingProtocol(StreamingPolicyStreamingProtocol streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
        return this;
    }

    /**
     * Get the encryptionScheme property: Encryption scheme.
     *
     * @return the encryptionScheme value.
     */
    public EncryptionScheme encryptionScheme() {
        return this.encryptionScheme;
    }

    /**
     * Set the encryptionScheme property: Encryption scheme.
     *
     * @param encryptionScheme the encryptionScheme value to set.
     * @return the StreamingPath object itself.
     */
    public StreamingPath withEncryptionScheme(EncryptionScheme encryptionScheme) {
        this.encryptionScheme = encryptionScheme;
        return this;
    }

    /**
     * Get the paths property: Streaming paths for each protocol and encryptionScheme pair.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: Streaming paths for each protocol and encryptionScheme pair.
     *
     * @param paths the paths value to set.
     * @return the StreamingPath object itself.
     */
    public StreamingPath withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (streamingProtocol() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property streamingProtocol in model StreamingPath"));
        }
        if (encryptionScheme() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property encryptionScheme in model StreamingPath"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StreamingPath.class);
}
