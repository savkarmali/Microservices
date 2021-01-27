package com.example.EmailSendingDemo.controller;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailCOntroller {

	@Autowired
	public JavaMailSender emailSender;
	
	@ResponseBody
	@RequestMapping("/sendEmail")
	public String sendEmail() throws MessagingException {
		
		MimeMessage message=emailSender.createMimeMessage();
		boolean multipart=true;
		MimeMessageHelper helper=new MimeMessageHelper(message,multipart,"utf-8");
		String htmlMsg = "<h3>Im testing send a HTML email</h3>"
                +"<img src='http://www.apache.org/images/asf_logo_wide.gif'>";
		message.setContent(htmlMsg,"text/html");
		helper.setTo("malisavkar@gmail.com");
		helper.setSubject("Test send HTML Email");
		helper.setText("Hello, I am testing email");
		
//		String path = "/C:\\Users\\Sa\\Downloads/text.txt";
		
//		FileSystemResource file =new FileSystemResource(new File(path));
//		helper.addAttachment("Text file", file);
		
		this.emailSender.send(message);
		return "HTML Email Sent";
		
	}
}
