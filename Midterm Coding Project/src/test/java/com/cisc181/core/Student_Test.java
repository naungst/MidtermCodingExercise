package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	private static ArrayList<Course> cArrayList;
	private static ArrayList<Semester> sArrayList;
	private static ArrayList<Section> secArrayList;
	private static ArrayList<Student> studArrayList;
	private static ArrayList<Enrollment> enrollList;
	static double stud1GPA;
	static double stud2GPA;
	static double stud3GPA;
	static double stud4GPA;
	static double stud5GPA;
	static double stud6GPA;
	static double stud7GPA;
	static double stud8GPA;
	static double stud9GPA;
	static double stud10GPA;
	private static double c1Average = 0;
	private static double c2Average = 0;
	private static double c3Average = 0;
	private static double c1Size= 0;
	private static double c2Size = 0;
	private static double c3Size = 0;
	
	@BeforeClass
	public static void setup() throws ParseException, PersonException {
		
		final UUID cUUID1 = UUID.randomUUID();
		final UUID cUUID2 = UUID.randomUUID();
		final UUID cUUID3 = UUID.randomUUID();
		final UUID sUUID1 = UUID.randomUUID();
		final UUID sUUID2 = UUID.randomUUID();
		final UUID secUUID1 = UUID.randomUUID();
		final UUID secUUID2 = UUID.randomUUID();
		final UUID secUUID3 = UUID.randomUUID();
		final UUID secUUID4 = UUID.randomUUID();
		final UUID secUUID5 = UUID.randomUUID();
		final UUID secUUID6 = UUID.randomUUID();

		Course c1 = new Course(cUUID1, "Geology", 3);
		Course c2 = new Course(cUUID2, "Chemistry", 4);
		Course c3 = new Course(cUUID3, "Business 101", 3);
		Course[] cArr = { c1, c2, c3 };
		cArrayList = new ArrayList<Course>();
		cArrayList.addAll(Arrays.asList(cArr));

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date fallStart = dateFormat.parse("01-09-2017");
		Date fallEnd = dateFormat.parse("18-12-2017");
		Semester fall = new Semester(sUUID1, fallStart, fallEnd);
		Date springStart = dateFormat.parse("09-02-2017");
		Date springEnd = dateFormat.parse("22-05-2017");
		Semester spring = new Semester(sUUID2, springStart, springEnd);
		Semester[] sArr = { spring, fall };
		sArrayList = new ArrayList<Semester>();
		sArrayList.addAll(Arrays.asList(sArr));

		Section s1 = new Section(cUUID1, secUUID1, sUUID1, 200);
		Section s2 = new Section(cUUID2, secUUID3, sUUID1, 210);
		Section s3 = new Section(cUUID3, secUUID5, sUUID1, 220);
		Section s4 = new Section(cUUID1, secUUID2, sUUID2, 205);
		Section s5 = new Section(cUUID2, secUUID4, sUUID2, 215);
		Section s6 = new Section(cUUID3, secUUID6, sUUID2, 225);
		Section[] secArr = { s1, s2, s3, s4, s5, s6 };
		secArrayList = new ArrayList<Section>();
		secArrayList.addAll(Arrays.asList(secArr));

		
		Date date1 = dateFormat.parse("01-12-1977");
		Student stud1 = new Student("Joey", "Rocky", "Costello", date1, eMajor.BUSINESS, "123 Road Rd",
				"(914)-222-2345", "jcostello@edu.edu");
		Student stud2 = new Student("Joey", "Rocky", "Costello", date1, eMajor.CHEM, "123 Road Rd",
				"(914)-221-2345", "jcostello@edu.edu");
		Student stud3 = new Student("Joey", "Rocky", "Costello", date1, eMajor.COMPSI, "123 Road Rd",
				"(914)-223-2345", "jcostello@edu.edu");
		Student stud4 = new Student("Joey", "Rocky", "Costello", date1, eMajor.NURSING, "123 Road Rd",
				"(914)-226-2345", "jcostello@edu.edu");
		Student stud5 = new Student("Joey", "Rocky", "Costello", date1, eMajor.PHYSICS, "123 Road Rd",
				"(914)-227-2445", "jcostello@edu.edu");
		Student stud6 = new Student("Joey", "Rocky", "Costello", date1, eMajor.NURSING, "12 Road Rd",
				"(914)-212-2445", "jcostello@edu.edu");
		Student stud7 = new Student("Joey", "Rocky", "Costello", date1, eMajor.NURSING, "1 Road Rd",
				"(914)-122-2345", "jcostello@edu.edu");
		Student stud8 = new Student("Joey", "Rocky", "Costello", date1, eMajor.CHEM, "4 Street Rd",
				"914-222-2346", "jcostello@edu.edu");
		Student stud9 = new Student("Joey", "Rocky", "Costello", date1, eMajor.BUSINESS, "6 Road Rd",
				"914-222-2348", "jcostello@edu.edu");
		Student stud10 = new Student("Joey", "Rocky", "Costello", date1, eMajor.COMPSI, "4 Zone Rd",
				"914-222-2349", "jcostello@edu.edu");
		Student[] studArr = { stud1, stud2, stud3, stud4, stud5, stud6, stud7, stud8, stud9, stud10 };
		studArrayList = new ArrayList<Student>();
		studArrayList.addAll(Arrays.asList(studArr));

		enrollList = new ArrayList<Enrollment>();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
		
				Enrollment e1 = new Enrollment(studArrayList.get(i).getStudentID(), secArrayList.get(j).getSectionID());
				enrollList.add(e1);
			}
		}

		for (int i = 5; i < 10; i++) {
			for (int j = 3; j < 6; j++) {
				
				Enrollment e1 = new Enrollment(studArrayList.get(i).getStudentID(), secArrayList.get(j).getSectionID());
				enrollList.add(e1);
			}
		}
		
		enrollList.get(0).setGrade(4.0);
		enrollList.get(1).setGrade(3.70);
		enrollList.get(2).setGrade(2.70);
		enrollList.get(3).setGrade(3.33);
		enrollList.get(4).setGrade(2.70);
		enrollList.get(5).setGrade(2.70);
		enrollList.get(6).setGrade(4.0);
		enrollList.get(7).setGrade(3.33);
		enrollList.get(8).setGrade(3.33);
		enrollList.get(9).setGrade(2.70);
		enrollList.get(10).setGrade(3.33);
		enrollList.get(11).setGrade(2.70);
		enrollList.get(12).setGrade(3.70);
		enrollList.get(13).setGrade(4.0);
		enrollList.get(14).setGrade(4.0);
		enrollList.get(15).setGrade(4.0);
		enrollList.get(16).setGrade(3.33);
		enrollList.get(17).setGrade(3.33);
		enrollList.get(18).setGrade(3.33);
		enrollList.get(19).setGrade(3.70);
		enrollList.get(20).setGrade(2.70);
		enrollList.get(21).setGrade(2.70);
		enrollList.get(22).setGrade(3.70);
		enrollList.get(23).setGrade(2.30);
		enrollList.get(24).setGrade(2.00);
		enrollList.get(25).setGrade(2.00);
		enrollList.get(26).setGrade(1.70);
		enrollList.get(27).setGrade(2.70);
		enrollList.get(28).setGrade(3.70);
		enrollList.get(29).setGrade(1.70);
		

		stud1GPA = ((enrollList.get(0).getGrade() * 3 + enrollList.get(1).getGrade() * 4 + enrollList.get(2).getGrade() * 3) / 10);
		stud2GPA = ((enrollList.get(3).getGrade() * 3 + enrollList.get(4).getGrade() * 4+ enrollList.get(5).getGrade() * 3) / 10);
		stud3GPA = ((enrollList.get(6).getGrade() * 3+ enrollList.get(7).getGrade() * 4 + enrollList.get(8).getGrade()* 3) / 10);
		stud4GPA = ((enrollList.get(9).getGrade() * 3+ enrollList.get(10).getGrade() * 4+ enrollList.get(11).getGrade() * 3) / 10);
		stud5GPA = ((enrollList.get(12).getGrade() * 3+ enrollList.get(13).getGrade() * 4+ enrollList.get(14).getGrade() * 3)
				/ 10);
		stud6GPA = ((enrollList.get(15).getGrade() * 3+ enrollList.get(16).getGrade() * 4 + enrollList.get(17).getGrade() * 3)
				/ 10);
		stud7GPA = ((enrollList.get(18).getGrade() * 3+ enrollList.get(19).getGrade() * 4+ enrollList.get(20).getGrade()* 3)
				/ 10);
		stud8GPA = ((enrollList.get(21).getGrade() * 3+ enrollList.get(22).getGrade() * 4+ enrollList.get(23).getGrade() * 3)
				/ 10);
		stud9GPA = ((enrollList.get(24).getGrade() * 3+ enrollList.get(25).getGrade() * 4 + enrollList.get(26).getGrade()* 3)
				/ 10);
		stud10GPA = ((enrollList.get(27).getGrade() * 3+ enrollList.get(28).getGrade() * 4 + enrollList.get(29).getGrade() * 3)
				/ 10);

		
		for(int i = 0; i < enrollList.size(); i++) {
			UUID sectionID = enrollList.get(i).getSectionID();
			double grade = enrollList.get(i).getGrade();
			UUID courseID = null;
			for(int j = 0; j < secArrayList.size(); j++) {
				if(sectionID == secArrayList.get(j).getSectionID()) {
					courseID = secArrayList.get(j).getCourseID();
				}
			}
			if(courseID == cUUID1) {
				c1Average += grade;
				c1Size++;
			}
			else if(courseID == cUUID2) {
				c2Average += grade;
				c2Size++;
			}
			else if(courseID == cUUID3) {
				c3Average += grade;
				c3Size++;
			}
		}

	}

	
	@Test
	public void testStudentGPA() {
		assertEquals(3.49, stud1GPA, 0.0000001);
		assertEquals(2.889, stud2GPA, 0.0000001);
		assertEquals(3.531, stud3GPA, 0.0000001);
		assertEquals(2.952, stud4GPA, 0.0000001);
		assertEquals(3.91, stud5GPA, 0.0000001);
		assertEquals(3.531, stud6GPA, 0.0000001);
		assertEquals(3.289, stud7GPA, 0.0000001);
		assertEquals(2.98, stud8GPA, 0.0000001);
		assertEquals(1.91, stud9GPA, 0.0000001);
		assertEquals(2.8, stud10GPA, 0.0000001);
	}

	@Test
	public void testCourseAverage() {
		assertEquals(3.246, (c1Average / c1Size), 0.0000001);
		assertEquals(3.349, (c2Average / c2Size), 0.0000001);
		assertEquals(2.715999999999997, (c3Average / c3Size), 0.0000001);
	}
}