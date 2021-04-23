package edu.ben.labs.lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This is my alphaphonebook interface
 * 
 * @author omerb
 * @version 1.0
 */
public interface AlphaPhonebookInterface {

	/**
	 * Adds a record to the phone book placing it in correct order
	 * 
	 * @param record the record
	 * @throws InvalidInputType Exception if the input is invalid
	 */
	void addRecord(Record record) throws InvalidInputType;

	/**
	 * Deletes a record in the phone book
	 * 
	 * @param record the record to be deleted
	 */
	void deleteRecord(Record record);

	/**
	 * Gets a list of records from a file and adds them to the phonebook
	 * 
	 * @param filepath the name of the file
	 * @throws InvalidInputType Exception if the input is invalid
	 */
	void importDataFromCSV(String filepath) throws InvalidInputType, FileNotFoundException;

	/**
	 * Writes the correctly formatted phone book in a file
	 * 
	 * @param filename the file the output should be written in
	 * @throws IOException if the file could not be found
	 */
	void outputToFile(String filename) throws IOException;

	/**
	 * Creates an ArrayList of records that have the same first name
	 * 
	 * @param firstName the first name that the records should have in common
	 * @return firstNameList records that share that first name
	 */
	ArrayList<Record> searchByFirstName(String firstName);

	/**
	 * Creates an ArrayList of records that have the same last name
	 * 
	 * @param lastName the last name that the records should have in common
	 * @return lastNameList records that share that last name
	 */
	ArrayList<Record> searchByLastName(String lastName);

	/**
	 * Returns a record with a particular phone number or null if none is found
	 * 
	 * @param phoneNumber the number the record should have
	 * @return r the record with the given phone number
	 */
	Record searchByPhoneNumber(String phoneNumber);

	/**
	 * Gets the size of the phone book;
	 * 
	 * @return size the size of the phone book
	 */
	int getSize();

	/**
	 * Returns a formatted string of the phone book
	 * 
	 * @return alphaPhoneBook a formatted string of the phone book
	 */
	String toString();

}