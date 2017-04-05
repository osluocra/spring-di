package org.ochoalara.osluocra.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")

public class HelloWorldServiceEngImpl implements HelloWorld{
	public void sayHello(){
		System.out.println("Hello World");
		
	}
	
}
