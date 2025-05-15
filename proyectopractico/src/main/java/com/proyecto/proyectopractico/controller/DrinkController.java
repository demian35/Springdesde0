package com.proyecto.proyectopractico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.proyecto.proyectopractico.model.Drink;
import com.proyecto.proyectopractico.service.DrinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        return "index";//mostramos la vista principal
    }

    //endpoint para agregar bebidas
    @PostMapping("/add")
    public String addDrink(@ModelAttribute Drink drink) {
        drinkService.saveDrink(drink);
        return "redirect:/";//al agregar redirige al inicio 
    }

    //endpoint para realizar la busqueda de una bebida
    @GetMapping("/search")
    public String searchDrink(@RequestParam("name") String name, Model model) {
        List<Drink> resultados= drinkService.searchDrinkbyName(name);
        model.addAttribute("drinks", resultados);
        model.addAttribute("drink", new Drink());//por si se quiere registrar otra nueva
        return "index"; //mostramos en la vista principal las bebidas solicitadas
    }
    


    
    
}
