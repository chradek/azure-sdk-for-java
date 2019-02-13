/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01.implementation;

import com.microsoft.azure.management.datalakestore.v2016_11_01.VirtualNetworkRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.datalakestore.v2016_11_01.UpdateVirtualNetworkRuleParameters;
import com.microsoft.azure.management.datalakestore.v2016_11_01.CreateOrUpdateVirtualNetworkRuleParameters;
import rx.functions.Func1;

class VirtualNetworkRuleImpl extends CreatableUpdatableImpl<VirtualNetworkRule, VirtualNetworkRuleInner, VirtualNetworkRuleImpl> implements VirtualNetworkRule, VirtualNetworkRule.Definition, VirtualNetworkRule.Update {
    private final DataLakeStoreManager manager;
    private String resourceGroupName;
    private String accountName;
    private String virtualNetworkRuleName;
    private CreateOrUpdateVirtualNetworkRuleParameters createParameter;
    private UpdateVirtualNetworkRuleParameters updateParameter;

    VirtualNetworkRuleImpl(String name, DataLakeStoreManager manager) {
        super(name, new VirtualNetworkRuleInner());
        this.manager = manager;
        // Set resource name
        this.virtualNetworkRuleName = name;
        //
        this.createParameter = new CreateOrUpdateVirtualNetworkRuleParameters();
        this.updateParameter = new UpdateVirtualNetworkRuleParameters();
    }

    VirtualNetworkRuleImpl(VirtualNetworkRuleInner inner, DataLakeStoreManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.virtualNetworkRuleName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "accounts");
        this.virtualNetworkRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkRules");
        //
        this.createParameter = new CreateOrUpdateVirtualNetworkRuleParameters();
        this.updateParameter = new UpdateVirtualNetworkRuleParameters();
    }

    @Override
    public DataLakeStoreManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualNetworkRule> createResourceAsync() {
        VirtualNetworkRulesInner client = this.manager().inner().virtualNetworkRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.virtualNetworkRuleName, this.createParameter)
            .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRuleInner>() {
               @Override
               public VirtualNetworkRuleInner call(VirtualNetworkRuleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkRule> updateResourceAsync() {
        VirtualNetworkRulesInner client = this.manager().inner().virtualNetworkRules();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.virtualNetworkRuleName, this.updateParameter)
            .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRuleInner>() {
               @Override
               public VirtualNetworkRuleInner call(VirtualNetworkRuleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkRuleInner> getInnerAsync() {
        VirtualNetworkRulesInner client = this.manager().inner().virtualNetworkRules();
        return client.getAsync(this.resourceGroupName, this.accountName, this.virtualNetworkRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new CreateOrUpdateVirtualNetworkRuleParameters();
        this.updateParameter = new UpdateVirtualNetworkRuleParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String subnetId() {
        return this.inner().subnetId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VirtualNetworkRuleImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public VirtualNetworkRuleImpl withSubnetId(String subnetId) {
        if (isInCreateMode()) {
            this.createParameter.withSubnetId(subnetId);
        } else {
            this.updateParameter.withSubnetId(subnetId);
        }
        return this;
    }

}