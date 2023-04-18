package driver;
import wheeledTransportation.WheeledTransportation;
import aircraftAndWWIIAirplane.*;
import ferry.Ferry;
import metro.Metro;
import monowheel.Monowheel;
import trainAndTram.*;

public class Driver {

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
		
		Transportation[] trans = {aircraft3, tram, warPlane2, train2, mono2, aircraft, warPlane, wt2, metro2, train, aircraft2, warPlane3};
		findLeastAndMostExpensiveAircraft(trans);
		
		System.out.println("\n" + ferry2);
		System.out.println(aircraft3);
		System.out.println(aircraft2);
		System.out.println(mono);
		System.out.println(tram2);
		System.out.println(tram);
		
	}
	public static void findLeastAndMostExpensiveAircraft( Transportation[] transportArr) {
		Aircraft mostExp = null;
		Aircraft leastExp = null;
		for (int i = 0; i < transportArr.length; i++) {
			if (transportArr[i] instanceof Aircraft) {
				Aircraft aircraft = (Aircraft)transportArr[i];
				if (mostExp == null)
					mostExp = aircraft;
				if (leastExp == null)
					leastExp = aircraft;
				if (aircraft.getPrice() > mostExp.getPrice())
					mostExp = aircraft;
				if (aircraft.getPrice() < leastExp.getPrice())
					leastExp = aircraft;
			}
			else
				continue;
		}
		if ( mostExp == null && leastExp == null)
			System.out.println("There are no aircrafts in this list");
		else if (mostExp.equals(leastExp))
			System.out.println("There is only one aircraf in this list: \n" + mostExp + ".");
		else
			System.out.println("The most expensive aircraft is: \n" + mostExp + "\nAnd the least expensive aircraft is: \n" + leastExp);
	}
}
