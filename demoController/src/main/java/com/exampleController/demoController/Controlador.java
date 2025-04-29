package com.exampleController.demoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//clase controlador que gestionara las peticiones y las respuestas del proyecto
@Controller
public class Controlador {
    

    //metodo que mostrara la pantalla principal cuando se le pase la url del getmapping
    @GetMapping("/") //ejemplo http://localhost8080/
    public String pantallaPrincipal(){
        return "index";
    }

}
