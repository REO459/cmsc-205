package edu.ben.labs.lab4;

/**
 * This is lab 4
 * 
 * @author omerb
 * @version 1.0
 */
public class Coffee {

	/**
	 * Size of tall
	 */
	public static final int TALL = 1;
	/**
	 * Size of grande
	 */
	public static final int GRANDE = 2;
	/**
	 * Size of venti
	 */
	public static final int VENTI = 3;

	// the variables for the order
	private String name;
	private int size;
	private double cost;
	private int timeToMake;

	/**
	 * 
	 * @param name       The name of the order
	 * @param size       How big the size is
	 * @param cost       How much the drink cost
	 * @param timeToMake How long it is going to make
	 */
	public Coffee(String name, int size, double cost, int timeToMake) {
		this.name = name;
		this.size = size;
		this.cost = cost;
		this.timeToMake = timeToMake;
	}

	/**
	 * 
	 * @return name the name of the order
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name sets the name of the order
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return cost gets the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * 
	 * @param cost sets the cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * 
	 * @return size gets the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 
	 * @param size sets the size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * 
	 * @return timeToMake returns the time you need to make coffee
	 */
	public int getTimeToMake() {
		return timeToMake;
	}

	/**
	 * 
	 * @param timeToMake sets the time to make
	 */
	public void setTimeToMake(int timeToMake) {
		this.timeToMake = timeToMake;
	}

	/**
	 * @return "Name: \'" + this.name + "\', Size: \'" + this.size + "\', Cost: \'"
	 * + this.cost + "\', Time to Make: \'" + this.timeToMake + "\'" returns
	 * the string of the order
	 */
	@Override
	public String toString() {
		return "Name: \'" + this.name + "\', Size: \'" + this.size + "\', Cost: \'" + this.cost + "\', Time to Make: \'"
				+ this.timeToMake + "\'";
	}

	/**
	 * @return false if there is no instance of the coffee
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Coffee) {
			Coffee c = (Coffee) obj;
			return name.equals(c.name) && size == (c.size) && timeToMake == c.timeToMake && cost == c.cost;
		}
		return false;
	}

}
