package com.acme.plugins.cooltek.model;

import org.springframework.beans.factory.annotation.Autowired;

import ch.dunes.vso.sdk.api.IPluginFactory;

import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

@VsoObject(singleton = true)
public class CooltekGreeter {
    public static final String TYPE = "CooltekGreeter";
    
    @Autowired
    private CooltekGreetingService service;


    public CooltekGreeter() {
    }

    public static CooltekGreeter createScriptingSingleton(IPluginFactory factory) {
        return ((AbstractSpringPluginFactory) factory).createScriptingObject(CooltekGreeter.class);
    }

    @VsoMethod
    public String greet(String name) {
        return service.greet(name);
    }
}
