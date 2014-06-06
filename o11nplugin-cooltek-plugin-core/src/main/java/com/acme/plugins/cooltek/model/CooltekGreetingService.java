package com.acme.plugins.cooltek.model;

import org.springframework.stereotype.Component;

import com.vmware.o11n.plugin.sdk.annotation.*;

@Component
public class CooltekGreetingService  {
    
    public CooltekGreetingService() {
        
    }
   
   public String greet(String name) {
       return "Hello, " + name +"! Welcome to 'Acme's Cooltek Adatper for vCO' plug-in";
   }
}

