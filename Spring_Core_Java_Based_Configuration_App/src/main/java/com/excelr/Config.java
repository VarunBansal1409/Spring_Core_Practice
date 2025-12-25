package com.excelr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // it will tells to spring core / ioc it is a configuration class
public class Config {
	
	@Bean
	public Car modifyCar() {
		
		Car c1 = new Car();
		c1.setCarPrice(1000);
		c1.setCarName("BMW");
		
		return c1;
	}
	
}
