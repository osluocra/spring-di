package org.ochoalara.osluocra.controller;

import org.ochoalara.osluocra.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingControllerInjectedByConstructor {
		private HelloWorldService helloWorldService;
		@Autowired
		public GreetingControllerInjectedByConstructor(HelloWorldService helloWorldService) {
			super();
			this.helloWorldService = helloWorldService;
		}
		
		public void sayHello(){
			helloWorldService.sayHello();
		}
		
		
}
