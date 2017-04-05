package org.ochoalara.osluocra;

import org.ochoalara.osluocra.controller.GreetingControllerInjectedByConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		 
		 GreetingControllerInjectedByConstructor greeting = (GreetingControllerInjectedByConstructor) ctx.getBean("greetingControllerInjectedByConstructor");
		 greeting.sayHello();
		 
	
	}
}
