// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An azure function receiver.
 */
@Fluent
public final class AzureFunctionReceiver implements JsonSerializable<AzureFunctionReceiver> {
    /*
     * The name of the azure function receiver. Names must be unique across all receivers within an action group.
     */
    private String name;

    /*
     * The azure resource id of the function app.
     */
    private String functionAppResourceId;

    /*
     * The function name in the function app.
     */
    private String functionName;

    /*
     * The http trigger url where http request sent to.
     */
    private String httpTriggerUrl;

    /*
     * Indicates whether to use common alert schema.
     */
    private Boolean useCommonAlertSchema;

    /**
     * Creates an instance of AzureFunctionReceiver class.
     */
    public AzureFunctionReceiver() {
    }

    /**
     * Get the name property: The name of the azure function receiver. Names must be unique across all receivers within
     * an action group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the azure function receiver. Names must be unique across all receivers within
     * an action group.
     * 
     * @param name the name value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the functionAppResourceId property: The azure resource id of the function app.
     * 
     * @return the functionAppResourceId value.
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }

    /**
     * Set the functionAppResourceId property: The azure resource id of the function app.
     * 
     * @param functionAppResourceId the functionAppResourceId value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withFunctionAppResourceId(String functionAppResourceId) {
        this.functionAppResourceId = functionAppResourceId;
        return this;
    }

    /**
     * Get the functionName property: The function name in the function app.
     * 
     * @return the functionName value.
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Set the functionName property: The function name in the function app.
     * 
     * @param functionName the functionName value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get the httpTriggerUrl property: The http trigger url where http request sent to.
     * 
     * @return the httpTriggerUrl value.
     */
    public String httpTriggerUrl() {
        return this.httpTriggerUrl;
    }

    /**
     * Set the httpTriggerUrl property: The http trigger url where http request sent to.
     * 
     * @param httpTriggerUrl the httpTriggerUrl value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withHttpTriggerUrl(String httpTriggerUrl) {
        this.httpTriggerUrl = httpTriggerUrl;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     * 
     * @return the useCommonAlertSchema value.
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     * 
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withUseCommonAlertSchema(Boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model AzureFunctionReceiver"));
        }
        if (functionAppResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property functionAppResourceId in model AzureFunctionReceiver"));
        }
        if (functionName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property functionName in model AzureFunctionReceiver"));
        }
        if (httpTriggerUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property httpTriggerUrl in model AzureFunctionReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFunctionReceiver.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("functionAppResourceId", this.functionAppResourceId);
        jsonWriter.writeStringField("functionName", this.functionName);
        jsonWriter.writeStringField("httpTriggerUrl", this.httpTriggerUrl);
        jsonWriter.writeBooleanField("useCommonAlertSchema", this.useCommonAlertSchema);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFunctionReceiver from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFunctionReceiver if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureFunctionReceiver.
     */
    public static AzureFunctionReceiver fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFunctionReceiver deserializedAzureFunctionReceiver = new AzureFunctionReceiver();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureFunctionReceiver.name = reader.getString();
                } else if ("functionAppResourceId".equals(fieldName)) {
                    deserializedAzureFunctionReceiver.functionAppResourceId = reader.getString();
                } else if ("functionName".equals(fieldName)) {
                    deserializedAzureFunctionReceiver.functionName = reader.getString();
                } else if ("httpTriggerUrl".equals(fieldName)) {
                    deserializedAzureFunctionReceiver.httpTriggerUrl = reader.getString();
                } else if ("useCommonAlertSchema".equals(fieldName)) {
                    deserializedAzureFunctionReceiver.useCommonAlertSchema = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFunctionReceiver;
        });
    }
}
