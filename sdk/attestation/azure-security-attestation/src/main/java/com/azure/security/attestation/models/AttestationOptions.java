// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.security.attestation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;

/**
 * <p>
 * AttestationOptions represent the parameters sent to the
 * {@link com.azure.security.attestation.AttestationClient#attestOpenEnclave}
 * or {@link com.azure.security.attestation.AttestationClient#attestSgxEnclave}API.
 * </p><p>
 * Each {@link AttestationOptions} object expresses the options to attest an SGX enclave.
 * </p><p>
 * An enclave (or Trusted Execution Environment) is a chunk of code that is isolated
 * from its host. When code is running inside an enclave, there is a real challenge - if
 * the customer wants to communicate with code in the enclave, there is no way of
 * establishing a secure communication channel that can verify communication to the enclave.
 * </p>
 * <p>
 *
 * To support the "Secure Key Release" protocol which enables that communication, there are three
 * key pieces of information required:
 * </p>
 * <ul>
 *     <li>Attestation Evidence (typically an SGX quote or OpenEnclave report</li>
 *     <li>InitTime Data - this is data specified when the TEE is created. (OPTIONAL)</li>
 *     <li>RunTime Data - this can be a public key or other information. (OPTIONAL)</li>
 * </ul>
 * <p>
 *
 * To perform an attestation operation, you need at minimum a set of attestation evidence.
 * </p>
 * <p>
 * For the Secure Key Release scenario, the InitTime Data and RunTime Data are expressed in the token
 * returned by the Attestation Service, a relying party can use the  InitTime Data to make decisions
 * about whether the TEE can be trusted, and can use the RunTime Data as data which is known to have
 * come from inside the enclave (if, for instance the RunTime Data is an asymmetric cryptographic
 * key, it can be used to encrypt data that can only be decrypted by code inside the TEE).
 * </p>
 * <p>
 *
 * For both InitTime and RunTime data, the data can be expressed in the token as either BINARY or
 * JSON data. This can simplify the evaluation process in the relying party.
 *
 * </p>
 * <p>
 *
 * In addition to the evidence, InitTime and RunTime data, an Attest request can also take a "draft"
 * attestation policy. This can be used to determine how an attestation policy effects the claims
 * generated by the attestation service.
 *
 * </p>
 * <p>
 * Note that when a client specifies a draft attestation policy the returned attestation token will not
 * be signed by the attestation service. That is to ensure that the token cannot be used by a relying
 * party.
 *
 * </p>
 * <p>
 * The reason that both binary and JSON are represented as binary is that JSON encodings are ambiguous
 * – there are many possible semantically identical JSON encodings of the same data. Since we’re going
 * to take the SHA256 hash of the data, we accept a sequence of octets (byte[]) instead of a String
 * (depending on your encoding, the same string can be encoded as different sequences of octets).
 * </p>
 *
 */
@Fluent
public final class AttestationOptions {

    private final BinaryData evidence;
    private AttestationData runTimeData;
    private AttestationData initTimeData;
    private String draftPolicyForAttestation;
    private AttestationTokenValidationOptions validationOptions;

    /**
     * Creates a new AttestOpenEnclaveRequest object with the OpenEnclave report from the enclave to be attested.
     *
     * The evidence will typically take the form of either an OpenEnclave report or an Intel SGX quote.
     *
     * <p><strong>Create an AttestationOptions from an SGX quote:</strong></p>
     * <!-- src_embed com.azure.security.attestation.models..fromEvidence#byte -->
     * <pre>
     * AttestationOptions options = new AttestationOptions&#40;sgxQuote&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models..fromEvidence#byte -->
     * @param evidence to be used in the attest request.
     */
    public AttestationOptions(BinaryData evidence) {
        this.evidence = evidence;
    }

    /**
     * Returns the "evidence" to be presented to the attestation service.
     * @return The attestation evidence to be presented to the attestation service.
     */
    public BinaryData getEvidence() {
        return evidence;
    }

    /**
     * Set the RunTime Data property.
     * <p>Runtime data provided by the enclave at the time the evidence
     * was generated. The attestation service will verify that the first 32 bytes of the {@code report_data}
     * field of the quote contains the SHA256 hash of the runtime data, this ensures that the
     * RunTime Data was known to the enclave.
     *</p>
     * <p>When the attestation service generates the attestation token, the RunTimeData will
     * be added as one of two possible claims: {@link AttestationResult#getRuntimeClaims()} if
     * the {@link AttestationDataInterpretation} specified for the RunTime Data was set to "JSON", or
     * {@link AttestationResult#getEnclaveHeldData()} if
     * the {@link AttestationDataInterpretation} specified for the RunTime Data was set to "BINARY", or
     *
     * <p><strong>Setting RunTime Data Property</strong></p>
     * <!-- src_embed com.azure.security.attestation.models..setInitTimeData#byte -->
     * <pre>
     * AttestationOptions optionsWithInitTimeData = new AttestationOptions&#40;openEnclaveReport&#41;
     *     .setInitTimeData&#40;new AttestationData&#40;inittimeData, AttestationDataInterpretation.BINARY&#41;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models..setInitTimeData#byte -->
     * @param attestationData the runtimeData value to set.
     * @return this {@link AttestationOptions} object itself.
     */
    public AttestationOptions setRunTimeData(AttestationData attestationData) {
        this.runTimeData = attestationData;
        return this;
    }

    /**
     * Retrieves the RunTimeData property to be sent to the service.
     * <p><strong>Retrieve the RunTimeData value.</strong></p>
     * <!-- src_embed com.azure.security.attestation.models.AttestationOptions.getRunTimeData -->
     * <pre>
     * AttestationData existingRuntimeData = attestationOptions.getRunTimeData&#40;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models.AttestationOptions.getRunTimeData -->
     * @return The RunTimeData value set by {@link AttestationOptions#setRunTimeData}
     */
    public AttestationData getRunTimeData() {
        return runTimeData != null ? new AttestationData(runTimeData) : null;
    }

    /**
     * <p>
     * Set the initTimeData property: The initTimeData is data presented at the time that the
     * execution environment was instantiated. The MAA will verify that the init data was
     * known to the execution environment. Note that InitTimeData is invalid for CoffeeLake processors.
     *</p>
     * <p>When the attestation service generates the attestation token, the InitTimeData will
     * be added as {@link AttestationResult#getInitTimeClaims()} if the {@link AttestationDataInterpretation}
     * for the {@link AttestationData} is set to "JSON".
     *
     * <p><strong>Setting InitTime Data Property</strong></p>
     * <!-- src_embed com.azure.security.attestation.models..setInitTimeData#byte -->
     * <pre>
     * AttestationOptions optionsWithInitTimeData = new AttestationOptions&#40;openEnclaveReport&#41;
     *     .setInitTimeData&#40;new AttestationData&#40;inittimeData, AttestationDataInterpretation.BINARY&#41;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models..setInitTimeData#byte -->
     * @param attestationData the InitTimeData value to set.
     * @return this {@link AttestationOptions} object itself.
     */
    public AttestationOptions setInitTimeData(AttestationData attestationData) {
        this.initTimeData = attestationData;
        return this;
    }

    /**
     * Retrieves the InitTimeData property to be sent to the service.
     * <p><strong>Retrieve the InitTimeData value.</strong></p>
     * <!-- src_embed com.azure.security.attestation.models.AttestationOptions.getInitTimeData -->
     * <pre>
     * AttestationOptions attestationOptions = new AttestationOptions&#40;openEnclaveReport&#41;
     *     .setInitTimeData&#40;new AttestationData&#40;inittimeData, AttestationDataInterpretation.JSON&#41;&#41;;
     *
     * AttestationData existingRuntimeData = attestationOptions.getInitTimeData&#40;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models.AttestationOptions.getInitTimeData -->
     * @return The InitTimeData value set by {@link AttestationOptions#setInitTimeData}
     */
    public AttestationData getInitTimeData() {
        return initTimeData != null ? new AttestationData(initTimeData) : null;
    }

    /**
     * Set the draftPolicyForAttestation property: Attest against the provided draft policy.
     * <p>The setDraftPolicyForAttestation API can be used to
     * determine how a proposed attestation policy would affect an attestation token.</p>
     * <b><i>Note that the resulting token cannot be validated.</i></b>
     * <p><b><i>Example of setting AttestationOptions with a draft policy.</i></b></p>
     * <!-- src_embed com.azure.security.attestation.models.AttestationOptions.setDraftPolicyForAttestation#String -->
     * <pre>
     * AttestationOptions request = new AttestationOptions&#40;openEnclaveReport&#41;
     *     .setDraftPolicyForAttestation&#40;&quot;version=1.0; authorizationrules&#123;=&gt; permit&#40;&#41;;&#125;; issuancerules&#123;&#125;;&quot;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models.AttestationOptions.setDraftPolicyForAttestation#String -->
     * @param draftPolicyForAttestation the draftPolicyForAttestation value to set.
     * @return this {@link AttestationOptions} object itself.
     */
    public AttestationOptions setDraftPolicyForAttestation(String draftPolicyForAttestation) {
        this.draftPolicyForAttestation = draftPolicyForAttestation;
        return this;
    }

    /**
     * Gets the draftPolicyForAttestation property which is used to attest against the draft policy.
     *
     * <p>Gets the previously set draft policy for attestation.</p>
     * <!-- src_embed com.azure.security.attestation.models.AttestationOptions.getDraftPolicyForAttestation -->
     * <pre>
     * AttestationOptions getOptions = new AttestationOptions&#40;openEnclaveReport&#41;
     *     .setDraftPolicyForAttestation&#40;&quot;version=1.0; authorizationrules&#123;=&gt; permit&#40;&#41;;&#125;; issuancerules&#123;&#125;;&quot;&#41;;
     *
     * String draftPolicy = getOptions.getDraftPolicyForAttestation&#40;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.models.AttestationOptions.getDraftPolicyForAttestation -->
     * @return The draft policy if set.
     */
    public String getDraftPolicyForAttestation() {
        return this.draftPolicyForAttestation;
    }

    /**
     * Sets the options used to validate attestation tokens returned from the service.
     * @param validationOptions Token Validation options to be used to enhance the validations
     *                          already performed by the SDK.
     * @return this {@link AttestationOptions} object.
     */
    public AttestationOptions setValidationOptions(AttestationTokenValidationOptions validationOptions) {
        this.validationOptions = validationOptions;
        return this;
    }

    /**
     * Returns the options used for token validation.
     * @return attestation token validation options.
     */
    public AttestationTokenValidationOptions getValidationOptions() {
        return validationOptions;
    }
}
