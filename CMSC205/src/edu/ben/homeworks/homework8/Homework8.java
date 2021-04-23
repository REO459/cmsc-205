package edu.ben.homeworks.homework8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This is my homework 8
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework8 {

	/**
	 * This is my constructor
	 */
	private Homework8() {

	}

	/**
	 * 
	 * @param args the main method of the list
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int system = 0;
		System.out.print("Enter numbers: ");
		String num = input.nextLine();
		String[] numList = num.split(" ");
		int[] convert = new int[numList.length];
		// converts array to an integer list
		for (int i = 0; i < numList.length; i++) {
			convert[i] = Integer.parseInt(numList[i]);
		}
		// adds the integers to the linked list
		for (int j = 0; j < convert.length; j++) {
			list.add(convert[j]);
		}
		menu();

		// the choice system for the manipulation
		int choice = input.nextInt();
		while (system == 0) {
			if (choice == 1) {
				sortListAscending(list);
			} else if (choice == 2) {
				sortListDescending(list);
			} else if (choice == 3) {
				String y = displayList(list);
				System.out.println(y);
			} else if (choice == 4) {
				removeLargestValue(list);
			} else if (choice == 5) {
				removeSmallestValue(list);
			} else if (choice == 6) {
				system = 1;
			} else {
				break;
			}
			if (system == 0) {
				menu();
				choice = input.nextInt();
			}
		}
		input.close();
	}

	/**
	 * Sorts the list in an ascending order
	 * 
	 * @param list the list the numbers
	 * @return list returns the list in an ascending order
	 */
	public static LinkedList<Integer> sortListAscending(LinkedList<Integer> list) {
		Collections.sort(list);
		return list;
	}


	/**
	 * Sorts the list in an descending order
	 * 
	 * @param list the list the numbers
	 * @return list returns the list in an descending order
	 */
	public static LinkedList<Integer> sortListDescending(LinkedList<Integer> list) {
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}

	/**
	 * displays the list
	 * 
	 * @param list the list of numbers 
	 * @return x the string of numbers
	 */
	public static String displayList(LinkedList<Integer> list) {
		Object[] y = list.toArray();
		String x = Arrays.toString(y);
		return x;
	}

	/**
	 * Removes the largest value from the list
	 * 
	 * @param list the list of numbers 
	 * @return list returns the list of numbers with the largest value removed
	 */
	public static LinkedList<Integer> removeLargestValue(LinkedList<Integer> list) {
		if (list.size() != 0) {
			Object[] y = list.toArray();
			Arrays.sort(y);
			list.remove(y[y.length - 1]);
		}
		return list;
	}

	/**
	 * Removes the smallest value from the list
	 * 
	 * @param list the list of numbers 
	 * @return list returns the list of numbers with the smallest value removed
	 */
	public static LinkedList<Integer> removeSmallestValue(LinkedList<Integer> list) {
		if (list.size() != 0) {
			Object[] y = list.toArray();
			Arrays.sort(y);
			list.remove(y[0]);
		}
		return list;
	}

	/**
	 * Makes the menu of the linked list manipulation
	 */
	public static void menu() {
		System.out.println("1. Sort List Ascending");
		System.out.println("2. Sort List Descending");
		System.out.println("3. Display List");
		System.out.println("4. Remove Largest Value");
		System.out.println("5. Remove Smallest Value");
		System.out.println("6. Exit");
	}

}
