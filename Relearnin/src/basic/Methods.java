package basic;

public class Methods {
	
	public static void main(String[] args) {
	
		// method = a block of code that is executed whenever it is called upon
		// main method is a static method
		//String name = "bro";
		//int x = 3;
		//int y = 4;
		
		//hello(name); // here, the variable 'name' is an argument used in the hello() method 
		//System.out.println(add(x,y));
		
	}
	
	// method name + parameters = method signature
	
	static void hello(String Name) {
		// here, the variable 'Name' is a parameter for the hello() method
		// static keyword is not needed if method is called upon in a non-static method
		System.out.println("Hello " + Name);
	}
	
	static int add(int x, int y) {
		// here 'add' method returns int, so return type is int instead of void
		return x + y;
	}
	
}
