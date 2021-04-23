package edu.ben.labs.lab2;

/**
 * This is lab2test
 * 
 * @author omerb
 * @version 1.0
 */
public interface Lab2Interface {

	/**
	 * Returns the total of all values in the array.
	 * 
	 * @return total total of all values in array
	 */
	double getTotal() throws Exception;

	/**
	 * Returns the average of all values in the array.
	 * 
	 * @return total / count the average in the array
	 */
	int getAverage() throws Exception;

	/**
	 * Accepts integer value representing the row.
	 * 
	 * @param row Row number to total (0...i-1)
	 * 
	 * @return rowSum Returns the sum of the values in the specified row.
	 */
	int getRowTotal(int row) throws Exception;

	/**
	 * Accepts integer value representing the column.
	 * 
	 * @param col Column number to total (0...j-1)
	 * 
	 * @return colSum Returns the sum of the values in the specified column.
	 */
	int getColumnTotal(int col) throws Exception;

	/**
	 * Accepts integer value representing the row.
	 * 
	 * @param row Row number to use for determining highest value (0...i-1)
	 * 
	 * @return highestRow Returns the highest integer value in the row.
	 */
	int getHighestInRow(int row) throws Exception;

	/**
	 * Accepts integer value representing the column.
	 * 
	 * @param col Column number to use for determining highest value (0...j-1)
	 * 
	 * @return highestCol Returns the highest integer value in the column.
	 */
	int getHighestInColumn(int col) throws Exception;

}