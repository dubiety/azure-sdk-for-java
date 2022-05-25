// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SMB Properties to copy from the source file.
 */
public enum CopyableFileSmbProperties {
    NONE("none"),
    FILE_ATTRIBUTES("fileattributes"),
    CREATED_ON("createdon"),
    LAST_WRITTEN_ON("lastwrittenon"),
    CHANGED_ON("changedon"),
    ALL("all");

    private final String value;
    CopyableFileSmbProperties(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CopyableFileSmbProperties instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CopyableFileSmbProperties object, or null if unable to parse.
     */
    @JsonCreator
    public static CopyableFileSmbProperties fromString(String value) {
        CopyableFileSmbProperties[] items = CopyableFileSmbProperties.values();
        for (CopyableFileSmbProperties item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
