package edu.ben.homeworks.homework1;

/**
 * This is my homework 1
 * 
 * @author omerb
 * @version 1.0
 */
public final class Homework1 {

	/**
	 * throws exception of the unsupported operation
	 */
	private Homework1() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param values
	 * @return false
	 */
	public static boolean isConsecutiveFour(int[][] values) {

		// This loop checks the rows
		for (int i = 0; i < values.length; i++) {
			int board = values[i][0];
			int connectFour = 0;
			for (int j = 0; j < values[i].length; j++) {

				if (values[i][j] == board) {
					connectFour++;
					if (connectFour == 4) {
						return true;
					}
				} else {
					board = values[i][j];
					connectFour = 1;
				}
			}
		}
		// This loop check the columns
		for (int j = 0; j < values[0].length; j++) {
			int connectFour = 0;
			int board = values[0][j];

			for (int i = 0; i < values.length; i++) {

				if (values[i][j] == board) {
					connectFour++;
					if (connectFour == 4) {
						return true;
					}
				} else {
					board = values[i][j];
					connectFour = 1;
				}

			}
		}

		// This loops checks left when going up right
		for (int i = values.length - 1; i > 0; i--) {
			int y = i;
			int x = 0;
			int connect = 0;
			int board = values[y][x];

			while (y >= 0) {
				if (values[y][x] == board) {
					connect++;
					if (connect == 4) {
						return true;
					}
				} else {
					connect = 1;
					board = values[y][x];
				}
				x++;
				y--;
			}
		}

		// This loops checks right when going up right
		for (int j = 0; j < values[0].length; j++) {
			int y = values.length - 1;
			int x = j;
			int connect = 0;
			int board = values[y][x];

			while (x < values[0].length && y >= 0) {
				if (values[y][x] == board) {
					connect++;
					if (connect == 4) {
						return true;
					}
				} else {
					connect = 1;
					board = values[y][x];
				}
				x++;
				y--;
			}

		}

		// This loops checks the left when going up left
		for (int j = values[0].length - 1; j > 0; j--) {

			int x = j;
			int y = values.length - 1;
			int board = values[y][x];
			int connectFour = 0;

			while (x >= 0 && y >= 0) {

				if (values[y][x] == board) {
					connectFour++;
					if (connectFour == 4) {
						return true;
					}
				} else {
					connectFour = 1;
					board = values[y][x];
				}

				x--;
				y--;
			}
		}
		// This loops checks the right when going up left
		for (int row = 1; row < values.length; row++) {
			int x = values[0].length - 1;
			int y = row;
			int connect = 0;
			int board = values[y][x];

			while (y >= 0) {
				if (values[y][x] == board) {
					connect++;
					if (connect == 4) {
						return true;
					}
				} else {
					connect = 1;
					board = values[y][x];
				}
				x--;
				y--;
			}

		}
		return false;
	}

}
