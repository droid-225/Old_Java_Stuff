package basic;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		
		/* while loops:
		 * regular while loop: only does something if condition is met
		 * while(condition) {
		 * 	something
		 * }
		 * 
		 * do while loop: does something once and then continues if condition is met
		 * do{
		 *  something
		 *  }while(condition);
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* for loop: executes a block of code a limited amount of times
		 * Example:
		 */
		/*
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		*/
		/* code counts down from 10 to 1
		 * 3 statements in parenthesis:
		 * 1. Initialization of index (i)
		 * 2. condition
		 * 3. increment(++) or decrement(--)
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//nested loops: loops inside of loops
		
		// for-each loop: traversing technique to iterate through the elements in an array/collection
	    //String[] animals = {"cat","Dawg","mamamal","doude"};
	    ArrayList<String> animals = new ArrayList<String>();
		
	    animals.add("cat");
	    animals.add("Dawg");
	    animals.add("mamaal");
	    animals.add("doude");
	    
	    for(String i : animals) { // i can be named anything
	    	System.out.println(i);
	    }
		
	}
	
}
