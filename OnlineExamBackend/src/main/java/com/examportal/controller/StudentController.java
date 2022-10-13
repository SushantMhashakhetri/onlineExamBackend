package com.examportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.entity.Answer;
import com.examportal.entity.Question;
import com.examportal.entity.Subject;
import com.examportal.services.QuestionService;
import com.examportal.services.StudentService;
import com.examportal.services.SubjectService;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
	
	
	@Autowired
	private QuestionService queService;
	
	@Autowired
	private SubjectService subService;
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/exam/{branchId}/{subId}") 
	public List<Question> getQuestion(@PathVariable String branchId,@PathVariable String subId) {
		return queService.getQuestions(Integer.parseInt(branchId), Integer.parseInt(subId));
	}
	@GetMapping("/student/{branchId}") 
	public List<Subject> getSubjects(@PathVariable String branchId) {
		return subService.getSubjectsByBranchId(Integer.parseInt(branchId));
	}
	
	@PostMapping("/ans")
	public boolean saveAns(@RequestBody Answer ans) {
		return studentService.saveAns(ans);
	}
	
	@GetMapping("/result/{username}/{subject_id}")
	public int result(@PathVariable String username,@PathVariable String subject_id) {
		return studentService.result(username, Integer.parseInt(subject_id));
	}
	
	@GetMapping("/attempted/{username}/{subject_id}")
	public boolean isAttempted(@PathVariable String username,@PathVariable String subject_id) {
		return studentService.isAttempted(username, Integer.parseInt(subject_id));
	}
	
}
