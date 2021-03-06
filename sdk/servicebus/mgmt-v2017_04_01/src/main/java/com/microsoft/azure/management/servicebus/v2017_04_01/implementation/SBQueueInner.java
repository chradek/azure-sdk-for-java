/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.microsoft.azure.management.servicebus.v2017_04_01.MessageCountDetails;
import org.joda.time.DateTime;
import org.joda.time.Period;
import com.microsoft.azure.management.servicebus.v2017_04_01.EntityStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Description of queue Resource.
 */
@JsonFlatten
public class SBQueueInner extends ProxyResource {
    /**
     * Message Count Details.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /**
     * The exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Last time a message was sent, or the last time there was a receive
     * request to this queue.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime accessedAt;

    /**
     * The size of the queue, in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /**
     * The number of messages in the queue.
     */
    @JsonProperty(value = "properties.messageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long messageCount;

    /**
     * ISO 8601 timespan duration of a peek-lock; that is, the amount of time
     * that the message is locked for other receivers. The maximum value for
     * LockDuration is 5 minutes; the default value is 1 minute.
     */
    @JsonProperty(value = "properties.lockDuration")
    private Period lockDuration;

    /**
     * The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue. Default is 1024.
     */
    @JsonProperty(value = "properties.maxSizeInMegabytes")
    private Integer maxSizeInMegabytes;

    /**
     * A value indicating if this queue requires duplicate detection.
     */
    @JsonProperty(value = "properties.requiresDuplicateDetection")
    private Boolean requiresDuplicateDetection;

    /**
     * A value that indicates whether the queue supports the concept of
     * sessions.
     */
    @JsonProperty(value = "properties.requiresSession")
    private Boolean requiresSession;

    /**
     * ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private Period defaultMessageTimeToLive;

    /**
     * A value that indicates whether this queue has dead letter support when a
     * message expires.
     */
    @JsonProperty(value = "properties.deadLetteringOnMessageExpiration")
    private Boolean deadLetteringOnMessageExpiration;

    /**
     * ISO 8601 timeSpan structure that defines the duration of the duplicate
     * detection history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    private Period duplicateDetectionHistoryTimeWindow;

    /**
     * The maximum delivery count. A message is automatically deadlettered
     * after this number of deliveries. default value is 10.
     */
    @JsonProperty(value = "properties.maxDeliveryCount")
    private Integer maxDeliveryCount;

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * Possible values include: 'Active', 'Disabled', 'Restoring',
     * 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming',
     * 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /**
     * ISO 8061 timeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private Period autoDeleteOnIdle;

    /**
     * A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     */
    @JsonProperty(value = "properties.enablePartitioning")
    private Boolean enablePartitioning;

    /**
     * A value that indicates whether Express Entities are enabled. An express
     * queue holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JsonProperty(value = "properties.enableExpress")
    private Boolean enableExpress;

    /**
     * Queue/Topic name to forward the messages.
     */
    @JsonProperty(value = "properties.forwardTo")
    private String forwardTo;

    /**
     * Queue/Topic name to forward the Dead Letter message.
     */
    @JsonProperty(value = "properties.forwardDeadLetteredMessagesTo")
    private String forwardDeadLetteredMessagesTo;

    /**
     * Get message Count Details.
     *
     * @return the countDetails value
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get the exact time the message was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get last time a message was sent, or the last time there was a receive request to this queue.
     *
     * @return the accessedAt value
     */
    public DateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the size of the queue, in bytes.
     *
     * @return the sizeInBytes value
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the number of messages in the queue.
     *
     * @return the messageCount value
     */
    public Long messageCount() {
        return this.messageCount;
    }

    /**
     * Get iSO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     *
     * @return the lockDuration value
     */
    public Period lockDuration() {
        return this.lockDuration;
    }

    /**
     * Set iSO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     *
     * @param lockDuration the lockDuration value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withLockDuration(Period lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024.
     *
     * @return the maxSizeInMegabytes value
     */
    public Integer maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get a value indicating if this queue requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set a value indicating if this queue requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get a value that indicates whether the queue supports the concept of sessions.
     *
     * @return the requiresSession value
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }

    /**
     * Set a value that indicates whether the queue supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }

    /**
     * Get iSO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value
     */
    public Period defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set iSO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withDefaultMessageTimeToLive(Period defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get a value that indicates whether this queue has dead letter support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set a value that indicates whether this queue has dead letter support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get iSO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value
     */
    public Period duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set iSO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10.
     *
     * @return the maxDeliveryCount value
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @param status the status value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get value that indicates whether server-side batched operations are enabled.
     *
     * @return the enableBatchedOperations value
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set value that indicates whether server-side batched operations are enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get iSO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value
     */
    public Period autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set iSO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withAutoDeleteOnIdle(Period autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get a value that indicates whether the queue is to be partitioned across multiple message brokers.
     *
     * @return the enablePartitioning value
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set a value that indicates whether the queue is to be partitioned across multiple message brokers.
     *
     * @param enablePartitioning the enablePartitioning value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get a value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set a value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get queue/Topic name to forward the messages.
     *
     * @return the forwardTo value
     */
    public String forwardTo() {
        return this.forwardTo;
    }

    /**
     * Set queue/Topic name to forward the messages.
     *
     * @param forwardTo the forwardTo value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
        return this;
    }

    /**
     * Get queue/Topic name to forward the Dead Letter message.
     *
     * @return the forwardDeadLetteredMessagesTo value
     */
    public String forwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Set queue/Topic name to forward the Dead Letter message.
     *
     * @param forwardDeadLetteredMessagesTo the forwardDeadLetteredMessagesTo value to set
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        return this;
    }

}
