package edu.ben.sandbox;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void test() {
		
		int a = 10;
		int b = 2;
		
		int expected = a / b;
		
		int actual;
		try {
			actual = Sample.divide(a, b);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
		
	}
	
	@Test
	public void testDivZero() {
		
		int a = 10;
		int b = 0;
		
		try {
			Sample.divide(a, b);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
		
	}

}