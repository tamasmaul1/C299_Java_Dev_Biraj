package com.example.demo.answer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.question.QuestionRestController;
import com.example.demo.question.QuestionServiceImpl;

import lombok.extern.java.Log;

@RestController
@Log
public class AnswerRestController {

	@Autowired
	private AnswerServiceImpl answerServiceImpl;
	@Autowired
	private QuestionServiceImpl questionServiceImpl;
	
	@PostMapping("/createAnswer")
	public Answer createAnswer(@RequestParam(value = "userId", defaultValue = "0") Long userId, 
			@RequestParam(value = "questionId", defaultValue = "0") Long questionId, @RequestBody Answer answer)  {
		
		answer.setOwnerId(userId);
		if(questionServiceImpl.findQuestion(questionId).isPresent()){
			answer.setQuestionId(questionId);
			log.info(userId.toString() + questionId.toString() + answer.toString());
			return answerServiceImpl.createAnswer(answer);
		}
		else{
			log.info("Invalid QuestionId");
			return null;
		}
	}

	@GetMapping("/Answer")
	public Optional<Answer> findAnswer(@RequestParam(value = "id", defaultValue = "0") Long id){
		return answerServiceImpl.findAnswer(id);
	}
}
