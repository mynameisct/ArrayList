// Write a Java program to insert an element into the array list at the first position.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Go....");
		
		list.add(0, "one");
		
		for(String element : list) {
			System.out.println(element);
		}

	}

}
