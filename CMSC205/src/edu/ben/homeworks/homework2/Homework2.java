package edu.ben.homeworks.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is homework 2
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework2 {
	
	/**
	 * This is my default constructor
	 */
	private Homework2() {
		
	}

	/**
	 * Main method
	 * @param args
	 * This is args array
	 */
	public static void main(String[] args) {
		File employeeRecords = new File("Homework2.csv");
		try {
			importEmployees(employeeRecords);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static Employee[] employees;

	/**
	 * Imports employee data from a CSV file (A sample has been provided on D2L).
	 * This method expects the file to have a header line.
	 * 
	 * @param importData File containing data, including a header line, in CSV
	 *                   format
	 * @throws FileNotFoundException Thrown if the file does not exist
	 */
	public static void importEmployees(File importData) throws FileNotFoundException {
		Scanner fileInput;
		int index = 0;
		int count = 0;
		try {
			// Creates a row for employees and add an employee counter
			fileInput = new Scanner(importData);
			String line = "";
			while (fileInput.hasNext()) {
				line = fileInput.next();
				String[] employeeData = line.split(",");
				if (count > 0) {
					Employee tempEmployee = new Employee(employeeData[0], employeeData[1], employeeData[2],
							employeeData[3]);
					Manager.employeeCounter++;
					employees[index] = tempEmployee;
					index++;
				}
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns an array containing all the employee objects
	 * 
	 * @return An array of Employee objects
	 */
	public static Employee[] getEmployeeRecords() {
		// Returns the array of employees
		return employees;
	}

	/**
	 * Returns the first employee object that matches the given parameter. This
	 * method is case sensitive.
	 * 
	 * @return firstName The matching employee object or null if the name is not found
	 */
	public static Employee getEmployeeByFirstName(String firstName) {
		// Gets the first name
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getFirstName().equals(firstName)) {
				return employees[i];
			}
		}
		return null;
	}

	/**
	 * Returns the first employee object that matches the given parameter. This
	 * method is case sensitive.
	 *
	 * @return lastName The matching employee object or null if the name is not found
	 */
	public static Employee getEmployeeByLastName(String lastName) {
		// Gets the last name
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getLastName().equals(lastName)) {
				return employees[i];
			}
		}
		return null;
	}

	/**
	 * Deletes all employee data currently stored in this class
	 */
	public static void deleteAllEmployees() {
		Employee[] newEmployees = new Employee[100];
		employees = newEmployees;
	}
}
