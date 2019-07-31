package com.ig.whatsapp.hub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WhatsAppHubApplication {
//test

	@Value("${PORT:8080}")
	String port;

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "Hello " + "!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(WhatsAppHubApplication.class, args);
	}

}
