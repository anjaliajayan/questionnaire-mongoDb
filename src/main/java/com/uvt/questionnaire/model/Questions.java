package com.uvt.questionnaire.model;


import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection="questions")
public class Questions {
	@Id
	private ObjectId id;	//questionId
	private Date creationDate = new Date();
	private String question;
//	@DBRef
//	private List<Choice> choices;

	private List<Choice> choices;
	private String q_type; 	

}
