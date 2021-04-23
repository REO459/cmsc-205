package edu.ben.labs.lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is my lab 7
 * 
 * @author omerb
 * @version 1.0
 */
public class Lab7 {

	/**
	 * This is my constructor
	 */
	private Lab7() {

	}

	// the private variables
	private static int longestWord = 0;
	private static int[] wordLength;

	/**
	 * Prints and outputs the file that counts the frequency of words
	 * 
	 * @param args the output
	 * @throws IOException if the file cannot be found
	 * 
	 */
	public static void main(String[] args) {
		double startTime = System.nanoTime();
		// input String
		String input = "";
		try {
			// reads through the text from the file
			// GreenEggsAndHam
			input = new String(Files.readAllBytes(Paths.get("GreenEggsAndHam.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// prints out the file name
		System.out.println("Results for file: GreenEggsAndHam.txt");
		System.out.println();
		System.out.printf("%15s%10s%8s\n", "Word", "Frequency", "Freq. %");
		System.out.println();
		// creates an array of unfiltered words
		String[] unfilteredWords = input.split(" ");
		// converts the string to a filter words
		String conversion = filterCharacters(unfilteredWords);
		// converts the conversion to an array
		String[] words = filterArray(conversion.split(" "));
		// sorts the array in alphabetical order
		Arrays.sort(words);
		// variable for getting Repeated word count
		int wrc = 1;
		// counts the total amount of words
		int count = words.length;
		double percent = (wrc / count) * 100;
		// outer loop for Comparison
		for (int i = 0; i < words.length; i++) {
			// inner loop for Comparison
			for (int j = i + 1; j < words.length; j++) {
				// checking for both strings are equal
				if (words[i].equals(words[j])) {
					// if equal increment the count
					wrc = wrc + 1;
					// replace repeated words by zero
					words[j] = "0";
				}
			}
			if (!words[i].equals("0")) {
				// printing the word along with count and frequency
				System.out.printf("%15s%10s%8s\n", words[i], wrc, percent);
			}
			wrc = 1;
		}
		// prints out the word length and distinct words
		System.out.println();
		lengthArr(longestWord, args);
		System.out.printf("%7s  %-9s\n%7s  %-9s\n%7s  %-9s\n", "Word", "  # of", "Length", "Distinct", "", "  Words");
		System.out.println();
		for (int i = 1; i < wordLength.length; i++) {
			if (wordLength[i] > 0) {
				System.out.printf("%7s  %-9s\n%7s  %-9s\n%7s  %-9s\n", i, wordLength[i]);
			}
		}
		// outputs the total numbers
		System.out.println("Total number of words processed: " + count);
		uniqueWords(words);

		// prints out the processing time
		double endTime = System.nanoTime();
		double totalTime = (endTime - startTime) / 1000000000.0;
		System.out.println();
		DecimalFormat df = new DecimalFormat("##.###");
		System.out.println("Total processing time: " + df.format(totalTime) + " " + "sec");
	}

	/**
	 * Filter the words in the array
	 * 
	 * @param words the array of words
	 * @return results the filter of words
	 */
	private static String[] filterArray(String[] words) {
		ArrayList<String> filtered = new ArrayList<String>();
		for (String str : words) {
			if (!str.equals("")) {
				filtered.add(str);
			}
		}
		String[] result = new String[filtered.size()];
		for (int i = 0; i < filtered.size(); i++) {
			result[i] = filtered.get(i);
		}
		return result;
	}

	/**
	 * Lower case the words
	 * 
	 * @param words the array of words
	 * @return result.toLowerCase() makes the word lower case
	 */
	private static String filterCharacters(String[] words) {
		String result = "";
		int pos = 0;
		for (String s : words) {
			pos++;
			if (!s.equals("")) {
				for (Character c : s.toCharArray()) {
					if (Character.isLetter(c) || c.equals('-')) {
						result += c;
					}
				}
				if (pos != words.length) {
					result += " ";
				}
			}
		}
		return result.toLowerCase();
	}
	
	/**
	 * Finds the longest word and prints out the distinct words
	 * 
	 * @param wordSize the size of the word
	 * @param words    the array of the words
	 */
	private static void lengthArr(int wordSize, String[] words) {
		wordLength = new int[longestWord + 1];
		for (int i = 0; i < wordSize; i++) {
			wordLength[words[i].length()] += 1;
		}

	}

	/**
	 * Counts the number of unique words
	 * 
	 * @param words the array of words
	 */
	private static void uniqueWords(String[] words) {
		int uniqueWords = 0;
		ArrayList<String> unique = new ArrayList<String>();
		for (String str : words) {
			if (!str.equals("")) {
				unique.add(str);
			}
			uniqueWords = (int) unique.stream().distinct().count();
		}
		System.out.println("Total number of unique words: " + uniqueWords);
	}
}
