package com.example.EurekaClientThree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class EurekaClientThreeApplication {
	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientThreeApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}

	@GetMapping("/getuserAddress")
	public Response sample() {

		Demo demo = restTemplate.getForObject("http://client-one/getUserInfo", Demo.class);

		Sample sample = restTemplate.getForObject("http://client-two/getuserAddress", Sample.class);

		return new Response(sample, demo);
	}
}
