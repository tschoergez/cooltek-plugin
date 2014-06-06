package com.acme.plugins.cooltek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginAdaptor;


public final class CooltekPluginAdaptor extends  AbstractSpringPluginAdaptor{

        private static final String DEFAULT_CONFIG = "com/acme/plugins/cooltek/pluginConfig.xml";
    
    public static final String PLUGIN_NAME = "Acme's Cooltek Adatper for vCO";
    
    static final String ROOT = "CarFinder";
    static final String REL_ROOTS = "roots";
    
    @Override
    protected ApplicationContext createApplicationContext(ApplicationContext defaultParent) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] { DEFAULT_CONFIG }, false, defaultParent);
        applicationContext.setClassLoader(getClass().getClassLoader());
        applicationContext.refresh();
    
        return applicationContext;
    }
}