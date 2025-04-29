package com.anotacionesbeans.anotacionesbeans;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.anotacionesbeans.anotacionesbeans.beans.Query;
import com.anotacionesbeans.anotacionesbeans.scope.Service1;
import com.anotacionesbeans.anotacionesbeans.scope.Service2;
import com.anotacionesbeans.anotacionesbeans.scope.Service3;

import jakarta.annotation.PostConstruct;

// clase que ejecuta la logica del proyecto
@Component
public class ClaseMaindementira {

    //objeto query
    @Autowired
    @Qualifier("fileQuery") //uso de la notacion @Qualifier para usar el bean fileQuery
    private Query query;

    @Autowired
    private Service1 service1;

    @Autowired 
    private Service2 service2;

    @Autowired
    private Service3 service3;

    @Autowired
    private ApplicationContext ctx;
    

    //metodo que ejecuta una consulta de acceso a datos
    @PostConstruct
    public void ejecutar(){

        //for para imprmir todos los beans que se crean durante la ejecucion
        for(String s: ctx.getBeanDefinitionNames() ){
            System.out.println(">>>>" + s);
        }

        System.out.println(query.muestraResultados());

        System.out.println(service1.utils);
        System.out.println(service2.utils);
        System.out.println(service3.utils);
    }

    
}
