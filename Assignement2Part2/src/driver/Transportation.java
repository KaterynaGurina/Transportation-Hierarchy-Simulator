package driver;

public class Transportation {

//basically make a copy constructor abstract, so that polymorfisme magic will make a call to the copy constructor of each individual object that calls it
//no doesn't work
	
	public Transportation() {
	}
	
	public Transportation(Transportation source) {
	}
}

//Uncomment this part and comment out the previous part for the method that works
/*
* package driver;
* 
* public abstract class Transportation { }
*/