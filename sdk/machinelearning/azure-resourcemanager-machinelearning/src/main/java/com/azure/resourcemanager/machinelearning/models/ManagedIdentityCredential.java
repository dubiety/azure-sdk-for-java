// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Credential for user managed identity.
 */
@Fluent
public final class ManagedIdentityCredential extends DataReferenceCredential {
    /*
     * [Required] Credential type used to authentication with storage.
     */
    private DataReferenceCredentialType credentialType = DataReferenceCredentialType.MANAGED_IDENTITY;

    /*
     * ManagedIdentityCredential identity type
     */
    private String managedIdentityType;

    /*
     * Full arm scope for the Id. For ManagedIdentityType = SystemManaged, this field is null.
     */
    private String userManagedIdentityResourceId;

    /*
     * ClientId for the UAMI. For ManagedIdentityType = SystemManaged, this field is null.
     */
    private String userManagedIdentityClientId;

    /*
     * PrincipalId for the UAMI. For ManagedIdentityType = SystemManaged, this field is null.
     */
    private String userManagedIdentityPrincipalId;

    /*
     * TenantId for the UAMI. For ManagedIdentityType = SystemManaged, this field is null.
     */
    private String userManagedIdentityTenantId;

    /**
     * Creates an instance of ManagedIdentityCredential class.
     */
    public ManagedIdentityCredential() {
    }

    /**
     * Get the credentialType property: [Required] Credential type used to authentication with storage.
     * 
     * @return the credentialType value.
     */
    @Override
    public DataReferenceCredentialType credentialType() {
        return this.credentialType;
    }

    /**
     * Get the managedIdentityType property: ManagedIdentityCredential identity type.
     * 
     * @return the managedIdentityType value.
     */
    public String managedIdentityType() {
        return this.managedIdentityType;
    }

    /**
     * Set the managedIdentityType property: ManagedIdentityCredential identity type.
     * 
     * @param managedIdentityType the managedIdentityType value to set.
     * @return the ManagedIdentityCredential object itself.
     */
    public ManagedIdentityCredential withManagedIdentityType(String managedIdentityType) {
        this.managedIdentityType = managedIdentityType;
        return this;
    }

    /**
     * Get the userManagedIdentityResourceId property: Full arm scope for the Id. For ManagedIdentityType =
     * SystemManaged, this field is null.
     * 
     * @return the userManagedIdentityResourceId value.
     */
    public String userManagedIdentityResourceId() {
        return this.userManagedIdentityResourceId;
    }

    /**
     * Set the userManagedIdentityResourceId property: Full arm scope for the Id. For ManagedIdentityType =
     * SystemManaged, this field is null.
     * 
     * @param userManagedIdentityResourceId the userManagedIdentityResourceId value to set.
     * @return the ManagedIdentityCredential object itself.
     */
    public ManagedIdentityCredential withUserManagedIdentityResourceId(String userManagedIdentityResourceId) {
        this.userManagedIdentityResourceId = userManagedIdentityResourceId;
        return this;
    }

    /**
     * Get the userManagedIdentityClientId property: ClientId for the UAMI. For ManagedIdentityType = SystemManaged,
     * this field is null.
     * 
     * @return the userManagedIdentityClientId value.
     */
    public String userManagedIdentityClientId() {
        return this.userManagedIdentityClientId;
    }

    /**
     * Set the userManagedIdentityClientId property: ClientId for the UAMI. For ManagedIdentityType = SystemManaged,
     * this field is null.
     * 
     * @param userManagedIdentityClientId the userManagedIdentityClientId value to set.
     * @return the ManagedIdentityCredential object itself.
     */
    public ManagedIdentityCredential withUserManagedIdentityClientId(String userManagedIdentityClientId) {
        this.userManagedIdentityClientId = userManagedIdentityClientId;
        return this;
    }

    /**
     * Get the userManagedIdentityPrincipalId property: PrincipalId for the UAMI. For ManagedIdentityType =
     * SystemManaged, this field is null.
     * 
     * @return the userManagedIdentityPrincipalId value.
     */
    public String userManagedIdentityPrincipalId() {
        return this.userManagedIdentityPrincipalId;
    }

    /**
     * Set the userManagedIdentityPrincipalId property: PrincipalId for the UAMI. For ManagedIdentityType =
     * SystemManaged, this field is null.
     * 
     * @param userManagedIdentityPrincipalId the userManagedIdentityPrincipalId value to set.
     * @return the ManagedIdentityCredential object itself.
     */
    public ManagedIdentityCredential withUserManagedIdentityPrincipalId(String userManagedIdentityPrincipalId) {
        this.userManagedIdentityPrincipalId = userManagedIdentityPrincipalId;
        return this;
    }

    /**
     * Get the userManagedIdentityTenantId property: TenantId for the UAMI. For ManagedIdentityType = SystemManaged,
     * this field is null.
     * 
     * @return the userManagedIdentityTenantId value.
     */
    public String userManagedIdentityTenantId() {
        return this.userManagedIdentityTenantId;
    }

    /**
     * Set the userManagedIdentityTenantId property: TenantId for the UAMI. For ManagedIdentityType = SystemManaged,
     * this field is null.
     * 
     * @param userManagedIdentityTenantId the userManagedIdentityTenantId value to set.
     * @return the ManagedIdentityCredential object itself.
     */
    public ManagedIdentityCredential withUserManagedIdentityTenantId(String userManagedIdentityTenantId) {
        this.userManagedIdentityTenantId = userManagedIdentityTenantId;
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("credentialType",
            this.credentialType == null ? null : this.credentialType.toString());
        jsonWriter.writeStringField("managedIdentityType", this.managedIdentityType);
        jsonWriter.writeStringField("userManagedIdentityResourceId", this.userManagedIdentityResourceId);
        jsonWriter.writeStringField("userManagedIdentityClientId", this.userManagedIdentityClientId);
        jsonWriter.writeStringField("userManagedIdentityPrincipalId", this.userManagedIdentityPrincipalId);
        jsonWriter.writeStringField("userManagedIdentityTenantId", this.userManagedIdentityTenantId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedIdentityCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedIdentityCredential if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedIdentityCredential.
     */
    public static ManagedIdentityCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedIdentityCredential deserializedManagedIdentityCredential = new ManagedIdentityCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("credentialType".equals(fieldName)) {
                    deserializedManagedIdentityCredential.credentialType
                        = DataReferenceCredentialType.fromString(reader.getString());
                } else if ("managedIdentityType".equals(fieldName)) {
                    deserializedManagedIdentityCredential.managedIdentityType = reader.getString();
                } else if ("userManagedIdentityResourceId".equals(fieldName)) {
                    deserializedManagedIdentityCredential.userManagedIdentityResourceId = reader.getString();
                } else if ("userManagedIdentityClientId".equals(fieldName)) {
                    deserializedManagedIdentityCredential.userManagedIdentityClientId = reader.getString();
                } else if ("userManagedIdentityPrincipalId".equals(fieldName)) {
                    deserializedManagedIdentityCredential.userManagedIdentityPrincipalId = reader.getString();
                } else if ("userManagedIdentityTenantId".equals(fieldName)) {
                    deserializedManagedIdentityCredential.userManagedIdentityTenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedIdentityCredential;
        });
    }
}
