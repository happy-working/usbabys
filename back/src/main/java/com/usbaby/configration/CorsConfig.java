package com.usbaby.configration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class CorsConfig extends WebMvcConfigurerAdapter  {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("http://192.168.1.119")
        .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")
          .allowCredentials(true).maxAge(3600);
    }
    
    
}

