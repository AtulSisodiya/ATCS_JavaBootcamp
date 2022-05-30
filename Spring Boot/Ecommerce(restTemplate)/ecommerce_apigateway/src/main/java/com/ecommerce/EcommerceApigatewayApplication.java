package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EcommerceApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApigatewayApplication.class, args);
	}

}
