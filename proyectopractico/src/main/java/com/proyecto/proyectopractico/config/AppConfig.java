package com.proyecto.proyectopractico.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//clase para inyectar dependencias para realizar peticiones http al api
@Configuration
public class AppConfig {
    
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
