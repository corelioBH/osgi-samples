package com.acme.servicoosgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.acme.servicososgi.impl.AloMundoServiceImpl;

public class Activator implements BundleActivator {

    ServiceRegistration<?> aloServiceRegistration;
    public void start(BundleContext context) throws Exception {
        AloMundoService aloService = new AloMundoServiceImpl();
        aloServiceRegistration =
        		context.registerService(
        				AloMundoService.class.getName(), 
        				aloService, null);
    }
    public void stop(BundleContext context) throws Exception {
    	     aloServiceRegistration.unregister();
    }

}
