// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** certificateAuthority. */
@Fluent
public final class MicrosoftGraphCertificateAuthority {
    /*
     * Required. The base64 encoded string representing the public certificate.
     */
    @JsonProperty(value = "certificate")
    private Base64Url certificate;

    /*
     * The URL of the certificate revocation list.
     */
    @JsonProperty(value = "certificateRevocationListUrl")
    private String certificateRevocationListUrl;

    /*
     * The URL contains the list of all revoked certificates since the last
     * time a full certificate revocaton list was created.
     */
    @JsonProperty(value = "deltaCertificateRevocationListUrl")
    private String deltaCertificateRevocationListUrl;

    /*
     * Required. true if the trusted certificate is a root authority, false if
     * the trusted certificate is an intermediate authority.
     */
    @JsonProperty(value = "isRootAuthority")
    private Boolean isRootAuthority;

    /*
     * The issuer of the certificate, calculated from the certificate value.
     * Read-only.
     */
    @JsonProperty(value = "issuer")
    private String issuer;

    /*
     * The subject key identifier of the certificate, calculated from the
     * certificate value. Read-only.
     */
    @JsonProperty(value = "issuerSki")
    private String issuerSki;

    /*
     * certificateAuthority
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the certificate property: Required. The base64 encoded string representing the public certificate.
     *
     * @return the certificate value.
     */
    public byte[] certificate() {
        if (this.certificate == null) {
            return new byte[0];
        }
        return this.certificate.decodedBytes();
    }

    /**
     * Set the certificate property: Required. The base64 encoded string representing the public certificate.
     *
     * @param certificate the certificate value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withCertificate(byte[] certificate) {
        if (certificate == null) {
            this.certificate = null;
        } else {
            this.certificate = Base64Url.encode(CoreUtils.clone(certificate));
        }
        return this;
    }

    /**
     * Get the certificateRevocationListUrl property: The URL of the certificate revocation list.
     *
     * @return the certificateRevocationListUrl value.
     */
    public String certificateRevocationListUrl() {
        return this.certificateRevocationListUrl;
    }

    /**
     * Set the certificateRevocationListUrl property: The URL of the certificate revocation list.
     *
     * @param certificateRevocationListUrl the certificateRevocationListUrl value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withCertificateRevocationListUrl(String certificateRevocationListUrl) {
        this.certificateRevocationListUrl = certificateRevocationListUrl;
        return this;
    }

    /**
     * Get the deltaCertificateRevocationListUrl property: The URL contains the list of all revoked certificates since
     * the last time a full certificate revocaton list was created.
     *
     * @return the deltaCertificateRevocationListUrl value.
     */
    public String deltaCertificateRevocationListUrl() {
        return this.deltaCertificateRevocationListUrl;
    }

    /**
     * Set the deltaCertificateRevocationListUrl property: The URL contains the list of all revoked certificates since
     * the last time a full certificate revocaton list was created.
     *
     * @param deltaCertificateRevocationListUrl the deltaCertificateRevocationListUrl value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withDeltaCertificateRevocationListUrl(
        String deltaCertificateRevocationListUrl) {
        this.deltaCertificateRevocationListUrl = deltaCertificateRevocationListUrl;
        return this;
    }

    /**
     * Get the isRootAuthority property: Required. true if the trusted certificate is a root authority, false if the
     * trusted certificate is an intermediate authority.
     *
     * @return the isRootAuthority value.
     */
    public Boolean isRootAuthority() {
        return this.isRootAuthority;
    }

    /**
     * Set the isRootAuthority property: Required. true if the trusted certificate is a root authority, false if the
     * trusted certificate is an intermediate authority.
     *
     * @param isRootAuthority the isRootAuthority value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withIsRootAuthority(Boolean isRootAuthority) {
        this.isRootAuthority = isRootAuthority;
        return this;
    }

    /**
     * Get the issuer property: The issuer of the certificate, calculated from the certificate value. Read-only.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: The issuer of the certificate, calculated from the certificate value. Read-only.
     *
     * @param issuer the issuer value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the issuerSki property: The subject key identifier of the certificate, calculated from the certificate value.
     * Read-only.
     *
     * @return the issuerSki value.
     */
    public String issuerSki() {
        return this.issuerSki;
    }

    /**
     * Set the issuerSki property: The subject key identifier of the certificate, calculated from the certificate value.
     * Read-only.
     *
     * @param issuerSki the issuerSki value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withIssuerSki(String issuerSki) {
        this.issuerSki = issuerSki;
        return this;
    }

    /**
     * Get the additionalProperties property: certificateAuthority.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: certificateAuthority.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphCertificateAuthority object itself.
     */
    public MicrosoftGraphCertificateAuthority withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
