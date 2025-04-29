package com.anotacionesbeans.anotacionesbeans.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {
    
    @Autowired
    public Utils utils;
}
