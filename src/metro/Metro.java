// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package metro;

import trainAndTram.Train;

public class Metro extends Train{
	
	protected int totalNumOfStops;

	/**
	 * Default constructor
	 */
	public Metro() {
		super();
		this.totalNumOfStops = 0; //COULD USE AN ENUM HERE !
	}

	/**
	 * Parameterized  constructor
	 * @param wheels
	 * @param MAX_SPEED
	 * @param nameOfStartingStation
	 * @param nameOfDestinatioStation
	 * @param totalNumOfStops
	 */
	public Metro(int wheels, int MAX_SPEED, String nameOfStartingStation, String nameOfDestinatioStation, int totalNumOfStops) {
		super(wheels, MAX_SPEED, nameOfStartingStation, nameOfDestinatioStation);
		this.totalNumOfStops = totalNumOfStops;
	}

	/**
	 * Copy constructor
	 * @param source the Metro object to copy 
	 */
	public Metro(Metro source) {
		super(source);
		this.totalNumOfStops = source.totalNumOfStops;
	}

	/**
	 * Returns the total number of stops.
	 * @return the total number of stops.
	 */
	public int getTotalNumOfStops() {
		return totalNumOfStops;
	}

	/**
	 * Sets the total number of stops
	 * @param totalNumOfStops total number of stops
	 */
	public void setTotalNumOfStops(int totalNumOfStops) {
		this.totalNumOfStops = totalNumOfStops;
	}

	/**
	 * Returns a String representation of Metro object
	 * @return string representation of Metro object
	 */
	public String toString() {
		return "Metro with " + wheels + " wheels and max speed " + MAX_SPEED + " km/h. It starts at " + nameOfStartingStation + " and stops at " + nameOfDestinatioStation + ". There are " + numOfVehicles + " trains of all types. The total number of stops is " + totalNumOfStops + ".";
	}

	/**
	 * Compares this Metro object to the specified object for equality.
	 * @param obj the object to be compared
	 * @return true if the Metro object is equal to the specified object, false otherwise
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Metro))
			return false;
		Metro other = (Metro) obj;
		if (totalNumOfStops != other.totalNumOfStops)
			return false;
		return true;
	}
}
