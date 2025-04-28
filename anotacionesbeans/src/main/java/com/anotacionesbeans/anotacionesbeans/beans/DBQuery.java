package com.anotacionesbeans.anotacionesbeans.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DBQuery implements Query {

    @Override
    public List<String> muestraResultados(){
        return List.of("Datos", "de", "la" ,"base","de","datos");
    }
    
}
