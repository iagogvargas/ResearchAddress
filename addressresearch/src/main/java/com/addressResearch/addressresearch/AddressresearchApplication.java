package com.addressResearch.addressresearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= "com.addressResearch")
@SpringBootApplication
@EnableAutoConfiguration
public class AddressresearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressresearchApplication.class, args);
	}
}
	