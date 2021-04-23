package edu.ben.labs.lab4;

/**
 * This is lab 4
 * 
 * @author omerb
 * @version 1.0
 */
public class CoffeeHouse {

	private Coffee[] array;
	private int size = 0;
	private double revenue = 0;

	/**
	 * This is my constructor
	 */
	public CoffeeHouse() {
		array = new Coffee[100];
	}

	/**
	 * Takes a coffee object and adds it to the next location in the "queue".
	 * 
	 * @param c not null coffee object
	 * @return true if coffee was added to queue, false if param c is null
	 */
	public boolean takeOrder(Coffee c) {
		if (c == null) {
			return false;
		} else {
			if (size < array.length) {
				array[size++] = c;
			} else {
				Coffee[] newArray = new Coffee[array.length + 1];

				for (int i = 0; i < array.length; i++) {
					newArray[i] = array[i];
				}
				array = newArray;
				array[size++] = c;
			}
			return true;
		}

	}

	/**
	 * "Serves" the order to the customer. This call will process the next order in
	 * the queue, track any necessary metrics, and return the coffee order
	 *
	 * @return temp the next coffee order in the queue
	 */
	public Coffee serveOrder() {
		if (size == 0) {
			return null;
		}
		if (array.length == 1) {
			size--;
			return array[0];
		}
		Coffee temp = array[0];
		size--;
		for (int i = 0; i < size; i++) {
			array[i] = array[i + 1];
		}
		revenue += temp.getCost();
		return temp;
	}

	/**
	 * Determines the potential revenue based on the value of each coffee order in
	 * the queue.
	 * 
	 * @return potentialRevenue revenue of all coffee orders currently in queue
	 */
	public double getPotentialRevenue() {
		double potentialRevenue = 0.0;
		for (int i = 0; i < size; i++) {
			potentialRevenue += array[i].getCost();
		}
		return potentialRevenue;
	}

	/**
	 * Determines, at any given time, how long it will take to make all the coffee
	 * orders currently in the queue.
	 * 
	 * @return timeToMake time to make all coffee orders, 0 if none in queue
	 */
	public int timeToMakeCoffeeOrders() {
		int timeToMake = 0;
		for (int i = 0; i < size; i++) {
			timeToMake += array[i].getTimeToMake();
			if (array.length == 0) {
				return 0;
			}
		}
		return timeToMake;
	}

	/**
	 * Gets the number of orders in the queue
	 * 
	 * @return numberOfOrders number of orders in the queue
	 */
	public int numOfOrders() {
		int numberOfOrders = size;
		return numberOfOrders;
	}

	/**
	 * Returns an array containing the size counts of the coffee orders. Location 0
	 * is the count of the smallest size, location 1 is the count of * the medium
	 * size, and location 2 is the count of the largest size 
	 *
	 * @return getSizeCount array containing the number of coffee orders by size
	 */
	public int[] getSizeCount() {
		int[] getSizeCount = { 0, 0, 0 };
		for (int i = 0; i < size; i++) {
			if (array[i].getSize() == Coffee.TALL) {
				getSizeCount[0]++;
			}
			if (array[i].getSize() == Coffee.GRANDE) {
				getSizeCount[1]++;
			}
			if (array[i].getSize() == Coffee.VENTI) {
				getSizeCount[2]++;
			}
		}
		return getSizeCount;
	}

	/**
	 * Returns the next pending coffee order to be made without removing it from the
	 * queue. A way to check what is coming without actually processing it. 
	 * 
	 * @return array[0] a copy of the next coffee order object
	 */
	public Coffee viewNextOrder() {
		if (size == 0) {
			return null;
		}
		return array[0];
	}

	/**
	 * Returns the number of orders in the queue
	 * 
	 * @return numberOfOrders number of orders in queue
	 */
	public int getNumOrders() {
		int numberOfOrders = size;
		return numberOfOrders;
	}

	/**
	 * Returns the total revenue processed to date. This does not include any
	 * pending orders not yet served sitting in the queue.
	 * 
	 * @return revenue total revenue to this point
	 */
	public double getRevenue() {
		return revenue;
	}

}
