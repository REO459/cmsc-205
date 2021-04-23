package edu.ben.homeworks.homework2;

/**
 * This is my manager class
 * 
 * @author omerb
 * @version 1.0
 */
public class Manager extends Employee {
	
	/**
	 * Counts the employees
	 */
	public static int employeeCounter;

	/**
	 * 
	 * @param firstName gets first name
	 * @param lastName gets last name
	 * @param salary gets salary
	 * @param startDate gets start date
	 */
	public Manager(String firstName, String lastName, String salary, String startDate) {
		super(firstName, lastName, salary, startDate);
		System.out.println(employeeCounter);
	}
	
}
