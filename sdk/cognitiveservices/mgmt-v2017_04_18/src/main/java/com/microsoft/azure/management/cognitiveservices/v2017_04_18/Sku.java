/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU of the cognitive services account.
 */
public class Sku {
    /**
     * Gets or sets the sku name. Required for account creation, optional for
     * update.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Gets the sku tier. This is based on the SKU name. Possible values
     * include: 'Free', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * Get gets or sets the sku name. Required for account creation, optional for update.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the sku name. Required for account creation, optional for update.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets the sku tier. This is based on the SKU name. Possible values include: 'Free', 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

}
