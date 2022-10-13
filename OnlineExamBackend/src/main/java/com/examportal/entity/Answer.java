package com.examportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "answer")
@Table(name = "answer")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansId;
	
	@Column(name="que_id",nullable = false)
	private int que_id;
	
	@Column(name="selectedAns",nullable = false)
	private String selectedAns;
	
	@Column(name="corr_ans",nullable = false)
	private String corr_ans;
	
	@Column(name="username",nullable = false)
	private String username;
	
	@Column(name="subjectId",nullable = false)
	private int subjectId;
	
	public Answer() {
		super();
	}

	public Answer(int ansId, int que_id, String selectedAns, String corr_ans, String username,int subjectId) {
		super();
		this.ansId = ansId;
		this.que_id = que_id;
		this.selectedAns = selectedAns;
		this.corr_ans = corr_ans;
		this.username = username;
		this.subjectId = subjectId;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public int getQue_id() {
		return que_id;
	}

	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}

	public String getSelectedAns() {
		return selectedAns;
	}

	public void setSelectedAns(String selectedAns) {
		this.selectedAns = selectedAns;
	}

	public String getCorr_ans() {
		return corr_ans;
	}

	public void setCorr_ans(String corr_ans) {
		this.corr_ans = corr_ans;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
}
