package basic;

public class Strings {

	public static void main (String[] args) {
		
		String name = "lol";
		
		boolean equal = name.equals("lol"); // tests if two strings are the same
		boolean equalCase = name.equalsIgnoreCase("Lol"); // test if two strings are equal ignoring their case
		int length = name.length(); // gives length of string
		char character = name.charAt(0); // gives char at given index 
		int index = name.indexOf("o"); // gives index value of given String
		boolean empty = name.isEmpty(); // tests if given string is empty
		String upperCase = name.toUpperCase(); // makes all characters in string upper case
		String lowerCase = name.toLowerCase(); // makes all characters in string lower case
		String trim = name.trim(); // removes empty space before or after characters in string
		String replace = name.replace("o", "d"); // replaces one character with another character
		
		System.out.println(index);
		
	}
	
}
