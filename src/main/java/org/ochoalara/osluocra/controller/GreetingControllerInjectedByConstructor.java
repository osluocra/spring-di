package org.ochoalara.osluocra.controller;

import org.ochoalara.osluocra.services.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingControllerInjectedByConstructor {
		private HelloWorld helloWorld;
		@Autowired
		public GreetingControllerInjectedByConstructor(HelloWorld helloWorld) {
			super();
			this.helloWorld = helloWorld;
		}
		
		public void sayHello(){
			helloWorld.sayHello();
		}
		
		
}
