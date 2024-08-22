// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the volume configuration for the container.
 */
@Fluent
public final class VolumeDefinition implements JsonSerializable<VolumeDefinition> {
    /*
     * Type of Volume Definition. Possible Values: bind,volume,tmpfs,npipe
     */
    private VolumeDefinitionType type;

    /*
     * Indicate whether to mount volume as readOnly. Default value for this is false.
     */
    private Boolean readOnly;

    /*
     * Source of the mount. For bind mounts this is the host path.
     */
    private String source;

    /*
     * Target of the mount. For bind mounts this is the path in the container.
     */
    private String target;

    /*
     * Consistency of the volume
     */
    private String consistency;

    /*
     * Bind Options of the mount
     */
    private BindOptions bind;

    /*
     * Volume Options of the mount
     */
    private VolumeOptions volume;

    /*
     * tmpfs option of the mount
     */
    private TmpfsOptions tmpfs;

    /**
     * Creates an instance of VolumeDefinition class.
     */
    public VolumeDefinition() {
    }

    /**
     * Get the type property: Type of Volume Definition. Possible Values: bind,volume,tmpfs,npipe.
     * 
     * @return the type value.
     */
    public VolumeDefinitionType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of Volume Definition. Possible Values: bind,volume,tmpfs,npipe.
     * 
     * @param type the type value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withType(VolumeDefinitionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the readOnly property: Indicate whether to mount volume as readOnly. Default value for this is false.
     * 
     * @return the readOnly value.
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the readOnly property: Indicate whether to mount volume as readOnly. Default value for this is false.
     * 
     * @param readOnly the readOnly value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the source property: Source of the mount. For bind mounts this is the host path.
     * 
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source of the mount. For bind mounts this is the host path.
     * 
     * @param source the source value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the target property: Target of the mount. For bind mounts this is the path in the container.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: Target of the mount. For bind mounts this is the path in the container.
     * 
     * @param target the target value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the consistency property: Consistency of the volume.
     * 
     * @return the consistency value.
     */
    public String consistency() {
        return this.consistency;
    }

    /**
     * Set the consistency property: Consistency of the volume.
     * 
     * @param consistency the consistency value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }

    /**
     * Get the bind property: Bind Options of the mount.
     * 
     * @return the bind value.
     */
    public BindOptions bind() {
        return this.bind;
    }

    /**
     * Set the bind property: Bind Options of the mount.
     * 
     * @param bind the bind value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withBind(BindOptions bind) {
        this.bind = bind;
        return this;
    }

    /**
     * Get the volume property: Volume Options of the mount.
     * 
     * @return the volume value.
     */
    public VolumeOptions volume() {
        return this.volume;
    }

    /**
     * Set the volume property: Volume Options of the mount.
     * 
     * @param volume the volume value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withVolume(VolumeOptions volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Get the tmpfs property: tmpfs option of the mount.
     * 
     * @return the tmpfs value.
     */
    public TmpfsOptions tmpfs() {
        return this.tmpfs;
    }

    /**
     * Set the tmpfs property: tmpfs option of the mount.
     * 
     * @param tmpfs the tmpfs value to set.
     * @return the VolumeDefinition object itself.
     */
    public VolumeDefinition withTmpfs(TmpfsOptions tmpfs) {
        this.tmpfs = tmpfs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bind() != null) {
            bind().validate();
        }
        if (volume() != null) {
            volume().validate();
        }
        if (tmpfs() != null) {
            tmpfs().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeBooleanField("readOnly", this.readOnly);
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeStringField("target", this.target);
        jsonWriter.writeStringField("consistency", this.consistency);
        jsonWriter.writeJsonField("bind", this.bind);
        jsonWriter.writeJsonField("volume", this.volume);
        jsonWriter.writeJsonField("tmpfs", this.tmpfs);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeDefinition.
     */
    public static VolumeDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeDefinition deserializedVolumeDefinition = new VolumeDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedVolumeDefinition.type = VolumeDefinitionType.fromString(reader.getString());
                } else if ("readOnly".equals(fieldName)) {
                    deserializedVolumeDefinition.readOnly = reader.getNullable(JsonReader::getBoolean);
                } else if ("source".equals(fieldName)) {
                    deserializedVolumeDefinition.source = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedVolumeDefinition.target = reader.getString();
                } else if ("consistency".equals(fieldName)) {
                    deserializedVolumeDefinition.consistency = reader.getString();
                } else if ("bind".equals(fieldName)) {
                    deserializedVolumeDefinition.bind = BindOptions.fromJson(reader);
                } else if ("volume".equals(fieldName)) {
                    deserializedVolumeDefinition.volume = VolumeOptions.fromJson(reader);
                } else if ("tmpfs".equals(fieldName)) {
                    deserializedVolumeDefinition.tmpfs = TmpfsOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeDefinition;
        });
    }
}
