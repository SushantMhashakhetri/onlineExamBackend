package com.examportal.services;

import java.util.List;

import com.examportal.entity.Question;


public interface QuestionService {
	
	List<Question> getQuestions();

	Question getQuestion(Integer id);

	Question addQuestion(Question que);

	Question updateQuestion(Question que);

	Question deleteQuestion(Integer id);
	
	public long countRows();
}
