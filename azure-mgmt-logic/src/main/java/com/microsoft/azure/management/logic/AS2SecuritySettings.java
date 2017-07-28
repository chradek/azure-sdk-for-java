/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement security settings.
 */
public class AS2SecuritySettings {
    /**
     * The value indicating whether to send or request a MDN.
     */
    @JsonProperty(value = "overrideGroupSigningCertificate", required = true)
    private boolean overrideGroupSigningCertificate;

    /**
     * The name of the signing certificate.
     */
    @JsonProperty(value = "signingCertificateName")
    private String signingCertificateName;

    /**
     * The name of the encryption certificate.
     */
    @JsonProperty(value = "encryptionCertificateName")
    private String encryptionCertificateName;

    /**
     * The value indicating whether to enable NRR for inbound encoded messages.
     */
    @JsonProperty(value = "enableNrrForInboundEncodedMessages", required = true)
    private boolean enableNrrForInboundEncodedMessages;

    /**
     * The value indicating whether to enable NRR for inbound decoded messages.
     */
    @JsonProperty(value = "enableNrrForInboundDecodedMessages", required = true)
    private boolean enableNrrForInboundDecodedMessages;

    /**
     * The value indicating whether to enable NRR for outbound MDN.
     */
    @JsonProperty(value = "enableNrrForOutboundMdn", required = true)
    private boolean enableNrrForOutboundMdn;

    /**
     * The value indicating whether to enable NRR for outbound encoded
     * messages.
     */
    @JsonProperty(value = "enableNrrForOutboundEncodedMessages", required = true)
    private boolean enableNrrForOutboundEncodedMessages;

    /**
     * The value indicating whether to enable NRR for outbound decoded
     * messages.
     */
    @JsonProperty(value = "enableNrrForOutboundDecodedMessages", required = true)
    private boolean enableNrrForOutboundDecodedMessages;

    /**
     * The value indicating whether to enable NRR for inbound MDN.
     */
    @JsonProperty(value = "enableNrrForInboundMdn", required = true)
    private boolean enableNrrForInboundMdn;

    /**
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize,
     * ShaHyphenHashSize, Sha2UnderscoreHashSize.
     */
    @JsonProperty(value = "sha2AlgorithmFormat")
    private String sha2AlgorithmFormat;

    /**
     * Get the overrideGroupSigningCertificate value.
     *
     * @return the overrideGroupSigningCertificate value
     */
    public boolean overrideGroupSigningCertificate() {
        return this.overrideGroupSigningCertificate;
    }

    /**
     * Set the overrideGroupSigningCertificate value.
     *
     * @param overrideGroupSigningCertificate the overrideGroupSigningCertificate value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withOverrideGroupSigningCertificate(boolean overrideGroupSigningCertificate) {
        this.overrideGroupSigningCertificate = overrideGroupSigningCertificate;
        return this;
    }

    /**
     * Get the signingCertificateName value.
     *
     * @return the signingCertificateName value
     */
    public String signingCertificateName() {
        return this.signingCertificateName;
    }

    /**
     * Set the signingCertificateName value.
     *
     * @param signingCertificateName the signingCertificateName value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withSigningCertificateName(String signingCertificateName) {
        this.signingCertificateName = signingCertificateName;
        return this;
    }

    /**
     * Get the encryptionCertificateName value.
     *
     * @return the encryptionCertificateName value
     */
    public String encryptionCertificateName() {
        return this.encryptionCertificateName;
    }

    /**
     * Set the encryptionCertificateName value.
     *
     * @param encryptionCertificateName the encryptionCertificateName value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEncryptionCertificateName(String encryptionCertificateName) {
        this.encryptionCertificateName = encryptionCertificateName;
        return this;
    }

    /**
     * Get the enableNrrForInboundEncodedMessages value.
     *
     * @return the enableNrrForInboundEncodedMessages value
     */
    public boolean enableNrrForInboundEncodedMessages() {
        return this.enableNrrForInboundEncodedMessages;
    }

    /**
     * Set the enableNrrForInboundEncodedMessages value.
     *
     * @param enableNrrForInboundEncodedMessages the enableNrrForInboundEncodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForInboundEncodedMessages(boolean enableNrrForInboundEncodedMessages) {
        this.enableNrrForInboundEncodedMessages = enableNrrForInboundEncodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForInboundDecodedMessages value.
     *
     * @return the enableNrrForInboundDecodedMessages value
     */
    public boolean enableNrrForInboundDecodedMessages() {
        return this.enableNrrForInboundDecodedMessages;
    }

    /**
     * Set the enableNrrForInboundDecodedMessages value.
     *
     * @param enableNrrForInboundDecodedMessages the enableNrrForInboundDecodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForInboundDecodedMessages(boolean enableNrrForInboundDecodedMessages) {
        this.enableNrrForInboundDecodedMessages = enableNrrForInboundDecodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForOutboundMdn value.
     *
     * @return the enableNrrForOutboundMdn value
     */
    public boolean enableNrrForOutboundMdn() {
        return this.enableNrrForOutboundMdn;
    }

    /**
     * Set the enableNrrForOutboundMdn value.
     *
     * @param enableNrrForOutboundMdn the enableNrrForOutboundMdn value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForOutboundMdn(boolean enableNrrForOutboundMdn) {
        this.enableNrrForOutboundMdn = enableNrrForOutboundMdn;
        return this;
    }

    /**
     * Get the enableNrrForOutboundEncodedMessages value.
     *
     * @return the enableNrrForOutboundEncodedMessages value
     */
    public boolean enableNrrForOutboundEncodedMessages() {
        return this.enableNrrForOutboundEncodedMessages;
    }

    /**
     * Set the enableNrrForOutboundEncodedMessages value.
     *
     * @param enableNrrForOutboundEncodedMessages the enableNrrForOutboundEncodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForOutboundEncodedMessages(boolean enableNrrForOutboundEncodedMessages) {
        this.enableNrrForOutboundEncodedMessages = enableNrrForOutboundEncodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForOutboundDecodedMessages value.
     *
     * @return the enableNrrForOutboundDecodedMessages value
     */
    public boolean enableNrrForOutboundDecodedMessages() {
        return this.enableNrrForOutboundDecodedMessages;
    }

    /**
     * Set the enableNrrForOutboundDecodedMessages value.
     *
     * @param enableNrrForOutboundDecodedMessages the enableNrrForOutboundDecodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForOutboundDecodedMessages(boolean enableNrrForOutboundDecodedMessages) {
        this.enableNrrForOutboundDecodedMessages = enableNrrForOutboundDecodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForInboundMdn value.
     *
     * @return the enableNrrForInboundMdn value
     */
    public boolean enableNrrForInboundMdn() {
        return this.enableNrrForInboundMdn;
    }

    /**
     * Set the enableNrrForInboundMdn value.
     *
     * @param enableNrrForInboundMdn the enableNrrForInboundMdn value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForInboundMdn(boolean enableNrrForInboundMdn) {
        this.enableNrrForInboundMdn = enableNrrForInboundMdn;
        return this;
    }

    /**
     * Get the sha2AlgorithmFormat value.
     *
     * @return the sha2AlgorithmFormat value
     */
    public String sha2AlgorithmFormat() {
        return this.sha2AlgorithmFormat;
    }

    /**
     * Set the sha2AlgorithmFormat value.
     *
     * @param sha2AlgorithmFormat the sha2AlgorithmFormat value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withSha2AlgorithmFormat(String sha2AlgorithmFormat) {
        this.sha2AlgorithmFormat = sha2AlgorithmFormat;
        return this;
    }

}
