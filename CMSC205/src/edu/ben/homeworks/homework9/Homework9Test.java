package edu.ben.homeworks.homework9;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class Homework9Test {

	@Test
	public void testFile() throws FileNotFoundException {
		File f = new File("monkey.txt");
		Homework9.processTranscript(f);
	}
}
