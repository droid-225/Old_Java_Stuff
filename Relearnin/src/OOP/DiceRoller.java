package OOP;

import java.util.Random;

public class DiceRoller {
	
	// local variable: declared inside a method, visible only to that method
	// global variable: declared outside a method, but within a class visible to all parts of a class 
			
	Random random;
	int num = 0;
	// here variables random and num are global variables that can be used in any method in this class
	
	DiceRoller() {
		//Random random = new Random();
		//int num = 0; 
		// variables random and num are local variables in the DiceRoller() constructor (which is a method)
		// this means that they can only be accessed inside of the constructor
		//roll(random, num);
		
		random = new Random();
		roll();
	}
	
	void roll(Random random, int num) { 
		num = random.nextInt(6) + 1; 
		System.out.println(num);
	}
	
	void roll() {
		num = random.nextInt(6) + 1;
		System.out.println(num);
	}
	
}
