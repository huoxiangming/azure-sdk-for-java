/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql.models;

/**
* Represents the properties of an Azure SQL Database security policy.
*/
public class DatabaseSecurityPolicyProperties {
    private String adoNetConnectionString;
    
    /**
    * Optional. Gets or sets ADO.NET connection string.
    * @return The AdoNetConnectionString value.
    */
    public String getAdoNetConnectionString() {
        return this.adoNetConnectionString;
    }
    
    /**
    * Optional. Gets or sets ADO.NET connection string.
    * @param adoNetConnectionStringValue The AdoNetConnectionString value.
    */
    public void setAdoNetConnectionString(final String adoNetConnectionStringValue) {
        this.adoNetConnectionString = adoNetConnectionStringValue;
    }
    
    private boolean isAuditingEnabled;
    
    /**
    * Optional. Gets or sets whether auditing is enabled.
    * @return The IsAuditingEnabled value.
    */
    public boolean isAuditingEnabled() {
        return this.isAuditingEnabled;
    }
    
    /**
    * Optional. Gets or sets whether auditing is enabled.
    * @param isAuditingEnabledValue The IsAuditingEnabled value.
    */
    public void setIsAuditingEnabled(final boolean isAuditingEnabledValue) {
        this.isAuditingEnabled = isAuditingEnabledValue;
    }
    
    private boolean isBlockDirectAccessEnabled;
    
    /**
    * Optional. Gets or sets a value indicating whether block direct access is
    * enabled.
    * @return The IsBlockDirectAccessEnabled value.
    */
    public boolean isBlockDirectAccessEnabled() {
        return this.isBlockDirectAccessEnabled;
    }
    
    /**
    * Optional. Gets or sets a value indicating whether block direct access is
    * enabled.
    * @param isBlockDirectAccessEnabledValue The IsBlockDirectAccessEnabled
    * value.
    */
    public void setIsBlockDirectAccessEnabled(final boolean isBlockDirectAccessEnabledValue) {
        this.isBlockDirectAccessEnabled = isBlockDirectAccessEnabledValue;
    }
    
    private boolean isEventTypeDataAccessEnabled;
    
    /**
    * Optional. Gets or sets whether auditing data access events.
    * @return The IsEventTypeDataAccessEnabled value.
    */
    public boolean isEventTypeDataAccessEnabled() {
        return this.isEventTypeDataAccessEnabled;
    }
    
    /**
    * Optional. Gets or sets whether auditing data access events.
    * @param isEventTypeDataAccessEnabledValue The IsEventTypeDataAccessEnabled
    * value.
    */
    public void setIsEventTypeDataAccessEnabled(final boolean isEventTypeDataAccessEnabledValue) {
        this.isEventTypeDataAccessEnabled = isEventTypeDataAccessEnabledValue;
    }
    
    private boolean isEventTypeDataChangesEnabled;
    
    /**
    * Optional. Gets or sets whether auditing data changes events.
    * @return The IsEventTypeDataChangesEnabled value.
    */
    public boolean isEventTypeDataChangesEnabled() {
        return this.isEventTypeDataChangesEnabled;
    }
    
    /**
    * Optional. Gets or sets whether auditing data changes events.
    * @param isEventTypeDataChangesEnabledValue The
    * IsEventTypeDataChangesEnabled value.
    */
    public void setIsEventTypeDataChangesEnabled(final boolean isEventTypeDataChangesEnabledValue) {
        this.isEventTypeDataChangesEnabled = isEventTypeDataChangesEnabledValue;
    }
    
    private boolean isEventTypeGrantRevokePermissionsEnabled;
    
    /**
    * Optional. Gets or sets whether auditing grant/revoke permissions events.
    * @return The IsEventTypeGrantRevokePermissionsEnabled value.
    */
    public boolean isEventTypeGrantRevokePermissionsEnabled() {
        return this.isEventTypeGrantRevokePermissionsEnabled;
    }
    
    /**
    * Optional. Gets or sets whether auditing grant/revoke permissions events.
    * @param isEventTypeGrantRevokePermissionsEnabledValue The
    * IsEventTypeGrantRevokePermissionsEnabled value.
    */
    public void setIsEventTypeGrantRevokePermissionsEnabled(final boolean isEventTypeGrantRevokePermissionsEnabledValue) {
        this.isEventTypeGrantRevokePermissionsEnabled = isEventTypeGrantRevokePermissionsEnabledValue;
    }
    
    private boolean isEventTypeSchemaChangeEnabled;
    
    /**
    * Optional. Gets or sets whether auditing schema changes events.
    * @return The IsEventTypeSchemaChangeEnabled value.
    */
    public boolean isEventTypeSchemaChangeEnabled() {
        return this.isEventTypeSchemaChangeEnabled;
    }
    
    /**
    * Optional. Gets or sets whether auditing schema changes events.
    * @param isEventTypeSchemaChangeEnabledValue The
    * IsEventTypeSchemaChangeEnabled value.
    */
    public void setIsEventTypeSchemaChangeEnabled(final boolean isEventTypeSchemaChangeEnabledValue) {
        this.isEventTypeSchemaChangeEnabled = isEventTypeSchemaChangeEnabledValue;
    }
    
    private boolean isEventTypeSecurityExceptionsEnabled;
    
    /**
    * Optional. Gets or sets whether auditing security exceptions events.
    * @return The IsEventTypeSecurityExceptionsEnabled value.
    */
    public boolean isEventTypeSecurityExceptionsEnabled() {
        return this.isEventTypeSecurityExceptionsEnabled;
    }
    
    /**
    * Optional. Gets or sets whether auditing security exceptions events.
    * @param isEventTypeSecurityExceptionsEnabledValue The
    * IsEventTypeSecurityExceptionsEnabled value.
    */
    public void setIsEventTypeSecurityExceptionsEnabled(final boolean isEventTypeSecurityExceptionsEnabledValue) {
        this.isEventTypeSecurityExceptionsEnabled = isEventTypeSecurityExceptionsEnabledValue;
    }
    
    private String jdbcConnectionString;
    
    /**
    * Optional. Gets or set JDBC connection string.
    * @return The JdbcConnectionString value.
    */
    public String getJdbcConnectionString() {
        return this.jdbcConnectionString;
    }
    
    /**
    * Optional. Gets or set JDBC connection string.
    * @param jdbcConnectionStringValue The JdbcConnectionString value.
    */
    public void setJdbcConnectionString(final String jdbcConnectionStringValue) {
        this.jdbcConnectionString = jdbcConnectionStringValue;
    }
    
    private String odbcConnectionString;
    
    /**
    * Optional. Gets or sets ODBC connection string.
    * @return The OdbcConnectionString value.
    */
    public String getOdbcConnectionString() {
        return this.odbcConnectionString;
    }
    
    /**
    * Optional. Gets or sets ODBC connection string.
    * @param odbcConnectionStringValue The OdbcConnectionString value.
    */
    public void setOdbcConnectionString(final String odbcConnectionStringValue) {
        this.odbcConnectionString = odbcConnectionStringValue;
    }
    
    private String phpConnectionString;
    
    /**
    * Optional. Gets or sets PHP connection setring.
    * @return The PhpConnectionString value.
    */
    public String getPhpConnectionString() {
        return this.phpConnectionString;
    }
    
    /**
    * Optional. Gets or sets PHP connection setring.
    * @param phpConnectionStringValue The PhpConnectionString value.
    */
    public void setPhpConnectionString(final String phpConnectionStringValue) {
        this.phpConnectionString = phpConnectionStringValue;
    }
    
    private String proxyDnsName;
    
    /**
    * Optional. Gets or sets the proxy DNS Name.
    * @return The ProxyDnsName value.
    */
    public String getProxyDnsName() {
        return this.proxyDnsName;
    }
    
    /**
    * Optional. Gets or sets the proxy DNS Name.
    * @param proxyDnsNameValue The ProxyDnsName value.
    */
    public void setProxyDnsName(final String proxyDnsNameValue) {
        this.proxyDnsName = proxyDnsNameValue;
    }
    
    private int retentionDays;
    
    /**
    * Optional. Gets or sets the number of retention days.
    * @return The RetentionDays value.
    */
    public int getRetentionDays() {
        return this.retentionDays;
    }
    
    /**
    * Optional. Gets or sets the number of retention days.
    * @param retentionDaysValue The RetentionDays value.
    */
    public void setRetentionDays(final int retentionDaysValue) {
        this.retentionDays = retentionDaysValue;
    }
    
    private String secondaryStorageAccountKey;
    
    /**
    * Optional. Gets or sets the secondary storage account key.
    * @return The SecondaryStorageAccountKey value.
    */
    public String getSecondaryStorageAccountKey() {
        return this.secondaryStorageAccountKey;
    }
    
    /**
    * Optional. Gets or sets the secondary storage account key.
    * @param secondaryStorageAccountKeyValue The SecondaryStorageAccountKey
    * value.
    */
    public void setSecondaryStorageAccountKey(final String secondaryStorageAccountKeyValue) {
        this.secondaryStorageAccountKey = secondaryStorageAccountKeyValue;
    }
    
    private String storageAccountKey;
    
    /**
    * Optional. Gets or sets the storage account key.
    * @return The StorageAccountKey value.
    */
    public String getStorageAccountKey() {
        return this.storageAccountKey;
    }
    
    /**
    * Optional. Gets or sets the storage account key.
    * @param storageAccountKeyValue The StorageAccountKey value.
    */
    public void setStorageAccountKey(final String storageAccountKeyValue) {
        this.storageAccountKey = storageAccountKeyValue;
    }
    
    private String storageAccountName;
    
    /**
    * Optional. Gets or sets auditing Storage account name.
    * @return The StorageAccountName value.
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    
    /**
    * Optional. Gets or sets auditing Storage account name.
    * @param storageAccountNameValue The StorageAccountName value.
    */
    public void setStorageAccountName(final String storageAccountNameValue) {
        this.storageAccountName = storageAccountNameValue;
    }
    
    private String storageAccountResourceGroupName;
    
    /**
    * Optional. Gets or sets the resource group name of the audit storage
    * account.
    * @return The StorageAccountResourceGroupName value.
    */
    public String getStorageAccountResourceGroupName() {
        return this.storageAccountResourceGroupName;
    }
    
    /**
    * Optional. Gets or sets the resource group name of the audit storage
    * account.
    * @param storageAccountResourceGroupNameValue The
    * StorageAccountResourceGroupName value.
    */
    public void setStorageAccountResourceGroupName(final String storageAccountResourceGroupNameValue) {
        this.storageAccountResourceGroupName = storageAccountResourceGroupNameValue;
    }
    
    private String storageAccountSubscriptionId;
    
    /**
    * Optional. Gets or sets the subscription Id of the audit storage account.
    * @return The StorageAccountSubscriptionId value.
    */
    public String getStorageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }
    
    /**
    * Optional. Gets or sets the subscription Id of the audit storage account.
    * @param storageAccountSubscriptionIdValue The StorageAccountSubscriptionId
    * value.
    */
    public void setStorageAccountSubscriptionId(final String storageAccountSubscriptionIdValue) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionIdValue;
    }
    
    private String storageTableEndpoint;
    
    /**
    * Optional. Gets or sets the storage table end point.
    * @return The StorageTableEndpoint value.
    */
    public String getStorageTableEndpoint() {
        return this.storageTableEndpoint;
    }
    
    /**
    * Optional. Gets or sets the storage table end point.
    * @param storageTableEndpointValue The StorageTableEndpoint value.
    */
    public void setStorageTableEndpoint(final String storageTableEndpointValue) {
        this.storageTableEndpoint = storageTableEndpointValue;
    }
    
    private boolean useServerDefault;
    
    /**
    * Optional. Gets or sets whether server default policy is used.
    * @return The UseServerDefault value.
    */
    public boolean isUseServerDefault() {
        return this.useServerDefault;
    }
    
    /**
    * Optional. Gets or sets whether server default policy is used.
    * @param useServerDefaultValue The UseServerDefault value.
    */
    public void setUseServerDefault(final boolean useServerDefaultValue) {
        this.useServerDefault = useServerDefaultValue;
    }
}