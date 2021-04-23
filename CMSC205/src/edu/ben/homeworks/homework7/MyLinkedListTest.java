package edu.ben.homeworks.homework7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	MyLinkedList<Integer> list = new MyLinkedList<Integer>();

	@Test
	public void testAdd() {
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(2);
		String expected = "[3][1][2][5][2]";
		String actual = list.toString();
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testClear() {
		list.add(3);
		list.add(2);
		list.clear();
		String expected = "";
		String actual = list.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testRemove() {
		list.add(3);
		Object expected = 3;
		Object actual = list.remove();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveLast() {
		list.add(3);
		list.add(5);
		Object expected = 5;
		Object actual = list.removeLast();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSize() {
		list.add(3);
		list.add(5);
		int expected = 2;
		int actual = list.getSize();
		assertEquals(expected, actual);
	}
	
	
	
}
