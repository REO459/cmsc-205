package edu.ben.labs.lab3;

/**
 * This is plate
 * 
 * @author omerb
 * @version 1.0
 */
public class Plate {
	/*
	 * The array of the plate
	 */
	private double[][] plate;

	/**
	 * 
	 * @param plate gets the array of the plate
	 */
	public Plate(double[][] plate) {
		this.plate = plate;
	}
	
	/**
	 * 
	 * @return plate returns the array of plates
	 */
	public double[][] getPlate() {
		return plate;
	}

}
