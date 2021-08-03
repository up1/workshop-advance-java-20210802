package com.example.workshopdip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class WorkshopDipApplication {

	@Bean
	public Random createMyRandom() {
		return new Random();
	}

	public static void main(String[] args) {
		// Beans => Java Bean, Enterprise Java Bean (EJB) => SessionBean, JPA
		ConfigurableApplicationContext context
				= SpringApplication.run(WorkshopDipApplication.class, args);
		System.out.println("Bean count=" + context.getBeanDefinitionCount());

		GenerateIdService service
				= context.getBean(GenerateIdService.class);
		String id = service.get();
		System.out.println("ID=" + id);
	}

}
