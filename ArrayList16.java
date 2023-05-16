// Write a Java program to clone an array list to another array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList16 {

	public static void main(String[] args) {
	
		List<String> li = new ArrayList<>();
		li.add("10");
		li.add("20");
		li.add("30");
		li.add("40");
		li.add("50");
		li.add("60");
		
		System.out.println("Original ArrayList: " + li);
		
		List<String> new1 = (List<String>) ((ArrayList<String>) li).clone();
		
		System.out.println("Cloned ArrayList: " + new1);
	}

}
