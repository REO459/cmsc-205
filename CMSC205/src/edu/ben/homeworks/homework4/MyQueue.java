package edu.ben.homeworks.homework4;

/**
 * This is homework 4
 * 
 * @author omerb
 * @version 1.0
 */
public class MyQueue {
	
	/**
	 * the array of the queue
	 */
	private int[] queue;
	/**
	 * how much is in the queue
	 */
	private int counter = 0;

	/**
	 * 
	 * @param i the number in the array
	 */
	public MyQueue(int i) {
		queue = new int[i];
	}

	/**
	 * 
	 * @return queue[0] the first thing in the queue if the queue is not empty
	 */
	public Integer peek() {
		if (isEmpty()) {
			return null;
		}
		return queue[0];
	}

	/**
	 * 
	 * @param insert adds an element to the side
	 * @return false if the counter exceeds the length of the queue
	 */
	public boolean enqueue(Integer insert) {
		if (counter < queue.length) {
			queue[counter] = insert;
			counter++;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return counter the size of the queue
	 */
	public int getSize() {
		return counter;
	}

	/**
	 * 
	 * @return counter == queue.length Checks to see if the queue is full
	 */
	public boolean isFull() {
		return counter == queue.length;
	}

	/**
	 * 
	 * @return counter == 0 so the queue is empty there
	 */
	public boolean isEmpty() {
		return counter == 0;
	}

	/**
	 * 
	 * @return temp the dequeue of the queue
	 */
	public Integer dequeue() {
		if (isEmpty()) {
			return null;
		}
		if (queue.length == 1) {
			counter--;
			return queue[0];
		}
		int temp = queue[0];
		counter--;
		for (int i = 0; i < counter; i++) {
			queue[i] = queue[i + 1];
		}
		return temp;
	}

	/**
	 * 
	 * @return queue.length shows how much there is in a queue
	 */
	public int getCapacity() {
		return queue.length;
	}

	/**
	 * 
	 * @return queue.length - counter shows how much is left in the queue
	 */
	public int getRemainingCapacity() {
		return queue.length - counter;
	}

	/**
	 * 
	 * @return largest gets the largest number in a queue
	 */
	public Integer getLargest() {

		if (isEmpty()) {
			return null;
		}
		int largest = queue[0];

		for (int i = 0; i < counter; i++) {
			largest = Math.max(largest, queue[i]);
		}
		return largest;
	}

	/**
	 * 
	 * @return smallest gets the smallest number in a queue
	 */
	public Integer getSmallest() {

		if (isEmpty()) {
			return null;
		}
		int smallest = queue[0];
		for (int i = 0; i < counter; i++) {
			smallest = Math.min(smallest, queue[i]);
		}
		return smallest;
	}

	/**
	 * @return s + "]" returns a string of a queue
	 */
	@Override
	public String toString() {
		String s = "My Queue [array = ";
		for (int i = 0; i < counter; i++) {
			if (i > 0) {
				s += ", ";
			}
			s = s + queue[i];
		}
		return s + "]";
	}
}
