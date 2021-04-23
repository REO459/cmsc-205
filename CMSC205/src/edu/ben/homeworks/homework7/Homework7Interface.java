package edu.ben.homeworks.homework7;

/**
 * This is my homework 7 interface
 * 
 * @author omerb
 * @version 1.0
 */
public interface Homework7Interface {

	/**
	 * Adds the value of amount to each node of the linked list
	 * 
	 * @param head pointer to start of list
	 * @param amount amount to add to each node
	 */
	public void addTo(Node<Integer> head, int amount);

	/**
	 * Returns total number of odd integers stored in list
	 * 
	 * @param head pointer to start of list
	 * @return Total number of odd integers stored in list
	 */
	public int countOdds(Node<Integer> head);

	/**
	 * Returns total number of even integers stored in list
	 * 
	 * @param head
	 *            - pointer to start of list
	 * @return Total number of even integers stored in list
	 */
	public int countEvens(Node<Integer> head);

	/**
	 * Returns the dot product of a set of integers stored in two linked lists,
	 * each containing the same number of elements. The dot product of two sets
	 * of integers is the sum of the products of corresponding elements.
	 * 
	 * @param head1 pointer to start of list 1
	 * 
	 * @param head2 pointer to start of list 2
	 * @return dot product
	 */
	public int dotProduct(Node<Integer> head1, Node<Integer> head2);

	/**
	 * Returns true if all the elements in a linked list are in order from
	 * smallest to largest. Otherwise, it should return false
	 * 
	 * @param head - point to start of list
	 * @return - true if in ascending order, false otherwise
	 */
	public boolean isAscendingOrder(Node<Integer> head);
}
