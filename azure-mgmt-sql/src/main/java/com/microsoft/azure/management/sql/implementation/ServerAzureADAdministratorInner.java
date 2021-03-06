/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Represents an Azure SQL Server Active Directory Administrator.
 */
@JsonFlatten
public class ServerAzureADAdministratorInner extends SubResource {
    /**
     * Gets the type of Azure SQL Server Administrator.
     */
    @JsonProperty(value = "properties.administratorType", required = true)
    private String administratorType;

    /**
     * Gets the Azure SQL Server Administrator Login Value.
     */
    @JsonProperty(value = "properties.login", required = true)
    private String login;

    /**
     * Gets the Azure SQL Server Administrator Sid.
     */
    @JsonProperty(value = "properties.sid", required = true)
    private String sid;

    /**
     * Gets the Azure SQL Server Active Directory Administrator tenant id.
     */
    @JsonProperty(value = "properties.tenantId", required = true)
    private String tenantId;

    /**
     * Get the administratorType value.
     *
     * @return the administratorType value
     */
    public String administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType value.
     *
     * @param administratorType the administratorType value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withAdministratorType(String administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the login value.
     *
     * @return the login value
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login value.
     *
     * @param login the login value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the sid value.
     *
     * @return the sid value
     */
    public String sid() {
        return this.sid;
    }

    /**
     * Set the sid value.
     *
     * @param sid the sid value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
