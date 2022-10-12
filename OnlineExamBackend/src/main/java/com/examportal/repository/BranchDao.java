package com.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.entity.Branch;


public interface BranchDao  extends JpaRepository<Branch, Integer>{

}
