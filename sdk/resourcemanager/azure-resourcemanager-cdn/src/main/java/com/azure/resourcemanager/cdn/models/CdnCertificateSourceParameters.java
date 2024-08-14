// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines the parameters for using CDN managed certificate for securing custom domain.
 */
@Fluent
public final class CdnCertificateSourceParameters implements JsonSerializable<CdnCertificateSourceParameters> {
    /*
     * The typeName property.
     */
    private String typeName = "CdnCertificateSourceParameters";

    /*
     * Type of certificate used
     */
    private CertificateType certificateType;

    /**
     * Creates an instance of CdnCertificateSourceParameters class.
     */
    public CdnCertificateSourceParameters() {
    }

    /**
     * Get the typeName property: The typeName property.
     * 
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     * 
     * @param typeName the typeName value to set.
     * @return the CdnCertificateSourceParameters object itself.
     */
    public CdnCertificateSourceParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the certificateType property: Type of certificate used.
     * 
     * @return the certificateType value.
     */
    public CertificateType certificateType() {
        return this.certificateType;
    }

    /**
     * Set the certificateType property: Type of certificate used.
     * 
     * @param certificateType the certificateType value to set.
     * @return the CdnCertificateSourceParameters object itself.
     */
    public CdnCertificateSourceParameters withCertificateType(CertificateType certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property certificateType in model CdnCertificateSourceParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CdnCertificateSourceParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("typeName", this.typeName);
        jsonWriter.writeStringField("certificateType",
            this.certificateType == null ? null : this.certificateType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CdnCertificateSourceParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CdnCertificateSourceParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CdnCertificateSourceParameters.
     */
    public static CdnCertificateSourceParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CdnCertificateSourceParameters deserializedCdnCertificateSourceParameters
                = new CdnCertificateSourceParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificateType".equals(fieldName)) {
                    deserializedCdnCertificateSourceParameters.certificateType
                        = CertificateType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCdnCertificateSourceParameters;
        });
    }
}
