// Write a Java Program to create a new array list, add some colors(string) and print out the collection.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Violet");
		list.add("Pink");
		list.add("Purple");
		
		System.out.println(list);
	}
}
