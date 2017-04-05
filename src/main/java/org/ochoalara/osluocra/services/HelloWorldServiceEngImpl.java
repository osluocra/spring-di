package org.ochoalara.osluocra.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceEngImpl implements HelloWorld{
	public void sayHello(){
		System.out.println("Hello World");
		
	}
	
}
