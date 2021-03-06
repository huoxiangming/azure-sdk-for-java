/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TableType.
 */
public final class TableType {
    /** Static value BaseTable for TableType. */
    public static final TableType BASE_TABLE = new TableType("BaseTable");

    /** Static value View for TableType. */
    public static final TableType VIEW = new TableType("View");

    private String value;

    /**
     * Creates a custom value for TableType.
     * @param value the custom value
     */
    public TableType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TableType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TableType rhs = (TableType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
