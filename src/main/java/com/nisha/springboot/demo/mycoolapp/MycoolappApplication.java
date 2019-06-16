package com.nisha.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This annotation actually combination of @Configuration, @EnableAutoConfiguraion, @ComponentScan
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args); // Bootstrap Spring Boot Application
		// Behind the scenes it will create application context, register all beans, Starts the embedded server Tomcat etc....
	}

}
