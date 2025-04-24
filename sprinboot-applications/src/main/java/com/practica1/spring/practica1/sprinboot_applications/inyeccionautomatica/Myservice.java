package com.practica1.spring.practica1.sprinboot_applications.inyeccionautomatica;

import org.springframework.stereotype.Service;

//clase que implementa la logica del proyecto (repository)
@Service
public class Myservice {
    private Myrepository repository;

    //metodo que ejecuta al repository
    public void ejecutaOperacion(){
        repository.realizaOperacion();
    }
}
