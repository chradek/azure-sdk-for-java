/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.compute.models.PageImpl;
import com.microsoft.azure.management.compute.models.VirtualMachineSize;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineSizesOperations.
 */
public interface VirtualMachineSizesOperations {
    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineSize&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineSize>> list(final String location) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String location, final ListOperationCallback<VirtualMachineSize> serviceCallback) throws IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineSize&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualMachineSize>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualMachineSize> serviceCallback) throws IllegalArgumentException;

}
