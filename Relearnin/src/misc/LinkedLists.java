package misc;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
	LinkedList<String> linkedList = new LinkedList<String>();
	
	  // *****************************************************
	  // LinkedList =  Nodes are in 2 parts (data + address)
	  //                        Nodes are in non-consecutive memory locations
	  //                        Elements are linked using pointers
	  //	2 types: singly linked lists & doubly linked lists
	  //	singly: node only contains data and address of next node
	  //	doubly: node contains data and addresses of previous node and next node
	 
	  //    advantages?
	  //    1. Dynamic Data Structure (allocates needed memory while running)
	  //    2. Insertion and Deletion of Nodes is easy. O(1) 
	  //    3. No/Low memory waste
	  
	  //    disadvantages?
	  //    1. Greater memory usage (additional pointer)
	  //    2. No random access of elements (no index [i])
	  //    3. Accessing/searching elements is more time consuming. O(n)
	  
	  //    uses?
	  //    1. implement Stacks/Queues
	  //    2. GPS navigation
	  //    3. music playlist
	  // *****************************************************
	
	/*
	linkedList.push("A"); // push treats list as a stack (first value is on bottom)
	linkedList.push("B");
	linkedList.push("C");
	linkedList.push("D");
	linkedList.push("F"); // last value is on top
	linkedList.pop(); // removes top value in linked list (here it is F)
	*/
	
	linkedList.offer("A"); // offer treats list as queue (first value is in first)
	linkedList.offer("B");
	linkedList.offer("C");
	linkedList.offer("D");
	linkedList.offer("F"); // last value is in last
	//linkedList.poll(); // removes first value in list (here it is A)
	
	linkedList.add(4, "E"); // add E at position 4
	linkedList.remove("E"); // removes E
	
	System.out.println(linkedList.peekFirst()); // prints value in first index
	System.out.println(linkedList.peekLast()); // prints value in last index
	
	System.out.println(linkedList.indexOf("F")); // .indexOf gives index of specified value
	
	linkedList.addFirst("0"); // adds value to the first index
	linkedList.addLast("G"); // adds value to the last index
	
	String first = linkedList.removeFirst(); // removes first value and stores it in variable
	String last = linkedList.removeLast(); // removes last value and stores it in variable
	
	int size = linkedList.size(); // returns size of linked list
	
	System.out.println(linkedList);
	
	}
}
