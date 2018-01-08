package com.acme.alomundoosgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	
	public void start(BundleContext bundleContext) throws Exception {		
        System.out.println("Criação do universo - Fiat lux...");        
	}


	public void stop(BundleContext bundleContext) throws Exception {
	
		System.out.println("Fim dos tempos - Ragnarok...");
	}

}
