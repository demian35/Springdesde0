package com.proyecto.proyectopractico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyectopractico.model.Drink;

//interfaz que nos ayudara con el acceso a las bebidas
@Repository
public interface DrinkRepository extends JpaRepository<Drink,Long> {
}
