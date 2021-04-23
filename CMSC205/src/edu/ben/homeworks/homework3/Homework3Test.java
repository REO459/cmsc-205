package edu.ben.homeworks.homework3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Homework3Test {

	@Test
	public void test() {
		String hexString = "D1CE";

		int expected = 53710;

		int actual;
		try {
			actual = Homework3.parseHex(hexString);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void test2() {
		String hexString = "53DC7C";

		int expected = 5495932;

		int actual;
		try {
			actual = Homework3.parseHex(hexString);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void test3() {
		String hexString = "64AA7";

		int expected = 412327;

		int actual;
		try {
			actual = Homework3.parseHex(hexString);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

}
