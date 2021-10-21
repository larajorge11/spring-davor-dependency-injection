package com.davor.di.DavorDependencyInjection;

import com.davor.di.DavorDependencyInjection.controller.ConstructorInjectedController;
import com.davor.di.DavorDependencyInjection.controller.HelloWorldController;
import com.davor.di.DavorDependencyInjection.controller.PropertyInjectedController;
import com.davor.di.DavorDependencyInjection.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DavorDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DavorDependencyInjectionApplication.class, args);
		HelloWorldController helloWorldController = (HelloWorldController) ctx.getBean("helloWorldController");
		System.out.println(helloWorldController.sayHello());

		System.out.println("Property --------------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetingService());

		System.out.println("Setter --------------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetingService());

		System.out.println("Constructor --------------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetingService());
	}

}
