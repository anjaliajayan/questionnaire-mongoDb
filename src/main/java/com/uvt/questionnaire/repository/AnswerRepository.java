package com.uvt.questionnaire.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uvt.questionnaire.model.Answer;

public interface AnswerRepository extends MongoRepository<Answer, String>{

}
