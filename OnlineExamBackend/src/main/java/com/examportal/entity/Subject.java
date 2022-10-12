package com.examportal.entity;


import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subjectId;
	private String subjectName;
	
	private int time;
	
	@OneToMany(mappedBy="subject",cascade=CascadeType.ALL)
	private Set<Question> question;
	
	
	@ManyToOne
	@JoinColumn(name="branch_id")
	private Branch branch;
	
	

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}



	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String subjectName, int time, Set<Question> question) {
		super();
		this.subjectName = subjectName;
		
		this.time = time;
		this.question = question;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Set<Question> getQuestion() {
		return question;
	}

	public void setQuestion(Set<Question> question) {
		this.question = question;
	}

}
