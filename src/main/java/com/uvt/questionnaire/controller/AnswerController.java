package com.uvt.questionnaire.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uvt.questionnaire.model.Choice;
import com.uvt.questionnaire.service.AnswerService;

@RestController
@RequestMapping("/answer")
public class AnswerController {
	@Autowired
	private AnswerService answerService;

	   private final Logger logger = LoggerFactory.getLogger(this.getClass());
	   @PostMapping(value= "/saveAnswer")
	    public String saveAnswer(@RequestBody List<Choice> choices) {
	        logger.debug("Saving employees.");
	        answerService.createEmployee(choices);
	        return "Employee records created.";
	    }
}
