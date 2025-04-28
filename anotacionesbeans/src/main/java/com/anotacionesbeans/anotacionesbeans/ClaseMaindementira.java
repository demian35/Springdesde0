package com.anotacionesbeans.anotacionesbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anotacionesbeans.anotacionesbeans.beans.Query;

import jakarta.annotation.PostConstruct;

// clase que ejecuta la logica del proyecto
@Component
public class ClaseMaindementira {

    //objeto query
    @Autowired
    private Query query;

    //metodo que ejecuta una consulta de acceso a datos
    @PostConstruct
    public void ejecutar(){
        System.out.println(query.muestraResultados());
    }

    
}
