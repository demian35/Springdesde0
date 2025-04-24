package com.practica1.spring.practica1.sprinboot_applications.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//clase que sera capaz de crear beans mediante @Configuration
@Configuration
public class Configbeans {

    //bean que creara la clase Configbeans
    @Bean
    public Otrobean otroBean(){
        return new Otrobean();
    }
    
}
