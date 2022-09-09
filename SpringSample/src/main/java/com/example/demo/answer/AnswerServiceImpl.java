package com.example.demo.answer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;
import com.example.demo.question.QuestionServiceImpl;

import lombok.extern.java.Log;

@Log
@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionServiceImpl questionServiceImpl;
	
	@Override
	public Answer createAnswer(Answer answer) {
		
		System.out.println("createAnswer");
		if(questionServiceImpl.findQuestion(answer.getQuestionId()).isPresent()){
			return answerRepository.save(answer);
		}
		else{
			System.out.println(questionServiceImpl.findQuestion(answer.getQuestionId()));
		}
		//Answer a = answerRepository.save(answer);
		//questionServiceImpl.updateQuestion(a);
		//questionServiceImpl.updateQuestion(a);
		//System.out.println(questionServiceImpl.findQuestion(2L));
		return answerRepository.save(answer);
	}

	@Override
	public Optional<Answer> findAnswer(Long id){
		return answerRepository.findById(id);
	}
}
