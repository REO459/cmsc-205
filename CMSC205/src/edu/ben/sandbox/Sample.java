package edu.ben.sandbox;

public class Sample {
	
	/**
	 * Divides 'a' by 'b'. If 'b' is zero then return null
	 * @param a
	 * @param b
	 * @return
	 */
	public static int divide(int a, int b) throws DivideByZeroException {
		if(b == 0) {
			throw new DivideByZeroException();
		}
		return a / b;
	}

}
