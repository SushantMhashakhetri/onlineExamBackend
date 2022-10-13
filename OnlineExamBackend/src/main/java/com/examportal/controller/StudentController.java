package com.examportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.entity.Question;
import com.examportal.services.QuestionService;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
	
	
	@Autowired
	private QuestionService queService;

	@GetMapping("/exam/{branchId}/{subId}") 
	public List<Question> getQuestion(@PathVariable String branchId,@PathVariable String subId) {
		return queService.getQuestions(Integer.parseInt(branchId), Integer.parseInt(subId));
	}
	
}
