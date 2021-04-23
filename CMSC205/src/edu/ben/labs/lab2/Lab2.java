package edu.ben.labs.lab2;

/**
 * This is Lab2
 * 
 * @author omerb
 * @version 1.0
 */
public class Lab2 implements Lab2Interface {
	/**
	 * This is the array
	 */
	private static int[][] array;

	/**
	 * 
	 * @param array the array that is created
	 */
	public Lab2(int[][] array) {
		super();
		Lab2.array = array;
	}

	/**
	 * Returns the total of all values in the array.
	 * 
	 * @return total total of all values in array
	 */
	@Override
	public double getTotal() throws Exception {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
		}
		return total;
	}

	/**
	 * Returns the average of all values in the array.
	 * 
	 * @return total / count the average in the array
	 */
	@Override
	public int getAverage() throws Exception {
		int count = 0;
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				count++;
				total += array[i][j];
			}
		}
		return total / count;
	}

	/**
	 * Accepts integer value representing the row.
	 * 
	 * @param row Row number to total (0...i-1)
	 * 
	 * @return rowSum Returns the sum of the values in the specified row.
	 */
	@Override
	public int getRowTotal(int row) throws Exception {
		int rowSum = 0;
		for (int i = 0; i < array[row].length; i++) {
			rowSum += array[row][i];
		}
		return rowSum;
	}

	/**
	 * Accepts integer value representing the column.
	 * 
	 * @param col Column number to total (0...j-1)
	 * 
	 * @return colSum Returns the sum of the values in the specified column.
	 */
	@Override
	public int getColumnTotal(int col) throws Exception {
		int colSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (col < array[i].length) {
				colSum += array[i][col];
			}
		}
		return colSum;
	}

	/**
	 * Accepts integer value representing the row.
	 * 
	 * @param row Row number to use for determining highest value (0...i-1)
	 * 
	 * @return highestRow Returns the highest integer value in the row.
	 */
	@Override
	public int getHighestInRow(int row) throws Exception {
		int highestRow = array[row][0];
		for (int j = 0; j < array[row].length; j++) {
			if (array[row][j] > highestRow) {
				highestRow = array[row][j];
			}
		}
		return highestRow;
	}

	/**
	 * Accepts integer value representing the column.
	 * 
	 * @param col Column number to use for determining highest value (0...j-1)
	 * 
	 * @return highestCol Returns the highest integer value in the column.
	 */
	@Override
	public int getHighestInColumn(int col) throws Exception {
		int highestCol = array[0][col];
		for (int i = 0; i < array.length; i++) {
			if (array[i][col] > highestCol) {
				highestCol = array[i][col];
			}
		}
		return highestCol;
	}

}
