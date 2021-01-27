package com.example.EmailSendingDemo;

//import java.util.logging.LogManager;

//import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailSendingDemoApplication {

//	Logger logger = LogManager.getLogger(EmailSendingDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EmailSendingDemoApplication.class, args);
		
		System.out.println("hello");
	}

}
