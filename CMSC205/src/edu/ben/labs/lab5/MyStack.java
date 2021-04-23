package edu.ben.labs.lab5;

/**
 * This is my stack
 * 
 * @author omerb
 * @version 1.0
 */
public class MyStack {

	/**
	 * class variables
	 */
	private Object[] array;
	private int counter;

	/**
	 * constructor for the stack
	 * 
	 * @param size is the size of the stack
	 */
	public MyStack(int size) {
		array = new Object[size];
		counter = 0;

	}

	/**
	 * peek will look at the top of the stack without removing it
	 * 
	 * @return null the top of the stack, null if it's empty
	 */
	public Object peek() {
		if (isEmpty()) {
			return null;
		}
		if (array != null) {
			return array[counter - 1];
		}
		return null;

	}

	/**
	 * push will pass in an object and 'push' it to the bottom of the stack expand
	 * the array if not enough room
	 * 
	 * @param o which is an object that will be passed in
	 */
	public void push(Object o) {

		if (counter < array.length) {
			array[counter++] = o;
		} else {

			Object[] newArray = new Object[array.length + 1];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			array[counter++] = o;
		}
	}

	/**
	 * pop will remove an object from the top of the stack
	 * 
	 * @return null if empty or the object at the top of the stack
	 */
	public Object pop() {
		if (!isEmpty()) {
			return array[--counter];
		}
		return null;
	}

	/**
	 * get's how many objects are in the stack
	 * 
	 * @return counter the number of objects in the stack
	 */
	public int getSize() {
		return counter;
	}

	/**
	 * the entire length of the stack
	 * 
	 * @return the length of the array
	 */
	public int getCapacity() {
		return array.length;
	}

	/**
	 * should be the remainder of the size of the stack - the objects in the stack
	 * 
	 * @return the remaining capacity
	 */
	public int getRemainingCapacity() {
		return array.length - counter;
	}

	/**
	 * gets the object at the specific index
	 * 
	 * @param index the specified index of the stack
	 * @return array[index] the object at the index
	 */
	public Object get(int index) {
		return array[index];

	}

	/**
	 * the stack is full
	 * 
	 * @return the objects are = to the size of the stack
	 */
	public boolean isFull() {
		return counter == array.length;
	}

	/**
	 * if the stack is empty, this will return 0
	 * 
	 * @return counter is 0 because there's nothing in the stack
	 */
	public boolean isEmpty() {
		return counter == 0;
	}

	/**
	 * converts the stack to a string
	 * 
	 * @return the string
	 */
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < counter; i++) {
			s = s + array[i] + "\n";
		}
		return s;
	}

	/**
	 * adds the objects in an array to the array that we made
	 * 
	 * @param o which are the objects that will be created in the reference tests
	 * @return true since it will all be added
	 */
	public boolean addAll(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			push(o[i]);
		}
		return true;
	}

	/**
	 * check if the object that will be passed in to the test is contained in the
	 * stack
	 * 
	 * @param o the object passed in
	 * @return false is empty, true if contains the object, otherwise false
	 */
	public boolean contains(Object o) {
		if (isEmpty()) {
			return false;
		}

		for (int i = 0; i < counter; i++) {
			if (array[i] == o) {
				return true;
			}
		}
		return false;
	}

	/**
	 * will check if the array of objects passed in is contained in the stack
	 * 
	 * @param o the array of objects
	 * @return true if it's contained, false if it's not
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
	 * the stack itself
	 * 
	 * @return temp the temp variable which is equal to the array so no one can change it
	 */
	public Object[] toArray() {
		Object[] temp = new Object[array.length];
		for (int i = 0; i < counter; i++) {
			temp[i] = array[i];
		}
		return temp;
	}
}