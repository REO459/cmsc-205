package edu.ben.assignments.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import student.TestCase;

public class test extends TestCase {

	@Test
	public void testArea() {
		Rectangle rectangle = new Rectangle(4,2);
		float w = 4;
		float l = 2;

		float expected = w * l;

		float actual;
		try {
			actual = rectangle.computeArea(4,2);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testIncreaseDimensions() {
		Rectangle rectangle = new Rectangle(4,2);
		rectangle.increaseDimensions(1,1);

		try {
			assertEquals(rectangle.getWidth(), 5, 0);
			assertEquals(rectangle.getLength(), 3, 0);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	
	@Test
	public void testDiagonal() {
		Rectangle rectangle = new Rectangle(4,2);
		float w = 4;
		float l = 2;

		float expected = (float) Math.sqrt(w * w + l * l);

		float actual;
		try {
			actual = rectangle.computeDiagonal(4,2);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	
	@Test
	public void testGreaterDimensionWidth() {
		Rectangle rectangle = new Rectangle(4,2);
		rectangle.findGreaterDimension(4,2);

		try {
			assertEquals("Width is greater\n", systemOut().getHistory());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testGreaterDimensionLength() {
		Rectangle rectangle = new Rectangle(2,4);
		rectangle.findGreaterDimension(2,4);

		try {
			assertEquals("Length is greater\n", systemOut().getHistory());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testGreaterDimensionEqual() {
		Rectangle rectangle = new Rectangle(4,4);
		rectangle.findGreaterDimension(4,4);

		try {
			assertEquals("Width and length are equal\n", systemOut().getHistory());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testIsSquare() {
		Rectangle rectangle = new Rectangle(4,4);

		boolean expected = true;

		boolean actual;
		try {
			actual = rectangle.isSquare();
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testIsNotSquare() {
		Rectangle rectangle = new Rectangle(4,2);

		boolean expected = false;

		boolean actual;
		try {
			actual = rectangle.isSquare();
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testWithdraw() {
		Account account = new Account(180);
		account.withdraw(120);
		try {
			assertEquals(account.getBalance(), 60, 0);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
		
		@Test
		public void testDeposit() {
			Account account = new Account(180);
			account.deposit(120);
			try {
				assertEquals(account.getBalance(), 300, 0);
			} catch (Exception e) {
				fail("Should not have thrown exception");
			}
	}
		
		@Test
		public void testAccrueInterest() {
			SavingsAccount account = new SavingsAccount(180, 120);
			account.accrueInterest();
			try {
				assertEquals(account.getBalance(), 21780, 0);
			} catch (Exception e) {
				fail("Should not have thrown exception");
			}
	}	
	
}
