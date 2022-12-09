package OOP;

public class Main {
	// OOP : Object Oriented Programming
	
	public static void main(String[] args) {
		
		// Objects:
		// Car myCar = new Car(); // instance of class Car() or a Car() object
		
		// prints object attributes
		//System.out.println(myCar.color); 
		//System.out.println(myCar.make);
		
		// evokes methods of Car() class
		//myCar.drive();
		//myCar.brake();
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// Constructors: 
		// constructor: special method that is called when an object is instantiated
		//Human human = new Human("Rick", 69, 43.2);
		//Human human2 = new Human("Dan", 22, 65);
		
		//System.out.println(human2.name);
		//System.out.println(human2.age);
		//System.out.println(human2.weight);
		//human.eat();
		//human2.drink();
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// local variable: declared inside a method, visible only to that method
		// global variable: declared outside a method, but within a class visible to all parts of a class 
		//new DiceRoller();
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// overloaded constructors: multiple constructors within a class with the same name,
		//							but different parameters
		// name + parameters = signature
		
		//Pizza pizza = new Pizza("Thick Crust", "Tomato", "Mozzerella", "Olives");
		//Pizza pizza = new Pizza("Thick Crust", "Tomato", "Mozzerella");
		//Pizza pizza = new Pizza("Thick Crust", "Tomato");
		//Pizza pizza = new Pizza("Thick Crust");
		//Pizza pizza = new Pizza();
		
		//System.out.println("Here are the ingredients of your pizza: ");
		//System.out.println(pizza.bread);
		//System.out.println(pizza.sauce);
		//System.out.println(pizza.cheese);
		//System.out.println(pizza.topping);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// toString() : special method that all objects inherit, 
		//				can be changed for each class to print specific information
		//				that is a string that "textually represents" an object
		//				can be used both implicitly and explicitly
		//				prints location of object in system memory by default
		
		//Car car = new Car();
		
		//System.out.println(car); // implicitly uses toString method when inside a print statement
		//System.out.println(car.toString()); // same as above (explicitly using toString method)
	
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// Array of objects:
		
		//Food[] refrigerator = new Food[3];
		
		//Food food1 = new Food("pizza");
		//Food food2 = new Food("burger");
		//Food food3 = new Food("apple");
		
		//Food[] refrigerator = {food1, food2, food3};
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		//System.out.println(refrigerator[0].name);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// Object Passing From One Class to Another:
		
		Garage garage = new Garage();
		Car2 car = new Car2("BMW");
		Car2 car1 = new Car2("Tesla");
		
		garage.park(car);
		garage.park(car1);
		
	}
	
}
