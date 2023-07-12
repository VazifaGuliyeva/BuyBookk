package com.example.buybook.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Springin arxa planda bu class-i documentasiya ucun yazildigini anlamasi ucun
@OpenAPIDefinition
public class SpringDocumentationConfig {
    @Bean //spring proyekt load olanda metodumu da load etmesi ucun ozu ile birlikde
    public OpenAPI openAPI() {
        return new OpenAPI().info(
                new Info().title("Documentation by Vazifa Guliyeva")
                        .version("0.0.1")
                        .description("This service is written for BuyBook")
                        .contact(
                                new Contact()
                                        .url("www.buybook.com")
                                        .email("vazifa@gmail.com")
                                        .name("Vazifa Guliyeva")
                        )
        );
    }
}
