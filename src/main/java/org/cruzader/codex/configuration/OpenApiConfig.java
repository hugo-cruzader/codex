package org.cruzader.codex.configuration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi version1() {
        return GroupedOpenApi.builder()
                .group("v1.0")
                .pathsToMatch("/api/1.0/**")
                .build();
    }

    @Bean
    public GroupedOpenApi version2() {
        return GroupedOpenApi.builder()
                .group("v2.0")
                .pathsToMatch("/api/2.0/**")
                .build();
    }
}
