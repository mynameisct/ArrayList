// Write a Java program to iterate through all elements in a array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thrusday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");
		
		for(String element : list) {
			System.out.println(element);
		}
	}
}
