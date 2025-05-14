package com.proyecto.proyectopractico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.proyecto.proyectopractico.model.Drink;
import com.proyecto.proyectopractico.service.DrinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//controlador que nos va a permitir interactuar con el sitio web
@Controller
public class DrinkController {
    @Autowired
    private DrinkService drinkService;
    
    //endpoint para redireccionar a la pagina principal
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("drink", new Drink());//para el formulario
        model.addAttribute("drinks", drinkService.getAllDrinks());
        return "index";
    }
    
}
