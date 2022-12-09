package basic;

public class Basics {

	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		
		//shortcut: sysout + CTRL + space (for eclipse)
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* Escape Sequences: 
		 * \t : inserts a tab
		 * \b : inserts backspace
		 * \n : inserts newline
		 * \r : carriage return ?(look it up)
		 * \f : form feed ?
		 * \' : single quote
		 * \" : double quote
		 * \\ : inserts backslash
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* Declaration: 
		 * int x;
		 * 
		 * Assignment: 
		 * x = 123;
		 * 
		 * Initialization: (declaration + assignment)
		 * int x = 123;
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* Data types:
		 * boolean:
		 * 	Size: 1 bit
		 * 	Prim (primitive value)
		 *  can be true or false
		 * 
		 * byte:
		 *  Size: 1 byte (8 bits)
		 *  Prim
		 *  -128 to 127
		 *  
		 * short:
		 * 	Size: 2 byte
		 *  Prim
		 *  -32,768 to 32,767
		 *  
		 * int:
		 *  Size: 4 byte
		 *  Prim
		 *  -2 billion to 2 billion
		 *  
		 * long:
		 *  Size: 8 bytes
		 *  Prim
		 *  -9 quintillion to 9 quintillion
		 *  
		 * float:
		 *  Size: 4 bytes
		 *  Prim
		 *  fraction number up to 6-7 digits
		 *  float x = 3.121356f; (f is required at end)
		 *  
		 * double:
		 *  Size: 8 bytes
		 *  Prim
		 *  fraction number up to 15 digits
		 *  Ex: 3.12345678901234
		 *  
		 * char:
		 *  Size: 2 bytes
		 *  Prim
		 *  single character/letter/ASCII value
		 *  char a = 'a'; (single quotes)
		 *  
		 * String: 
		 *  Size: varies
		 *  Reference value
		 *  a sequence of characters
		 *  Ex: "fsdalkfjalk"
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* expression : operands and operators
		 * operands: values, variables, numbers, quantities
		 * operators: + - * / %
		 * 
		 * %: modulus gives remainder of division of two values 
		 * Ex: 10 % 2 = 0, 10 % 3 = 1
		 * x++ == x + 1
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* To turn String into int:
		 * String  y = "32423";
		 * int x = Integer.parseInt(y);
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* Logical operators:
		 * && (AND)
		 * || (OR)
		 * ! (NOT)
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// anything declared as final cannot be changed or updated later in the program
		// example: following code gives error because PI is declared as a final double
		// names of variables declared as final usually are all upper case
		//final double PI = 3.14159;
		
		//PI = 4;
		
		//System.out.println(PI);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// static = modifier, a single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		// for example, here the numberOfFriends variable is static and is shared by every
		// instance of the Friend() class, so it can be accessed and modified by any instance
		// such as by friend1, friend2, or friend3 and referenced statically with just Friend
		
		Friend friend1 = new Friend("Spongeboy");
		Friend friend2 = new Friend("SPratic");
		Friend friend3 = new Friend("Squibwerb");
		Friend friend4 = new Friend("SWamby");
		
		// static methods can use static variables and can be referenced in a statically
		Friend.displayFriends();
	}

}
