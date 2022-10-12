package com.examportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user_mstr")
@Table(name = "user_mstr")
public class User {
	
	@Id
	private String username;
	
	@Column(name = "fname",nullable = false)
	private String fName;
	
	@Column(name = "lname",nullable = false)
	private String lName;
	
	@Column(name = "password",nullable = false)
	private String password;
	
	@Column(name = "email",nullable = false)
	private String email;
	
	@Column(name = "branchId",nullable = false)
	private int branchId;
	
	@Column(name = "userType",nullable = false)
	private String userType;
	
	
	public User() {
		super();
	}
	
	
	public User(String username, String fName, String lName, String password, String email, int branchId,String userType) {
		super();
		this.username = username;
		this.fName = fName;
		this.lName = lName;
		this.password = password;
		this.email = email;
		this.branchId = branchId;
		this.userType = userType;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
