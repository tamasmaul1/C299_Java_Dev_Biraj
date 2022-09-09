package com.example.demo.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.answer.Answer;
import com.example.demo.appUser.AppUserServiceImpl;

import lombok.extern.java.Log;

@Log
@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question createQuestion(Question question) {
		
		System.out.println("createQuestion");
		ArrayList<Answer> answerList = new ArrayList<Answer>();
		question.setAnswers(answerList);
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> findQuestion(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id);
	}

	// @Override
	// public Question updateQuestion(Answer answer){
	// 	Optional<Question> question = questionRepository.findById(answer.getQuestionId());
	// 	if(question.isPresent()){
	// 		Question q = question.get();
	// 		List<Answer> answerList = q.getAnswers();
	// 		answerList.add(answer);
	// 		q.setAnswers(answerList);
	// 		//q.setAnswers(q.getAnswers().add(answer));
	// 		System.out.println("Question");
	// 		System.out.println("Answers" + q.getAnswers());
	// 		return questionRepository.save(q);
	// 	}
	// 	else{
	// 		return null;
	// 	}
	// }

	@Override
	public Question maxAnswer(){
		long max = 0;
		long maxId = 0;
		for(Question question : questionRepository.findAll()){
			if(question.getAnswers().size() > max){
				max = question.getAnswers().size();
				maxId = question.getId();
			}
		}
		return questionRepository.findById(maxId).get();
	}
}