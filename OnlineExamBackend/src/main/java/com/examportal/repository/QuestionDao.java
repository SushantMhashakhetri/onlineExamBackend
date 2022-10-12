package com.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.entity.Question;


public interface QuestionDao extends JpaRepository<Question, Integer> {

}
