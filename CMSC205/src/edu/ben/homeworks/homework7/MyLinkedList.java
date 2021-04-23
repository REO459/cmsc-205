package edu.ben.homeworks.homework7;

import java.util.ArrayList;

/**
 * This is my linked list
 * 
 * @author omerb
 * @version 1.0
 * @param <E> the linked list
 */
public class MyLinkedList<E> implements MyLinkedListInterface<E> {

	private Node<E> head;
	private Node<E> current = head;
	private int size;

	/**
	 * constructor
	 */
	public MyLinkedList() {
		head = null;
	}

	/**
	 * 
	 * @param value being passed in
	 */
	public MyLinkedList(E value) {
		head = new Node<E>(value);
	}

	/**
	 * Returns the head value
	 * 
	 * @return head of the list
	 */
	@Override
	public Node<E> getHead() {
		if (head == null) {
			return null;
		}
		return head;
	}

	/**
	 * adds a value to the linked list
	 * 
	 * @param value integer being added in
	 */
	@Override
	public void add(E value) {
		if (head == null) {
			head = new Node<E>(value);
			return;
		} else {
			Node<E> temp = new Node<E>(value);
			Node<E> currentAdd = head;
			while (currentAdd.getNext() != null) {
				currentAdd = currentAdd.getNext();
			}
			temp.setNext(currentAdd.getNext());
			currentAdd.setNext(temp);
		}
	}

	/**
	 * Adds an array of values to the end of a linkedlist as nodes
	 * 
	 * @param values the array of values
	 */
	@Override
	public void addAll(E[] values) {
		for (int i = 0; i < values.length; i++) {
			if (head.getValue() == null) {
				head.setValue(values[i]);
			} else {
				current.setNext(new Node<E>(null));
				current = current.getNext();
			}
		}
		size += values.length;
	}

	/**
	 * Adds a node to the beginning of the linkedlist
	 * 
	 * @param value the value of the node
	 */
	@Override
	public void addFirst(E value) {
		Node<E> temp = new Node<E>(value);
		temp.setNext(head);
		head = temp;
		size++;
	}

	/**
	 * Adds a node to the end of the linkedlist
	 * 
	 * @param value the value of the node
	 */
	@Override
	public void addLast(E value) {
		if (head.getValue() == null) {
			head.setValue(value);
		} else {
			Node<E> temp = new Node<E>(value);
			current.setNext(temp);
			current = current.getNext();
		}
		size++;
	}

	/**
	 * Checks if the LinkedList is empty
	 * 
	 * @return true if the list is empty, false if it is not
	 */
	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the value of the head
	 * 
	 * @return head.getValue() the value of the head
	 */
	@Override
	public E peek() {
		return head.getValue();
	}

	/**
	 * Clears the linkedlist erasing any nodes
	 */
	@Override
	public void clear() {
		head = null;
	}

	/**
	 * Gets the first value of the first node
	 * 
	 * @return head.getValue() the value of the first node
	 */
	@Override
	public E getFirst() {
		return head.getValue();
	}

	/**
	 * Get the last value of the last node
	 * 
	 * @return current.getValue() the last value of the last node
	 */
	@Override
	public E getLast() {
		return current.getValue();
	}

	/**
	 * Removes the first node in the list
	 * 
	 * @return temp.getValue() the first node
	 */
	@Override
	public E remove() {
		if (isEmpty()) {
			return null;
		}
		Node<E> temp = head;
		head = temp.getNext();
		return temp.getValue();
	}

	/**
	 * Removes a certain node of the remove
	 * 
	 * @param value the value of the node to be removed
	 * @return true if the value was found and node was removed, false if not
	 */
	@Override
	public boolean remove(E value) {
		Node<E> currentValue = head;
		Node<E> previous = null;
		while (currentValue != null && !currentValue.getValue().equals(value)) {
			previous = currentValue;
			currentValue = currentValue.getNext();
		}
		if (currentValue == null) {
			return false;
		} else if (previous != null) {
			previous.setNext(currentValue.getNext());
		} else {
			head = head.getNext();
		}
		return true;
	}

	/**
	 * Removes the last node in the linkedlist
	 * 
	 * @return temp.getValue() the node that was removed
	 */
	@Override
	public E removeLast() {
		if (isEmpty()) {
			return null;
		}
		Node<E> temp = head;
		for (int i = 0; i < getSize() - 1; i++) {
			temp = temp.getNext();
		}
		return temp.getValue();
	}

	/**
	 * Gets the size of the of the linkedlist
	 * 
	 * @return variable the size of the linkedlist
	 */
	@Override
	public int getSize() {
		int variable = 0;
		Node<E> currentSize = head;
		while (currentSize != null) {
			variable++;
			currentSize = currentSize.getNext();
		}
		return variable;
	}

	/**
	 * Converts the linkedlist to an array representation
	 * 
	 * @return toArray() the linkedlist in array form
	 */
	@Override
	public ArrayList<E> toArray() {
		ArrayList<E> o = new ArrayList<E>(getSize());
		current = head;
		for (int i = 0; i < getSize(); i++) {
			o.add(current.getValue());
			if (current.getNext() != null) {
				current = current.getNext();
			}
		}
		return toArray();
	}

	/**
	 * Gets a string representation of the linkedlist
	 * 
	 * @return output a string representing the linkedlist
	 */
	@Override
	public String toString() {
		String output = "";
		Node<E> currentString = head;
		while (currentString != null) {
			output += "[" + currentString.getValue().toString() + "]";
			currentString = currentString.getNext();
		}
		return output;
	}

}
