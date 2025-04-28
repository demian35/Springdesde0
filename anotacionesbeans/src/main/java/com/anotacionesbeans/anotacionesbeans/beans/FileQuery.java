package com.anotacionesbeans.anotacionesbeans.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//clase que nos regresa los elementos de un archivo
@Component
public class FileQuery implements Query {

    //value notacion para dar valores personalizados a los beans
    @Value("${query.file.message}")
    private String message;

    @Override
    public List<String> muestraResultados(){
        return List.of(message);
    }

    
}
