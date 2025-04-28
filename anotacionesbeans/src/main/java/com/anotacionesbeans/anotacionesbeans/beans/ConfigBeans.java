package com.anotacionesbeans.anotacionesbeans.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//clase que crea los beans mediante configuraciones java
@Configuration
public class ConfigBeans  {

    @Primary
    @Bean
    public DBQuery dbQuery(){
        return new DBQuery();
    }

    @Bean
    public FileQuery fileQuery(){
        return new FileQuery();
    }
    
}
