// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The configuration for virtual machine extensions.
 */
@Fluent
public final class VMExtension implements JsonSerializable<VMExtension> {

    /*
     * The name of the virtual machine extension.
     */
    @Generated
    private final String name;

    /*
     * The name of the extension handler publisher.
     */
    @Generated
    private final String publisher;

    /*
     * The type of the extension.
     */
    @Generated
    private final String type;

    /*
     * The version of script handler.
     */
    @Generated
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     */
    @Generated
    private Boolean autoUpgradeMinorVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     */
    @Generated
    private Boolean enableAutomaticUpgrade;

    /*
     * JSON formatted public settings for the extension.
     */
    @Generated
    private Map<String, String> settings;

    /*
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     */
    @Generated
    private Map<String, String> protectedSettings;

    /*
     * The collection of extension names. Collection of extension names after which this extension needs to be provisioned.
     */
    @Generated
    private List<String> provisionAfterExtensions;

    /**
     * Creates an instance of VMExtension class.
     *
     * @param name the name value to set.
     * @param publisher the publisher value to set.
     * @param type the type value to set.
     */
    @Generated
    public VMExtension(String name, String publisher, String type) {
        this.name = name;
        this.publisher = publisher;
        this.type = type;
    }

    /**
     * Get the name property: The name of the virtual machine extension.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    @Generated
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Get the type property: The type of the extension.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the typeHandlerVersion property: The version of script handler.
     *
     * @return the typeHandlerVersion value.
     */
    @Generated
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: The version of script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VMExtension object itself.
     */
    @Generated
    public VMExtension setTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    @Generated
    public Boolean isAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VMExtension object itself.
     */
    @Generated
    public VMExtension setAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @return the enableAutomaticUpgrade value.
     */
    @Generated
    public Boolean isEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VMExtension object itself.
     */
    @Generated
    public VMExtension setEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the settings property: JSON formatted public settings for the extension.
     *
     * @return the settings value.
     */
    @Generated
    public Map<String, String> getSettings() {
        return this.settings;
    }

    /**
     * Set the settings property: JSON formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the VMExtension object itself.
     */
    @Generated
    public VMExtension setSettings(Map<String, String> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    @Generated
    public Map<String, String> getProtectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the VMExtension object itself.
     */
    @Generated
    public VMExtension setProtectedSettings(Map<String, String> protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the provisionAfterExtensions property: The collection of extension names. Collection of extension names after
     * which this extension needs to be provisioned.
     *
     * @return the provisionAfterExtensions value.
     */
    @Generated
    public List<String> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions;
    }

    /**
     * Set the provisionAfterExtensions property: The collection of extension names. Collection of extension names after
     * which this extension needs to be provisioned.
     *
     * @param provisionAfterExtensions the provisionAfterExtensions value to set.
     * @return the VMExtension object itself.
     */
    @Generated
    public VMExtension setProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        this.provisionAfterExtensions = provisionAfterExtensions;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeBooleanField("autoUpgradeMinorVersion", this.autoUpgradeMinorVersion);
        jsonWriter.writeBooleanField("enableAutomaticUpgrade", this.enableAutomaticUpgrade);
        jsonWriter.writeMapField("settings", this.settings, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("protectedSettings", this.protectedSettings,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("provisionAfterExtensions", this.provisionAfterExtensions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VMExtension from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VMExtension if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VMExtension.
     */
    @Generated
    public static VMExtension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            String publisher = null;
            String type = null;
            String typeHandlerVersion = null;
            Boolean autoUpgradeMinorVersion = null;
            Boolean enableAutomaticUpgrade = null;
            Map<String, String> settings = null;
            Map<String, String> protectedSettings = null;
            List<String> provisionAfterExtensions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    publisher = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    typeHandlerVersion = reader.getString();
                } else if ("autoUpgradeMinorVersion".equals(fieldName)) {
                    autoUpgradeMinorVersion = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableAutomaticUpgrade".equals(fieldName)) {
                    enableAutomaticUpgrade = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    settings = reader.readMap(reader1 -> reader1.getString());
                } else if ("protectedSettings".equals(fieldName)) {
                    protectedSettings = reader.readMap(reader1 -> reader1.getString());
                } else if ("provisionAfterExtensions".equals(fieldName)) {
                    provisionAfterExtensions = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            VMExtension deserializedVMExtension = new VMExtension(name, publisher, type);
            deserializedVMExtension.typeHandlerVersion = typeHandlerVersion;
            deserializedVMExtension.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            deserializedVMExtension.enableAutomaticUpgrade = enableAutomaticUpgrade;
            deserializedVMExtension.settings = settings;
            deserializedVMExtension.protectedSettings = protectedSettings;
            deserializedVMExtension.provisionAfterExtensions = provisionAfterExtensions;
            return deserializedVMExtension;
        });
    }
}
