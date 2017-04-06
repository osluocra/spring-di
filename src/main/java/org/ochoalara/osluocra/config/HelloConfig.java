package org.ochoalara.osluocra.config;

import org.ochoalara.osluocra.services.HelloWorldService;
import org.ochoalara.osluocra.services.HelloWorldFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {
	@Bean
	public HelloWorldFactory helloWorldFactory(){
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile({"default","english"})
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory helloWorldFactory){
		return helloWorldFactory.createHelloWord("en");
	}
	
	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory helloWorldFactory){
		return helloWorldFactory.createHelloWord("spa");
	}
	
}
