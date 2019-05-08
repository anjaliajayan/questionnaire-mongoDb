package com.uvt.questionnaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uvt.questionnaire.model.Questions;
import com.uvt.questionnaire.service.QuestionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/quest")
public class QuestionSaveController {

	@Autowired
	private QuestionService questionService;

	@PostMapping("/post")
	public Questions saveQuest(@RequestBody Questions questions) {
		questionService.save(questions);
		return questions;
		
	}
}
