package com.proyecto.proyectopractico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//clase Drink que modelara un objeto bebida
@Entity
public class Drink {
    
    //atributos del objeto bebida
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebida; //id de la bebida

    private String name;
    private String description;
    private String image; //guardara la url de la imagen del trago
    private String ingredients; //ingredientes para preparar la bebida

    public Drink(){}//Constructor sin argumentos

    public Drink(String name,String description,String image,String ingredients){//constructor con argumentos
        this.name=name;
        this.description=description;
        this.image=image;
        this.ingredients=ingredients;
    }

    //metodos get y set

    public Long getIdBebida(){
        return idBebida;
    }

    public void setIdBebida(Long idBebida){
        this.idBebida=idBebida;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image=image;
    }

    public String getIngredients(){
        return ingredients;
    }

    public void setIngredients(String ingredients){
        this.ingredients=ingredients;
    }

}
