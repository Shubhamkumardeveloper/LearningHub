package com.tyss.Springbootemailsentproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendSimpleEmail(String toEmail,String subject,String body)
	{
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		
		simpleMailMessage.setFrom("imshubu1809@gmail.com");
		simpleMailMessage.setTo(toEmail);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(body);
		
		System.out.println("Sending mail.......");
		javaMailSender.send(simpleMailMessage);
		System.out.println("Mail sent Successfully....");
		
	}

}
