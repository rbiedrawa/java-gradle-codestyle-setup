package com.rbiedrawa.spotless.app.dtos;

import java.time.Instant;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Hello {
    Long id;
    String message;

    Instant createdDate;
    Instant modifiedDate;
}
