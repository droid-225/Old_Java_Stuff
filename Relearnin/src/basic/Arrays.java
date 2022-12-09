package basic;

import java.util.ArrayList;

public class Arrays {
	
	public static void main(String[] args) {
		
		/*
		String[] cars = {"Camaro", "Corvette", "Tesla"}; // array of cars
		
		cars[0] = "Mustang"; // replaces element 0 ("Camaro") with "Mustang"
		
		//System.out.println(cars[0]);
		
		// Another way to initialize an array:
		String[] moreCars = new String[3]; // sets array size to 3 elements
		// Assigning value to array elements:
		moreCars[0] = "Camaro";
		moreCars[1] = "Corvette";
		moreCars[2] = "Tesla"; 
		
		// Using for loop to print all values of array:
		for(int i=0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/*
		// 2D arrays: array of arrays
		// [num. of rows][num. of columns]
		String[][] cars = new String[3][3]; // creates array with 3 rows and 3 columns
		// Assigning values to elements:
		cars[0][0] = "Camaro"; // assigns value to element in row 0 and column 0
		cars[0][1] = "Camaro2";
		cars[0][2] = "Camaro3";
		cars[1][0] = "Camaro4";
		cars[1][1] = "Camaro5";
		cars[1][2] = "Camaro6";
		cars[2][0] = "Camaro7";
		cars[2][1] = "Camaro8";
		cars[2][2] = "Camaro9";
		*/
		
		/* Using for loop to print values of 2D array:
		 * first for loop is for rows and second is for columns
		 */
		/*
		for(int i = 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j]);
			}
		}
		
		// 2D arrays can also be initialized as:
		String[][] moreCars = { {"Camaro","Camaro1","Camaro2"},
								{"Car1","Car2","Car3"},
								{"car1","car2","car3"}
								};
		*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* ArrayList = a resizable array
		 * Elements can be added and removed after compilation phase
		 * only stores reference data types
		 * if you want to make a ArrayList of primitive data types, use their wrapper class
		 * Ex: ArrayList<Integer>
		 */
		/*
		ArrayList<String>  food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		food.set(0, "Sushi"); // sets and element in given index
		food.remove(2); // removes element in given index
		food.clear(); // empties the ArrayList
		
		// Using for loop too list elements in ArrayList:
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		*/
		
		// 2D ArrayList:
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList(); 
		
		ArrayList<String> bakeryList = new ArrayList(); // regular ArrayList can also be initialized like this
		bakeryList.add("paster");
		bakeryList.add("linguini");
		bakeryList.add("gaming fuel");
		
		ArrayList<String> produceList = new ArrayList(); // regular ArrayList can also be initialized like this
		produceList.add("pain");
		produceList.add("vfuel");
		produceList.add("dew");
		
		ArrayList<String> drinksList = new ArrayList(); // regular ArrayList can also be initialized like this
		drinksList.add("cola");
		drinksList.add("damn");
		drinksList.add("lust");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		//System.out.println(groceryList); // prints all list elements
		System.out.println(groceryList.get(0).get(1)); // prints second element of first list
		// .get(listIndex).get(elementIndex);
		
	}
	
}
