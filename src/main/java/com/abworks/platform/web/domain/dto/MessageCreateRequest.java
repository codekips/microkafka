package com.abworks.platform.web.domain.dto;

import jakarta.validation.constraints.NotBlank;

public class MessageCreateRequest {
    @NotBlank
    String encodedMessage;
}
