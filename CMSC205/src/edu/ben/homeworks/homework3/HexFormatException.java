package edu.ben.homeworks.homework3;

/**
 * This is hexformatexception
 * 
 * @author omerb
 * @version 1.0
 */
public class HexFormatException extends Exception {
	private String hexString;

	/**
	 * Construct a HexFormatException object
	 * @param hexString sees if this is a valid hex string
	 */
	public HexFormatException(String hexString) {
		super(hexString + " is not a hex string");
		this.hexString = hexString;
	}

	/**
	 * 
	 * @return hexString returns the string of the hex.
	 */
	public String getHex() {
		return hexString;
	}
}
