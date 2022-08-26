package com.kiriti;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Bean
	public Person person1() {
		return new Person();
	}

}
