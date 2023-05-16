// Write a Java program to join two array lists.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList15 {

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		
		List<String> list2 = new ArrayList<>();
		list2.add("F");
		list2.add("G");
		list2.add("H");
		list2.add("I");
		list2.add("J");
		
		// Lets join all the two ArrayLists
		
		List<String> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		
		System.out.println("Resultant ArrayList is: " + list );
	}

}
