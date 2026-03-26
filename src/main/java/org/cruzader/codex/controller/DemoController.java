package org.cruzader.codex.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloEndpoint() {
        log.info("Entered demo endpoint Hello");
        return ResponseEntity.ok("HELLO");
    }
}
