/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2018_03_01.implementation.MonitorManager;
import java.util.List;
import org.joda.time.Period;
import org.joda.time.DateTime;
import com.microsoft.azure.management.monitor.v2018_03_01.implementation.MetricAlertResourceInner;

/**
 * Type representing MetricAlertResource.
 */
public interface MetricAlertResource extends HasInner<MetricAlertResourceInner>, Resource, GroupableResourceCore<MonitorManager, MetricAlertResourceInner>, HasResourceGroup, Refreshable<MetricAlertResource>, Updatable<MetricAlertResource.Update>, HasManager<MonitorManager> {
    /**
     * @return the actions value.
     */
    List<MetricAlertAction> actions();

    /**
     * @return the autoMitigate value.
     */
    Boolean autoMitigate();

    /**
     * @return the criteria value.
     */
    MetricAlertCriteria criteria();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the enabled value.
     */
    boolean enabled();

    /**
     * @return the evaluationFrequency value.
     */
    Period evaluationFrequency();

    /**
     * @return the lastUpdatedTime value.
     */
    DateTime lastUpdatedTime();

    /**
     * @return the scopes value.
     */
    List<String> scopes();

    /**
     * @return the severity value.
     */
    int severity();

    /**
     * @return the targetResourceRegion value.
     */
    String targetResourceRegion();

    /**
     * @return the targetResourceType value.
     */
    String targetResourceType();

    /**
     * @return the windowSize value.
     */
    Period windowSize();

    /**
     * The entirety of the MetricAlertResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCriteria, DefinitionStages.WithDescription, DefinitionStages.WithEnabled, DefinitionStages.WithEvaluationFrequency, DefinitionStages.WithSeverity, DefinitionStages.WithWindowSize, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of MetricAlertResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a MetricAlertResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the MetricAlertResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCriteria> {
        }

        /**
         * The stage of the metricalertresource definition allowing to specify Criteria.
         */
        interface WithCriteria {
           /**
            * Specifies criteria.
            * @param criteria defines the specific alert criteria information
            * @return the next definition stage
*/
            WithDescription withCriteria(MetricAlertCriteria criteria);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify Description.
         */
        interface WithDescription {
           /**
            * Specifies description.
            * @param description the description of the metric alert that will be included in the alert email
            * @return the next definition stage
*/
            WithEnabled withDescription(String description);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify Enabled.
         */
        interface WithEnabled {
           /**
            * Specifies enabled.
            * @param enabled the flag that indicates whether the metric alert is enabled
            * @return the next definition stage
*/
            WithEvaluationFrequency withEnabled(boolean enabled);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify EvaluationFrequency.
         */
        interface WithEvaluationFrequency {
           /**
            * Specifies evaluationFrequency.
            * @param evaluationFrequency how often the metric alert is evaluated represented in ISO 8601 duration format
            * @return the next definition stage
*/
            WithSeverity withEvaluationFrequency(Period evaluationFrequency);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify Severity.
         */
        interface WithSeverity {
           /**
            * Specifies severity.
            * @param severity Alert severity {0, 1, 2, 3, 4}
            * @return the next definition stage
*/
            WithWindowSize withSeverity(int severity);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify WindowSize.
         */
        interface WithWindowSize {
           /**
            * Specifies windowSize.
            * @param windowSize the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold
            * @return the next definition stage
*/
            WithCreate withWindowSize(Period windowSize);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify Actions.
         */
        interface WithActions {
            /**
             * Specifies actions.
             * @param actions the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved
             * @return the next definition stage
             */
            WithCreate withActions(List<MetricAlertAction> actions);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify AutoMitigate.
         */
        interface WithAutoMitigate {
            /**
             * Specifies autoMitigate.
             * @param autoMitigate the flag that indicates whether the alert should be auto resolved or not
             * @return the next definition stage
             */
            WithCreate withAutoMitigate(Boolean autoMitigate);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify Scopes.
         */
        interface WithScopes {
            /**
             * Specifies scopes.
             * @param scopes the list of resource id's that this metric alert is scoped to
             * @return the next definition stage
             */
            WithCreate withScopes(List<String> scopes);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify TargetResourceRegion.
         */
        interface WithTargetResourceRegion {
            /**
             * Specifies targetResourceRegion.
             * @param targetResourceRegion the region of the target resource(s) on which the alert is created/updated. Mandatory for MultipleResourceMultipleMetricCriteria
             * @return the next definition stage
             */
            WithCreate withTargetResourceRegion(String targetResourceRegion);
        }

        /**
         * The stage of the metricalertresource definition allowing to specify TargetResourceType.
         */
        interface WithTargetResourceType {
            /**
             * Specifies targetResourceType.
             * @param targetResourceType the resource type of the target resource(s) on which the alert is created/updated. Mandatory for MultipleResourceMultipleMetricCriteria
             * @return the next definition stage
             */
            WithCreate withTargetResourceType(String targetResourceType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<MetricAlertResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithActions, DefinitionStages.WithAutoMitigate, DefinitionStages.WithScopes, DefinitionStages.WithTargetResourceRegion, DefinitionStages.WithTargetResourceType {
        }
    }
    /**
     * The template for a MetricAlertResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<MetricAlertResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithActions, UpdateStages.WithAutoMitigate, UpdateStages.WithScopes, UpdateStages.WithTargetResourceRegion, UpdateStages.WithTargetResourceType {
    }

    /**
     * Grouping of MetricAlertResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the metricalertresource update allowing to specify Actions.
         */
        interface WithActions {
            /**
             * Specifies actions.
             * @param actions the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved
             * @return the next update stage
             */
            Update withActions(List<MetricAlertAction> actions);
        }

        /**
         * The stage of the metricalertresource update allowing to specify AutoMitigate.
         */
        interface WithAutoMitigate {
            /**
             * Specifies autoMitigate.
             * @param autoMitigate the flag that indicates whether the alert should be auto resolved or not
             * @return the next update stage
             */
            Update withAutoMitigate(Boolean autoMitigate);
        }

        /**
         * The stage of the metricalertresource update allowing to specify Scopes.
         */
        interface WithScopes {
            /**
             * Specifies scopes.
             * @param scopes the list of resource id's that this metric alert is scoped to
             * @return the next update stage
             */
            Update withScopes(List<String> scopes);
        }

        /**
         * The stage of the metricalertresource update allowing to specify TargetResourceRegion.
         */
        interface WithTargetResourceRegion {
            /**
             * Specifies targetResourceRegion.
             * @param targetResourceRegion the region of the target resource(s) on which the alert is created/updated. Mandatory for MultipleResourceMultipleMetricCriteria
             * @return the next update stage
             */
            Update withTargetResourceRegion(String targetResourceRegion);
        }

        /**
         * The stage of the metricalertresource update allowing to specify TargetResourceType.
         */
        interface WithTargetResourceType {
            /**
             * Specifies targetResourceType.
             * @param targetResourceType the resource type of the target resource(s) on which the alert is created/updated. Mandatory for MultipleResourceMultipleMetricCriteria
             * @return the next update stage
             */
            Update withTargetResourceType(String targetResourceType);
        }

    }
}