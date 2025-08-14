package com.abworks.platform.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Consumer {
    private UUID consumerId;
    private Map<String, Integer> topicOffsetMap;
    private Set<String> subscriptionList;

}
