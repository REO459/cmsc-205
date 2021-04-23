package edu.ben.homeworks.homework6;

import java.util.Scanner;

/**
 * This is homework 6
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework6 {
	
	/**
	 * This is my constructor
	 */
	private Homework6() {
		
	}

	/**
	 * writes the input of the data
	 * 
	 * @param args the data of the written input
	 */
	public static void main(String[] args) {
		String n = "";
		Scanner input = new Scanner(System.in);
		// closes the code if the input is zero
		while (!n.equals("0")) {
			n = input.nextLine();
			if (n.length() >= 2) {
				startCandyGame(n);
			}
		}
		input.close();
	}

	/**
	 * the candy sharing game starts now
	 * 
	 * @param n number of candy the kid has
	 */
	public static void startCandyGame(String n) {
		// variables for the candy and whistles
		int[] nums = {};
		int[] give = {};
		int whistles = 0;
		nums = toIntArray(n);

		boolean equalAmount = false;
		while (!equalAmount && whistles < 100) {
			whistles++;
			give = giveHalfofCandy(nums);
			nums = passCandy(nums, give);
			equalAmount = checkEqual(nums);
		}
		// checks the amount of whistles if the game ends or keeps going on
		if (whistles >= 100) {
			System.out.println("Game goes on forever");
		} else {
			System.out.println(whistles + " whistle blows");
		}

	}

	/**
	 * checks if each kid has equal amount of candy
	 * 
	 * @param nums amount of candy for a kid
	 * @return true if the number of candy they received is equal
	 */
	private static boolean checkEqual(int[] nums) {
		// loops the array for the equal amount of candy
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The kid passes candy to another kid
	 * 
	 * @param nums The original array of each number of candy pieces
	 * @param give array that has half as many candy pieces
	 * @return nums that holds updated candy pieces
	 */
	private static int[] passCandy(int[] nums, int[] give) {
		// pass the candy depending on how much they get and which place they are in
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				nums[0] = give[0] + give[nums.length - 1];
			} else {
				nums[i] = give[i] + give[i - 1];
			}
			if (nums[i] % 2 != 0) {
				nums[i] += 1;
			}
		}
		return nums;
	}

	/**
	 * Takes each child and gives away half of their candy
	 * 
	 * @param nums the original array that had the candy of each child
	 * @return give the next kid half amount of candy
	 */
	private static int[] giveHalfofCandy(int[] nums) {
		// determines the amount of candy they should give
		int[] give = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			give[i] = nums[i] / 2;
		}
		return give;
	}

	/**
	 * Converts the string to an array
	 * 
	 * @param line the line of the string
	 * @return intArr returns the array of the number
	 */
	private static int[] toIntArray(String line) {
		// works the convertion of the string to an array
		String[] strArr = line.split(" ");
		int[] intArr = new int[strArr.length];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.valueOf(strArr[i]);
		}
		return intArr;
	}

}