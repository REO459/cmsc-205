package edu.ben.homeworks.homework3;

/**
 * This is homework 3
 * 
 * @author omerb
 * @version 1.0
 */
public class Homework3 {

	/**
	 * This is my default constructor
	 */
	private Homework3() {

	}

	/**
	 * 
	 * @param hexString the input of the hexadecimal
	 * @return decimalValue returns a decimal value after the hexadecimal has been
	 *         converted
	 * @throws HexFormatException when a invalid hexadecimal is inputed
	 */
	public static int parseHex(String hexString) throws HexFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hexString.length(); i++) {
			if (!((hexString.charAt(i) >= '0' && hexString.charAt(i) <= '9')
					|| (hexString.charAt(i) >= 'A' && hexString.charAt(i) <= 'F'))) {
				throw new HexFormatException(hexString);
			}
			char hexChar = hexString.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	/**
	 * 
	 * @param ch this is the char of the letter that accepts A to F
	 * @return ch - '0' returns the character
	 */
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else {
			return ch - '0';
		}
	}
}
