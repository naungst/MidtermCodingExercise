package com.cisc181.core;
import java.util.UUID;

public class Section {
	
	private UUID courseID;
	private UUID sectionID; 
	private UUID semesterID;
	private int roomID;
	
	public Section(UUID courseID, UUID sectionID, UUID semesterID, int roomID) {
		this.courseID = courseID;
		this.sectionID = sectionID;
		this.semesterID = semesterID;
		this.roomID = roomID;
	}

	public UUID getCourseID() {
		return courseID;
	}

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public UUID getSectionID() {
		return sectionID;
	}

	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}

	public UUID getSemesterID() {
		return semesterID;
	}

	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
	
}
