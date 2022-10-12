package com.examportal.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Branch {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchId;
	private String branchName;
	
	@OneToMany(mappedBy="branch",cascade=CascadeType.ALL)
	private Set<Subject> subject;
	
	
	
	
	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Set<Subject> getSubject() {
		return subject;
	}

	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(String branchName, Set<Subject> subject) {
		super();
		this.branchName = branchName;
		this.subject = subject;
	}


}
