package edu.ben.labs.lab5;

/**
 * This is my cargo
 * 
 * @author omerb
 * @version 1.0
 */
public class Cargo {

	// class variables
	private int trackingNumber = 0;
	private int cubicFeet = 0;
	private int value = 0;
	private int weight = 0;

	/**
	 * This assigns the variables
	 * 
	 * @param trackingNumber which is for the cargo
	 * @param cubicFeet      of the cargo
	 * @param value          the amount it's worth in $
	 * @param weight         the weight in lbs
	 */
	public Cargo(int trackingNumber, int cubicFeet, int value, int weight) {
		this.trackingNumber = trackingNumber;
		this.cubicFeet = cubicFeet;
		this.value = value;
		this.weight = weight;
	}

	/**
	 * get the tracking number
	 * 
	 * @return trackingNumber the tracking number
	 */
	public int getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * set the tracking number
	 * 
	 * @param trackingNumber for the cargo
	 */
	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	 * get the cubic feet
	 * 
	 * @return cubicFeet cubic feet
	 */
	public int getCubicFeet() {
		return cubicFeet;
	}

	/**
	 * set the cubic feet
	 * 
	 * @param cubicFeet for the cargo
	 */
	public void setCubicFeet(int cubicFeet) {
		this.cubicFeet = cubicFeet;
	}

	/**
	 * get the value of the cargo
	 * 
	 * @return value in $ for the cargo
	 */
	public int getValue() {
		return value;
	}

	/**
	 * set the value of the cargo
	 * 
	 * @param value in $
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * get the weight of the cargo
	 * 
	 * @return weight the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * set the weight of the cargo
	 * 
	 * @param weight of the cargo
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * override the toString method
	 * 
	 * @return manifest the string
	 */
	@Override
	public String toString() {
		String manifest = "#" + getTrackingNumber() + ", " + getCubicFeet() + " cu/ft., " + getWeight() + " lbs. $"
				+ getValue();
		return manifest;

	}
}
