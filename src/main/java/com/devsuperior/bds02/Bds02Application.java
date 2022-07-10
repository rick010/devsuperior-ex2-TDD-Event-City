package com.devsuperior.bds02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class Bds02Application {

	public static void main(String[] args) {
		SpringApplication.run(Bds02Application.class, args);
	}

}
