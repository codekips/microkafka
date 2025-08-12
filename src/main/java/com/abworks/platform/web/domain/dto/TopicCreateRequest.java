package com.abworks.platform.web.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TopicCreateRequest {
    @NotBlank(message = "Topic name can not be empty")
    @Size(min = 3, message = "Topic name is too small. size of name should be > 3")
    private String name;
    private int numPartitions = 1;
    private long retentionMs = 60 * 60 * 1000;
    private int maxMessageSizeKB = 1024;

}
