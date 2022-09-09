package com.example.demo.answer;

import java.util.Optional;

import com.example.demo.question.Question;

public interface AnswerService {

	Answer createAnswer(Answer answer);

	Optional<Answer> findAnswer(Long id);
}
