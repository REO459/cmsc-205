package edu.ben.homeworks.homework8;

import static org.junit.Assert.assertEquals;
import java.util.LinkedList;

import org.junit.Test;


public class Homework8Test {
	
	@Test
	public void testAscendingSort() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(10);
		
		LinkedList<Integer> actual = Homework8.sortListAscending(list);
		Integer[] expected = { 1, 3, 4, 5, 7, 8, 9, 10 };
		int i = 0;
		for (Integer val : actual) {
			assertEquals(val, expected[i++]);
		}
 	}
	
	@Test
	public void testDescendingSort() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(10);
		
		LinkedList<Integer> actual = Homework8.sortListDescending(list);
		Integer[] expected = { 10, 9, 8, 7, 5, 4, 3, 1 };
		int i = 0;
		for (Integer val : actual) {
			assertEquals(val, expected[i++]);
		}
 	}
	
	@Test
	public void displayList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(10);
		
		String actual = Homework8.displayList(list);
		String expected = "[5, 8, 4, 3, 1, 9, 7, 10]";
		assertEquals(expected, actual);
 	}
	
	@Test
	public void testRemoveLargest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(10);
		
		LinkedList<Integer> actual = Homework8.removeLargestValue(list);
		Integer[] expected = {5, 8, 4, 3, 1, 9, 7};
		int i = 0;
		for (Integer val : actual) {
			assertEquals(val, expected[i++]);
		}
 	}
	
	@Test
	public void testRemoveSmallest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(10);
		
		LinkedList<Integer> actual = Homework8.removeSmallestValue(list);
		Integer[] expected = {5, 8, 4, 3, 9, 7, 10};
		int i = 0;
		for (Integer val : actual) {
			assertEquals(val, expected[i++]);
		}
 	}

}
