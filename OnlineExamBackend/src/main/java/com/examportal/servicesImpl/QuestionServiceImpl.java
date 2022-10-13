package com.examportal.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.examportal.entity.Question;
import com.examportal.repository.QuestionDao;
import com.examportal.services.QuestionService;


@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired 
	QuestionDao qd;
	

	@Override
	public Question getQuestion(int branchId,int subId,int queNo) {
		// TODO Auto-generated method stub
		return qd.getQuestion(branchId, subId,PageRequest.of(queNo-1, 1));
	}

	@Override
	public Question addQuestion(Question que) {
		// TODO Auto-generated method stub
		qd.save(que);
		return que;
	}

	@Override
	public Question updateQuestion(Question que) {
		// TODO Auto-generated method stub
		qd.save(que);
		return que;
	}

	@Override
	public Question deleteQuestion(Integer id) {
		// TODO Auto-generated method stub
		Question entitytodelete = qd.findById(id).get();
		qd.delete(entitytodelete);
//		qd.deleteById(id);
		return null;
	}
	@Override
	public long countRows() {
        return qd.count();
	}

	@Override
	public List<Question> getQuestions(int branchId, int subId) {
		return qd.getQuestions(branchId, subId);
	}

	@Override
	public int gettotalQustions(int branchId, int subId) {
		return qd.gettotalQustions(branchId, subId);
	}
    



}
