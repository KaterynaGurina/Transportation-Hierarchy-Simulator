// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package trainAndTram;

import metro.Metro;

public class Tram extends Metro{

	private int yearOfCreation;
	
	/**
	 * Default constructor
	 */
	public Tram() {
		super();
		this.yearOfCreation = 0;
	}

	/**
	 * Parameterized constructor (6 parameters because I made numOfVehicles instance based)
	 * @param wheels
	 * @param MAX_SPEED
	 * @param nameOfStartingStation
	 * @param nameOfDestinatioStation
	 * @param totalNumOfStops
	 * @param yearOfCreation
	 */
	public Tram(int wheels, int MAX_SPEED, String nameOfStartingStation, String nameOfDestinatioStation, int totalNumOfStops, int yearOfCreation) {
		super(wheels, MAX_SPEED, nameOfStartingStation, nameOfDestinatioStation, totalNumOfStops);
		this.yearOfCreation = yearOfCreation;
	}
	
	/**
	 * Copy constructor
	 * @param source
	 */
	public Tram(Tram source) {
		super();
		this.yearOfCreation = source.yearOfCreation;
	}

	/**
	 * Returns the year of creation
	 * @return the yearOfCration
	 */
	public int getYearOfCration() {
		return yearOfCreation;
	}

	/**
	 * Sets the year of creation
	 * @param yearOfCration the yearOfCration to set
	 */
	public void setYearOfCration(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}

	/**
	 * Returns a String representation of Tram object
	 * @return string representation of Tram object
	 */
	public String toString() {
		return "Tram with " + wheels + " wheels and max speed " + MAX_SPEED + " km/h. It starts at " + nameOfStartingStation + " and stops at " + nameOfDestinatioStation + ". There is " + numOfVehicles + " trains of all types. The total number of stops is " + totalNumOfStops + ". It was created in " + yearOfCreation + ".";
	}

	/**
	 * Compares this Tram object to the specified object for equality.
	 * @param obj the object to be compared
	 * @return true if the Tram object is equal to the specified object, false otherwise
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		Tram other = (Tram) obj;
		return (yearOfCreation == other.yearOfCreation);		
	}
}
