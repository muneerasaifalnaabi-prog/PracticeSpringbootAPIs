package com.example.tra.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		UserProfile userProfile = new UserProfile(
				"101",
				"0712345678",
				" Muscat, Oman"
		);

		System.out.println("---User Profile---");
		System.out.println("User Id :" +userProfile.getUserId());
		System.out.println("Phone Numbers :"+ userProfile.getPhoneNumber());
		System.out.println("Address :" +userProfile.getAddress());

		userProfile.setPhoneNumber("0798765432");
		userProfile.setAddress(" Ruwi, Muscat ");

		System.out.println("---Update User Profile---");
		System.out.println("User Id :" +userProfile.getUserId());
		System.out.println("Phone Numbers :"+ userProfile.getPhoneNumber());
		System.out.println("Address :" +userProfile.getAddress());

	}

}
