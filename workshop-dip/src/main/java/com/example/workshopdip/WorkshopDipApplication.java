package com.example.workshopdip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorkshopDipApplication {

	@Autowired
	private GenerateIdService generateIdService;

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
