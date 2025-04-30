package com.exampleController.demoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



//clase controlador que gestionara las peticiones y las respuestas del proyecto
@Controller
public class Controlador {
    

    //metodo que mostrara la pantalla principal cuando se le pase la url del getmapping
    @GetMapping("/") //ejemplo http://localhost8080/
    public String pantallaPrincipal(){
        return "index";
    }

    /*medoto que redirecciona a otra pagina cuando se le pasa http://localhost8080/me 
     * la diferencia es que se usa model, al html se le pasa el mensaje 
     */
    @GetMapping("/me")
    public String perfil(Model model){
        model.addAttribute("mensaje", "Bienvenido a mi perfil");
        return "perfil";
    }

}
