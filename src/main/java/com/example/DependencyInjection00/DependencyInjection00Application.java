package com.example.DependencyInjection00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjection00Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(DependencyInjection00Application.class, args);
		//ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyInjection00Application.class);
		THEbean  THEbean = applicationContext.getBean(THEbean.class);
		THEbean.check();


		/*THEbean THEbean = apc.getBean(THEbean.class);
		for(String s : apc.getBeanDefinitionNames()){
			System.out.println(s);

		}*/

	}

}
