package edu.ben.labs.lab5;

/**
 * This is my airplane
 * 
 * @author omerb
 * @version 1.0
 */
public class Airplane {

	// all variables
	private int aircraftType = 0;
	private int flightNumber = 0;
	private int cargoCapacity = 0;
	private int maximumCapacity = 0;
	private int cargoWeight = 0;
	private int maximumWeight = 0;

	/**
	 * This is my constructor
	 */
	private MyStack cargoInPlane = new MyStack(100);

	/**
	 * constructor for airplane information
	 * 
	 * @param aircraftType    the number from the file
	 * @param flightNumber    the flight number
	 * @param maximumCapacity how much cargo the plane can hold in cubic feet
	 * @param maximumWeight   the weight of the cargo in lbs
	 */
	public Airplane(int aircraftType, int flightNumber, int maximumCapacity, int maximumWeight) {
		this.aircraftType = aircraftType;
		this.flightNumber = flightNumber;
		this.maximumCapacity = maximumCapacity;
		this.maximumWeight = maximumWeight;
	}

	/**
	 * get the type of aircraft
	 * 
	 * @return aircraftType gets the aircraft type
	 */
	public int getAircraftType() {
		return aircraftType;
	}

	/**
	 * gets the remaining capacity
	 * 
	 * @return maximumCapacity - cargoCapacity cargo capacity which is the remaining
	 *         capacity
	 */
	public int getRemainingCapacity() {
		return maximumCapacity - cargoCapacity;
	}

	/**
	 * get the remaining weight
	 * 
	 * @return maximumWeight - cargoWeight cargo weight which is the remaining
	 *         weight
	 */
	public int getRemainingWeight() {
		return maximumWeight - cargoWeight;
	}

	/**
	 * get the maximum capacity
	 * 
	 * @return maximumCapacity which is the capacity of the plane
	 */
	public int getMaximumCapacity() {
		return maximumCapacity;
	}

	/**
	 * set the maximum capacity
	 * 
	 * @param maximumCapacity which is from the airplane
	 */
	public void setMaximumCapacity(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	/**
	 * get the max weight
	 * 
	 * @return maximumWeight which is from the plane
	 */
	public int getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * set the maximum weight
	 * 
	 * @param maximumWeight which is the max weight of the plane that it can hold
	 */
	public void setMaximumWeight(int maximumWeight) {
		this.maximumWeight = maximumWeight;
	}

	/**
	 * set the aircraft type
	 * 
	 * @param aircraftType which is a number
	 */
	public void setAircraftType(int aircraftType) {
		this.aircraftType = aircraftType;
	}

	/**
	 * get the flight number
	 * 
	 * @return flightNumber; the flight number
	 */
	public int getFlightNumber() {
		return flightNumber;
	}

	/**
	 * set the flight number
	 * 
	 * @param flightNumber which will be set
	 */
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * get the capacity of the cargo on the plane
	 * 
	 * @return cargoCapacity the cargo capacity
	 */
	public int getCargoCapacity() {
		return cargoCapacity;
	}

	/**
	 * set the capacity of the cargo
	 * 
	 * @param cargoCapacity in cubic feet
	 */
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	/**
	 * get the weight of the cargo that the plane can hold
	 * 
	 * @return cargoWeight the weight of the cargo
	 */
	public int getCargoWeight() {
		return cargoWeight;
	}

	/**
	 * set the weight of the cargo that the plane can hold
	 * 
	 * @param cargoWeight the weight of the cargo
	 */
	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	/**
	 * @return cargoInPlane the cargoInPlane
	 */
	public MyStack getCargoInPlane() {
		return cargoInPlane;
	}

	/**
	 * @param cargoInPlane the cargoInPlane to set
	 */
	public void setCargoInPlane(MyStack cargoInPlane) {
		this.cargoInPlane = cargoInPlane;
	}

	/**
	 * adds cargo into the plane
	 * 
	 * @param c the cargo that will be added in
	 */
	public void putCargo(Cargo c) {
		MyStack temp = new MyStack(100);
		// checks if the cargo is not empty
		if (!getCargoInPlane().isEmpty()) {
			// weight is pushed if less than what's in the plane
			while (!getCargoInPlane().isEmpty() && c.getWeight() < ((Cargo) (getCargoInPlane().peek())).getWeight()) {
				temp.push(getCargoInPlane().pop());
			}
			getCargoInPlane().push(c);
			// push temp to plane
			while (!temp.isEmpty()) {
				getCargoInPlane().push(temp.pop());
			}
		} else {
			getCargoInPlane().push(c);
		}
		cargoCapacity += c.getCubicFeet();
		cargoWeight += c.getWeight();
	}

	/**
	 * override the toString method
	 * 
	 * @return s + "\n" which is the string of the cargo information
	 */
	@Override
	public String toString() {
		String s = "Flight #" + getFlightNumber() + " Cargo: " + cargoCapacity + "/" + getMaximumCapacity() + " cu/ft. "
				+ cargoWeight + "/" + getMaximumWeight() + " lbs.";
		s += " \nCARGO DETAILS: \n";
		for (int i = 0; i < getCargoInPlane().getSize(); i++) {
			s += "\t" + getCargoInPlane().get(i) + "\n";
		}
		if (getCargoInPlane().isEmpty()) {
			s += "\t" + "NO CARGO";
		}
		return s + "\n";
	}
}