package com.acme.alomundoosgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	
	public void start(BundleContext bundleContext) throws Exception {		
        System.out.println("Cria��o do universo - Fiat lux...");        
	}


	public void stop(BundleContext bundleContext) throws Exception {
	
		System.out.println("Fim dos tempos - Ragnarok...");
	}

}
