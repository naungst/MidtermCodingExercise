package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID; 
	private double grade;
		
	private Enrollment() {
		
	}
	
	public Enrollment(UUID studentID, UUID sectionID) {
		this.studentID = studentID;
		this.sectionID = sectionID;
		this.enrollmentID = UUID.randomUUID();
	}

	public UUID getSectionID() {
		return sectionID;
	}

	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}

	public UUID getStudentID() {
		return studentID;
	}

	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}

	public UUID getEnrollmentID() {
		return enrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
