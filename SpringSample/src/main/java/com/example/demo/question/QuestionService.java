package com.example.demo.question;

import java.util.List;
import java.util.Optional;

import com.example.demo.answer.Answer;


public interface QuestionService {
	
	Question createQuestion(Question question);

	Optional<Question> findQuestion(Long id);

	//Question updateQuestion(Answer answer);
	
	Question maxAnswer();
}
