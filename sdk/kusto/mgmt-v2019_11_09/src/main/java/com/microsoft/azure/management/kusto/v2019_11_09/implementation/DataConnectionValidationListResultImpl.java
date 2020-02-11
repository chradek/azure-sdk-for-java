/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09.implementation;

import com.microsoft.azure.management.kusto.v2019_11_09.DataConnectionValidationListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.kusto.v2019_11_09.DataConnectionValidationResult;

class DataConnectionValidationListResultImpl extends WrapperImpl<DataConnectionValidationListResultInner> implements DataConnectionValidationListResult {
    private final KustoManager manager;
    DataConnectionValidationListResultImpl(DataConnectionValidationListResultInner inner, KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public List<DataConnectionValidationResult> value() {
        return this.inner().value();
    }

}
