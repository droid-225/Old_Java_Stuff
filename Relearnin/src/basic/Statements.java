package basic;

public class Statements {

	public static void main(String[] args) {
		
		/* for "if", "else if", and "else" statements,
		 * if "if" statement is true, none of the following "else if" or "else" statements will be executed
		 * if "if" statement is false, "else if" statement is checked
		 * if subsequent "else if" statement(s) is/are false, "else" statement is executed
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		/* switch = statement that allows a variable to be tested for equality against a list of values
		 * can be used to test for following data types:
		 * byte, short, char, int, String, Character, Byte, Short, and Integer
		 */
		// Example:
		String day = "Monday";
		
		switch(day) {
		case "Monday": 
			System.out.println("Its Monday!");
			break;
		case "Tuesday":
			System.out.println("Its Tuesday!");
			break;
		default: // not required but good to have
			System.out.println("That is not a day!");
		}
		
	}
	
}
