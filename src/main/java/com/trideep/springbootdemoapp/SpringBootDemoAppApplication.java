package com.trideep.springbootdemoapp;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootDemoAppApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBootDemoAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAppApplication.class, args);
		log.info("******************** SpringBootDemoAppApplication Started ********************");
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
