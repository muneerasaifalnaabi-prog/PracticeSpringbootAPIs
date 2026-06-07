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

		System.out.println("---User Profile---");
		System.out.println("User Id :" +userProfile.getUserId());
		System.out.println("Phone Numbers :"+ userProfile.getPhoneNumber());
		System.out.println("Address :" +userProfile.getAddress());

		userProfile.setPhoneNumber("999324435");
		userProfile.setAddress("Ibra");

		System.out.println("---Update User Profile---");
		System.out.println("User Id :" +userProfile.getUserId());
		System.out.println("Phone Numbers :"+ userProfile.getPhoneNumber());
		System.out.println("Address :" +userProfile.getAddress());

	}

}
