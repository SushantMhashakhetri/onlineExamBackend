package com.examportal.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.entity.Branch;

import com.examportal.repository.BranchDao;
import com.examportal.services.BranchService;

@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	BranchDao brd;
	@Override
	public List<Branch> getBranches() {
		// TODO Auto-generated method stub
		return brd.findAll();
	}

	@Override
	public Branch getBranch(Integer id) {
		// TODO Auto-generated method stub
		return brd.findById(id).get();
	}

	@Override
	public Branch addBranch(Branch br) {
		// TODO Auto-generated method stub
		brd.save(br);
		return br;
	}

	@Override
	public Branch deleteBranch(Integer id) {
		// TODO Auto-generated method stub
		Branch entitytodelete = brd.findById(id).get();
		brd.delete(entitytodelete);
//		brd.deleteById(id);
		return null;
	}

}
