package edu.ben.homeworks.homework2;

import java.io.File;

import org.junit.Test;

/**
 * This is my homework 2 test
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework2Test {

	@Test
	public void testImportEmployees() {
		try {
			Homework2.importEmployees(new File("Homework2.csv"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		Employee e = new Employee("Zena");

		e.setFirstName("Zena");
	}

	@Test
	public void testAllData() {
		Employee e = new Employee("Zena", "Burch", "88499.39", "11/5/2011");

		e.setFirstName("Zena");
		e.setLastName("Burch");
		e.setSalary("88499.39");
		e.setStartDate("11/5/2011");
	}

}
