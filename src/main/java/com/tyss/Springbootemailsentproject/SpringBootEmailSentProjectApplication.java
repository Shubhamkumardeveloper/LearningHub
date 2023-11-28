package com.tyss.Springbootemailsentproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootEmailSentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailSentProjectApplication.class, args);
	}
	
	@Autowired
	EmailSenderService service;
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail()
	{
		service.sendSimpleEmail("sandeepchavan2726@gmail.com", "Welcome...", "Welcome vinay");
	}

}
