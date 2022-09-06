package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.java.Log;

@Log
@SpringBootApplication
public class SpringSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);

		System.out.println("Spring Sample Application");

	}

	@Bean
	public CommandLineRunner demo(AppUserRepository appUserRepository, AppUserServiceImpl appUserServiceImpl) {
		return (args) -> {
			log.info("Demo is working");

			// appUserRepository.deleteAll();
			/*
			 * for (int i = 0; i < 10; i++) { AppUser tempAppUser = new AppUser();
			 * tempAppUser.setName("Biraj"); tempAppUser.setAddress("India");
			 * tempAppUser.setPhoneNumber(123456789L);
			 * 
			 * appUserServiceImpl.createAppUser(tempAppUser);
			 * 
			 * }
			 * 
			 * for (AppUser tempAppUser : appUserRepository.findAll()) {
			 * log.info(tempAppUser.toString()); }
			 */

		};
	}

}
