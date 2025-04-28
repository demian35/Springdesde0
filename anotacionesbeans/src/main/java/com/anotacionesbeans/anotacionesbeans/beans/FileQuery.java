package com.anotacionesbeans.anotacionesbeans.beans;

import java.util.List;

import org.springframework.stereotype.Component;

//clase que nos regresa los elementos de un archivo
@Component
public class FileQuery implements Query {

    @Override
    public List<String> muestraResultados(){
        return List.of("elementos ", "de", "un " , "archivo");
    }

    
}
