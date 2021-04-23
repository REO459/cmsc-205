package edu.ben.labs.lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Lab1Test {

	@Test
	public void testDoubleAdd() {
		double a = 8.4;
		double b = 9.6;

		double expected = a + b;

		double actual;
		try {
			actual = Lab1.add(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testDoubleAdd2() {
		double a = 5.5;
		double b = 5.5;

		double expected = a + b;

		double actual;
		try {
			actual = Lab1.add(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testDoubleAdd3() {
		double a = 4.56;
		double b = 7.44;

		double expected = a + b;

		double actual;
		try {
			actual = Lab1.add(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testChar() {
		String text = "This is the count of characters";
		int expected = 3;
		try {
			int actual = Lab1.characterCount('c', text);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testNoChar() {
		String text = "There are none";
		int expected = 0;
		try {
			int actual = Lab1.characterCount('c', text);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testMoreCs() {
		String text = "The c Story on the c Tree with the c boy and the c girl on the c pond";
		int expected = 5;
		try {
			int actual = Lab1.characterCount('c', text);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testFormatUpperCaseText() {
		String expected = "LOREM IPSUM DOLOR SIT AMET";
		try {
			String actual = Lab1.formatText("Lorem ipsum dolor sit amet", FormatType.UPPERCASE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testCrazyLettersLowerCase() {
		String expected = "those letters are going crazy";
		try {
			String actual = Lab1.formatText("tHoSe lEttErs aRe GoIng CrAzy", FormatType.LOWERCASE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testCrazyLettersUpperCase() {
		String expected = "THOSE LETTERS ARE ALL CAPS";
		try {
			String actual = Lab1.formatText("tHoSe lEttErs aRe aLL CaPs", FormatType.UPPERCASE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testFormatLowerCaseText() {
		String expected = "i had a feeling that someone would make the text lowercase";
		try {
			String actual = Lab1.formatText("I HAD A FEELING THAT SOMEONE WOULD MAKE THE TEXT LOWERCASE",
					FormatType.LOWERCASE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testFormatCamelCasePeriod() {
		String expected = "It should capitalize after a period. Right? Wow that is awesome! Really good";
		try {
			String actual = Lab1.formatText(
					"It should capitalize after a period. right? wow that is awesome! really good",
					FormatType.CAMELCASE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testFormatCamelCaseFirstSentence() {
		String expected = "It should capitalize after a period. Right?";
		try {
			String actual = Lab1.formatText("it should capitalize after a period. right?", FormatType.CAMELCASE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testIntAdd() {
		int a = 4;
		int b = 16;

		int expected = a + b;

		int actual;
		try {
			actual = Lab1.add(a, b);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testFloatAdd() {
		float a = 123.00000f;
		float b = 124.00000f;

		float expected = a + b;

		float actual;
		try {
			actual = Lab1.add(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testFloatAdd2() {
		float a = 69.00000f;
		float b = 420.00000f;

		float expected = a + b;

		float actual;
		try {
			actual = Lab1.add(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testDoubleDivide() {
		double a = 4.8;
		double b = 2.4;

		double expected = a / b;

		double actual;
		try {
			actual = Lab1.divide(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testDoubleDivide2() {
		double a = 0.0;
		double b = 2.4;

		double expected = a / b;

		double actual;
		try {
			actual = Lab1.divide(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testIntDivide() {
		int a = 4;
		int b = 2;

		int expected = a / b;

		int actual;
		try {
			actual = Lab1.divide(a, b);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testIntDivide2() {
		int a = 0;
		int b = 2;

		int expected = a / b;

		int actual;
		try {
			actual = Lab1.divide(a, b);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	@Test
	public void testFloatDivide() {
		float a = 65.00000f;
		float b = 5.00000f;

		float expected = a / b;

		float actual;
		try {
			actual = Lab1.divide(a, b);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}

	}

	@Test
	public void testIntDivideZero() {
		int a = 6;
		int b = 0;

		try {
			Lab1.divide(a, b);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void testDoubleDivideZero() {
		double a = 9.6;
		double b = 0;

		try {
			Lab1.divide(a, b);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void testFloatDivideZero() {
		float a = 12.00000f;
		float b = 0;

		try {
			Lab1.divide(a, b);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}
}
