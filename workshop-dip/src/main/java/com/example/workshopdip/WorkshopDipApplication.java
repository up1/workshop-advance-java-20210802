package com.example.workshopdip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorkshopDipApplication {

	public static void main(String[] args) {
		// Beans => Java Bean, Enterprise Java Bean (EJB) => SessionBean, JPA
		ConfigurableApplicationContext context
				= SpringApplication.run(WorkshopDipApplication.class, args);
		System.out.println("Bean count=" + context.getBeanDefinitionCount());
	}

}
