package com.uvt.questionnaire.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="choices")
public class Choice {
	@Id
	private ObjectId id;
	private String option;

}
