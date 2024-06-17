package br.com.wo.ramengo_api.desafio_backend_rv.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info()
                        .title("ramenGO!")
                        .description("This API allows users to list available broths, available proteins and place an order.")
                        .version("1.0.0"));

    }
}
