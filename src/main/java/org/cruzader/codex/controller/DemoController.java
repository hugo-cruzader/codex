package org.cruzader.codex.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@Tag(name = "Demo API", description = "Versioned Demo Endpoints")
public class DemoController {

    @GetMapping(value = "/{version}/hello", version = "1.0")
    @Operation(summary = "Get message V1")
    public ResponseEntity<String> getHelloEndpoint() {
        log.info("Entered demo endpoint Hello");
        return ResponseEntity.ok("HELLO");
    }

    @GetMapping(value="/{version}/hello", version = "2.0")
    @Operation(summary = "Get message V2")
    public ResponseEntity<String> getHelloEndpointV2() {
        log.info("Entered demo endpoint V2 Hello");
        return ResponseEntity.ok("V2 is here");
    }
}
