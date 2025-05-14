package com.proyecto.proyectopractico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyectopractico.model.Drink;
import com.proyecto.proyectopractico.repository.DrinkRepository;



//clase servicio que efectuara la logica para listar las bebidas, guardarlas y consultarlas
@Service
public class DrinkService {
    
    @Autowired
    private DrinkRepository drinkrepository;

    //listamos todos los tragos
    public List<Drink> getAllDrinks(){
        return drinkrepository.findAll();
    }

    //obtenemos un nuevo trago por su id
    public Optional getDrinkbyID(Long id){
        return drinkrepository.findById(id);
    }

    //guardamos un trago nuevo
    public Drink saveDrink(Drink drink){
        return drinkrepository.save(drink);
    }

    //eliminamos el trago
    public void deleteDrink(Long id){
        drinkrepository.deleteById(id);
    }
}
