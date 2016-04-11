package com.microsoft.azure;

import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.credentials.AzureEnvironment;
import com.microsoft.azure.implementation.Azure;
import com.microsoft.azure.management.resources.ResourceGroups;
import com.microsoft.azure.management.resources.Subscriptions;
import com.microsoft.azure.management.storage.StorageAccounts;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class AzureTests {
    static final ServiceClientCredentials credentials = new ApplicationTokenCredentials(
            System.getenv("client-id"),
            System.getenv("domain"),
            System.getenv("secret"),
            AzureEnvironment.AZURE);
    static final String subscriptionId = System.getenv("subscription-id");

    Subscriptions subscriptions;
    ResourceGroups resourceGroups;
    StorageAccounts storageAccounts;

    @Before
    public void setup() throws Exception {
        subscriptions = Azure.authenticate(credentials).subscriptions();

        resourceGroups = Azure.authenticate(credentials)
            .subscription(subscriptionId)
            .resourceGroups();

        storageAccounts = Azure.authenticate(credentials)
            .subscription(subscriptionId)
            .storageAccounts();
    }

    @Test
    public void listSubscriptions() throws Exception {
        Assert.assertTrue(0 < subscriptions.size());
    }

    @Test
    public void listResourceGroups() throws Exception {
        Assert.assertTrue(0 < resourceGroups.size());
    }

    @Test
    public void listStorageAccounts() throws Exception {
        Assert.assertTrue(0 < storageAccounts.size());
    }
}
