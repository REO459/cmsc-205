package edu.ben.labs.lab1;

/**
 * This is my lab 1
 * 
 * @author omerb
 * @version 1.0
 */
public final class Lab1 {

	/**
	 * throws exception of the unsupported operation
	 */
	private Lab1() {
		throw new UnsupportedOperationException();
	}

	private static int total;

	/**
	 * 
	 * @param a for the variable double a
	 * @param b for the variable double b
	 * @return a + b for the total of a and b
	 * @throws Exception if there is a fail
	 */
	public static double add(double a, double b) throws Exception {
		total++;
		return a + b;
	}

	/**
	 * 
	 * @param c    checks the character of 'c'
	 * @param text the whole text of the string for the loop to read
	 * @return count counts how many 'c's are there
	 */
	public static int characterCount(char c, String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	/**
	 * This will convert the text provided to the format type requested If lower
	 * case is selected, then the text will be converted to all lower case
	 * characters. If upper case is selected, then the text will be converted to all
	 * upper case characters.
	 * 
	 * @param text       The string of the sentence
	 * @param formatType makes all letters uppercase, lowercase, or camelcase
	 * @return text shows the output of the new string
	 */
	public static String formatText(String text, int formatType) {
		if (formatType == FormatType.LOWERCASE) {
			return text.toLowerCase();
		} else if (formatType == FormatType.UPPERCASE) {
			return text.toUpperCase();
		} else if (formatType == FormatType.CAMELCASE) {
			char[] arr = text.toCharArray();
			boolean cap = true;
			for (int i = 0; i < arr.length; i++) {
				if (cap && !Character.isWhitespace(arr[i])) {
					arr[i] = Character.toUpperCase(arr[i]);
					cap = false;
				} else {
					if (arr[i] == '.' || arr[i] == '?' || arr[i] == '!') {
						cap = true;
					}
				}
			}
			text = new String(arr);
			return text;
		}
		return null;
	}

	/**
	 * 
	 * @param a for the variable int a
	 * @param b for the variable int b
	 * @return a + b for the total of a and b
	 * @throws Exception if there is a fail
	 */
	public static int add(int a, int b) throws Exception {
		total++;
		return a + b;
	}

	/**
	 * 
	 * @param a for the variable float a
	 * @param b for the variable float b
	 * @return a + b for the total of a and b
	 * @throws Exception if there is a fail
	 */
	public static float add(float a, float b) throws Exception {
		total++;
		return a + b;
	}

	/**
	 * 
	 * @param a for the variable double a
	 * @param b for the variable double b
	 * @return a / b for the division of a and b
	 * @throws Exception if there is a fail or division by zero
	 */
	public static double divide(double a, double b) throws Exception {
		total++;
		if (b == 0) {
			throw new Exception();
		}
		return a / b;
	}

	/**
	 * 
	 * @param a for the variable int a
	 * @param b for the variable int b
	 * @return a / b for the division of a and b
	 * @throws Exception if there is a fail or division by zero
	 */
	public static int divide(int a, int b) throws Exception {
		total++;
		if (b == 0) {
			throw new Exception();
		}
		return a / b;
	}

	/**
	 * 
	 * @param a for the variable float a
	 * @param b for the variable float b
	 * @return a / b for the division of a and b
	 * @throws Exception if there is a fail or division by zero
	 */
	public static float divide(float a, float b) throws Exception {
		total++;
		if (b == 0) {
			throw new Exception();
		}
		return a / b;
	}

	/**
	 * 
	 * @return total returns total amount of additions and divisions used
	 * @throws Exception if there is a fail
	 */
	public static int getTotalComputations() throws Exception {
		return total;
	}
}
