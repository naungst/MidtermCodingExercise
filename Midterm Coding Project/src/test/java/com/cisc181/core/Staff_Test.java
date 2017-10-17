package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Test
	public void testAverageSalary() throws ParseException, PersonException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = null;
		Date date2 = null;
		double averageSalary = 0;

		date1 = dateFormat.parse("01-12-1977");
		date2 = dateFormat.parse("01-12-2006");
		Staff s1 = new Staff("Joe", "Jack", "Josephson", date1, "123 Road Rd", "123-456-3345", "email@email.gov",
				"WED 1-2", 23, 50000.0, date2, eTitle.MR);
		date1 = dateFormat.parse("01-12-1975");
		date2 = dateFormat.parse("01-12-2002");
		Staff s2 = new Staff("Joey", "Jacob", "Jackson", date1, "123 Road Rd", "123-456-3345", "email@email.gov",
				"WED 1-2", 23, 57500.0, date2, eTitle.MR);
		date1 = dateFormat.parse("01-12-1974");
		date2 = dateFormat.parse("01-12-2009");
		Staff s3;
		s3 = new Staff("Carl", "Jack", "Sagan", date1, "123 Road Rd", "123-456-3345", "email@email.gov",
					"WED 1-2", 23, 60000.0, date2, eTitle.MR);
		date1 = dateFormat.parse("01-12-1979");
		date2 = dateFormat.parse("01-12-2014");
		Staff s4 = new Staff("Carl", "Jack", "Rojas", date1, "123 Road Rd", "123-456-3345", "email@email.gov",
				"WED 1-2", 23, 40000.0, date2, eTitle.MR);
		date1 = dateFormat.parse("01-12-1962");
		date2 = dateFormat.parse("01-12-2011");
		Staff s5 = new Staff("Daniel", "Jack", "Sandman", date1, "123 Road Rd", "123-456-3345", "email@email.gov",
				"WED 1-2", 23, 45000.0, date2, eTitle.MR);
		ArrayList<Staff> a1 = new ArrayList<Staff>();
		Staff[] sArray = { s1, s2, s3, s4, s5 };
		a1.addAll(Arrays.asList(sArray));
		for (int i = 0; i < a1.size(); i++) {
			averageSalary += a1.get(i).getSalary();
		}

		averageSalary = averageSalary / 5;

		assertEquals(50500.0, averageSalary, 0);
	}
	
	@Test(expected = PersonException.class)
	public void testThrowPersonException() throws ParseException, PersonException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = null;
		Date date2 = null;
		date1 = dateFormat.parse("01-12-1974");
		date2 = dateFormat.parse("01-12-2009");
		Staff s1 = (Staff) new Staff("Joe", "Jack", "Josephson", date1, "123 Road Rd", "123-456-334", "email@email.gov",
				"WED 1-2", 23, 50000.0, date2, eTitle.MR);
		date1 = dateFormat.parse("01-12-1900");
		Staff s2 = (Staff) new Staff("Joe", "Jack", "Josephson", date1, "123 Road Rd", "123-456-3346", "email@email.gov",
				"WED 1-2", 23, 50000.0, date2, eTitle.MR);
		s1.validate();
		s2.validate();
	}
	
}
