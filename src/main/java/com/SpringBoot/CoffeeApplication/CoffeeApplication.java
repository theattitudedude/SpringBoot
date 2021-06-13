package com.SpringBoot.CoffeeApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.SpringBoot.GreetingApplication.Pojo.Droid;

@ConfigurationPropertiesScan("com.SpringBoot")
@ComponentScan("com.SpringBoot")
@SpringBootApplication(scanBasePackages = {"com.SpringBoot.CoffeeApplication","com.SpringBoot.GreetingApplicayion}"})
public class CoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeApplication.class, args);
	}
	
	@Bean
	@ConfigurationProperties(prefix = "droid")
	Droid createDroid() {
		return new Droid();
	}
}