package edu.ben.homeworks.homework4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void testPeek() throws Exception {

		MyQueue mq = new MyQueue(1);
		mq.enqueue(4);
		Integer expected = 4;
		Integer actual = mq.peek();

		assertEquals(expected, actual);

		mq.dequeue();

		Integer expected2 = null;
		Integer actual2 = mq.peek();

		assertEquals(expected2, actual2);

	}

	@Test
	public void testEnqueue() throws Exception {
		MyQueue mq = new MyQueue(1);

		boolean expected = true;
		boolean actual = mq.enqueue(5);
		assertEquals(expected, actual);

		boolean expected1 = false;
		boolean actual2 = mq.enqueue(3);
		assertEquals(expected1, actual2);

	}

	@Test
	public void testGetSize() throws Exception {
		MyQueue mq = new MyQueue(5);

		mq.enqueue(3);
		mq.enqueue(2);
		mq.enqueue(5);
		mq.dequeue();

		int expected = 2;
		int actual = mq.getSize();

		assertEquals(expected, actual);
	}

	@Test
	public void testIsFull() throws Exception {
		MyQueue mq = new MyQueue(1);
		mq.enqueue(3);

		boolean expected = true;
		boolean actual = mq.isFull();
		assertEquals(expected, actual);

		mq.dequeue();
		boolean expected1 = false;
		boolean actual2 = mq.isFull();
		assertEquals(expected1, actual2);
	}

	@Test
	public void isEmpty() throws Exception {
		MyQueue mq = new MyQueue(1);
		mq.enqueue(3);
		mq.dequeue();

		boolean expected = true;
		boolean actual = mq.isEmpty();
		assertEquals(expected, actual);

		mq.enqueue(3);
		boolean expected1 = false;
		boolean actual2 = mq.isEmpty();
		assertEquals(expected1, actual2);
	}

	@Test
	public void testDequeue() throws Exception {
		MyQueue mq = new MyQueue(2);
		mq.enqueue(3);

		Integer expected = 3;
		Integer actual = mq.dequeue();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCapacity() {
		MyQueue mq = new MyQueue(5);

		mq.enqueue(5);
		mq.enqueue(3);

		int expected = 5;
		int actual = mq.getCapacity();

		assertEquals(expected, actual);

	}

	@Test
	public void testGetRemainingCapacity() {
		MyQueue mq = new MyQueue(10);
		mq.enqueue(2);
		mq.enqueue(3);
		mq.enqueue(5);
		mq.enqueue(2);

		int expected = 6;
		int actual = mq.getRemainingCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void testLargest() throws Exception {
		MyQueue mq = new MyQueue(2);
		mq.enqueue(2);
		mq.enqueue(7);

		Integer expected = 7;
		Integer actual = mq.getLargest();
		assertEquals(expected, actual);

		mq.dequeue();
		mq.dequeue();

		Integer expected2 = null;
		Integer actual2 = mq.getLargest();
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void testSmallest() throws Exception {
		MyQueue mq = new MyQueue(2);
		mq.enqueue(1);
		mq.enqueue(7);
		mq.enqueue(4);
		mq.enqueue(5);

		Integer expected = 1;
		Integer actual = mq.getSmallest();
		assertEquals(expected, actual);

		mq.dequeue();
		mq.dequeue();

		Integer expected2 = null;
		Integer actual2 = mq.getSmallest();
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void testToString() {
		MyQueue mq = new MyQueue(3);
		mq.enqueue(1);
		mq.enqueue(2);
		mq.enqueue(3);
		System.out.println(mq);

		assertEquals("My Queue [array = 1, 2, 3]", mq.toString());
	}

}
