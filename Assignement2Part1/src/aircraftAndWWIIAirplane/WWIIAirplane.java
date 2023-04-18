// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package aircraftAndWWIIAirplane;

public class WWIIAirplane extends Aircraft{

	private boolean twinEngine;

	/**
	 * Default constructor
	 */
	public WWIIAirplane() {
		super();
		this.twinEngine = false;
	}
	
	/**
	 * Parameterized constructor
	 * @param price
	 * @param MAX_ELEVATION
	 * @param twinEngine
	 */
	public WWIIAirplane(double price, double MAX_ELEVATION, boolean twinEngine) {
		super(price, MAX_ELEVATION);
		this.twinEngine = twinEngine;
	}
	
	/**
	 * Copy constructor
	 * @param source
	 */
	public WWIIAirplane(WWIIAirplane source) {
		super();
		this.twinEngine = source.twinEngine;
	}

	/**
	 * Returns if the engine if twin or not
	 * @return if the the engine is twin or not 
	 */
	public boolean isTwinEngine() {
		return twinEngine;
	}

	/**
	 * sets the twin engine to true or false
	 * @param twinEngine
	 */
	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}

	/**
	 * Returns a string representation of a World War 2 Airplane object 
	 * @return a string representation of a World War 2 Airplane object 
	 */
	public String toString() {
		if (twinEngine)
			return "World War II Airplane with price " + price + " dollars, max elevation " + MAX_ELEVATION + " meters and a twin engine.";
		else
			return "World War II Airplane with price " + price + " dollars, max elevation " + MAX_ELEVATION + " meters. It doesn't have a twin engine.";
	}

	/**
	 * Compares this WWIIAirplane object to the specified object for equality.
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
		WWIIAirplane other = (WWIIAirplane) obj;
		return (twinEngine == other.twinEngine);
	}
}
