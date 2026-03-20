package com.example.jenkinsDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Yay! Application is running");
	}

	@RestController
	class TestController {

		@GetMapping("/")
		public String hello() {
			return "Hello from Jenkins!!";
		}
	}
}
