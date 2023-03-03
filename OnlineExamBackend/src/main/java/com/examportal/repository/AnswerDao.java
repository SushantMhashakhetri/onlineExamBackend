package com.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examportal.entity.Answer;

public interface AnswerDao extends JpaRepository<Answer, Integer>{
	@Query("select count(*) from answer where username = :username and selected_ans = corr_ans and subject_id = :subject_id")
	public int result(@Param("username") String username,@Param("subject_id") int subject_id);
	
	@Query("select count(*) from answer where username = :username and subject_id = :subject_id")
	public int isAttempted(@Param("username") String username,@Param("subject_id") int subject_id);
}
