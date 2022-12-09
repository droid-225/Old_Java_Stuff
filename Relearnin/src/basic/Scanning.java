package basic;

import java.util.*;
// for scanner specifically: import java.util.Scanner;

public class Scanning {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = in.nextLine(); // also accepts enter key as input (\n)
		System.out.println("How old are you? ");
		int age = in.nextInt(); // Only accepts int values
		in.nextLine(); // resets .nextLine() method so it can be used again
		System.out.println("What is your favorite food?");
		String food = in.nextLine();
		in.close(); // not really needed
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You're favorite food is " + food);
		
	}
	
}
