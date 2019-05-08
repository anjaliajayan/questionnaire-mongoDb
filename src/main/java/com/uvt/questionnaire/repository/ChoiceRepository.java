package com.uvt.questionnaire.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uvt.questionnaire.model.Choice;

public interface ChoiceRepository extends MongoRepository<Choice, String> {

}
