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
 * Represents an Azure SQL Database data masking rule.
 */
@JsonFlatten
public class DataMaskingRuleInner extends SubResource {
    /**
     * Gets or sets the rule Id.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String dataMaskingRuleId;

    /**
     * Gets or sets the rule state.
     */
    @JsonProperty(value = "properties.ruleState", required = true)
    private String ruleState;

    /**
     * Gets or sets the schema name on which the data masking rule is applied.
     */
    @JsonProperty(value = "properties.schemaName")
    private String schemaName;

    /**
     * Gets or sets the table name on which the data masking rule is applied.
     */
    @JsonProperty(value = "properties.tableName")
    private String tableName;

    /**
     * Gets or sets the column name on which the data masking rule is applied.
     */
    @JsonProperty(value = "properties.columnName")
    private String columnName;

    /**
     * Gets or sets the masking function that is used for the data masking
     * rule.
     */
    @JsonProperty(value = "properties.maskingFunction", required = true)
    private String maskingFunction;

    /**
     * Gets or sets the numberFrom property of the masking rule.
     */
    @JsonProperty(value = "properties.numberFrom")
    private String numberFrom;

    /**
     * Gets or sets the numberTo property of the data masking rule.
     */
    @JsonProperty(value = "properties.numberTo")
    private String numberTo;

    /**
     * Gets or sets the prefixSize property that is used for the data masking
     * rule.
     */
    @JsonProperty(value = "properties.prefixSize")
    private String prefixSize;

    /**
     * Gets or sets the suffixSize property that is used for the data masking
     * rule.
     */
    @JsonProperty(value = "properties.suffixSize")
    private String suffixSize;

    /**
     * Gets or sets the replacementString property that is used for the data
     * masking rule.
     */
    @JsonProperty(value = "properties.replacementString")
    private String replacementString;

    /**
     * Get the dataMaskingRuleId value.
     *
     * @return the dataMaskingRuleId value
     */
    public String dataMaskingRuleId() {
        return this.dataMaskingRuleId;
    }

    /**
     * Set the dataMaskingRuleId value.
     *
     * @param dataMaskingRuleId the dataMaskingRuleId value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withDataMaskingRuleId(String dataMaskingRuleId) {
        this.dataMaskingRuleId = dataMaskingRuleId;
        return this;
    }

    /**
     * Get the ruleState value.
     *
     * @return the ruleState value
     */
    public String ruleState() {
        return this.ruleState;
    }

    /**
     * Set the ruleState value.
     *
     * @param ruleState the ruleState value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withRuleState(String ruleState) {
        this.ruleState = ruleState;
        return this;
    }

    /**
     * Get the schemaName value.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName value.
     *
     * @param schemaName the schemaName value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the tableName value.
     *
     * @return the tableName value
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName value.
     *
     * @param tableName the tableName value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the columnName value.
     *
     * @return the columnName value
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * Set the columnName value.
     *
     * @param columnName the columnName value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the maskingFunction value.
     *
     * @return the maskingFunction value
     */
    public String maskingFunction() {
        return this.maskingFunction;
    }

    /**
     * Set the maskingFunction value.
     *
     * @param maskingFunction the maskingFunction value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withMaskingFunction(String maskingFunction) {
        this.maskingFunction = maskingFunction;
        return this;
    }

    /**
     * Get the numberFrom value.
     *
     * @return the numberFrom value
     */
    public String numberFrom() {
        return this.numberFrom;
    }

    /**
     * Set the numberFrom value.
     *
     * @param numberFrom the numberFrom value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withNumberFrom(String numberFrom) {
        this.numberFrom = numberFrom;
        return this;
    }

    /**
     * Get the numberTo value.
     *
     * @return the numberTo value
     */
    public String numberTo() {
        return this.numberTo;
    }

    /**
     * Set the numberTo value.
     *
     * @param numberTo the numberTo value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withNumberTo(String numberTo) {
        this.numberTo = numberTo;
        return this;
    }

    /**
     * Get the prefixSize value.
     *
     * @return the prefixSize value
     */
    public String prefixSize() {
        return this.prefixSize;
    }

    /**
     * Set the prefixSize value.
     *
     * @param prefixSize the prefixSize value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withPrefixSize(String prefixSize) {
        this.prefixSize = prefixSize;
        return this;
    }

    /**
     * Get the suffixSize value.
     *
     * @return the suffixSize value
     */
    public String suffixSize() {
        return this.suffixSize;
    }

    /**
     * Set the suffixSize value.
     *
     * @param suffixSize the suffixSize value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withSuffixSize(String suffixSize) {
        this.suffixSize = suffixSize;
        return this;
    }

    /**
     * Get the replacementString value.
     *
     * @return the replacementString value
     */
    public String replacementString() {
        return this.replacementString;
    }

    /**
     * Set the replacementString value.
     *
     * @param replacementString the replacementString value to set
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withReplacementString(String replacementString) {
        this.replacementString = replacementString;
        return this;
    }

}
