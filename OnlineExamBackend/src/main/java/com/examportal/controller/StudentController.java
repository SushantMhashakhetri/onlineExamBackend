package com.examportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.entity.Question;
import com.examportal.services.QuestionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	
	@Autowired
	private QuestionService queService;
	
	
	
	
	@GetMapping("/exam/{branchId}/{subId}/{queId}") 
	public Question getQuestion(@PathVariable String branchId,@PathVariable String subId,@PathVariable String queId) {
		return this.queService.getQuestion(Integer.parseInt(queId));
	}
	
//	@PostMapping("/question")
//	public Question addQuestion(@RequestBody Question pro) {
//		return this.queService.addQuestion(pro);
//	}
//	
//	@PutMapping("/question")
//	public Question updateQuestion(@RequestBody Question pro) {
//		return this.queService.updateQuestion(pro);
//	}
//	@DeleteMapping("/question/{id}")
//	public Question deleteQuestion(@PathVariable String id) {
//		return  this.queService.deleteQuestion(Integer.parseInt(id));
//	}
//	
//	@GetMapping("/questionscount")
//	public long countQuestions() {
//		return this.queService.countRows();
//	}
}
