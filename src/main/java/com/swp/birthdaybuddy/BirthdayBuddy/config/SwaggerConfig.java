package com.swp.birthdaybuddy.BirthdayBuddy.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("BirthdayBuddy-public")
                .packagesToScan("com.swp.birthdaybuddy.BirthdayBuddy.controller")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public OpenAPI birthdayBuddyOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("BirthdayBuddy API")
                        .description("BirthdayBuddy application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("BirthdayBuddy Documentation")
                        .url("https://troll.vn"));
    }


}