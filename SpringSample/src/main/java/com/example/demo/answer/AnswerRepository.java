package com.example.demo.answer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>   {

}