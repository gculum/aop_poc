package com.example.aop_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopPocApplication.class, args);
	}

}
