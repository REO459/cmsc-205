package edu.ben.labs.lab6;

import java.util.ArrayList;

/**
 * This is my my linked list interface
 * 
 * @author omerb
 * @param <E> the node of the list
 * @version 1.0
 */
interface MyLinkedListInterface<E> {

	/**
	 * Returns the head value
	 * 
	 * @return head of the list
	 */
	Node<E> getHead();

	/**
	 * adds a value to the linked list
	 * 
	 * @param value integer being added in
	 */
	void add(E value);

	/**
	 * Adds an array of values to the end of a linkedlist as nodes
	 * 
	 * @param values the array of values
	 */
	void addAll(E[] values);

	/**
	 * Adds a node to the beginning of the linkedlist
	 * 
	 * @param value the value of the node
	 */
	void addFirst(E value);

	/**
	 * Adds a node to the end of the linkedlist
	 * 
	 * @param value the value of the node
	 */
	void addLast(E value);

	/**
	 * Checks if the LinkedList is empty
	 * 
	 * @return true if the list is empty, false if it is not
	 */
	boolean isEmpty();

	/**
	 * Returns the value of the head
	 * 
	 * @return head.getValue() the value of the head
	 */
	E peek();

	/**
	 * Clears the linkedlist erasing any nodes
	 */
	void clear();

	/**
	 * Gets the first value of the first node
	 * 
	 * @return head.getValue() the value of the first node
	 */
	E getFirst();

	/**
	 * Get the last value of the last node
	 * 
	 * @return current.getValue() the last value of the last node
	 */
	E getLast();

	/**
	 * Removes the first node in the list
	 * 
	 * @return temp.getValue() the first node
	 */
	E remove();

	/**
	 * Removes a certain node of the remove
	 * 
	 * @param value the value of the node to be removed
	 * @return true if the value was found and node was removed, false if not
	 */
	boolean remove(E value);

	/**
	 * Removes the last node in the linkedlist
	 * 
	 * @return temp.getValue() the node that was removed
	 */
	E removeLast();

	/**
	 * Gets the size of the of the linkedlist
	 * 
	 * @return variable the size of the linkedlist
	 */
	int getSize();

	/**
	 * Converts the linkedlist to an array representation
	 * 
	 * @return toArray() the linkedlist in array form
	 */
	ArrayList<E> toArray();

	/**
	 * Gets a string representation of the linkedlist
	 * 
	 * @return output a string representing the linkedlist
	 */
	@Override
	String toString();

}
