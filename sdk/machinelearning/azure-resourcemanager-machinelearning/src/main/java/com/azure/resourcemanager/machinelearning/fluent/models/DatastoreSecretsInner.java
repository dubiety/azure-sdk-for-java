// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.AccountKeyDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.CertificateDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.SasDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.SecretsType;
import com.azure.resourcemanager.machinelearning.models.ServicePrincipalDatastoreSecrets;
import java.io.IOException;

/**
 * Base definition for datastore secrets.
 */
@Immutable
public class DatastoreSecretsInner implements JsonSerializable<DatastoreSecretsInner> {
    /*
     * [Required] Credential type used to authentication with storage.
     */
    private SecretsType secretsType = SecretsType.fromString("DatastoreSecrets");

    /**
     * Creates an instance of DatastoreSecretsInner class.
     */
    public DatastoreSecretsInner() {
    }

    /**
     * Get the secretsType property: [Required] Credential type used to authentication with storage.
     * 
     * @return the secretsType value.
     */
    public SecretsType secretsType() {
        return this.secretsType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("secretsType", this.secretsType == null ? null : this.secretsType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatastoreSecretsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatastoreSecretsInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatastoreSecretsInner.
     */
    public static DatastoreSecretsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("secretsType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AccountKey".equals(discriminatorValue)) {
                    return AccountKeyDatastoreSecrets.fromJson(readerToUse.reset());
                } else if ("Certificate".equals(discriminatorValue)) {
                    return CertificateDatastoreSecrets.fromJson(readerToUse.reset());
                } else if ("Sas".equals(discriminatorValue)) {
                    return SasDatastoreSecrets.fromJson(readerToUse.reset());
                } else if ("ServicePrincipal".equals(discriminatorValue)) {
                    return ServicePrincipalDatastoreSecrets.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static DatastoreSecretsInner fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatastoreSecretsInner deserializedDatastoreSecretsInner = new DatastoreSecretsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretsType".equals(fieldName)) {
                    deserializedDatastoreSecretsInner.secretsType = SecretsType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatastoreSecretsInner;
        });
    }
}
