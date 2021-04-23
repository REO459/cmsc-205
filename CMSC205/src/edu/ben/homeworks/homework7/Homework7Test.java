package edu.ben.homeworks.homework7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Homework7Test {

	MyLinkedList<Integer> list = new MyLinkedList<Integer>();
	MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();

	@Test
	public void testAddTo() {
		Homework7 linkedlist = new Homework7();
		list.add(5);
		list.add(2);
		linkedlist.addTo(list.getHead(), -5);

		String expected = "[0][-3]";
		String actual = list.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCountOdd() {
		Homework7 linkedlist = new Homework7();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);

		int expected = 3;
		int actual = linkedlist.countOdds(list.getHead());
		assertEquals(expected, actual);
	}

	@Test
	public void testCountEven() {
		Homework7 linkedlist = new Homework7();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(8);

		int expected = 4;
		int actual = linkedlist.countEvens(list.getHead());
		assertEquals(expected, actual);
	}

	@Test
	public void testisAscendingOrder() {
		Homework7 linkedlist = new Homework7();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		boolean expected = true;
		boolean actual = linkedlist.isAscendingOrder(list.getHead());
		assertEquals(expected, actual);
	}

	@Test
	public void testisNotAscendingOrder() {
		Homework7 linkedlist = new Homework7();
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(1);

		boolean expected = false;
		boolean actual = linkedlist.isAscendingOrder(list.getHead());
		assertEquals(expected, actual);
	}

	@Test
	public void testDotProduct() {
		Homework7 linkedlist = new Homework7();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);

		int expected = 30;
		int actual = linkedlist.dotProduct(list.getHead(), list2.getHead());
		assertEquals(expected, actual);
	}
}
