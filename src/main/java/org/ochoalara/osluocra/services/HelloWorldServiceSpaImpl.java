package org.ochoalara.osluocra.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceSpaImpl implements HelloWorld{
	public void sayHello(){
		System.out.println("Hola Mundo");
	}
}
