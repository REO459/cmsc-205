package edu.ben.labs.lab3;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class Lab3Test {

	@Test
	public void test() {

		double[][] expected = { { 0.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 0.00 },
				{ 50.00, 50.23, 50.44, 50.61, 50.74, 50.80, 50.80, 50.74, 50.61, 50.44, 50.23, 50.00 },
				{ 50.00, 50.44, 50.84, 51.17, 51.41, 51.54, 51.54, 51.41, 51.17, 50.84, 50.44, 50.00 },
				{ 50.00, 50.61, 51.17, 51.64, 51.98, 52.15, 52.15, 51.98, 51.64, 51.17, 50.61, 50.00 },
				{ 50.00, 50.74, 51.41, 51.98, 52.38, 52.59, 52.59, 52.38, 51.98, 51.41, 50.74, 50.00 },
				{ 50.00, 50.80, 51.54, 52.15, 52.59, 52.82, 52.82, 52.59, 52.15, 51.54, 50.80, 50.00 },
				{ 50.00, 50.80, 51.54, 52.15, 52.59, 52.82, 52.82, 52.59, 52.15, 51.54, 50.80, 50.00 },
				{ 50.00, 50.74, 51.41, 51.98, 52.38, 52.59, 52.59, 52.38, 51.98, 51.41, 50.74, 50.00 },
				{ 50.00, 50.61, 51.17, 51.64, 51.98, 52.15, 52.15, 51.98, 51.64, 51.17, 50.61, 50.00 },
				{ 50.00, 50.44, 50.84, 51.17, 51.41, 51.54, 51.54, 51.41, 51.17, 50.84, 50.44, 50.00 },
				{ 50.00, 50.23, 50.44, 50.61, 50.74, 50.80, 50.80, 50.74, 50.61, 50.44, 50.23, 50.00 },
				{ 0.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 50.00, 0.00 } };

		File file = new File("lab3thermalplateSAMPLE.input");
		try {
			Plate[] plates = Lab3.processTempsFromFile(file, 1);
			assertNotNull(plates);

			double[][] actual = plates[0].getPlate();
			for (int i = 0; i < expected.length; i++) {
				for (int j = 0; j < expected[i].length; j++) {
					assertEquals(expected[i][j], actual[i][j], .1);
				}
			}
		} catch (FileNotFoundException e) {
			fail("This should not have thrown an exception");
		}
	}
}