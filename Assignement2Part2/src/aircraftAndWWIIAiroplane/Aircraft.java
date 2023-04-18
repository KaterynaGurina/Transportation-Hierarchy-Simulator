// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package aircraftAndWWIIAiroplane;

import driver.Transportation;

public class Aircraft extends Transportation{
	protected double price;
	protected final double MAX_ELEVATION;
	
	/**
	 * Default constructor
	 */
	public Aircraft() {
		this.price = 0;
		MAX_ELEVATION = 0;
	}
	
	/** 
	 * Parameterized constructor
	 * @param price
	 * @param mAX_ELEVATION
	 */
	public Aircraft(double price, double mAX_ELEVATION) {
		this.price = price;
		MAX_ELEVATION = mAX_ELEVATION;
	}
	
	/**
	 * Copy constructor
	 * @param source
	 */
	public Aircraft(Aircraft source) {
		this.price = source.price;
		MAX_ELEVATION = source.MAX_ELEVATION;
	}

	/**
	 * Returns the price of the aircraft
	 * @return the price of the aircraft
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price of the aircraft
	 * @param price to be set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Returns max elevation for this aircraft
	 * @return max elevation of this aircraft
	 */
	public double getMAX_ELEVATION() {
		return MAX_ELEVATION;
	}

	/**
	 * Returns a String representation of aircraft object
	 * @return a String representation of aircraft object
	 */
	public String toString() {
		return "Aircraft with price " + price + " dollars and max elevation " + MAX_ELEVATION + " meters.";
	}	
		
	/**
	 * Compares this Aircraft object to the specified object for equality.
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
		Aircraft other = (Aircraft) obj;
		return ((MAX_ELEVATION == other.MAX_ELEVATION) && (price == other.price));
	}
	
}
