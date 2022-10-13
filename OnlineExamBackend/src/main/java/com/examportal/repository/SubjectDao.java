package com.examportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examportal.entity.Subject;

public interface SubjectDao extends JpaRepository<Subject, Integer> {
	@Query(value = "from subject where branch_id = :branchId") 
	List<Subject> getSubjectsByBranchId(@Param("branchId") int branchId);
}
