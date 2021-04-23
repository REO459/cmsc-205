package edu.ben.homeworks.homework7;

/**
 * This is my homework 7
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework7 implements Homework7Interface {
	
	/**
	 * Adds the value of amount to each node of the linked list
	 * 
	 * @param head pointer to start of list
	 * @param amount amount to add to each node
	 */
	@Override
	public void addTo(Node<Integer> head, int amount) {
		Node<Integer> current = head;
		while (current != null) {
			current.setValue(amount + current.getValue());
			current = current.getNext(); 
		}
	}

	/**
	 * Returns total number of odd integers stored in list
	 * 
	 * @param head pointer to start of list
	 * @return count Total number of odd integers stored in list
	 */
	@Override
	public int countOdds(Node<Integer> head) {
		Node<Integer> current = head;
		int count = 0;
		while (current != null) {
			if (current.getValue() % 2 == 1) {
				count++; 
			}
			current = current.getNext();
		}
		return count;
	}

	/**
	 * Returns total number of even integers stored in list
	 * 
	 * @param head pointer to start of list
	 * @return count Total number of even integers stored in list
	 */
	@Override
	public int countEvens(Node<Integer> head) {
		Node<Integer> current = head;
		int count = 0;
		while (current != null) {
			if (current.getValue() % 2 == 0) { 
				count++; 
			}
			current = current.getNext();
		}
		return count;
	}

	/**
	 * Returns the dot product of a set of integers stored in two linked lists,
	 * each containing the same number of elements. The dot product of two sets
	 * of integers is the sum of the products of corresponding elements.
	 * 
	 * @param head1 pointer to start of list 1
	 * 
	 * @param head2 pointer to start of list 2
	 * @return sum dot product
	 */
	@Override
	public int dotProduct(Node<Integer> head1, Node<Integer> head2) {
		int sum = 0;
		Node<Integer> temp1 = head1;
		Node<Integer> temp2 = head2;
		while (temp1 != null) { 
			sum += temp1.getValue() * temp2.getValue();
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
		}
		return sum;
	}

	/**
	 * Returns true if all the elements in a linked list are in order from
	 * smallest to largest. Otherwise, it should return false
	 * 
	 * @param head point to start of list
	 * @return true if in ascending order, false otherwise
	 */
	@Override
	public boolean isAscendingOrder(Node<Integer> head) {
		Node<Integer> current = head;
		if (head == null) {
			return false; 
		}
		while (current.getNext() != null) {
			if (current.getValue() > current.getNext().getValue()) {
				return false;
			}
			current = current.getNext();
		}
		return true;
	}

}
