// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package ferry;

import driver.Transportation;

public class Ferry extends Transportation{
	
	protected final double MAX_SPEED;
	protected final double MAX_LOAD;
	
	/**
	 * Default constructor
	 */
	public Ferry() {
		super();
		MAX_SPEED = 20;
		MAX_LOAD = 3000;
	}
	
	/**
	 * Parameterized constructor
	 * @param mAX_SPEED
	 * @param mAX_LOAD
	 */
	public Ferry(double mAX_SPEED, double mAX_LOAD) {
		super();
		MAX_SPEED = mAX_SPEED;
		MAX_LOAD = mAX_LOAD;
	}
	
	/**
	 * Copy constructor
	 * @param source
	 */
	public Ferry( Ferry source) {
		this.MAX_SPEED = source.MAX_SPEED;
		this.MAX_LOAD = source.MAX_LOAD;
	}

	/**
	 * Returns max speed 
	 * @return the mAX_SPEED
	 */
	public double getMAX_SPEED() {
		return MAX_SPEED;
	}

	/**
	 * Returns max load
	 * @return the mAX_LOAD
	 */
	public double getMAX_LOAD() {
		return MAX_LOAD;
	}

	/**
	 * Returns a string representation of a Ferry object
	 * @return a string representation of a Ferry object
	 */
	public String toString() {
		return "Ferry with max speed: " + MAX_SPEED + "km/h, and max load: " + MAX_LOAD + "kg.";
	}

	/**
	 * Compares this Ferry object to the specified object for equality.
	 * @param obj the object to be compared
	 * @return true if the Ferry object is equal to the specified object, false otherwise
	 */
	public boolean equals(Object obj) {
		if (obj == null) 
	        return false;
	    if (getClass() != obj.getClass()) 
	        return false;
	    if (!super.equals(obj)) 
	        return false;
		Ferry other = (Ferry) obj;
		return ((MAX_SPEED == other.MAX_SPEED)&&(MAX_LOAD == other.MAX_LOAD));
	}
}
