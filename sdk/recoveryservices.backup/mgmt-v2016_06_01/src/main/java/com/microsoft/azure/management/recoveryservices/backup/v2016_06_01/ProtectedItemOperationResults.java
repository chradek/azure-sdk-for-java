/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectedItemOperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectedItemOperationResults.
 */
public interface ProtectedItemOperationResults extends HasInner<ProtectedItemOperationResultsInner> {
    /**
     * Gets the result of any operation on the backup item.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup item.
     * @param containerName The container name associated with the backup item.
     * @param protectedItemName The name of backup item used in this GET operation.
     * @param operationId The OperationID used in this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupFabricVaultProtectedItemResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId);

}
