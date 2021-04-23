package edu.ben.homeworks.homework5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void testPeek() {
		MyStack ms = new MyStack();

		ms.push("how are you");
		Object expected1 = "how are you";
		Object actual1 = ms.peek();
		assertEquals(expected1, actual1);

		ms.push("a");
		Object expected2 = "a";
		Object actual2 = ms.peek();
		assertEquals(expected2, actual2);

		ms.push(3);
		Object expected = 3;
		Object actual = ms.peek();
		assertEquals(expected, actual);
	}

	@Test
	public void testPush() {
		MyStack ms = new MyStack();

		ms.push("a");
		Object expected2 = "a";
		Object actual2 = ms.peek();
		assertEquals(expected2, actual2);

		ms.push("b");
		Object expected3 = "b";
		Object actual3 = ms.peek();
		assertEquals(expected3, actual3);

		ms.push("c");
		Object expected4 = "c";
		Object actual4 = ms.peek();
		assertEquals(expected4, actual4);
	}

	@Test
	public void testPop() {
		MyStack ms = new MyStack();

		ms.push(3);
		ms.push(4);
		ms.pop();
		Object expected = 3;
		Object actual = ms.peek();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSize() {
		MyStack ms = new MyStack();

		int expected = 0;
		int actual = ms.getSize();
		assertEquals(expected, actual);

		ms.push(3);
		int expected1 = 1;
		int actual1 = ms.getSize();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGetCapacity() {
		MyStack ms = new MyStack();

		int expected = 1;
		int actual = ms.getCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRemainingCapacity() {
		MyStack ms = new MyStack();

		int expected = 1;
		int actual = ms.getRemainingCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsFull() {
		MyStack ms = new MyStack();

		ms.push(3);
		boolean expected = true;
		boolean actual = ms.isFull();
		assertEquals(expected, actual);

		ms.pop();
		boolean expected1 = false;
		boolean actual1 = ms.isFull();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testIsEmpty() {
		MyStack ms = new MyStack();

		boolean expected = true;
		boolean actual = ms.isEmpty();
		assertEquals(expected, actual);

		ms.push("a");
		boolean expected1 = false;
		boolean actual1 = ms.isEmpty();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testToString() {
		MyStack ms = new MyStack();

		ms.push(3);
		ms.push(2);
		ms.push("a");
		assertEquals("My Stack [array = 3, 2, a]", ms.toString());
	}

	@Test
	public void testAddAll() {
		MyStack ms = new MyStack();
		ms.push(2);
		ms.push(2);
		Object[] array = { 3, 2, 4, "a" };

		ms.addAll(array);

		boolean expected = true;
		boolean actual = ms.addAll(array);
		assertEquals(expected, actual);

	}

	@Test
	public void testContains() {
		MyStack ms = new MyStack();

		ms.push(3);
		boolean expected = true;
		boolean actual = ms.contains(3);
		assertEquals(expected, actual);
	}

	@Test
	public void testContainsAll() {
		MyStack ms = new MyStack();

		ms.push(3);
		ms.push(5);
		Object[] array = { 5, 3 };
		ms.containsAll(array);

		boolean expected = true;
		boolean actual = ms.containsAll(array);
		assertEquals(expected, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToArray() {
		MyStack ms = new MyStack();

		ms.push(1);
		ms.push(3);
		Object[] expected = { 1, 3 };
		Object[] actual = ms.toArray();
		assertEquals(expected, actual);
	}

}
