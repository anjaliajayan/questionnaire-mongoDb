package com.uvt.questionnaire.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uvt.questionnaire.model.Questions;


public interface QuestionRepo extends MongoRepository<Questions, String> {

}
