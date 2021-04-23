package edu.ben.homeworks.homework7;

/**
 * This is my node
 * 
 * @author omerb
 * @param <E> the node of the linked list
 * @version 1.0
 */
public class Node<E> {
	private E value;
	private Node<E> next;
	
	/**
	 * 
	 * @param value the value of the list
	 */
	public Node(E value) {
		this.value = value;
	}

	/**
	 * 
	 * @return value gets the values of the list
	 */
	public E getValue() {
		return value;
	}

	/**
	 * 
	 * @param value sets the value of the list
	 */
	public void setValue(E value) {
		this.value = value;
	}

	/**
	 * 
	 * @return next gets the next value of a list
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * 
	 * @param next sets the next value of a list
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

}
