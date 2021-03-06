/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.HubVirtualNetworkConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing HubVirtualNetworkConnection.
 */
public interface HubVirtualNetworkConnection extends HasInner<HubVirtualNetworkConnectionInner>, Indexable, Refreshable<HubVirtualNetworkConnection>, HasManager<NetworkManager> {
    /**
     * @return the allowHubToRemoteVnetTransit value.
     */
    Boolean allowHubToRemoteVnetTransit();

    /**
     * @return the allowRemoteVnetToUseHubVnetGateways value.
     */
    Boolean allowRemoteVnetToUseHubVnetGateways();

    /**
     * @return the enableInternetSecurity value.
     */
    Boolean enableInternetSecurity();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the remoteVirtualNetwork value.
     */
    SubResource remoteVirtualNetwork();

}
