package edu.ben.labs.lab6;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class AlphaPhonebookTest {

	@Test
	public void testDelete() {

		AlphaPhonebook a = new AlphaPhonebook();

		Record x = new Record("Lebron", "James", "6305551234");
		Record y = new Record("Michael", "James", "6305551235");
		Record z = new Record("Donovan", "James", "6305551236");
		Record o = new Record("Benjamin", "Cumberbatch", "6305551237");

		try {
			a.addRecord(o);
			a.addRecord(x);
			a.addRecord(y);
			a.addRecord(z);
		} catch (InvalidInputType e) {
			fail();
		}
		a.deleteRecord(z);
		try {
			a.outputToFile("mytesting3");
		} catch (IOException e) {
			fail();
		}
	}

	@Test
	public void testSearchByLastName() {
		AlphaPhonebook a = new AlphaPhonebook();

		Record x = new Record("Lebron", "James", "6305551234");
		Record y = new Record("Michael", "James", "6305551235");
		Record z = new Record("Donovan", "James", "6305551236");
		Record o = new Record("Benjamin", "Cumberbatch", "6305551237");

		try {
			a.addRecord(o);
			a.addRecord(x);
			a.addRecord(y);
			a.addRecord(z);
		} catch (InvalidInputType e) {
			fail();
		}
		ArrayList<Record> expected = new ArrayList<Record>();
		expected.add(z);
		expected.add(x);
		expected.add(y);
		assertEquals(expected, a.searchByLastName("James"));
	}

	@Test
	public void testSearchByFirstName() {
		AlphaPhonebook a = new AlphaPhonebook();
		
		Record x = new Record("Lebron", "James", "6305551234");
		Record y = new Record("Michael", "James", "6305551235");
		Record z = new Record("Donovan", "James", "6305551236");
		Record o = new Record("Benjamin", "Cumberbatch", "6305551237");
		Record p = new Record("Michael", "Jordan", "6305552345");
		
		try {
			a.addRecord(o);
			a.addRecord(x);
			a.addRecord(y);
			a.addRecord(z);
			a.addRecord(p);
		} catch (InvalidInputType e) {
			fail();
		}
		ArrayList<Record> expected = new ArrayList<Record>();
		expected.add(y);
		expected.add(p);
		assertEquals(expected, a.searchByFirstName("Michael"));
	}
	
	@Test
	public void testSearchByPhoneNumber() {
		
		AlphaPhonebook a = new AlphaPhonebook();
		
		Record x = new Record("Lebron", "James", "6305551234");
		Record y = new Record("Michael", "James", "6305551235");
		Record z = new Record("Donovan", "James", "6305551236");
		Record o = new Record("Benjamin", "Cumberbatch", "6305551237");
		Record p = new Record("Michael", "Jordan", "6305552345");
		
		try {
			a.addRecord(o);
			a.addRecord(x);
			a.addRecord(y);
			a.addRecord(z);
			a.addRecord(p);
		} catch (InvalidInputType e) {
			fail();
		}
		assertEquals(x, a.searchByPhoneNumber("6305551234"));
	}
}
