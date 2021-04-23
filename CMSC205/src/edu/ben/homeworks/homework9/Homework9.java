package edu.ben.homeworks.homework9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is my homework 9
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework9 {

	/**
	 * This is my constructor
	 */
	private Homework9() {

	}

	/**
	 * This is the file
	 */
	private static File f = new File("monkey.txt");

	/**
	 * 
	 * @param args the output of the file
	 * @throws FileNotFoundException throws exception if the file is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		processTranscript(f);
	}

	/**
	 * 
	 * @param file processes the transcript
	 * @throws FileNotFoundException throws exception if the file is not found
	 */
	public static void processTranscript(File file) throws FileNotFoundException {
		// declares the variables for the monkeys and spies
		int i = 0;
		String[] monkeys = new String[25];
		ArrayList<String> spies = new ArrayList<String>();

		// reads the file
		try {
			Scanner data = new Scanner(file);
			while (data.hasNextLine()) {
				String s = data.nextLine();
				String[] splited = s.split(":");
				// breaks on omega
				if (splited[0].equals("OMEGA")) {
					break;
				}
				// if it is a monkey
				if (isSentence(splited[1])) {
					monkeys[i++] = splited[0];
					// adds spies
				} else {
					if (!spies.contains(splited[0])) {
						spies.add(splited[0]);
					}
				}
			}
			// displays the spies
			for (int p = 0; p < spies.size(); p++) {
				if (!spies.contains(null)) {
					System.out.println(spies.get(p));
				}
			}
			data.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param s the string of the monkey language
	 * @return isSentence(restWords) && isWord(lastWord) returns the check for
	 *         sentence
	 */
	public static boolean isSentence(String s) {
		String[] allWords = s.split(" ");
		String restWords = "";
		String lastWord = "";
		// checks if it is a word
		if (allWords.length == 1) {
			return isWord(s);
			// takes the rest of the words
		} else {
			lastWord = allWords[allWords.length - 1];
			for (int i = 0; i < allWords.length - 1; i++) {
				restWords += allWords[i] + " ";
			}
		}
		// returns the sentence
		restWords = restWords.trim();
		lastWord = lastWord.trim();
		return isSentence(restWords) && isWord(lastWord);
	}

	/**
	 * 
	 * @param s the string of the monkey language
	 * @return false if it's not a word
	 */
	public static boolean isWord(String s) {
		int syllables = 0;
		s = s.trim();
		// checks the length of the string
		while (s.length() > 0) {
			// checks if it is a syllable or not
			if (s.length() <= 4 && s.length() > 1) {
				if (isSyllable(s)) {
					syllables++;
					s = s.substring(s.length());
				} else if (isSyllable(s.substring(0, 2))) {
					syllables++;
					s = s.substring(2);
				} else {
					return false;
				}
				// checks if it is a syllable or not if the language is bigger than 5
			} else if (s.length() >= 5) {
				if (isSyllable(s.substring(0, 4))) {
					syllables++;
					s = s.substring(4);
				} else if (isSyllable(s.substring(0, 3))) {
					syllables++;
					s = s.substring(3);
				} else if (isSyllable(s.substring(0, 2))) {
					syllables++;
					s = s.substring(2);
				}
			} else {
				return false;
			}
		}
		return syllables % 2 != 0;
	}

	/**
	 * 
	 * @param s the string of the monkey language
	 * @return s.equals("cbab") || s.equals("cbad") || s.equals("cdad") ||
	 *         s.equals("cdab") || s.equals("acda") || s.equals("acba") ||
	 *         s.equals("ad") || s.equals("ab") || isPlosive(s) if the word is a
	 *         syllable
	 */
	public static boolean isSyllable(String s) {
		return s.equals("cbab") || s.equals("cbad") || s.equals("cdad") || s.equals("cdab") || s.equals("acda")
				|| s.equals("acba") || s.equals("ad") || s.equals("ab") || isPlosive(s);
	}

	/**
	 * 
	 * @param s the string of the monkey language
	 * @return return isStop(s) if it is plosive
	 */
	public static boolean isPlosive(String s) {
		return isStop(s);
	}

	/**
	 * 
	 * @param s the string of the monkey language
	 * @return s.equals("cda") || s.equals("cba") to stop
	 */
	public static boolean isStop(String s) {
		return s.equals("cda") || s.equals("cba");
	}
}
