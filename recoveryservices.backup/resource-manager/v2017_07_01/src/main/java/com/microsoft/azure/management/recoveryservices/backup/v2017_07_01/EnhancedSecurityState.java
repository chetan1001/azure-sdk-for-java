/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EnhancedSecurityState.
 */
public final class EnhancedSecurityState extends ExpandableStringEnum<EnhancedSecurityState> {
    /** Static value Invalid for EnhancedSecurityState. */
    public static final EnhancedSecurityState INVALID = fromString("Invalid");

    /** Static value Enabled for EnhancedSecurityState. */
    public static final EnhancedSecurityState ENABLED = fromString("Enabled");

    /** Static value Disabled for EnhancedSecurityState. */
    public static final EnhancedSecurityState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a EnhancedSecurityState from its string representation.
     * @param name a name to look for
     * @return the corresponding EnhancedSecurityState
     */
    @JsonCreator
    public static EnhancedSecurityState fromString(String name) {
        return fromString(name, EnhancedSecurityState.class);
    }

    /**
     * @return known EnhancedSecurityState values
     */
    public static Collection<EnhancedSecurityState> values() {
        return values(EnhancedSecurityState.class);
    }
}