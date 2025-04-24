package com.practica1.spring.practica1.sprinboot_applications.inyeccionautomatica;

import org.springframework.stereotype.Repository;

//clase respository que contendra la operacion del ejemplo
@Repository
public class Myrepository {

    public void realizaOperacion(){
        System.out.println("algo ejecutandose");
    }
    
}
