// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package trainAndTram;

import wheeledTransportation.WheeledTransportation;

public class Train extends WheeledTransportation{
	
	protected static int numOfVehicles;
	protected String nameOfStartingStation;
	protected String nameOfDestinatioStation;
	
	/**
	 * Default constructor
	 */
	public Train() {
		super();
		this.nameOfStartingStation = "A";
		this.nameOfDestinatioStation = "A";
		numOfVehicles++;
	}
	
	/**
	 * Parameterized  constructor
	 * @param wheels the number of wheels of the train
	 * @param MAX_SPEED the maximum speed of the train
	 * @param nameOfStartingStation the name of the starting station of the train
	 * @param nameOfDestinatioStation the name of the destination station of the train
	 */
	public Train(int wheels, int MAX_SPEED, String nameOfStartingStation, String nameOfDestinatioStation) {
		super(wheels, MAX_SPEED);
		this.nameOfStartingStation = nameOfStartingStation;
		this.nameOfDestinatioStation = nameOfDestinatioStation;
		numOfVehicles++;	
	}
	
	/** 
	 * Copy constructor 
	 * @param source the Train object to copy
	 */
	public Train(Train source) {
		super(source);
		this.nameOfStartingStation = source.nameOfStartingStation;
		this.nameOfDestinatioStation = source.nameOfDestinatioStation;
		numOfVehicles++;
	}
	
	/**
	 * Returns the number of Train objects that have been created.
	 * @return the number of Train objects
	 */
	public static int getNumOfVehicles() {
		return numOfVehicles;
	}
	
	/**
	 * Returns the name of the starting station of the train.
	 * @return the name of the starting station
	 */
	public String getNameOfStartingStation() {
		return nameOfStartingStation;
	}

	/**
	 * Sets the name of the starting station of the train.
	 * @param nameOfStartingStation the new name of the starting station
	 */
	public void setNameOfStartingStation(String nameOfStartingStation) {
		this.nameOfStartingStation = nameOfStartingStation;
	}

	/**
	 * Returns the name of the destination station of the train.
	 * @return the name of the destination station
	 */
	public String getNameOfDestinatioStation() {
		return nameOfDestinatioStation;
	}

	/**
	 * Sets the name of the destination station of the train.
	 * @param nameOfDestinatioStation
	 */
	public void setNameOfDestinatioStation(String nameOfDestinatioStation) {
		this.nameOfDestinatioStation = nameOfDestinatioStation;
	}

	/**
	 * Returns a string representation of the Train object.
	 * @return a string representation of the Train object
	 */
	public String toString() {
		return "Train with " + wheels + " wheels and max speed " + MAX_SPEED + " km/h. It starts at " + nameOfStartingStation + " and stops at " + nameOfDestinatioStation + ". There are " + numOfVehicles + " trains of different types so far.";
	}

	/**
	 * Compares the Train object to another object for equality.
	 *  @param obj the object to be compared
	 *  @return true if the Train object is equal to the specified object, false otherwise
	 */
	public boolean equals(Object obj) {
	    if (obj == null) 
	        return false;
	    if (getClass() != obj.getClass()) 
	        return false;
	    if (!super.equals(obj)) 
	        return false;
	    Train other = (Train) obj;
	    return (nameOfDestinatioStation.equals(other.nameOfDestinatioStation) && nameOfStartingStation.equals(other.nameOfStartingStation));
	}
}
