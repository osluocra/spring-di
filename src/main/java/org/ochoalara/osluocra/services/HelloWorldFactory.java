package org.ochoalara.osluocra.services;


public class HelloWorldFactory {
	public HelloWorldService createHelloWord(String language){
		HelloWorldService helloWorldService = null;
		
		switch (language){
		case "en":
				helloWorldService= new HelloWorldServiceEngImpl();
				break;
		case "sp": 
				helloWorldService = new HelloWorldServiceSpaImpl();
				break;
		default:
			helloWorldService= new HelloWorldServiceEngImpl();
		}
		
		return helloWorldService;
	}
}
