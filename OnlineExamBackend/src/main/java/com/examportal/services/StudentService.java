package com.examportal.services;

import com.examportal.entity.Answer;

public interface StudentService {
	boolean saveAns(Answer ans);
	int result(String username,int subject_id);
	boolean isAttempted(String username,int subject_id);
}
