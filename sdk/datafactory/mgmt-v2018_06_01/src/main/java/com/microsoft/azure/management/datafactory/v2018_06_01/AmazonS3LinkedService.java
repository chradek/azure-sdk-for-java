/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Linked service for Amazon S3.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AmazonS3LinkedService.class)
@JsonTypeName("AmazonS3")
@JsonFlatten
public class AmazonS3LinkedService extends LinkedServiceInner {
    /**
     * The access key identifier of the Amazon S3 Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.accessKeyId")
    private Object accessKeyId;

    /**
     * The secret access key of the Amazon S3 Identity and Access Management
     * (IAM) user.
     */
    @JsonProperty(value = "typeProperties.secretAccessKey")
    private SecretBase secretAccessKey;

    /**
     * This value specifies the endpoint to access with the S3 Connector. This
     * is an optional property; change it only if you want to try a different
     * service endpoint or want to switch between https and http. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUrl")
    private Object serviceUrl;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @return the accessKeyId value
     */
    public Object accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @param accessKeyId the accessKeyId value to set
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService withAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     *
     * @return the secretAccessKey value
     */
    public SecretBase secretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * Set the secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     *
     * @param secretAccessKey the secretAccessKey value to set
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService withSecretAccessKey(SecretBase secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * Get this value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     *
     * @return the serviceUrl value
     */
    public Object serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set this value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     *
     * @param serviceUrl the serviceUrl value to set
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService withServiceUrl(Object serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
