package com.uvt.questionnaire.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uvt.questionnaire.model.Choice;
import com.uvt.questionnaire.repository.AnswerRepository;
import com.uvt.questionnaire.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository;
	
	@Override
	public void createEmployee(List<Choice> choices) {
		// TODO Auto-generated method stub
		
	}

}
