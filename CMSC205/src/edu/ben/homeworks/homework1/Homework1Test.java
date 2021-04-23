package edu.ben.homeworks.homework1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Homework1Test {

	@Test
	public void testConnectFour() {
		int[][] values = { { 0, 1, 0, 3, 1, 6, 1 }, { 0, 1, 6, 0, 1 }, { 5, 6, 1, 1, 9, 1 }, { 1, 3, 6, 1, 4, 0, 7 },
				{ 3, 3, 3, 3, 4, 0, 7 } };
		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}

	}

	@Test
	public void testConnectFour2() {
		int[][] values = { { 0, 1, 0, 3, 1, 6, 1 }, { 0, 1, 6, 8, 6, 0, 1 }, { 5, 5, 2, 1, 8, 2, 9 },
				{ 6, 5, 6, 1, 1, 9, 1 }, { 1, 5, 6, 1, 4, 0, 7 }, { 3, 5, 3, 3, 4, 0, 7 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}

	}

	@Test
	public void testConnectFour3() {
		int[][] values = { { 0, 1 } };

		boolean expected = false;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour4() {
		int[][] values = { { 0, 1, 0, 3, 1, 6, 1 }, { 0, 1, 6, 8, 6, 0, 1 }, { 5, 6, 2, 1, 6, 2, 9 },
				{ 6, 5, 6, 6, 1, 9, 1 }, { 1, 3, 6, 1, 4, 0, 7 }, { 3, 6, 3, 3, 4, 0, 7 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour5() {
		int[][] values = { { 0, 1, 0, 3, 1, 6, 1 }, { 0, 1, 6, 8, 6, 0, 1 }, { 9, 6, 2, 1, 8, 2, 9 },
				{ 6, 9, 6, 1, 1, 9, 1 }, { 1, 3, 9, 1, 4, 0, 7 }, { 3, 3, 3, 9, 4, 0, 7 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour6() {
		int[][] values = { { 9, 8, 7, 5, 7, 8, 4 }, { 0, 1, 6, 8, 6, 0, 1 }, { 9, 6, 2, 8, 8, 2, 9 },
				{ 6, 8, 6, 1, 1, 9, 1 }, { 1, 3, 3, 0, 4, 0, 7 }, { 2, 4, 6, 4, 4, 0, 7 } };

		boolean expected = false;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour7() {
		int[][] values = { { 1, 8, 7, 5, 7, 8, 4, 0, 8 }, { 0, 1, 6, 8, 6, 0, 1, 4, 6 }, { 5, 8, 1, 8, 8, 2, 9, 7, 6 },
				{ 6, 8, 6, 1, 1, 9, 1, 7, 4 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour8() {
		int[][] values = { { 1, 8, 7, 5, 7, 8, 4, 0, 8 }, { 0, 1, 6, 8, 6, 0, 1, 4, 6 },
				{ 5, 8, 1, 8, 8, 2, 9, 7, 6 } };
		boolean expected = false;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour9() {
		int[][] values = { { 4, 4, 4, 4 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testConnectFour10() {
		int[][] values = { { 1, 0, 3, 4 }, { 1, 0, 3, 4 } };

		boolean expected = false;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testConnectFour11() {
		int[][] values = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testConnectFour12() {
		int[][] values = { { 1 }, { 1 }, { 1 }, { 1 } };

		boolean expected = true;

		try {
			boolean actual = Homework1.isConsecutiveFour(values);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
}
