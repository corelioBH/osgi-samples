package com.khubla.osgiexample.restlet.restlet;


import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class HelloServiceResource extends ServerResource {


   public HelloServiceResource() {
   }

   @Get
   public String sayHello() {
	   return "Alo Mundo RESTLET!";
   }

}
