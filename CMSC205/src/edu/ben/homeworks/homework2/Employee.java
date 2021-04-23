package edu.ben.homeworks.homework2;

/**
 * This is my employee class
 * 
 * @author omerb
 * @version 1.0
 */
public class Employee {
	/**
	 * Gets the first name
	 */
	public String firstName;
	/**
	 * Gets the last name
	 */
	public String lastName;
	/**
	 * Gets the salary
	 */
	public String salary;
	/**
	 * Gets the start date
	 */
	public String startDate;

	/**
	 * 
	 * @param firstName get first name
	 * @param lastName  get last name
	 * @param salary    get salary
	 * @param startDate get date
	 */
	public Employee(String firstName, String lastName, String salary, String startDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.startDate = startDate;
	}

	/**
	 * 
	 * @param firstName get first name
	 */
	public Employee(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return firstName returns the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName sets the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return lastName returns the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName sets the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return salary gets the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param salary sets the salary
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * @return startDate gets the start date
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 
	 * @param startDate sets the start date
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
