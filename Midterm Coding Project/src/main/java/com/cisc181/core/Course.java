package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	private UUID courseID;
	private String courseName;
	private int gradePoints;
	private eMajor major;
	
	public Course(UUID id, String courseName, int grade) {
		this.courseID = id;
		this.courseName = courseName;
		this.gradePoints = grade;
	}
	
	public eMajor getMajor() {
		return major;
	}

	public void setMajor(eMajor major) {
		this.major = major;
	}

	public void setCourseID(UUID id) {
		this.courseID = id;
	}
	
	public UUID getCourseId() {
		return this.courseID;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}
	
	public int getGradePoints() {
		return this.gradePoints;
	}
}
