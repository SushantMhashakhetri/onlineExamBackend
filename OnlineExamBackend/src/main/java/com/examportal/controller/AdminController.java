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

import com.examportal.entity.Branch;
import com.examportal.entity.Question;
import com.examportal.entity.Subject;
import com.examportal.services.BranchService;
import com.examportal.services.QuestionService;
import com.examportal.services.SubjectService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
	private BranchService brService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Spring Boot";
	}
	
	@GetMapping("/branches")
	public List<Branch> getbranches() {
		return brService.getBranches();
		}
	
	@GetMapping("/branch/{id}") 
	public Branch getBranch(@PathVariable String id) {
		return this.brService.getBranch(Integer.parseInt(id));
	}
	
	@PostMapping("/branch")
	public Branch addBranch(@RequestBody Branch br) {
		return this.brService.addBranch(br);
	}
	

	@DeleteMapping("/branch/{id}")
	public Branch deleteBranch(@PathVariable String id) {
		return  this.brService.deleteBranch(Integer.parseInt(id));
	}
	

	@Autowired
	private SubjectService subService;
	

	
	@GetMapping("/subjects")
	public List<Subject> getSubjects() {
		return subService.getSubjects();
		}
	
	@GetMapping("/subject/{id}") 
	public Subject getSubject(@PathVariable String id) {
		return this.subService.getSubject(Integer.parseInt(id));
	}
	
	@PostMapping("/subject")
	public Subject addSubject(@RequestBody Subject sub) {
		return this.subService.addSubject(sub);
	}
	

	@DeleteMapping("/subject/{id}")
	public Subject deleteSubject(@PathVariable String id) {
		return  this.subService.deleteSubject(Integer.parseInt(id));
	}
	
	@Autowired
	private QuestionService queService;
	
	
	@GetMapping("/questions/{branchId}/{subId}")
	public List<Question> getQuestions(@PathVariable String branchId,@PathVariable String subId) {
		return queService.getQuestions(Integer.parseInt(branchId),Integer.parseInt(subId));
		}
	
	@GetMapping("/question/{id}") 
	public Question getQuestion(@PathVariable String id) {
		return this.queService.getQuestion(Integer.parseInt(id));
	}
	
	@PostMapping("/question")
	public Question addQuestion(@RequestBody Question pro) {
		return this.queService.addQuestion(pro);
	}
	
	@PutMapping("/question")
	public Question updateQuestion(@RequestBody Question pro) {
		return this.queService.updateQuestion(pro);
	}
	@DeleteMapping("/question/{id}")
	public Question deleteQuestion(@PathVariable String id) {
		return  this.queService.deleteQuestion(Integer.parseInt(id));
	}
	
	@GetMapping("/questionscount")
	public long countQuestions() {
		return this.queService.countRows();
	}


}
