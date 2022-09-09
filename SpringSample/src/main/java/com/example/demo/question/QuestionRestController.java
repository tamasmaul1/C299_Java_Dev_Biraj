package com.example.demo.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.answer.Answer;
import com.example.demo.answer.AnswerRepository;

import lombok.extern.java.Log;

@RestController
@Log
public class QuestionRestController {
	
	@Autowired
	private QuestionServiceImpl questionServiceImpl;
	@Autowired
	private AnswerRepository answerRepository;

	@PostMapping("/createQuestion")
	public Question createQuestion(@RequestBody Question Question) {

		log.info(Question.toString());
		return questionServiceImpl.createQuestion(Question);

	}
	
	@GetMapping("/Question")
	public Question getQuestion(@RequestParam(value = "id", defaultValue = "0") Long id) {
		System.out.println(id);

		Optional<Question> optQuestion = questionServiceImpl.findQuestion(id);
		Question question = optQuestion.get();
		Iterable<Answer> answers = answerRepository.findAll();
		for (Answer answer : answers) {
			if(answer.getQuestionId() == id)
			{
				System.out.println(answer.getQuestionId());
				System.out.println(id);
				List<Answer> answerList = question.getAnswers();
				answerList.add(answer);
				question.setAnswers(answerList);
			}
		}
		return question;
	}

	@GetMapping("/maxAnswer")
	public Question maxAnswer() {
		return questionServiceImpl.maxAnswer();
	}
	
}
