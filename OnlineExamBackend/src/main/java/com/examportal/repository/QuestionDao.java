package com.examportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examportal.entity.Question;


public interface QuestionDao extends JpaRepository<Question, Integer> {
	@Query(value = "from question where branch_id = :branchId and subject_id = :subId")
	List<Question> getQuestions(@Param("branchId") int branchId,@Param("subId") int subId);
}
