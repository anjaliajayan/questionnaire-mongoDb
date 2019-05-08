package com.uvt.questionnaire.model;

import java.util.List;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="answers")
public class Answer {
	@Id
	private ObjectId id;
	private List<Answer> answer;
	

}
