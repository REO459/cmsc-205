package edu.ben.labs.lab6;

import java.util.Formatter;

/**
 * This is my record
 * 
 * @author omerb
 * @version 1.0
 */
public class Record {

	// string varables
	private String firstName;
	private String lastName;
	private String phoneNumber;

	/**
	 * This is my constructor
	 * 
	 * @param firstName   the first name
	 * @param lastName    the last name
	 * @param phoneNumber the phone number
	 */
	public Record(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * gets first name
	 * 
	 * @return firstName the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * sets first name
	 * 
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * gets last name
	 * 
	 * @return lastName the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * sets last name
	 * 
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * gets phone number
	 * 
	 * @return phoneNumber the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * sets phone number
	 * 
	 * @param phoneNumber the phonenumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Prints to string
	 * 
	 * @return record string
	 */
	public String toString() {
		Formatter f = new Formatter();
		// Putting phone number in standard format
		String phoneNumberEdit = "";
		phoneNumberEdit += "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-"
				+ phoneNumber.substring(6);
		String name = lastName + ", " + firstName;
		// Set column width to 19 and right align the name
		String record = f.format("%20s", name) + "\t" + phoneNumberEdit;
		f.close();
		return record;
	}

	/**
	 * Compares obj
	 * 
	 * @param o object
	 * @return this.lastName.compareTo(r.lastName) record
	 */
	public int compareTo(Object o) {
		Record r = (Record) o;
		if (this.lastName.equals(r.lastName)) {
			return this.firstName.compareTo(r.firstName);
		} else {
			return this.lastName.compareTo(r.lastName);
		}
	}

	/**
	 * equals to obj
	 * 
	 * @param obj obj
	 * @return this.firstName.equals(o.firstName) &&
	 *         this.lastName.equals(o.lastName) &&
	 *         this.phoneNumber.equals(o.phoneNumber); boolean
	 */
	public boolean equals(Object obj) {
		Record o = null;
		if (obj instanceof Record) {
			o = (Record) obj;
		}
		return this.firstName.equals(o.firstName) && this.lastName.equals(o.lastName)
				&& this.phoneNumber.equals(o.phoneNumber);
	}
}
