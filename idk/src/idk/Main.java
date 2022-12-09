package idk;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		File file = new File("lol.txt");
		//file.createNewFile();
		
		FileReader reader = new FileReader(file);
		FileWriter writer = new FileWriter(file);
		
		writer.write("Hello World");
		
		//file.delete();
		
	}
	
}
