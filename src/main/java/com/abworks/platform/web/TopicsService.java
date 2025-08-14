package com.abworks.platform.web;

import com.abworks.platform.domain.Message;
import com.abworks.platform.domain.Topic;
import com.abworks.platform.web.repository.TopicsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class TopicsService {

    private final TopicsRepository topicsRepository;

    public abstract void createTopic(Topic newTopic);

    public abstract List<Message> getNextNMessages(Topic sourceTopic, int n);

    public abstract void addMessageToTopic(Topic sourceTopic, Message message);
}
