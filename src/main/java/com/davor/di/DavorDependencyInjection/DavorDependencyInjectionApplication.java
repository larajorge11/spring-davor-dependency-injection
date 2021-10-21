package com.davor.di.DavorDependencyInjection;

import com.davor.di.DavorDependencyInjection.controller.HelloWorldController;
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
	}

}
