package com.examportal.services;

import java.util.List;

import com.examportal.entity.Branch;



public interface BranchService {

	
	List<Branch> getBranches();

	Branch getBranch(Integer id);

	Branch addBranch(Branch br);

	Branch deleteBranch(Integer id);
}
