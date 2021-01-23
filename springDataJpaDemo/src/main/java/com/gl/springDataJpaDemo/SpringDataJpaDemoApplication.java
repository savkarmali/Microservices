package com.gl.springDataJpaDemo;

import com.gl.springDataJpaDemo.restTemplate.ForEntityMethodOfRestTemplateDemo;
import com.gl.springDataJpaDemo.restTemplate.ForExchangeMethodOfRestTemplateDemo;
import com.gl.springDataJpaDemo.restTemplate.ForObjectMethodOfRestTemplateDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaDemoApplication.class, args);

		/*ForExchangeMethodOfRestTemplateDemo forExchangeMethodOfRestTemplateDemo=new ForExchangeMethodOfRestTemplateDemo();
		forExchangeMethodOfRestTemplateDemo.useExchangeMethodsOfRestTemplate();*/

		/*ForEntityMethodOfRestTemplateDemo forEntityMethodOfRestTemplateDemo = new ForEntityMethodOfRestTemplateDemo();
		forEntityMethodOfRestTemplateDemo.driverMethod();*/

		/*ForObjectMethodOfRestTemplateDemo forObjectMethodOfRestTemplateDemo = new ForObjectMethodOfRestTemplateDemo();
		forObjectMethodOfRestTemplateDemo.driverMethod();*/

	}
	
	}
