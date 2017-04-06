package org.ochoalara.osluocra.controller;

import org.ochoalara.osluocra.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingControllerInjectedBySetter {
	private HelloWorldService helloWorldService;
	

	
	public HelloWorldService getHelloWorld() {
		return helloWorldService;
	}

	@Autowired
	public void setHelloWorld(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public void sayHello(){
		this.helloWorldService.sayHello();
	}

}
