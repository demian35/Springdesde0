package com.anotacionesbeans.anotacionesbeans.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//clase servicio con dependencia a utils
@Service
public class Service1 {
    
    @Autowired
    public Utils utils;
}
