package com.uvt.questionnaire.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uvt.questionnaire.model.Choice;
import com.uvt.questionnaire.model.Questions;
import com.uvt.questionnaire.repository.ChoiceRepository;
import com.uvt.questionnaire.repository.QuestionRepo;
import com.uvt.questionnaire.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepo questionRepo;
	@Autowired
	private ChoiceRepository choiceRepository;
	@Override
	public void save(Questions questions) {
		 List<Choice> choices=choiceRepository.saveAll(questions.getChoices());
		 questions.setChoices(choices);
		 questionRepo.save(questions);

	}

}
