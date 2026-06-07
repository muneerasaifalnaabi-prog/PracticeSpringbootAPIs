package com.example.tra.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		UserProfile userProfile = new UserProfile(
				"101",
				"99933399",
				"Muscat"
		);

	}

}
