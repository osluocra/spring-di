package org.ochoalara.main;

import org.ochoalara.osluocra.config.HelloConfig;
import org.ochoalara.osluocra.controller.GreetingControllerInjectedByConstructor;
import org.ochoalara.osluocra.controller.GreetingControllerInjectedBySetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.ochoalara.osluocra")
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		 
		 GreetingControllerInjectedByConstructor greeting = (GreetingControllerInjectedByConstructor) ctx.getBean("greetingControllerInjectedByConstructor");
		 greeting.sayHello();
		 
		 GreetingControllerInjectedBySetter greetingSetter = (GreetingControllerInjectedBySetter) ctx.getBean("greetingControllerInjectedBySetter");
		 greetingSetter.sayHello();
	
	}
}
