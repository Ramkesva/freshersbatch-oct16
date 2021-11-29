package com.example.SpringBootFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		ApplicationContext  applicationContext = SpringApplication.run(SpringBootFirstDemoApplication.class, args);
		for(String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
