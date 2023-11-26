package com.example.demo.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*") // Permite requisições de todas as origens
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
            .allowedHeaders("*"); // Todos os headers permitidos
    }
}
