package com.abworks.platform.web.dto;

import jakarta.validation.constraints.NotBlank;

public class MessageCreateRequest {
    @NotBlank
    String encodedMessage;
}
