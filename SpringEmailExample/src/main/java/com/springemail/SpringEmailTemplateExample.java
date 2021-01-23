package com.springemail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpringEmailTemplateExample {
 
	public static void main(String[] args) {
		Mail mail = new Mail();
		mail.setMailFrom("malisavkar@gmail.com");
		mail.setMailTo("savkarmali3@gmail.com");
		mail.setMailSubject("Subject - Send Email using Spring Velocity Template");
		mail.setTemplateName("emailtemplate.vm");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Mailer mailer = (Mailer) context.getBean("mailer");
		mailer.sendMail(mail);
	}
}
