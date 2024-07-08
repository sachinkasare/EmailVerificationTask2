package com.emailverification.EmailVerification3;

import org.sachin.controller.EmailController;
import org.sachin.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= {EmailController.class, EmailService.class})
public class EmailVerification3Application {

	public static void main(String[] args) {
		SpringApplication.run(EmailVerification3Application.class, args);
	}

}
