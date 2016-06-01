package com.microsoft.azure;

import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachines;
import com.microsoft.azure.management.compute.implementation.KnownVirtualMachineImage;
import com.microsoft.azure.management.compute.implementation.api.DataDisk;
import com.microsoft.azure.management.compute.implementation.api.NetworkInterfaceReference;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;

public class TestVirtualMachine extends TestTemplate<VirtualMachine, VirtualMachines> {
    @Override
    public VirtualMachine createResource(VirtualMachines virtualMachines) throws Exception {
        final String vmName = "vm" + this.testId;
        final String nicName = "nic" + this.testId;

        return virtualMachines.define(vmName)
                .withRegion(Region.US_EAST)
                .withNewGroup()
                .withNewPrimaryNetworkInterface(nicName)
                .withMarketplaceImage()
                .popular(KnownVirtualMachineImage.WINDOWS_SERVER_2012_R2_DATACENTER)
                .withWindowsOS()
                .withAdminUserName("testuser")
                .withPassword("12NewPA$$w0rd!")
                .create();
    }

    @Override
    public VirtualMachine updateResource(VirtualMachine resource) throws Exception {
        return null;
    }

    @Override
    public void print(VirtualMachine resource) {
        StringBuilder storageProfile = new StringBuilder().append("\n\tStorageProfile: ");
        if (resource.storageProfile().imageReference() != null) {
            storageProfile.append("\n\t\tImageReference:" );
            storageProfile.append("\n\t\t\tPublisher: ").append(resource.storageProfile().imageReference().publisher());
            storageProfile.append("\n\t\t\tOffer: ").append(resource.storageProfile().imageReference().offer());
            storageProfile.append("\n\t\t\tSKU: ").append(resource.storageProfile().imageReference().sku());
            storageProfile.append("\n\t\t\tVersion: ").append(resource.storageProfile().imageReference().version());
        }

        if (resource.storageProfile().osDisk() != null) {
            storageProfile.append("\n\t\tOSDisk:" );
            storageProfile.append("\n\t\t\tOSType: ").append(resource.storageProfile().osDisk().osType());
            storageProfile.append("\n\t\t\tName: ").append(resource.storageProfile().osDisk().name());
            storageProfile.append("\n\t\t\tCaching: ").append(resource.storageProfile().osDisk().caching());
            storageProfile.append("\n\t\t\tCreateOption: ").append(resource.storageProfile().osDisk().createOption());
            storageProfile.append("\n\t\t\tDiskSizeGB: ").append(resource.storageProfile().osDisk().diskSizeGB());
            if (resource.storageProfile().osDisk().image() != null) {
                storageProfile.append("\n\t\t\tImage Uri: ").append(resource.storageProfile().osDisk().image().uri());
            }
            if (resource.storageProfile().osDisk().vhd() != null) {
                storageProfile.append("\n\t\t\tVhd Uri: ").append(resource.storageProfile().osDisk().vhd().uri());
            }
            if (resource.storageProfile().osDisk().encryptionSettings() != null) {
                storageProfile.append("\n\t\t\tEncryptionSettings: ");
                storageProfile.append("\n\t\t\t\tEnabled: ").append(resource.storageProfile().osDisk().encryptionSettings().enabled());
                storageProfile.append("\n\t\t\t\tDiskEncryptionKey Uri: ").append(resource
                        .storageProfile()
                        .osDisk()
                        .encryptionSettings()
                        .diskEncryptionKey().secretUrl());
                storageProfile.append("\n\t\t\t\tKeyEncryptionKey Uri: ").append(resource
                        .storageProfile()
                        .osDisk()
                        .encryptionSettings()
                        .keyEncryptionKey().keyUrl());
            }
        }

        if (resource.storageProfile().dataDisks() != null) {
            int i = 0;
            for (DataDisk disk : resource.storageProfile().dataDisks()) {
                storageProfile.append("\n\t\tDataDisk: #" ).append(i++);
                storageProfile.append("\n\t\t\tName: ").append(disk.name());
                storageProfile.append("\n\t\t\tCaching: ").append(disk.caching());
                storageProfile.append("\n\t\t\tCreateOption: ").append(disk.createOption());
                storageProfile.append("\n\t\t\tDiskSizeGB: ").append(disk.diskSizeGB());
                storageProfile.append("\n\t\t\tLun: ").append(disk.lun());
                if (disk.vhd().uri() != null) {
                    storageProfile.append("\n\t\t\tVhd Uri: ").append(disk.vhd().uri());
                }
                if (disk.image() != null) {
                    storageProfile.append("\n\t\t\tImage Uri: ").append(disk.image().uri());
                }
            }
        }

        StringBuilder osProfile = new StringBuilder().append("\n\tOSProfile: ");
        osProfile.append("\n\t\tComputerName:" ).append(resource.osProfile().computerName());
        if (resource.osProfile().windowsConfiguration() != null) {
            osProfile.append("\n\t\t\tWindowsConfiguration: ");
            osProfile.append("\n\t\t\t\tProvisionVMAgent: ")
                    .append(resource.osProfile().windowsConfiguration().provisionVMAgent());
            osProfile.append("\n\t\t\t\tEnableAutomaticUpdates: ")
                    .append(resource.osProfile().windowsConfiguration().enableAutomaticUpdates());
            osProfile.append("\n\t\t\t\tTimeZone: ")
                    .append(resource.osProfile().windowsConfiguration().timeZone());
        }

        if (resource.osProfile().linuxConfiguration() != null) {
            osProfile.append("\n\t\t\tLinuxConfiguration: ");
            osProfile.append("\n\t\t\t\tDisablePasswordAuthentication: ")
                    .append(resource.osProfile().linuxConfiguration().disablePasswordAuthentication());
        }

        StringBuilder networkProfile = new StringBuilder().append("\n\tNetworkProfile: ");
        for (NetworkInterfaceReference nicReference : resource.networkProfile().networkInterfaces()) {
            networkProfile.append("\n\t\tId:" ).append(nicReference.id());
            networkProfile.append("\n\t\tPrimary:" ).append(nicReference.primary());
        }

        System.out.println(new StringBuilder().append("Virtual Machine: ").append(resource.id())
                .append("Name: ").append(resource.name())
                .append("\n\tResource group: ").append(resource.resourceGroupName())
                .append("\n\tRegion: ").append(resource.region())
                .append("\n\tTags: ").append(resource.tags())
                .append("\n\tHardwareProfile: ")
                    .append("\n\t\tSize: ").append(resource.hardwareProfile().vmSize())
                .append(storageProfile)
                .append(osProfile)
                .append(networkProfile)
                .toString());
    }
}
