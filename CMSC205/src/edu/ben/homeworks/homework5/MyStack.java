package edu.ben.homeworks.homework5;


/**
 * This is homework 5
 * 
 * @author omerb
 * @version 1.0
 */
public class MyStack {

	/**
	 * the array of the stack
	 */
	private Object[] stack;
	private static final int DEFAULT_SIZE = 1;
	private int counter;

	/**
	 * the constructor
	 */
	public MyStack() {
		stack = new Object[DEFAULT_SIZE];
		counter = 0;
	}

	/**
	 * 
	 * @return null if the stack it's empty
	 */
	public Object peek() {
		if (stack != null) {
			return stack[counter - 1];
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param o object that will be passed in
	 */
	public void push(Object o) {

		if (counter < stack.length) {
			stack[counter++] = o;
		} else {
			Object[] newArray = new Object[stack.length + 1];
			for (int i = 0; i < stack.length; i++) {
				newArray[i] = stack[i];
			}
			stack = newArray;
			stack[counter++] = o;
		}
	}

	/**
	 * 
	 * @return null if empty or the object at the top of the stack
	 */
	public Object pop() {
		if (!isEmpty()) {
			return stack[--counter];
		}
		return null;
	}

	/**
	 * 
	 * @return counter the size of the stack
	 */
	public int getSize() {
		return counter;
	}

	/**
	 * 
	 * @return stack.length shows how much there is in a stack
	 */
	public int getCapacity() {
		return stack.length;
	}

	/**
	 * 
	 * @return stack.length - counter shows how much is left in the stack
	 */
	public int getRemainingCapacity() {
		return stack.length - counter;
	}

	/**
	 * 
	 * @return counter == stack.length Checks to see if the stack is full
	 */
	public boolean isFull() {
		return counter == stack.length;
	}

	/**
	 * 
	 * @return counter == 0 so the stack is empty there
	 */
	public boolean isEmpty() {
		return counter == 0;
	}

	/**
	 * @return s + "]" returns a string of a stack
	 */
	@Override
	public String toString() {
		String s = "My Stack [array = ";
		for (int i = 0; i < counter; i++) {
			if (i > 0) {
				s += ", ";
			}
			s = s + stack[i];
		}
		return s + "]";
	}

	/**
	 * 
	 * @param o objects that will be created in the reference tests
	 * @return true that it will add all
	 */
	public boolean addAll(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			push(o[i]);
		}
		return true;
	}

	/**
	 * 
	 * @param o the object passed in
	 * @return false if it does not contain an object
	 */
	public boolean contains(Object o) {
		if (isEmpty()) {
			return false;
		}

		for (int i = 0; i < counter; i++) {
			if (stack[i] == o) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param o the object passed in
	 * @return true if it contains all
	 */
	public boolean containsAll(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			if (!contains(o[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @return temp to make it into an array
	 */
	public Object[] toArray() {
		Object[] temp = new Object[stack.length];
		for (int i = 0; i < counter; i++) {
			temp[i] = stack[i];
		}
		return temp;
	}

}

