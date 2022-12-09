package OOP;

public class Car { // Car() class

	//attributes of Car() class
	String make = "Telsa";
	String model = "X";
	int year = 2020;
	String color = "Blue";
	double price = 2432234.32;
			
	void drive() {
		
		System.out.println("You drive the car");
		
	}
	
	void brake() {
		
		System.out.println("You brake the car");
		
	}
	
	public String toString() {
		
		// one method to specify what is returned
		//String myString = make + "\n" + model + "\n" + color + "\n" + year;	
		//return myString;
		
		// single line method to specify what is to be returned
		return make + "\n" + model + "\n" + color + "\n" + year;
		
	}
	
}
