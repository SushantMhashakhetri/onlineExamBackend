package com.examportal.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.entity.Subject;
import com.examportal.repository.SubjectDao;
import com.examportal.services.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectDao sd;
	@Override
	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return sd.findAll();
	}

	@Override
	public Subject getSubject(Integer id) {
		// TODO Auto-generated method stub
		return sd.findById(id).get();
	}

	@Override
	public Subject addSubject(Subject sub) {
		// TODO Auto-generated method stub
		sd.save(sub);
		return sub;
	}

	@Override
	public Subject deleteSubject(Integer id) {
		// TODO Auto-generated method stub
		Subject entitytodelete = sd.findById(id).get();
		sd.delete(entitytodelete);
//		brd.deleteById(id);
		return null;
	}

}
