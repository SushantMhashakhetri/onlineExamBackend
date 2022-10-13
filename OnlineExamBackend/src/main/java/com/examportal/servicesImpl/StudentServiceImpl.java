package com.examportal.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.entity.Answer;
import com.examportal.repository.AnswerDao;
import com.examportal.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	AnswerDao answerDao;
	@Override
	public boolean saveAns(Answer ans) {
		Answer a = answerDao.save(ans);
		if(a != null)
			return true;
		return false;
	}
	@Override
	public int result(String username, int subject_id) {
		return answerDao.result(username, subject_id);
	}
	@Override
	public boolean isAttempted(String username, int subject_id) {
		if(answerDao.isAttempted(username, subject_id)>0)
			return true;
		return false;
	}

}
