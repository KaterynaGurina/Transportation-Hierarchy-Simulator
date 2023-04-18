// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package monowheel;

import driver.Transportation;

public class Monowheel extends Transportation{
	
	private final double MAX_WEIGTH;

	/**
	 * Default constructor
	 */
	public Monowheel() {
		super();
		MAX_WEIGTH = 20;
	}

	/**
	 * Parameterized constructor
	 * @param mAX_WEIGTH
	 */
	public Monowheel(double MAX_WEIGTH) {
		super();
		this.MAX_WEIGTH = MAX_WEIGTH;
	}
	
	/**
	 * Copy constructor
	 * @param source
	 */
	public Monowheel( Monowheel source) {
		super();
		this.MAX_WEIGTH = source.MAX_WEIGTH;
	}

	/**
	 * Returns max weight of the Monowheel
	 * @return the mAX_WEIGTH
	 */
	public double getMAX_WEIGTH() {
		return MAX_WEIGTH;
	}

	/**
	 * Returns a string representation of a Monowheel object
	 * @return a string representation of a Monowheel object
	 */
	public String toString() {
		return "Monowheel with max weigth: " + MAX_WEIGTH + "kg.";
	}

	/**
	 * Compares this Monowheel object to the specified object for equality.
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
		Monowheel other = (Monowheel) obj;
		return (MAX_WEIGTH == other.MAX_WEIGTH);
	}
}
