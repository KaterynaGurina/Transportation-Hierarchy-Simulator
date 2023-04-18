// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------

package wheeledTransportation;

import driver.Transportation;

public class WheeledTransportation extends Transportation{
	protected int wheels;
	protected final int MAX_SPEED;
	
	/**
	 * Default constructor
	 */
	public WheeledTransportation() {
		this.wheels = 1;
		this.MAX_SPEED = 20;
	}
	
	/**
	 * Parameterized  constructor
	 * @param wheels the number of wheels for the `WheeledTransportation`
	 * @param MAX_SPEED the maximum speed for the `WheeledTransportation`
	 */
	public WheeledTransportation(int wheels, int MAX_SPEED) {
		this.wheels = wheels;
		this.MAX_SPEED = MAX_SPEED;
	}
	
	/**
	 * Copy constructor 
	 * @param source WheeledTransportation object to be copied
	 */
	public WheeledTransportation(WheeledTransportation source) {
		this.wheels = source.wheels;
		this.MAX_SPEED = source.MAX_SPEED;
	}
	
	/**
	 * Returns the number of wheels for this `WheeledTransportation`
	 * @return the number of wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * Sets the number of wheels for this `WheeledTransportation`
	 * @param wheels number of wheels
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * Returns the maximum speed for this `WheeledTransportation`
	 * @return the maximum speed
	 */
	public int getMAX_SPEED() {
		return MAX_SPEED;
	}

	/**
	 * Returns a string representation of this `WheeledTransportation`
	 * @return a string representation
	 */
	public String toString() {
		return "Wheeled transportation with " + wheels + " wheels and max speed " + MAX_SPEED + " km/h.";
	}

	/**
	 * Compares this `WheeledTransportation` to the specified object for equality.
	 * @param obj the object to compare to this `WheeledTransportation`
	 * @return `true` if the objects are equal, `false` otherwise
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof WheeledTransportation))
			return false;
		WheeledTransportation other = (WheeledTransportation) obj;
		if (MAX_SPEED != other.MAX_SPEED)
			return false;
		if (wheels != other.wheels)
			return false;
		return true;
	}
}
