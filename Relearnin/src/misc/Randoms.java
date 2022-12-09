package misc;

import java.util.Random;

public class Randoms {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		int x = random.nextInt();
		/* generates pseudo-random integer (from -2 billion to 2 billion)  
		 * Parameter of .nextInt() method limits this range'
		 * random ints starts from 0, so parameter of 6 gives random
		 * numbers from 0 - 5
		 * Tip: 
		 * for random numbers without zero, 
		 * int x =  random.nextInt() + 1;
		 */
		double y = random.nextDouble(); // generates pseudo-random double values
		boolean z =  random.nextBoolean(); // generates true or false
		
		System.out.println(z);
		
	}
	
}
