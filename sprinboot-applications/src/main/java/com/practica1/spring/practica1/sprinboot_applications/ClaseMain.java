package com.practica1.spring.practica1.sprinboot_applications;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**Clase que ejecutara el bean MiPrimerBean */
@Component
public class ClaseMain {

    @Autowired
    private ApplicationContext ap;

    //metodo que se ejecutara cuando se cree el bean y mostrara los beans creados
    @PostConstruct
    public void init(){
        System.out.println("algo");
    }
}
