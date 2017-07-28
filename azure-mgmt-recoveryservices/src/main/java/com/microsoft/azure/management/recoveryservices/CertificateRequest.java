/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices;

import com.microsoft.azure.management.recoveryservices.implementation.RawCertificateDataInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the certificate to be uploaded to the vault.
 */
public class CertificateRequest {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private RawCertificateDataInner properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public RawCertificateDataInner properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the CertificateRequest object itself.
     */
    public CertificateRequest withProperties(RawCertificateDataInner properties) {
        this.properties = properties;
        return this;
    }

}
