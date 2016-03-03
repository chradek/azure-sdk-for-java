/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * App Service Plan Model.
 */
@JsonFlatten
public class ServerFarmWithRichSku extends Resource {
    /**
     * Name for the App Service Plan.
     */
    @JsonProperty(value = "properties.name")
    private String serverFarmWithRichSkuName;

    /**
     * Target worker tier assigned to the App Service Plan.
     */
    @JsonProperty(value = "properties.workerTierName")
    private String workerTierName;

    /**
     * App Service Plan Status. Possible values include: 'Ready', 'Pending'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusOptions status;

    /**
     * App Service Plan Subscription.
     */
    @JsonProperty(value = "properties.subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /**
     * App Service Plan administration site.
     */
    @JsonProperty(value = "properties.adminSiteName")
    private String adminSiteName;

    /**
     * Specification for the hosting environment (App Service Environment) to
     * use for the App Service Plan.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Maximum number of instances that can be assigned to this App Service
     * Plan.
     */
    @JsonProperty(value = "properties.maximumNumberOfWorkers")
    private Integer maximumNumberOfWorkers;

    /**
     * Geographical location for the App Service Plan.
     */
    @JsonProperty(value = "properties.geoRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegion;

    /**
     * If True apps assigned to this App Service Plan can be scaled
     * independently
     * If False apps assigned to this App Service Plan will scale
     * to all instances of the plan.
     */
    @JsonProperty(value = "properties.perSiteScaling")
    private Boolean perSiteScaling;

    /**
     * Number of web apps assigned to this App Service Plan.
     */
    @JsonProperty(value = "properties.numberOfSites", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfSites;

    /**
     * Resource group of the serverfarm.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * The sku property.
     */
    private SkuDescription sku;

    /**
     * Get the serverFarmWithRichSkuName value.
     *
     * @return the serverFarmWithRichSkuName value
     */
    public String getServerFarmWithRichSkuName() {
        return this.serverFarmWithRichSkuName;
    }

    /**
     * Set the serverFarmWithRichSkuName value.
     *
     * @param serverFarmWithRichSkuName the serverFarmWithRichSkuName value to set
     */
    public void setServerFarmWithRichSkuName(String serverFarmWithRichSkuName) {
        this.serverFarmWithRichSkuName = serverFarmWithRichSkuName;
    }

    /**
     * Get the workerTierName value.
     *
     * @return the workerTierName value
     */
    public String getWorkerTierName() {
        return this.workerTierName;
    }

    /**
     * Set the workerTierName value.
     *
     * @param workerTierName the workerTierName value to set
     */
    public void setWorkerTierName(String workerTierName) {
        this.workerTierName = workerTierName;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public StatusOptions getStatus() {
        return this.status;
    }

    /**
     * Get the subscription value.
     *
     * @return the subscription value
     */
    public String getSubscription() {
        return this.subscription;
    }

    /**
     * Get the adminSiteName value.
     *
     * @return the adminSiteName value
     */
    public String getAdminSiteName() {
        return this.adminSiteName;
    }

    /**
     * Set the adminSiteName value.
     *
     * @param adminSiteName the adminSiteName value to set
     */
    public void setAdminSiteName(String adminSiteName) {
        this.adminSiteName = adminSiteName;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile value.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     */
    public void setHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
    }

    /**
     * Get the maximumNumberOfWorkers value.
     *
     * @return the maximumNumberOfWorkers value
     */
    public Integer getMaximumNumberOfWorkers() {
        return this.maximumNumberOfWorkers;
    }

    /**
     * Set the maximumNumberOfWorkers value.
     *
     * @param maximumNumberOfWorkers the maximumNumberOfWorkers value to set
     */
    public void setMaximumNumberOfWorkers(Integer maximumNumberOfWorkers) {
        this.maximumNumberOfWorkers = maximumNumberOfWorkers;
    }

    /**
     * Get the geoRegion value.
     *
     * @return the geoRegion value
     */
    public String getGeoRegion() {
        return this.geoRegion;
    }

    /**
     * Get the perSiteScaling value.
     *
     * @return the perSiteScaling value
     */
    public Boolean getPerSiteScaling() {
        return this.perSiteScaling;
    }

    /**
     * Set the perSiteScaling value.
     *
     * @param perSiteScaling the perSiteScaling value to set
     */
    public void setPerSiteScaling(Boolean perSiteScaling) {
        this.perSiteScaling = perSiteScaling;
    }

    /**
     * Get the numberOfSites value.
     *
     * @return the numberOfSites value
     */
    public Integer getNumberOfSites() {
        return this.numberOfSites;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription getSku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     */
    public void setSku(SkuDescription sku) {
        this.sku = sku;
    }

}
