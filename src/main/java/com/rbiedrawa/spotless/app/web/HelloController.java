package com.rbiedrawa.spotless.app.web;

import com.rbiedrawa.spotless.app.dtos.Hello;

import java.time.Instant;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/hello")
@AllArgsConstructor
public class HelloController {

    @GetMapping
    ResponseEntity<Hello> hello() {
        var testCodestyle = Stream.of("aaa", "aabb", "aaa", "ccc")
                .peek(log::info)
                .filter("aaa"::equals)
                .filter("aaa"::equals)
                .map(s -> String.format("\t- %s:%s:%s", s, Instant.now(), Instant.now()))
                .collect(Collectors.joining(","));

        log.info("Collected {}", testCodestyle);

        final var helloWorld = Hello.builder()
                .id(1L)
                .message("Hello World")
                .modifiedDate(Instant.now())
                .createdDate(Instant.now())
                .build();

        return ResponseEntity.ok(helloWorld);
    }
}
