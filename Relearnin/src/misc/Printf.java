package misc;

public class Printf {

	/* printf() : an optional method to control, format, and display text to the console window
	 * 			  two arguments = format string + (object/variable/value)
	 * 			  % [flags] [precision] [width] [conversion-character]
	 * 			  % : format specifier
	 */
	
	public static void main(String[] args) {
		
		//System.out.printf("%d This is a format string",123);
		// value of argument will appear at location of format specifier
		
		boolean myBoolean = true;
		char myChar = '$';
		String myString = "name";
		int myInt = 5;
		double myDouble = 23.223;
		
		/* 
		// [conversion-character]
		System.out.printf("%b", myBoolean); // b for boolean
		System.out.printf("%c", myChar); // c for char
		System.out.printf("%s", myString); // s for String
		System.out.printf("%d", myInt); // d for int
		System.out.printf("%f", myDouble); // f for double
		*/
		
		/*
		// [width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString); // width amount comes before conversion-character
		// if width is negative, text will be left-justified
		*/
		
		// [precision]
		// sets a number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f", myDouble); 
		// precision comes before conversion-character
		
		/* [flags]
		 * adds an effect to output based on the flag added to format specifier
		 * - : left-justify
		 * + : output a plus (+) or minus (-) sign for a numeric value
		 * 0 : numeric values are zero-padded (adds specified amount of zeros in front)
		 * , : comma grouping separator if number > 1000
		 * comes before conversion-character
		 */
	}
 
	
}
