package com.examportal.services;

import java.util.List;

import com.examportal.entity.Subject;

public interface SubjectService {
	
	List<Subject> getSubjects();

	Subject getSubject(Integer id);

	Subject addSubject(Subject sub);

	Subject deleteSubject(Integer id);
	
	

}
