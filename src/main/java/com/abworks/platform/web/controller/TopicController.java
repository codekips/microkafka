package com.abworks.platform.web.controller;

import com.abworks.platform.web.dto.MessageCreateRequest;
import com.abworks.platform.web.dto.TopicCreateRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/topics")
public class TopicController {

    @PostMapping
    public void createTopic (@RequestBody TopicCreateRequest topicCreateRequest){

    }

    /*
    Get the next n unread messages
     */
    @GetMapping("/{topicName}/messages")
    public void getMessages(@PathVariable String topicName,

                            @RequestParam(required = false, defaultValue = "5") int numberOfMessages) {

    }

    @PostMapping("/{topicName}/messages")
    public void postMessage(@PathVariable String topicName,
            @RequestBody MessageCreateRequest messageCreateRequest){

    }

}
