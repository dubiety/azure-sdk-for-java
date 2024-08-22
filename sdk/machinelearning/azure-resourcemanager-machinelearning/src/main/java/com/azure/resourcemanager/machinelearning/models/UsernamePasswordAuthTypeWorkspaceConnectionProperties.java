// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * The UsernamePasswordAuthTypeWorkspaceConnectionProperties model.
 */
@Fluent
public final class UsernamePasswordAuthTypeWorkspaceConnectionProperties extends WorkspaceConnectionPropertiesV2 {
    /*
     * Authentication type of the connection target
     */
    private ConnectionAuthType authType = ConnectionAuthType.USERNAME_PASSWORD;

    /*
     * The credentials property.
     */
    private WorkspaceConnectionUsernamePassword credentials;

    /*
     * The createdByWorkspaceArmId property.
     */
    private String createdByWorkspaceArmId;

    /*
     * Group based on connection category
     */
    private ConnectionGroup group;

    /**
     * Creates an instance of UsernamePasswordAuthTypeWorkspaceConnectionProperties class.
     */
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties() {
    }

    /**
     * Get the authType property: Authentication type of the connection target.
     * 
     * @return the authType value.
     */
    @Override
    public ConnectionAuthType authType() {
        return this.authType;
    }

    /**
     * Get the credentials property: The credentials property.
     * 
     * @return the credentials value.
     */
    public WorkspaceConnectionUsernamePassword credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials property.
     * 
     * @param credentials the credentials value to set.
     * @return the UsernamePasswordAuthTypeWorkspaceConnectionProperties object itself.
     */
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties
        withCredentials(WorkspaceConnectionUsernamePassword credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the createdByWorkspaceArmId property: The createdByWorkspaceArmId property.
     * 
     * @return the createdByWorkspaceArmId value.
     */
    @Override
    public String createdByWorkspaceArmId() {
        return this.createdByWorkspaceArmId;
    }

    /**
     * Get the group property: Group based on connection category.
     * 
     * @return the group value.
     */
    @Override
    public ConnectionGroup group() {
        return this.group;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withCategory(ConnectionCategory category) {
        super.withCategory(category);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withExpiryTime(OffsetDateTime expiryTime) {
        super.withExpiryTime(expiryTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withIsSharedToAll(Boolean isSharedToAll) {
        super.withIsSharedToAll(isSharedToAll);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withMetadata(Map<String, String> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withSharedUserList(List<String> sharedUserList) {
        super.withSharedUserList(sharedUserList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withValue(String value) {
        super.withValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withValueFormat(ValueFormat valueFormat) {
        super.withValueFormat(valueFormat);
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
        if (credentials() != null) {
            credentials().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", category() == null ? null : category().toString());
        jsonWriter.writeStringField("expiryTime",
            expiryTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(expiryTime()));
        jsonWriter.writeBooleanField("isSharedToAll", isSharedToAll());
        jsonWriter.writeStringField("target", target());
        jsonWriter.writeMapField("metadata", metadata(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("sharedUserList", sharedUserList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("value", value());
        jsonWriter.writeStringField("valueFormat", valueFormat() == null ? null : valueFormat().toString());
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        jsonWriter.writeJsonField("credentials", this.credentials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UsernamePasswordAuthTypeWorkspaceConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsernamePasswordAuthTypeWorkspaceConnectionProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UsernamePasswordAuthTypeWorkspaceConnectionProperties.
     */
    public static UsernamePasswordAuthTypeWorkspaceConnectionProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            UsernamePasswordAuthTypeWorkspaceConnectionProperties deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties
                = new UsernamePasswordAuthTypeWorkspaceConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties
                        .withCategory(ConnectionCategory.fromString(reader.getString()));
                } else if ("createdByWorkspaceArmId".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.createdByWorkspaceArmId
                        = reader.getString();
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.withExpiryTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("group".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.group
                        = ConnectionGroup.fromString(reader.getString());
                } else if ("isSharedToAll".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties
                        .withIsSharedToAll(reader.getNullable(JsonReader::getBoolean));
                } else if ("target".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.withTarget(reader.getString());
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.withMetadata(metadata);
                } else if ("sharedUserList".equals(fieldName)) {
                    List<String> sharedUserList = reader.readArray(reader1 -> reader1.getString());
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties
                        .withSharedUserList(sharedUserList);
                } else if ("value".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.withValue(reader.getString());
                } else if ("valueFormat".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties
                        .withValueFormat(ValueFormat.fromString(reader.getString()));
                } else if ("authType".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.authType
                        = ConnectionAuthType.fromString(reader.getString());
                } else if ("credentials".equals(fieldName)) {
                    deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties.credentials
                        = WorkspaceConnectionUsernamePassword.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsernamePasswordAuthTypeWorkspaceConnectionProperties;
        });
    }
}
