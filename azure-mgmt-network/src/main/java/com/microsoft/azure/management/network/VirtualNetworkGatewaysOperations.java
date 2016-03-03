/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.VirtualNetworkGateway;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworkGatewaysOperations.
 */
public interface VirtualNetworkGatewaysOperations {
    /**
     * The Put VirtualNetworkGateway operation creates/updates a virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGateway> createOrUpdate(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetworkGateway operation creates/updates a virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters, final ServiceCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put VirtualNetworkGateway operation creates/updates a virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGateway> beginCreateOrUpdate(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put VirtualNetworkGateway operation creates/updates a virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters, final ServiceCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get VirtualNetworkGateway operation retrieves information about the specified virtual network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGateway> get(String resourceGroupName, String virtualNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetworkGateway operation retrieves information about the specified virtual network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String virtualNetworkGatewayName, final ServiceCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete VirtualNetworkGateway operation deletes the specifed virtual network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete VirtualNetworkGateway operation deletes the specifed virtual network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String virtualNetworkGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete VirtualNetworkGateway operation deletes the specifed virtual network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String virtualNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Delete VirtualNetworkGateway operation deletes the specifed virtual network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String virtualNetworkGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetworkGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualNetworkGateway>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Reset VirtualNetworkGateway operation resets the primary of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGateway> reset(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Reset VirtualNetworkGateway operation resets the primary of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall resetAsync(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters, final ServiceCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Reset VirtualNetworkGateway operation resets the primary of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGateway> beginReset(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Reset VirtualNetworkGateway operation resets the primary of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginResetAsync(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters, final ServiceCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Generatevpnclientpackage operation generates Vpn client package for P2S client of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param processorArchitecture VPN client Processor Architecture -Amd64/X86. Possible values include: 'Amd64', 'X86'
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<String> generatevpnclientpackage(String resourceGroupName, String virtualNetworkGatewayName, String processorArchitecture) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Generatevpnclientpackage operation generates Vpn client package for P2S client of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param processorArchitecture VPN client Processor Architecture -Amd64/X86. Possible values include: 'Amd64', 'X86'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall generatevpnclientpackageAsync(String resourceGroupName, String virtualNetworkGatewayName, String processorArchitecture, final ServiceCallback<String> serviceCallback) throws IllegalArgumentException;

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetworkGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualNetworkGateway>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualNetworkGateway> serviceCallback) throws IllegalArgumentException;

}
