/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error code compose of code and message.
 */
public class Error {
    /**
     * The code of error.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The message of error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code of error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code of error.
     *
     * @param code the code value to set
     * @return the Error object itself.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message of error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message of error.
     *
     * @param message the message value to set
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

}
