package edu.ben.homeworks.homework6;

import org.junit.Test;

import student.TestCase;

public class Homework6Test extends TestCase {

	@Test
	public void testWhistles() {
		try {
			Homework6.startCandyGame("1000 100 10 2");
			assertEquals("19 whistle blows\n", systemOut().getHistory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testForeverGame() {
		try {
			Homework6.startCandyGame(
					"35 45 55 65 75 85 95 105 115 125 135 145 155 165 175 185 195 205 215 225 235 245 255 265 275 285 295 305 315 325");
			assertEquals("Game goes on forever\n", systemOut().getHistory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
