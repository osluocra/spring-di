package org.ochoalara.osluocra;

import org.ochoalara.osluocra.services.HelloWorld;
import org.ochoalara.osluocra.services.HelloWorldServiceEngImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		 
		 HelloWorld greeting = (HelloWorld) ctx.getBean("helloWorldServiceEngImpl");
		 greeting.sayHello();
		 
		 greeting = (HelloWorld) ctx.getBean("helloWorldServiceSpaImpl");
		 greeting.sayHello();
	
	}
}
