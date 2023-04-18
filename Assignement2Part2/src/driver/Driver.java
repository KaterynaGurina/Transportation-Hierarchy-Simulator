// -----------------------------------------------------
// Assignment 2
// Part: 2
// Written by: Kateryna Gurina 40188793
// -----------------------------------------------------
package driver;
import wheeledTransportation.WheeledTransportation;
import ferry.Ferry;
import metro.Metro;
import monowheel.Monowheel;
import trainAndTram.*;
import aircraftAndWWIIAiroplane.*;

public class Driver {
	
/**
 * 1). We can't create an array in which all the objects keep their class type without using instance of or another method that would verify what class the object belongs to;
 * 2). It also cannot be done because we have to use the copy constructor, and we can't call the appropriate ones without knowing the type of the object, unfortunately you cannot make a polymorphic call on a constructor 
 * It could be fixed if we creates a copy() method in the transportation class and then implemented it on all the rest of them, then we could make a polymorphic call to it without having to know the type of the class 
 */

//doesnt work
	public static Transportation[] copyTheObject(Transportation[] source) {
		Transportation[] result = new Transportation[source.length];
		for (int i = 0; i<source.length; i++) {
			result[i] = new Transportation(source[i]);
		}
		return result;
	}
	
	public static Transportation[] copy2( Transportation[] source) {
		Transportation[] result = new Transportation[source.length];
		for (int i = 0; i < source.length; i++) {
            if (source[i] instanceof Aircraft) 
                result[i] = new Aircraft((Aircraft)source[i]);
            
            else if (source[i] instanceof WWIIAirplane) 
                result[i] = new WWIIAirplane((WWIIAirplane)source[i]);
            
            else if (source[i] instanceof Ferry) 
                result[i] = new Ferry((Ferry)source[i]);
            
            else if (source[i] instanceof Metro)             	
                result[i] = new Metro((Metro)source[i]);
            
            else if (source[i] instanceof Monowheel) 
                result[i] = new Monowheel((Monowheel)source[i]);
            
            else if (source[i] instanceof Train)
                result[i] = new Train((Train)source[i]);
            
            else if (source[i] instanceof Tram)
                result[i] = new Tram((Tram)source[i]);
            
            else if (source[i] instanceof WheeledTransportation)
                result[i] = new WheeledTransportation((WheeledTransportation)source[i]);
            
            else 
                result[i] = null;
		}
		return result;
	}
	
	public static void main(String[] args) {
		WheeledTransportation wt = new WheeledTransportation(3, 75);
		Train train = new Train(60, 360, "Montreal", "New York");
		Metro metro = new Metro(60, 50, "Montmorency", "Cote Vertu", 31);
		Tram tram = new Tram(8, 40, "Pushcha-Vodytsia", "Kontraktova Square", 36, 1998);
		Ferry ferry = new Ferry(30, 500);
		Monowheel mono = new Monowheel(100);
		Aircraft aircraft = new Aircraft(20, 0);
		WWIIAirplane warPlane = new WWIIAirplane(30000, 5000, true);
		WheeledTransportation wt2 = new WheeledTransportation(50, 75);
		Train train2 = new Train(78, 400, "San Francisco", "New York");
		Metro metro2 = new Metro(20, 60, "Namur", "Cote Vertu", 4);
		Tram tram2 = new Tram(16, 30, "Metro Station Lisova", "Metro Station Pozniaki", 14, 1980);
		Ferry ferry2 = new Ferry(20, 1000);
		Monowheel mono2 = new Monowheel(80);
		Aircraft aircraft2 = new Aircraft(100000, 6000);
		WWIIAirplane warPlane2 = new WWIIAirplane(30000, 5000, true);
		Aircraft aircraft3 = new Aircraft(20560, 2000);
		WWIIAirplane warPlane3 = new WWIIAirplane(15050, 1500, false);
		
		Transportation[] trans = {wt, train, metro, tram, ferry, mono, aircraft, warPlane, wt2, train2, metro2, tram2, ferry2, mono2, aircraft2, warPlane2};
		
		Transportation[] trans2 = copyTheObject(trans);
		
		Transportation[] trans3 = copy2(trans);
		
		System.out.println("\n" + "Here is the original");
		for (Transportation element : trans) {
			System.out.println(element.toString());
		}
				
		System.out.println("\n" + "Here is the copy that doesnt work");
		for (Transportation element : trans2) {
			System.out.println(element.toString());
		}
		
		System.out.println("\n" + "Here is that is supposed to work");
		for (Transportation element : trans3) {
			System.out.println(element.toString());
		}
	}
}
