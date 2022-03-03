package com.springboot.app.item.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class appConfig {

    @Bean("clienteRest")
    public RestTemplate registrarRestTemplate(){
        return new RestTemplate();
    }


}
