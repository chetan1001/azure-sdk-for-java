/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.implementation.ComputeSecretsInner;

/**
 * Secrets related to a Machine Learning compute based on AKS.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("VirtualMachine")
public class VirtualMachineSecrets extends ComputeSecretsInner {
    /**
     * Admin credentials for virtual machine.
     */
    @JsonProperty(value = "administratorAccount")
    private VirtualMachineSshCredentials administratorAccount;

    /**
     * Get admin credentials for virtual machine.
     *
     * @return the administratorAccount value
     */
    public VirtualMachineSshCredentials administratorAccount() {
        return this.administratorAccount;
    }

    /**
     * Set admin credentials for virtual machine.
     *
     * @param administratorAccount the administratorAccount value to set
     * @return the VirtualMachineSecrets object itself.
     */
    public VirtualMachineSecrets withAdministratorAccount(VirtualMachineSshCredentials administratorAccount) {
        this.administratorAccount = administratorAccount;
        return this;
    }

}