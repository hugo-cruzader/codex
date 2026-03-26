package org.cruzader.codex.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureApiVersioning(ApiVersionConfigurer apiVersionConfigurer) {
        apiVersionConfigurer
                .addSupportedVersions("1.0","2.0")
                .setDefaultVersion("1.0")
                .usePathSegment(1)
                .setVersionParser(new ApiVersionParser());
    }
}
