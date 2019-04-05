// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.keyvault;

import com.azure.keyvault.models.Secret;
import com.azure.keyvault.models.SecretAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * The object attributes managed by the Secret service.
 */
class SecretRequestAttributes {

    /**
     * Creates an instance of SecretRequestAttributes. Reads secretAttributes.notBefore, secretAttributes.expires and secretAttributes.enabled fields
     * from {@code secretAttributes}
     * @param secretAttributes the {@link SecretAttributes} object with populated attributes
     */
    public SecretRequestAttributes(SecretAttributes secretAttributes){
        if(secretAttributes.notBefore() != null) {
            this.notBefore = secretAttributes.notBefore().toEpochSecond();
        }
        if(secretAttributes.expires() != null) {
            this.expires = secretAttributes.expires().toEpochSecond();
        }
        this.enabled = secretAttributes.enabled();
    }

    /**
     * The secret value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The secret id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Determines whether the object is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Not before date in UTC.
     */
    @JsonProperty(value = "nbf")
    private Long notBefore;

    /**
     * Expiry date in UTC.
     */
    @JsonProperty(value = "exp")
    private Long expires;

    /**
     * Creation time in UTC.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private Long created;

    /**
     * Last updated time in UTC.
     */
    @JsonProperty(value = "updated", access = JsonProperty.Access.WRITE_ONLY)
    private Long updated;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the Attributes object itself.
     */
    public SecretRequestAttributes enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the notBefore value.
     *
     * @return the notBefore value
     */
    public OffsetDateTime notBefore() {
        if (this.notBefore == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(this.notBefore * 1000L), ZoneOffset.UTC);
    }

    /**
     * Set the notBefore value.
     *
     * @param notBefore the notBefore value to set
     * @return the Attributes object itself.
     */
    public SecretRequestAttributes notBefore(OffsetDateTime notBefore) {
        if (notBefore == null) {
            this.notBefore = null;
        } else {
            this.notBefore = OffsetDateTime.ofInstant(notBefore.toInstant(), ZoneOffset.UTC).toEpochSecond();
        }
        return this;
    }

    /**
     * Get the expires value.
     *
     * @return the expires value
     */
    public OffsetDateTime expires() {
        if (this.expires == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(this.expires * 1000L), ZoneOffset.UTC);
    }

    /**
     * Set the expires value.
     *
     * @param expires the expires value to set
     * @return the Attributes object itself.
     */
    public SecretRequestAttributes expires(OffsetDateTime expires) {
        if (expires == null) {
            this.expires = null;
        } else {
            this.expires = OffsetDateTime.ofInstant(expires.toInstant(), ZoneOffset.UTC).toEpochSecond();
        }
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public OffsetDateTime created() {
        if (this.created == null) {
            return null;
        }
        return  OffsetDateTime.ofInstant(Instant.ofEpochMilli(this.created * 1000L), ZoneOffset.UTC);
    }

    /**
     * Get the updated value.
     *
     * @return the updated value
     */
    public OffsetDateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return  OffsetDateTime.ofInstant(Instant.ofEpochMilli(this.updated * 1000L), ZoneOffset.UTC);
    }

}