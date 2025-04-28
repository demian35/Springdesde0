package com.anotacionesbeans.anotacionesbeans.beans;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*Bean primary para especificar cual es el bean principal */
@Primary
@Component
public class DBQuery implements Query {

    @Override
    public List<String> muestraResultados(){
        return List.of("Datos", "de", "la" ,"base","de","datos");
    }
    
}
