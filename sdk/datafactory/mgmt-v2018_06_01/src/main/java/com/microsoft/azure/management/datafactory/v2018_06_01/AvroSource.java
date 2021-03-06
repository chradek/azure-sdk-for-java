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

/**
 * A copy activity Avro source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AvroSource.class)
@JsonTypeName("AvroSource")
public class AvroSource extends CopySource {
    /**
     * Avro store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /**
     * Get avro store settings.
     *
     * @return the storeSettings value
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set avro store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the AvroSource object itself.
     */
    public AvroSource withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

}
