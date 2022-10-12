package com.examportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "question")
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int que_id;
	
	@Column(name="question")
	private String question;
	@Column(name="op1")
	private String op1;
	@Column(name="op2")
	private String op2;
	@Column(name="op3")
	private String op3;
	@Column(name="op4")
	private String op4;
	@Column(name="corr_ans")
	private String corr_ans;
	
	public Question() {
		super();
	
	}
	
	public Question(int que_id, String question, String op1, String op2, String op3, String op4, String corr_ans,
			int branchId, int subjectId) {
		super();
		this.que_id = que_id;
		this.question = question;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.corr_ans = corr_ans;
		this.branchId = branchId;
		this.subjectId = subjectId;
	}
	


	@Column(name="branchId")
	private int branchId;
	
	private int subjectId;



	public int getBranchId() {
		return branchId;
	}



	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}














	public int getQue_id() {
		return que_id;
	}



	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getOp1() {
		return op1;
	}



	public void setOp1(String op1) {
		this.op1 = op1;
	}



	public String getOp2() {
		return op2;
	}



	public void setOp2(String op2) {
		this.op2 = op2;
	}



	public String getOp3() {
		return op3;
	}



	public void setOp3(String op3) {
		this.op3 = op3;
	}



	public String getOp4() {
		return op4;
	}



	public void setOp4(String op4) {
		this.op4 = op4;
	}



	public String getCorr_ans() {
		return corr_ans;
	}



	public void setCorr_ans(String corr_ans) {
		this.corr_ans = corr_ans;
	}



	public int getSubjectId() {
		return subjectId;
	}



	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}








}
