package edu.ben.homeworks.homework10;

import org.junit.Test;

import student.TestCase;

public class Homework10Test extends TestCase {

	@Test
	public void test() {
		String input = "2\n6 4\n5\n2 3 2 3 2\n0\n";
		String expected = "2 iterations\n12 is not a triangular number\n";
		setSystemIn(input);
		Homework10.main(null);
		String actual = systemOut().getHistory();
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		String input = "3\n4 3 3\n1\n1\n0\n";
		String expected = "9 iterations\n0 iterations\n";
		setSystemIn(input);
		Homework10.main(null);
		String actual = systemOut().getHistory();
		assertEquals(expected, actual);
	}

}
