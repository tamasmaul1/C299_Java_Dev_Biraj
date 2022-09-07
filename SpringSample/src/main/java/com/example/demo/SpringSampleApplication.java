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
	public CommandLineRunner demo(QuestionRepository questionRepository) {
		return (args) -> {
			log.info("Demo is working");
			
			Question dummyQuestion = new Question();
			
			for (Answer ans : dummyQuestion.getAnswers())
			{
				ans.getDetails();
			}


		};
	}

}
