package edu.ben.labs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is lab2test
 * 
 * @author omerb
 * @version 1.0
 */
public class Lab2Test {

	@Test
	public void testGetTotal() {
		Lab2 l2 = new Lab2(new int[][] { { 4, 4, 7, 4 } });

		double expected = 19;

		try {
			double actual = l2.getTotal();
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAverage() {
		Lab2 l2 = new Lab2(new int[][] { { 4, 5, 7, 8 } });

		int expected = 6;

		try {
			int actual = l2.getAverage();
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testTotalRow() {
		Lab2 l2 = new Lab2(new int[][] { { 4, 5, 7, 8 } });

		int expected = 24;

		try {
			int actual = l2.getRowTotal(0);
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testTotalCol() {
		Lab2 l2 = new Lab2(new int[][] { { 4 }, { 6 }, { 9 }, { 10 } });

		int expected = 29;

		try {
			int actual = l2.getColumnTotal(0);
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetHighestInRow() {
		Lab2 l2 = new Lab2(new int[][] { { 2, 2, 2, 2 }, { 4, 4, 7, 4 }, { 5, 3, 2, 5 }, { 10 } });
		int expected = 5;

		try {
			int actual = l2.getHighestInRow(2);
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetHighestInCol() {
		Lab2 l2 = new Lab2(new int[][] { { 2, 2, 2, 2 }, { 1, 4, 7, 4 }, { 5, 3, 2, 5 }, { 9, 8, 2, 0 } });
		int expected = 9;

		try {
			int actual = l2.getHighestInColumn(0);
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
