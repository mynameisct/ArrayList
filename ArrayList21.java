// Write a Java program to replace the second element of a ArrayList with the specified element.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList21 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("30");
		list.add("30");
		list.add("40");
		list.add("50");
		list.add("60");
		
		System.out.println("Original ArrayList is: " + list);
		
		list.set(1,"20");
		
		System.out.println("New ArrayList is: " + list);
		

	}

}
