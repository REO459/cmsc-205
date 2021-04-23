package edu.ben.homeworks.homework10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This is my homework 10
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework10 {
	
	/**
	 * This is my constructor
	 */
	private Homework10() {
		
	}
	
	/**
	 * Iteration coin pile program
	 * 
	 * @param args input and output
	 * 
	 */
	public static void main(String[] args) {
		// declare the variables
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		int piles = Integer.parseInt(answer);

		// makes the coins pile
		while (piles > 0) {
			ArrayList<Integer> cpiles = new ArrayList<Integer>(piles);
			String[] coins = scan.nextLine().split(" ");
			int totalCoins = 0;
			for (int i = 0; i < piles; i++) {
				if (Integer.parseInt(coins[i]) != 0) {
					cpiles.add(Integer.parseInt(coins[i]));
				}
			}
			// adds up the total coins
			for (int i = 0; i < cpiles.size(); i++) {
				totalCoins += cpiles.get(i);
			}
			// checks if it is a triangle number or not
			if (isTriangleNumber(totalCoins)) {
				int iterations = 0;
				while (!isInOrder(cpiles)) {
					int newPile = 0;
					for (int i = 0; i < cpiles.size(); i++) {
						if (cpiles.get(i) > 0) {
							newPile++;
						}
						cpiles.set(i, cpiles.get(i) - 1);
						if (cpiles.get(i) == 0) {
							cpiles.remove(i);
							i--;
						}
					}
					cpiles.add(newPile);
					iterations++;
					Collections.sort(cpiles);
				}
				System.out.println(iterations + " iterations");
			} else {
				System.out.println(totalCoins + " is not a triangular number");
			}
			String input = scan.nextLine();
			piles = Integer.parseInt(input);
		}
		scan.close();
	}

	/**
	 * the quadratic method to solve.
	 * 
	 * @param num  the number
	 * @return false if it is not a triangle number
	 */
	public static boolean isTriangleNumber(int num) {
		if (num >= 1) {
			double answer = num;
			answer *= 2;
			answer = (-1 + Math.sqrt(1 + (4 * answer))) / 2;
			return Math.floor(answer) == answer;
		} else {
			return false;
		}
	}

	/**
	 * Determines if an ArrayList of integers isInOrder and begins with 1. 
	 * 
	 * @param array the list
	 * @return false if it is not in order
	 */
	public static boolean isInOrder(ArrayList<Integer> array) {
		// if the array is in order
		boolean inOrder = false;
		if (array.size() == 1 && array.get(0) == 1) {
			return true;
		}

		// ordering the array
		for (int i = 0; i < array.size(); i++) {
			if (i != array.size() - 1) {
				if (array.get(i + 1) == array.get(i) + 1) {
					inOrder = true;
				} else {
					return false;
				}
			}
		}
		
		// checks if the array is not empty and re
		if (!array.isEmpty() && array.get(0) == 1) {
			return inOrder;
		} else {
			return false;
		}
	}
}
