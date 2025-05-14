package com.proyecto.proyectopractico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyectopractico.model.Drink;

//interfaz que nos ayudara con el acceso a las bebidas
@Repository
public interface DrinkRepository extends JpaRepository<Drink,Long> {

    List<Drink> findByNameContainingIgnoreCase(String name);
}
