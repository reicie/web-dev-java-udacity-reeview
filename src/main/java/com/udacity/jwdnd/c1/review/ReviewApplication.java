package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}


//	@Bean
//	public String message() {
//		System.out.println("Creating a message");
//		return "Hello, Spring!";
//	}

//	@Bean
//	public String upperCase(MessageService messageService) {
//		System.out.println("Initializing upper case method");
//		return messageService.upperCase();
//	}
//
//	@Bean
//	public String lowerCase(MessageService messageService) {
//		System.out.println("Initializing lower case method");
//		return messageService.lowerCase();
//	}


}
