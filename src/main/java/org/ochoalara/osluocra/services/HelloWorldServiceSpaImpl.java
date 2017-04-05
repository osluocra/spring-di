package org.ochoalara.osluocra.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceSpaImpl implements HelloWorld{
	public void sayHello(){
		System.out.println("Hola Mundo");
	}
}
