package com.abworks.platform.domain;

public record TopicConfig(int numPartitions, int retentionMs, int maxSizeInKB) {
}
