/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.TransparentDataEncryptionStates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Represents an Azure SQL Database Transparent Data Encryption .
 */
@JsonFlatten
public class TransparentDataEncryptionInner extends SubResource {
    /**
     * Gets the status of the Azure SQL Database Transparent Data Encryption.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.status")
    private TransparentDataEncryptionStates status;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public TransparentDataEncryptionStates status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the TransparentDataEncryptionInner object itself.
     */
    public TransparentDataEncryptionInner withStatus(TransparentDataEncryptionStates status) {
        this.status = status;
        return this;
    }

}
