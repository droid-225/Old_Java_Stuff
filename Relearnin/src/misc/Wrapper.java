package misc;

public class Wrapper {

	public static void main (String[] args) {
		
		/* wrapper class: provides a way to use primitive data types as reference data types
		 * reference data types contain useful methods
		 * can be used with collections (Ex. ArrayList) 
		 * faster and less resource heavy to use primitive data types over reference data types
		 * 
		 * primitive:	wrapper:
		 * 
		 * boolean		Boolean
		 * char			Character
		 * int          Integer
		 * double		Double
		 * 
		 * autoboxing: the automatic conversion the java compiler makes between the primitive data types and their corresponding wrapper class
		 * unboxing: the reverse of autoboxing, automatic conversion of wrapper class to primitive 
		 * 		   
		 */
		
		Boolean a = true; // here 'true' is a primitive value (boolean), autoboxing occurs
		Character b = 'a';
		Integer c = 123;
		Double d = 3.14;
		String e = "bro";
		
		// for the if statement to use values of a and b, they first undergo unboxing
		if(a == true) {
			System.out.println(b);
		}
		
	}
	
}
