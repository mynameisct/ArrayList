// Write a Java program to empty an array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList17 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		list.add("60");
		
		System.out.println("Original ArrayList is:  " + list);
	
		list.removeAll(list);
		
		System.out.println("Now ArrayList is: " + list);
		
	}
}
